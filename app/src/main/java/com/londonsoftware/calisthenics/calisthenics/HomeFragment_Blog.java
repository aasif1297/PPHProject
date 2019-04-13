package com.londonsoftware.calisthenics.calisthenics;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

public class HomeFragment_Blog extends Fragment {

    private RecyclerView blog_list_view;
    private List<BlogPost> blog_list;
    private FirebaseFirestore firebaseFirestore;
    private BlogRecyclerAdapter blogRecyclerAdapter;
    private StorageReference storageReference;
    ImageView blogImageView;
    public Context context;


    public HomeFragment_Blog() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home_fragment__blog, container, false);

        blog_list = new ArrayList<>();
        blog_list_view = view.findViewById(R.id.blog_list_view);

        blogRecyclerAdapter = new BlogRecyclerAdapter(blog_list);
        blog_list_view.setLayoutManager(new LinearLayoutManager(getContext()));
        blog_list_view.setAdapter(blogRecyclerAdapter);
        blogImageView = view.findViewById(R.id.blog_image);





        firebaseFirestore = FirebaseFirestore.getInstance();
        CollectionReference userphotoRef = firebaseFirestore.collection("Posts");

        userphotoRef.orderBy("timestamp", Query.Direction.DESCENDING).get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                if (task.isSuccessful()) {
                    List<BlogPost> blog_list = new ArrayList<>();
                    for (DocumentSnapshot documentSnapshot : task.getResult()) {
                        if (documentSnapshot.exists()) {

                            String blogPostId = documentSnapshot.getId();
                            BlogPost blogPost = documentSnapshot.toObject(BlogPost.class).withId(blogPostId);
                            blog_list.add(blogPost);
                        }
                    }


                    blogRecyclerAdapter = new BlogRecyclerAdapter(blog_list);
                    blog_list_view.setLayoutManager(new LinearLayoutManager(getContext()));
                    blog_list_view.setAdapter(blogRecyclerAdapter);
                    blogRecyclerAdapter.notifyDataSetChanged();

                } else {
                    Log.d(TAG, "Error getting documents: ", task.getException());
                }
            }
        });


        return view;
    }

}
