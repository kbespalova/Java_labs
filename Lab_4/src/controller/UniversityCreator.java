package controller;

import model.University;

public class UniversityCreator
{
    public University createUniversity(String name, String head)
    {
        return new University(name, head);
    }
}