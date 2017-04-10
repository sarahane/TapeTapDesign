package com.example.sarahane.tapetapdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }
    //Lägger till så man med hjälp av knapptryck kan komma vidare till nästa
    //sida. Knapp finns i LogIn (button: log_in: android:onClick="gotoAddUser"/>
    // Lägg även till i Manifest

    public void gotoAddUser(View v){
        startActivity(new Intent(LogIn.this, AddUser.class));
    }

    public void gotoForgotPass(View v){
        startActivity(new Intent(LogIn.this, ForgotPass.class));
    }

    public void gotoChildMenu(View v){
        startActivity(new Intent(LogIn.this, ChildMenu.class));
    }

}

