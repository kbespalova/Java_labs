package controller;

import model.*;

public class StudentCreator
{
    public static Student createStudent(String name, String surname, String patronymic, Sex sex) {
        return new Student(name, surname, patronymic, sex);
    }
}