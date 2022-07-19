package com.company;

import java.util.Objects;

public class Human {

    private String name;
    private String lastName;
    private String patronymic;
    private String city;
    private String street;
    private String house;
    private String flat;
    private String numberPassport;

    @Override
    public String toString() {
        return  name + " " + lastName + " " + patronymic + '\n' +
                "Пасспорт: " + '\n' +
                "Номер: "+ numberPassport + '\n' +
                "Город " + city + " Улица " + street + " Дом " + house  + " Квартира " + flat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(numberPassport, human.numberPassport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberPassport);
    }
}
