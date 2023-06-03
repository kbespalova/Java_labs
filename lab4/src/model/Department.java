package model;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Group> groups;

    public Department(String name) {
        this.name = name;
        this.groups = new ArrayList<>();
    }

    public void addGroup(Group group) {
        groups.add(group);
    }
}