package com.londonsoftware.calisthenics.calisthenics;

import android.content.Intent;
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

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.muddzdev.styleabletoastlibrary.StyleableToast;

public class PostActivity extends AppCompatActivity {

    ImageView imageView;
    EditText mPostTitle;
    EditText mPostDesc;
    Button mSubmitbtn;
    Uri imageUri = null;

    ProgressBar progressBar;

    StorageReference mStorage;

    private static final int GALLERY_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);


        progressBar = findViewById(R.id.progressBar);

        mStorage = FirebaseStorage.getInstance().getReference();

        mPostTitle = findViewById(R.id.diary_edittext1);
        mPostDesc = findViewById(R.id.diary_edittext2);
        mSubmitbtn = findViewById(R.id.addpost_diary_btn);


        mSubmitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                startPosting();
                sendMail();
            }
        });







        Toolbar toolbar = findViewById(R.id.toolbar);

        imageView = findViewById(R.id.imageselect);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivityForResult(intent, GALLERY_REQUEST);

            }
        });

        //Allows icons from a Menu inflator to be placed at the right of the toolbar
        setSupportActionBar(toolbar);



        //This sets the back button on the toolbar of the tabbed page
        toolbar.setNavigationIcon(R.drawable.ic_backspace);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == GALLERY_REQUEST && resultCode == RESULT_OK){


           imageUri = data.getData();

            imageView.setImageURI(imageUri);
        }




    }

    private void startPosting() {

        String title_val = mPostTitle.getText().toString().trim();
        String desc_val = mPostDesc.getText().toString().trim();

        if (!TextUtils.isEmpty(title_val) && !TextUtils.isEmpty(desc_val) && imageUri != null) {

            final StorageReference filepath = mStorage.child("Blog_Images");

            final UploadTask uploadTask = filepath.putFile(imageUri);
            uploadTask.addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                    uploadTask.continueWithTask(new Continuation<UploadTask.TaskSnapshot, Task<Uri>>() {
                        @Override
                        public Task<Uri> then(@NonNull Task<UploadTask.TaskSnapshot> task) throws Exception {

                            if (!task.isSuccessful()) {
                                throw task.getException();


                            }


                            return filepath.getDownloadUrl();
                        }
                    }).addOnCompleteListener(new OnCompleteListener<Uri>() {
                        @Override
                        public void onComplete(@NonNull Task<Uri> task) {


                        }

                    });


                }
            });
        }
    }

    private void sendMail() {


        String subject = mPostTitle.getText().toString();
        String message = mPostDesc.getText().toString();


        if (subject.trim().isEmpty() || message.trim().isEmpty()) {
            StyleableToast.makeText(PostActivity.this, "Please add a Post Title and Description", Toast.LENGTH_SHORT, R.style.mytoast2).show();

        }

        else {
            StyleableToast.makeText(PostActivity.this, "Added Successfully", Toast.LENGTH_SHORT, R.style.mytoast3).show();
        }






}
}