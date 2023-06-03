package model;

public class University {
    private String name;
    private String head;

    public University(String name, String head) {
        this.name = name;
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public String getHead() {
        return head;
    }
}