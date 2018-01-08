package com.example.hp.retrofitexample;

/**
 * Created by HP on 10/29/2017.
 */

public class JsonObjectClass {
    private String id,first_name,email;

    public JsonObjectClass(String id, String first_name, String email) {
        this.id = id;
        this.first_name = first_name;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getEmail() {
        return email;
    }
}
