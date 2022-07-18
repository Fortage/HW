package com.company;

public class QA extends Worker {

    String name; // имя
    String lastName; // фамилия
    String profession; // профессия

    public QA()
    {
        name = "Mikhail";
        lastName = "Korelin";
        profession = "QA";
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
