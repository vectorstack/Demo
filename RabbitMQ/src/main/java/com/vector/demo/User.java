package com.vector.demo;

import java.io.Serializable;

/**
 * Created by 12345 on 2018-7-19.
 */
public class User implements Serializable {
    private String name;
    private String pass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
