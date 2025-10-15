package com.example.vyhau_2311_ktgk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button btnLogin = findViewById(R.id.btnLogin_2311);
        EditText email_2311 = findViewById(R.id.email_2311);
        EditText pass_2311 = findViewById(R.id.pass_2311);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Profile.class);
                i.putExtra("email_2311",email_2311.getText().toString());
                i.putExtra("pass_2311",pass_2311.getText().toString());
                startActivity(i);
            }
        });
    }
}