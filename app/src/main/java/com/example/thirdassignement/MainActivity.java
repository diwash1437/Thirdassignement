package com.example.thirdassignement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btnLogin;
    String  username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                username=etUsername.getText().toString();

                password = etPassword.getText().toString();
                if (username.equals("softwarica") && password.equals("coventry")) {
                    Intent intent=new Intent(MainActivity.this, BottomN)
                    //Intent intent = new Intent(MainActivity.this, BottomNavigationActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
