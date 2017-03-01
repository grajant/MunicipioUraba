package com.example.glego.municipiouraba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    //private EditText[4] dataText;
    //private String[4] message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        /*dataText[0] = (EditText) findViewById(R.id.username);
        dataText[1] = (EditText) findViewById(R.id.password);
        dataText[2] = (EditText) findViewById(R.id.repassword);
        dataText[3] = (EditText) findViewById(R.id.email);*/

        //message[0] = getString()
    }

    public void registerClicked(View view) {
        for (int i = 0; i < 4; i++){

        }
    }

    public void cancelClicked(View view) {
    }
}
