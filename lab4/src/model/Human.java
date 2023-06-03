package model;

import java.util.ArrayList;
import java.util.List;

class Human {
    private String name;
    private String surname;
    private String patronymic;
    private Sex sex;

    public Human(String name, String surname, String patronymic, Sex sex) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.sex = sex;
    }
}