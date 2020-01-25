package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText name;
    private EditText password;
    private Button login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.etName);
        password = (EditText) findViewById(R.id.etPassword);

        login = (Button)findViewById(R.id.btnLogin);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(name.getText().toString(),password.getText().toString() );
            }
        }
        );

    }

    private void validate(String userName, String userPassword) {
        if ((userName.equals("admin")) && (userPassword.equals("pass"))) {
            Intent intent1 = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent1);
        } else if ((userName.equals("")) && (userPassword.equals(""))) {
            Intent intent2 = new Intent(MainActivity.this, ThirdActivity.class);
            startActivity(intent2);
        }
    }

}
