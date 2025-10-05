package com.example.baitap_chuyenactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        EditText editText1 = findViewById(R.id.editUsername_2311);
        EditText editText2 = findViewById(R.id.editPassword_2311);
        Button btn = findViewById(R.id.btnLogin_2311);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(Login.this,Profile.class);
                String username = editText1.getText().toString();
                String pass = editText2.getText().toString();
                i.putExtra("email",username);
                i.putExtra("pass",pass);
                startActivity(i);
            }
        });
    }
}