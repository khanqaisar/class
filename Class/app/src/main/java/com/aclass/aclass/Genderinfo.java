package com.aclass.aclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Genderinfo extends AppCompatActivity {
    Button nexte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genderinfo);

        nexte =(Button)findViewById(R.id.nexte);
        nexte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ex = new Intent(getApplicationContext(),Explorer.class);
                startActivity(ex);
            }
        });

    }
}
