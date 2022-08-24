package com.company;

public class User {
    private int id;
    private String name;
    private String secondName;
    private int age;
    private boolean haveWork;

    public User(int id, String name, String secondName, int age, boolean haveWork) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.haveWork = haveWork;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public boolean isHaveWork() {
        return haveWork;
    }

    public void setHaveWork(boolean haveWork) {
        this.haveWork = haveWork;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return id+"|"+name+"|"+secondName+"|"+age+"|"+haveWork;
    }
}
