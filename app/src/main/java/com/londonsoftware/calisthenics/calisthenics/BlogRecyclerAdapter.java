package com.londonsoftware.calisthenics.calisthenics;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;
import com.muddzdev.styleabletoastlibrary.StyleableToast;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nullable;

import de.hdodenhof.circleimageview.CircleImageView;

public class BlogRecyclerAdapter extends RecyclerView.Adapter<BlogRecyclerAdapter.ViewHolder> {

    public List<BlogPost> blog_list;
    public Context context;
    private FirebaseFirestore firebaseFirestore;
    private FirebaseAuth firebaseAuth;

    public BlogRecyclerAdapter(List<BlogPost> blog_list){
        this.blog_list = blog_list;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.blog_list_item, parent, false);
        context = parent.getContext();
        firebaseFirestore = FirebaseFirestore.getInstance();
        firebaseAuth = FirebaseAuth.getInstance();

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {

        holder.setIsRecyclable(false);

        final String blogPostId = blog_list.get(position).BlogPostId;
        final String currentUserId = firebaseAuth.getCurrentUser().getUid();

        String desc_data = blog_list.get(position).getDesc();
        holder.setDescText(desc_data);

        String image_uri = blog_list.get(position).getImage_url();
        String thumbUri = blog_list.get(position).getImage_thumb();
        holder.setBlogImage(image_uri, thumbUri);

        String user_id = blog_list.get(position).getUser_id();


        firebaseFirestore.collection("Users").document(user_id).get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {

                if (task.isSuccessful()) {

                    String userName = task.getResult().getString("name");
                    String userImage = task.getResult().getString("image");

                    holder.setUserData(userName, userImage);


                } else {
                    String errorMessage = task.getException().getMessage();
                    StyleableToast.makeText(context, "Error : " + errorMessage, Toast.LENGTH_SHORT, R.style.mytoast3).show();
                }

            }
        });


        long milliseconds = blog_list.get(position).getTimestamp().getTime();
        String dateString = DateFormat.format("EEE, d MMM yyyy HH:mm", new Date(milliseconds)).toString();

        holder.setTime(dateString);



        //Get Likes Count
        firebaseFirestore.collection("Posts/" + blogPostId + "/Likes").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {

                if(!queryDocumentSnapshots.isEmpty()){

                    int count = queryDocumentSnapshots.size();

                    holder.updateLikesCount(count);

                } else {

                    holder.updateLikesCount(0);

                }
            }
        });


        //Get Likes
        firebaseFirestore.collection("Posts/" + blogPostId + "/Likes").document(currentUserId).addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {

                if(documentSnapshot.exists()){

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        holder.blogLikeBtn.setImageDrawable(context.getDrawable(R.drawable.ic_favorite_red_24dp));


                    } else {

                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            holder.blogLikeBtn.setImageDrawable(context.getDrawable(R.drawable.ic_favorite_black_24dp));
                        }

                    }
                }

            }
        });



        //Like features
        holder.blogLikeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                firebaseFirestore.collection("Posts/" + blogPostId + "/Likes").document(currentUserId).get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DocumentSnapshot> task) {

                        if (!task.getResult().exists()) {


                            Map<String, Object> likesMap = new HashMap<>();
                            likesMap.put("timestamp", FieldValue.serverTimestamp());


                            firebaseFirestore.collection("Posts/" + blogPostId + "/Likes").document(currentUserId).set(likesMap);

                        } else {

                            firebaseFirestore.collection("Posts/" + blogPostId + "/Likes").document(currentUserId).delete();
                        }
                    }
                });




            }

        });

        holder.blogCommentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent commentIntent = new Intent(context, CommentsActivity.class);
                commentIntent.putExtra("blog_post_id", blogPostId);
                context.startActivity(commentIntent);

            }
        });

    }

                @Override
                public int getItemCount () {
                    return blog_list.size();
                }

                public class ViewHolder extends RecyclerView.ViewHolder {

                    private View mView;

                    private TextView descView;
                    private ImageView blogImageView;
                    private TextView blogUserName;
                    private TextView blogDate;
                    private CircleImageView blogUserIamge;
                    private ImageView blogLikeBtn;
                    private TextView blogLikeCount;
                    private ImageView blogCommentBtn;


                    public ViewHolder(@NonNull View itemView) {
                        super(itemView);
                        mView = itemView;

                        blogLikeBtn = mView.findViewById(R.id.blog_like_btn);
                        blogCommentBtn = mView.findViewById(R.id.blog_comment_icon);


                    }

                    public void setDescText(String descText) {

                        descView = mView.findViewById(R.id.blog_desc);
                        descView.setText(descText);


                    }

                    public void setBlogImage(String downloadUri, String thumbUri) {

                        blogImageView = mView.findViewById(R.id.blog_image);
                        RequestOptions requestOptions = new RequestOptions();
                        requestOptions.placeholder(R.drawable.image_placeholder);


                        Glide.with(context).applyDefaultRequestOptions(requestOptions).load(downloadUri).apply(RequestOptions.skipMemoryCacheOf(true)).apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE)).
                                thumbnail(
                                        Glide.with(context).load(thumbUri)
                                ).into(blogImageView);

                    }


                    public void setTime(String date) {

                        blogDate = mView.findViewById(R.id.blog_user_date);
                        blogDate.setText(date);

                    }


                    public void setUserData(String name, String image) {

                        blogUserIamge = mView.findViewById(R.id.blog_user_image);
                        blogUserName = mView.findViewById(R.id.blog_user_name);

                        blogUserName.setText(name);

                        RequestOptions placeholderOption = new RequestOptions();
                        placeholderOption.placeholder(R.drawable.profile_placeholder);

                        Glide.with(context).applyDefaultRequestOptions(placeholderOption).load(image).apply(RequestOptions.skipMemoryCacheOf(true)).apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE)).
                                into(blogUserIamge);

                    }

                    public void updateLikesCount(int count) {

                        blogLikeCount = mView.findViewById(R.id.blog_like_count);

                        blogLikeCount.setText(count + " Likes");
                    }



            }
        }
