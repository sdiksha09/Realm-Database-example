package com.example.shipra.realmdb_test;

import io.realm.RealmObject;

public class person extends RealmObject {

    String Id;
    String Name;
    String Email;


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    @Override
    public String toString() {
        return "person{" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                "\n";
    }
}
