package com.example.simplelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_login;
    EditText username_main,password_main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_login = (Button) findViewById(R.id.btn_main_login);
        username_main = (EditText) findViewById(R.id.uname_main);
        password_main = (EditText) findViewById(R.id.pwd_main);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                password_main.onEditorAction(EditorInfo.IME_ACTION_DONE);

                String username = username_main.getText().toString();
                String password = password_main.getText().toString();

                if(username.isEmpty() || password.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Username or password is empty!",Toast.LENGTH_SHORT).show();
                }
                else{
                    if(username.equals(password)){
                        Intent intent = new Intent(getApplicationContext(),Welcome.class);
                        intent.putExtra("username",username);

                        Toast.makeText(getApplicationContext(),"Welcome user",Toast.LENGTH_SHORT).show();
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"You are not allowed!",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}