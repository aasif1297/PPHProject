package com.londonsoftware.calisthenics.calisthenics;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.muddzdev.styleabletoastlibrary.StyleableToast;


public class Herbal_Diary extends AppCompatActivity {
    ImageView backspace;
    EditText loginemail_text;
    EditText loginpass_text;
    Button loginbtn;
    TextView register_user_textview;
    ProgressBar loginProgress;

    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herbal_diary);


        loginemail_text = findViewById(R.id.login_username_edittxt);
        loginpass_text = findViewById(R.id.login_password_edittxt);
        loginbtn = findViewById(R.id.login_button);
        register_user_textview = findViewById(R.id.register_textview);
        loginProgress = findViewById(R.id.login_progressbar);

        mAuth = FirebaseAuth.getInstance();


        register_user_textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reg_intent = new Intent(Herbal_Diary.this, RegisterActivity.class);
                startActivity(reg_intent);
            }
        });



        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String loginEmail = loginemail_text.getText().toString();
                String loginPass = loginpass_text.getText().toString();

                if (!TextUtils.isEmpty(loginEmail) && !TextUtils.isEmpty(loginPass)){
                    loginProgress.setVisibility(View.VISIBLE);

                    mAuth.signInWithEmailAndPassword(loginEmail, loginPass).addOnCompleteListener( new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if (task.isSuccessful()){

                                sendToPrelogin();

                            } else {

                                String errorMessage = task.getException().getMessage();
                                StyleableToast.makeText(Herbal_Diary.this, "Error : " + errorMessage, Toast.LENGTH_SHORT, R.style.mytoast3).show();
                            }

                            loginProgress.setVisibility(View.INVISIBLE);

                        }
                    });

                }
            }
        });








        backspace = findViewById(R.id.backspace);
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();

            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser != null) {

            sendToPrelogin();
        }

    }

    private void sendToPrelogin() {

        Intent intent = new Intent(Herbal_Diary.this, Herbal_Diary_Prelogin.class);
        startActivity(intent);
        finish();
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

