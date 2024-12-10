package com.example.projectencryptedchats;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        Button loginBtn = findViewById(R.id.loginBtn);
        EditText userName = findViewById(R.id.userName);
        EditText userPassword = findViewById(R.id.userPassword);
        Button registerBtn = findViewById(R.id.registerBtn);

        loginBtn.setOnClickListener(v ->{
            String inptName = userName.getText().toString();
            String inptPassword= userPassword.getText().toString();
        });
    }
}