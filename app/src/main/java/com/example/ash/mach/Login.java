package com.example.ash.mach;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
public Button sign;
public EditText uname,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Typeface typeface=Typeface.createFromAsset(getAssets(),"Quesat.otf");
        Typeface elegant=Typeface.createFromAsset(getAssets(),"ElegantLux.otf");
        sign=findViewById(R.id.login);
        sign.setTypeface(typeface);
        uname=findViewById(R.id.username);
        uname.setTypeface(elegant);
        pass=findViewById(R.id.password);
        pass.setTypeface(elegant);

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Login.this,AfterLogin.class);
                startActivity(intent);
            }
        });
    }
}
