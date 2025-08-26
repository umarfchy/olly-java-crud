package com.example.bookbuddy;

import java.util.UUID;

public class Book{
    private int id;
    private String name;
    private String uuid;

    public Book(int id, String name){
        this.id = id;
        this.name = name;
        this.uuid = UUID.randomUUID().toString();
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getUUID(){
        return uuid;
    }
}
