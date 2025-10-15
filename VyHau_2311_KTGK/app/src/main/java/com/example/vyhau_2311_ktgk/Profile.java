package com.example.vyhau_2311_ktgk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.profile);
        TextView email_2311 = findViewById(R.id.email_2311);
        TextView pass_2311 = findViewById(R.id.pass_2311);
        ImageButton btn_2311 = findViewById(R.id.btn_2311);
        Intent i = getIntent();
        email_2311.setText("Email: "+ i.getStringExtra("email_2311"));
        pass_2311.setText("Mật khẩu hiện tại: " + i.getStringExtra("pass_2311"));
        btn_2311.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
