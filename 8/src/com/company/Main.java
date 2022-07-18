package com.company;

public class Main {
    public static void main(String[] args) {
        //Программист
        Worker programmer = new Programmer();
        programmer.goToWork();
        programmer.goToVacation(28);
        //Тестировщик
        Worker qa = new QA();
        qa.goToWork();
        qa.goToVacation(14);
        //ДевОпс
        Worker devOps = new DevOps();
        devOps.goToWork();
        devOps.goToVacation(25);
        //Аналитик
        Worker analytic = new Analytic();
        analytic.goToWork();
        analytic.goToVacation(32);
    }
}
