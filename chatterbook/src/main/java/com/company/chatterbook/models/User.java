package com.company.chatterbook.models;

import java.util.ArrayList;
import java.util.List;

public class User {
    public String name;
    public List<ChatterPost> chatterPosts = new ArrayList<>();
    public User(String name){
        this.name=name;
    }

    public void setChatterPosts(List<ChatterPost> l, ChatterPost t){
        for (ChatterPost b:l) {
            chatterPosts.add(b);
        }
        chatterPosts.add(t);
    }
    public void setChatterPosts(List<ChatterPost> l){
        for(ChatterPost b: l){
            chatterPosts.add(b);
        }
    }
}
