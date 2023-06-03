package model;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private List<Department> departments;

    public Faculty(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }
}