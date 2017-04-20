package com.deitel.addressbook;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        final EditText id = (EditText) findViewById(R.id.emailAddress);
        final EditText pw = (EditText) findViewById(R.id.passWord);

        Button loginBtn = (Button) findViewById(R.id.chat_sdk_btn_login);
        Button regBtn = (Button) findViewById(R.id.chat_sdk_btn_register);

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                Toast.makeText(context, "New account registered", Toast.LENGTH_LONG).show();
                Handler myHandler = new Handler();
                myHandler.postDelayed(mMyRunnable, 1000);
            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
            }
        });
    }

    private Runnable mMyRunnable = new Runnable() {
        @Override
        public void run() {
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
        }
    };
}