package com.londonsoftware.calisthenics.calisthenics;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.muddzdev.styleabletoastlibrary.StyleableToast;

public class RegisterActivity extends AppCompatActivity {

    EditText reg_email;
    EditText reg_password;
    EditText reg_confirm_password;
    Button reg_btn;
    TextView reg_already_user;
    ProgressBar reg_progress;

    FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mAuth = FirebaseAuth.getInstance();

        reg_email = findViewById(R.id.reg_username_edittxt);
        reg_password = findViewById(R.id.reg_password_edittxt);
        reg_confirm_password = findViewById(R.id.reg_password_confirm_edittxt);
        reg_btn = findViewById(R.id.reg_button);
        reg_already_user = findViewById(R.id.register_textview);
        reg_progress = findViewById(R.id.reg_progressbar);


        reg_already_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent already_intent = new Intent(RegisterActivity.this, Herbal_Diary.class);
                startActivity(already_intent);
            }
        });


        reg_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = reg_email.getText().toString();
                String password = reg_password.getText().toString();
                String confirm_pass = reg_confirm_password.getText().toString();

                if(!TextUtils.isEmpty(email) && !TextUtils.isEmpty(password) & !TextUtils.isEmpty(confirm_pass)) {

                    if (password.equals(confirm_pass)) {

                        reg_progress.setVisibility(View.VISIBLE);

                        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {

                                if (task.isSuccessful()) {

                                    Intent setupIntent = new Intent(RegisterActivity.this, SetupActivity.class);
                                    startActivity(setupIntent);
                                    finish();


                                } else {
                                    String errorMessage = task.getException().getMessage();
                                    StyleableToast.makeText(RegisterActivity.this, "Error : " + errorMessage, Toast.LENGTH_SHORT, R.style.mytoast3).show();


                                }

                                reg_progress.setVisibility(View.INVISIBLE);

                            }
                        });

                    } else {

                        StyleableToast.makeText(RegisterActivity.this, "Password Fields Do Not Match", Toast.LENGTH_SHORT, R.style.mytoast3).show();
                    }

                }
            }
        });





    }


    @Override
    protected void onStart() {
        super.onStart();

        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){

            sendtoMain();
        }
    }



    private void sendtoMain() {

        Intent intent = new Intent(RegisterActivity.this, Herbal_Diary_Prelogin.class);
        startActivity(intent);
        finish();
    }
}
