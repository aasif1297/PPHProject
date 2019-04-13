package com.londonsoftware.calisthenics.calisthenics;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.muddzdev.styleabletoastlibrary.StyleableToast;


public class Herbal_Diary_Prelogin extends AppCompatActivity {

    private FirebaseAuth mAuth;
    Toolbar mainToolbar;
    private FloatingActionButton addPostBtn;
    private FirebaseFirestore firebaseFirestore;

    private String current_user_id;

    private BottomNavigationView mainbottomNav;

    private HomeFragment_Blog homeFragment_blog;
    private NotificationsFragment_Blog notificationsFragment_blog;
    private AccountFragment accountFragment;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herbal_diary_prelogin);


        mAuth = FirebaseAuth.getInstance();
        firebaseFirestore = FirebaseFirestore.getInstance();


        mainToolbar = findViewById(R.id.main_toolbar);
        setSupportActionBar(mainToolbar);

        if (mAuth.getCurrentUser() !=null) {

            mainbottomNav = findViewById(R.id.mainBottomNav);


            homeFragment_blog = new HomeFragment_Blog();
            notificationsFragment_blog = new NotificationsFragment_Blog();
            accountFragment = new AccountFragment();

            replaceFragment(homeFragment_blog);


            mainbottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                    switch (menuItem.getItemId()) {

                        case R.id.bottom_action_home:
                            replaceFragment(homeFragment_blog);
                            return true;

                        case R.id.bottom_notifications_action:
                            replaceFragment(notificationsFragment_blog);
                            return true;

                        case R.id.bottom_action_account:
                            replaceFragment(accountFragment);
                            return true;

                        default:
                            return false;


                    }

                }
            });


            addPostBtn = findViewById(R.id.add_post_btn);
            addPostBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent newPostintent = new Intent(Herbal_Diary_Prelogin.this, NewPostActivity.class);
                    startActivity(newPostintent);
                }
            });


        }

    }

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser == null){

            sendToLogin();

        } else {

            current_user_id = mAuth.getCurrentUser().getUid();
            firebaseFirestore.collection("Users").document(current_user_id).get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                @Override
                public void onComplete(@NonNull Task<DocumentSnapshot> task) {

                    if (task.isSuccessful()) {

                        if (!task.getResult().exists()) {

                            Intent setupIntent = new Intent(Herbal_Diary_Prelogin.this, SetupActivity.class);
                            startActivity(setupIntent);
                            finish();

                        }

                    } else {
                        String errorMessage = task.getException().getMessage();
                        StyleableToast.makeText(Herbal_Diary_Prelogin.this, "Error : " + errorMessage, Toast.LENGTH_SHORT, R.style.mytoast3).show();
                    }

                }
            });
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_diary_new, menu);



        return true;


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.action_logout_button:

                logOut();

            case R.id.action_settings_button:

                Intent intent_settings = new Intent(Herbal_Diary_Prelogin.this, SetupActivity.class);
                startActivity(intent_settings);
                finish();






            return true;

            default:

                return false;
        }

    }




    private void logOut() {
        mAuth.signOut();
        sendToLogin();

    }



    private void sendToLogin() {

        Intent intent = new Intent(Herbal_Diary_Prelogin.this, Herbal_Diary.class);
        startActivity(intent);
        finish();
    }

    private void replaceFragment(Fragment fragment){

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_container, fragment);
        fragmentTransaction.commit();

    }

}
















        /*
        Toolbar toolbar = findViewById(R.id.toolbar);

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
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_diary, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == R.id.action_add) {
            startActivity(new Intent(Herbal_Diary.this, PostActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }


}
*/

