package com.example.formationstage2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {
private TextView goToSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        goToSignIn=findViewById(R.id.goToSignIn);

        goToSignIn.setOnClickListener(v -> {
            startActivity(new Intent(SignUpActivity.this,SignInActivity.class));
     });

    }
}