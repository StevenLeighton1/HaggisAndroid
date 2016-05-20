package com.example.asap.haggisandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by asap on 5/20/16.
 */
public class LoggedInActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);      //some super class function
        setContentView(R.layout.login_success); //R is the activity login XML, sets view

        //get 'button' view from XML
        Button backButton = (Button) findViewById(R.id.back_button);

        //set onclick listener, changes onClick function
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToLogin();
            }
        });
    }

    private void goToLogin(){
        Intent back = new Intent(this, LoginActivity.class);
        startActivity(back);
    }
}
