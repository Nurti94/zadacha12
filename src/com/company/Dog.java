package com.company;

public class Dog {
    private  String name;
    private  String color;
    private  String breed;
    private  int age;

      void setName(String dogName){

        name=dogName;
    }

     void setColor(String dogColor){
        color=dogColor;
    }

     void setBreed(String dogBreed){
        breed = dogBreed;
    }

     void setAge(int dogAge){
        age=dogAge;
    }

     String getName() {
        return name;
    }
    String getColor() {
        return color;
    }
    String getBreed() {
        return breed;
    }
    int getAge() {
        return age;

    }

}

