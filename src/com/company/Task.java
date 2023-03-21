package com.company;

import java.util.ArrayList;
import java.util.List;

public class Task {
   private String name;
   private int count;

   public Task(String name){
       this.name = name;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name + '\'';
    }
}
