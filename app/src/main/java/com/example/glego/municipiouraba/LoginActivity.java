package com.example.glego.municipiouraba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void registerClicked(View view) {
        Intent intent =  new Intent(LoginActivity.this, RegisterActivity.class);
        startActivityForResult(intent, 1);
    }

    public void loginClicked(View view) {
        Intent intent =  new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
