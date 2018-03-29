package com.example.ash.mach;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {
public EditText phone,newemail,newpass;
public Button signme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Typeface typeface=Typeface.createFromAsset(getAssets(),"Quesat.otf");
        Typeface elegant=Typeface.createFromAsset(getAssets(),"ElegantLux.otf");
        phone=findViewById(R.id.phone);
        phone.setTypeface(elegant);
        newemail=findViewById(R.id.newemail);
        newemail.setTypeface(elegant);
        newpass=findViewById(R.id.newpassword);
        newpass.setTypeface(elegant);

        signme=findViewById(R.id.signmeup);
        signme.setTypeface(typeface);
    }
}
