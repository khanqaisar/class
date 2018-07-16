package com.aclass.aclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Forgetpassword extends AppCompatActivity {

    Button Sendmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetpassword);

        Sendmail =(Button)findViewById(R.id.Sendmail);

        Sendmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ver = new Intent(getApplicationContext(),Verifivation.class);
                startActivity(ver);
            }
        });

    }
}
