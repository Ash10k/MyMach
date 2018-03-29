package com.example.ash.mach;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Home extends AppCompatActivity {
public Button login,signup;
public TextView mach,not;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Typeface typeface=Typeface.createFromAsset(getAssets(),"Quesat.otf");
        Typeface elegant=Typeface.createFromAsset(getAssets(),"ElegantLux.otf");
        setContentView(R.layout.activity_home);
        signup=findViewById(R.id.signup);
        signup.setTypeface(typeface);
        login=findViewById(R.id.mylogin);
        login.setTypeface(typeface);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Home.this,Login.class);
                startActivity(intent);
            }
        });
        mach=findViewById(R.id.mach);
        not=findViewById(R.id.not);
        not.setTypeface(elegant);
        mach.setTypeface(typeface);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Home.this,SignUp.class);
                startActivity(intent);
            }
        });
    }
}
