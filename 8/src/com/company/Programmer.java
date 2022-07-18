package com.company;

public class Programmer extends Worker {

    String name; // имя
    String lastName; // фамилия
    String profession; // профессия

    public Programmer()
    {
        name = "Evgeniya";
        lastName = "Korelina";
        profession = "programmer";
    }

    @Override
    public void goToVacation(int days) {
        System.out.println(name+ " " + lastName);
        System.out.println("I'm "+profession);
        System.out.println("I'm going on vacation for " +days+ " days");

    }

    @Override
    public void goToWork() {
        System.out.println("i'm "+profession);
        System.out.println("My name is "+name);
        System.out.println("i'm work 8H 5/2");
    }
}
