package com.company;

public class DevOps extends Worker {

    String name; // имя
    String lastName; // фамилия
    String profession; // профессия

    public DevOps()
    {
        name = "Kirill";
        lastName = "Onegin";
        profession = "DevOps";
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
        System.out.println("i'm work 8 Hour 5/2");
    }
}
