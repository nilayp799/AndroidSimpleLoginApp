package com.example.simplelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
    TextView welcomeText;
    Button logoutBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        logoutBtn = (Button)findViewById(R.id.btn_welcome_logout);
        welcomeText = (TextView)findViewById(R.id.welcome_msg);

        String welcomeMessage = (String)getIntent().getExtras().get("username");
        welcomeText.setText(("Welcome "+welcomeMessage).toString());

        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLout = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intentLout);
            }
        });
    }
}