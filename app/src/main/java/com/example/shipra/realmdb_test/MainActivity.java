package com.example.shipra.realmdb_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         findViewById(R.id.insert).setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i=new Intent(MainActivity.this, insertData.class);
                 startActivity(i);

             }
         });


        findViewById(R.id.view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, DisplayData.class);
                startActivity(i);

            }
        });

    }
}
