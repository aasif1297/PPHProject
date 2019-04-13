package com.londonsoftware.calisthenics.calisthenics;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.muddzdev.styleabletoastlibrary.StyleableToast;
import com.theartofdev.edmodo.cropper.CropImage;
import com.theartofdev.edmodo.cropper.CropImageView;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import id.zelory.compressor.Compressor;

public class NewPostActivity extends AppCompatActivity {

    Toolbar addnewpost_toolbar;
    private ImageView newPostImage;
    private EditText newPostDesc;
    private Button newPostBtn;

    private Uri postimageUri = null;
    private ProgressBar newPostProgress;

    private StorageReference storageReference;
    private FirebaseFirestore firebaseFirestore;

    private FirebaseAuth firebaseAuth;
    private String current_user_id;
    private Bitmap compressedImageFile;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_post);

        newPostImage = findViewById(R.id.new_post_image);
        newPostDesc = findViewById(R.id.new_post_desc);
        newPostBtn = findViewById(R.id.post_btn);
        newPostProgress = findViewById(R.id.new_post_progress);

        storageReference = FirebaseStorage.getInstance().getReference();
        firebaseFirestore = FirebaseFirestore.getInstance();
        firebaseAuth = FirebaseAuth.getInstance();
        current_user_id = firebaseAuth.getCurrentUser().getUid();



        newPostImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                CropImage.activity()
                        .setGuidelines(CropImageView.Guidelines.ON)
                        .setMinCropResultSize(512,512)
                        .setAspectRatio(1,1)
                        .start(NewPostActivity.this);
            }


        });



        addnewpost_toolbar = findViewById(R.id.newpost_toolbar);
        setSupportActionBar(addnewpost_toolbar);

        addnewpost_toolbar.setNavigationIcon(R.drawable.ic_backspace);
        addnewpost_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        newPostBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String desc = newPostDesc.getText().toString();

                if(!TextUtils.isEmpty(desc) && postimageUri !=null){

                    newPostProgress.setVisibility(View.VISIBLE);

                    final String randomName = UUID.randomUUID().toString();

                    StorageReference filepath = storageReference.child("post_images").child(randomName + ".jpg");
                    filepath.putFile(postimageUri).addOnCompleteListener(new OnCompleteListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onComplete(@NonNull final Task<UploadTask.TaskSnapshot> task) {
                            //final String downloadUri = task.getResult().getUploadSessionUri().toString();

                            Task<Uri> result = task.getResult().getMetadata().getReference().getDownloadUrl();
                            result.addOnSuccessListener(new OnSuccessListener<Uri>() {
                                @Override
                                public void onSuccess(Uri uri) {
                                    final String downloadUrl = uri.toString();
                                    if(task.isSuccessful()) {

                                        File newImageFile = new File(postimageUri.getPath());

                                        try {
                                            compressedImageFile = new Compressor(NewPostActivity.this).
                                                    setMaxHeight(100)
                                                    .setMaxWidth(100)
                                                    .setQuality(2)
                                                    .compressToBitmap(newImageFile);

                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }

                                        ByteArrayOutputStream baos = new ByteArrayOutputStream();
                                        compressedImageFile.compress(Bitmap.CompressFormat.JPEG, 100, baos);
                                        byte[] thumbData = baos.toByteArray();

                                        UploadTask uploadTask = storageReference.child("post_images/thumbs").child(randomName + ".jpg").putBytes(thumbData);

                                        uploadTask.addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                                            @Override
                                            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                                                String downloadthumbUri = taskSnapshot.getUploadSessionUri().toString();

                                                Map<String, Object> postMap = new HashMap<>();
                                                postMap.put("image_url", downloadUrl);
                                                postMap.put("image_thumb", downloadthumbUri);
                                                postMap.put("desc", desc);
                                                postMap.put("user_id", current_user_id);
                                                postMap.put("timestamp", FieldValue.serverTimestamp());

                                                firebaseFirestore.collection("Posts").add(postMap).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<DocumentReference> task) {

                                                        if (task.isSuccessful()) {

                                                            StyleableToast.makeText(NewPostActivity.this, "Successfully Added", Toast.LENGTH_LONG, R.style.mytoast3).show();
                                                            Intent mainIntent = new Intent(NewPostActivity.this, Herbal_Diary_Prelogin.class);
                                                            startActivity(mainIntent);
                                                            finish();

                                                        } else {
                                                            String errorMessage = task.getException().getMessage();
                                                            StyleableToast.makeText(NewPostActivity.this, "Error : " + errorMessage, Toast.LENGTH_SHORT, R.style.mytoast3).show();

                                                        }

                                                        newPostProgress.setVisibility(View.INVISIBLE);

                                                    }
                                                });

                                            }


                                        }).addOnFailureListener(new OnFailureListener() {
                                            @Override
                                            public void onFailure(@NonNull Exception e) {

                                                //Error handling
                                                String errorMessage = task.getException().getMessage();
                                                StyleableToast.makeText(NewPostActivity.this, "Error : " + errorMessage, Toast.LENGTH_SHORT, R.style.mytoast3).show();


                                            }
                                        });


                                    } else {

                                        newPostProgress.setVisibility(View.INVISIBLE);

                                    }

                                }
                            });

                        }
                    });


                }

            }
        });


    }





    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE) {
            CropImage.ActivityResult result = CropImage.getActivityResult(data);
            if (resultCode == RESULT_OK) {

                postimageUri = result.getUri();

                newPostImage.setImageURI(postimageUri);



            } else if (resultCode == CropImage.CROP_IMAGE_ACTIVITY_RESULT_ERROR_CODE) {

                Exception error = result.getError();
            }
        }
    }


}
