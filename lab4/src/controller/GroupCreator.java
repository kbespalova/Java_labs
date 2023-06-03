package controller;

import model.*;

public class GroupCreator
{
    public static Group createGroup(String name) {
        return new Group(name);
    }
}