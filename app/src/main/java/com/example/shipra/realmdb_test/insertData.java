package com.example.shipra.realmdb_test;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.util.Date;
import java.util.jar.Attributes;

import io.realm.Realm;

public class insertData extends AppCompatActivity {


    EditText _name,_email;

    Realm realm;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insertview);


        _name=(EditText)findViewById(R.id.name_edt);
        _email=(EditText)findViewById(R.id.email_edt);
          Realm.init(this);
          realm= realm.getDefaultInstance();

          findViewById(R.id.btn_insert).setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {

                  realm.beginTransaction();

                  person obj = realm.createObject(person.class);
                  obj.setId(new Date().toString());
                  obj.setName(_name.getText().toString());
                  obj.setEmail(_email.getText().toString());


                  realm.commitTransaction();












              }
          });








    }
}
