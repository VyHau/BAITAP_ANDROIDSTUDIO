package com.example.baitap_chuyenactivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        Intent i = getIntent();
        String username= i.getStringExtra("email");
        String passWord = i.getStringExtra("pass");
        TextView txt = findViewById(R.id.tvUsername_2311);
        TextView email = findViewById(R.id.tvEmail_2311);
        TextView pass = findViewById(R.id.tvPass_2311);
        ImageButton btnSetting = findViewById(R.id.btnSetting_2311);
        txt.setText(username);
        email.setText(username);
        pass.setText(passWord);
        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
