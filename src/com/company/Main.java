package com.company;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("====>DOG GERMES<====");
        Dog dog= new Dog();
        dog.setName("Germes");
        dog.setColor("White");
        dog.setBreed("Alabai");
        dog.setAge(3);

        System.out.println("Dog name: "+dog.getName()+"\n"+"Dog color: "+dog.getColor()+"\n"+"Dog bread: "+dog.getBreed()
        +"\n"+"Dog age: "+dog.getAge()+"\n");

        System.out.println("====>CAT MARKIS<====");
        Cat cat=new Cat();
        cat.setName("Markis");
        cat.setColor("Yellow");
        cat.setBreed("Syamskiy");
        cat.setAge(5);

        System.out.println("Cat name : "+cat.getName()+"\n"+"Cat color :"+cat.getColor()+"\n"+"Cat breed :"+cat.getBreed()
                +"\n"+"Cat age: "+cat.getAge()+"\n");


        System.out.println("====>PARROT JIM<====");
        Parrot parrot= new Parrot();
        parrot.setName("Jim");
        parrot.setColor("Red");
        parrot.setBreed("Brazil");
        parrot.setAge(2);
        System.out.println("Parrot name: "+parrot.getName()+"\n"+"Parrot color: "+parrot.getColor()+"\n"+"Parrot breed: "
        +parrot.getBreed()+"\n"+"Parrot age: "+parrot.getAge()+"\n");


        System.out.println("====>FISH NEO<====");
        Fish fish=new Fish();
        fish.setName("Neo");
        fish.setColor("White");
        fish.setBreed("Forel");
        fish.setAge(1);
        System.out.println("Fish name: "+fish.getName()+"\n"+"Fish color: "+fish.getColor()+"\n"+"Fish breed: "+fish.getBreed()
        +"\n"+"Fish age"+fish.getAge());



    }
}
