package com.example.shipra.realmdb_test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import io.realm.Realm;
import io.realm.RealmResults;

public class DisplayData extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.displayview);

        TextView _display= (TextView)findViewById(R.id.mainDisplay);

        Realm.init(this);
        Realm realm= Realm.getDefaultInstance();

        RealmResults<person> result=realm.where(person.class).findAll();

        for(int i=0;i< result.size();i++){


            _display.append(result.get(i).getName()+"\n"+result.get(i).getEmail()+"\n\n\n");




        }





    }
}
