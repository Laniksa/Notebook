package com.company;
public class Task {
   private String name;

   public Task(String name){
       this.name = name;
   }
    @Override
    public String toString() {
       //count++;
       return name + "\n";
    }
}
