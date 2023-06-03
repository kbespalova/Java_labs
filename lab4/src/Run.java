import controller.*;
import model.*;
import utils.JsonManager;

public class Run {
    public static void main(String[] args) {
        createTypicalUniversity();
    }

    private static void createTypicalUniversity() {
        University university = new University("Example University");

        Faculty faculty1 = FacultyCreator.createFaculty("Faculty of Science");
        Faculty faculty2 = FacultyCreator.createFaculty("Faculty of Arts");

        Department department1 = new Department("Department of Mathematics");
        Department department2 = new Department("Department of Physics");
        Department department3 = new Department("Department of Literature");
        Department department4 = new Department("Department of History");

        Group group1 = GroupCreator.createGroup("Group 1");
        Group group2 = GroupCreator.createGroup("Group 2");
        Group group3 = GroupCreator.createGroup("Group 3");
        Group group4 = GroupCreator.createGroup("Group 4");
        Group group5 = GroupCreator.createGroup("Group 5");
        Group group6 = GroupCreator.createGroup("Group 6");
        Group group7 = GroupCreator.createGroup("Group 7");
        Group group8 = GroupCreator.createGroup("Group 8");

        Student student1 = StudentCreator.createStudent("John", "Doe", "Smith", Sex.MALE);
        Student student2 = StudentCreator.createStudent("Jane", "Doe", "Smith", Sex.FEMALE);
        Student student3 = StudentCreator.createStudent("Alice", "Johnson", "Brown", Sex.FEMALE);
        Student student4 = StudentCreator.createStudent("Bob", "Johnson", "Brown", Sex.MALE);
        Student student5 = StudentCreator.createStudent("Charlie", "Williams", "Davis", Sex.MALE);
        Student student6 = StudentCreator.createStudent("Eve", "Williams", "Davis", Sex.FEMALE);
        Student student7 = StudentCreator.createStudent("Michael", "Taylor", "Miller", Sex.MALE);
        Student student8 = StudentCreator.createStudent("Emily", "Taylor", "Miller", Sex.FEMALE);

        group1.addStudent(student1);
        group1.addStudent(student2);
        group2.addStudent(student3);
        group2.addStudent(student4);
        group3.addStudent(student5);
        group3.addStudent(student6);
        group4.addStudent(student7);
        group4.addStudent(student8);
        group5.addStudent(student1);
        group5.addStudent(student2);
        group6.addStudent(student3);
        group6.addStudent(student4);
        group7.addStudent(student5);
        group7.addStudent(student6);
        group8.addStudent(student7);
        group8.addStudent(student8);

        department1.addGroup(group1);
        department1.addGroup(group2);
        department2.addGroup(group3);
        department2.addGroup(group4);
        department3.addGroup(group5);
        department3.addGroup(group6);
        department4.addGroup(group7);
        department4.addGroup(group8);

        faculty1.addDepartment(department1);
        faculty1.addDepartment(department2);
        faculty2.addDepartment(department3);
        faculty2.addDepartment(department4);

        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        // Записати університет у форматі JSON та зберегти його у файл
        JsonManager jsonManager = new JsonManager();
        jsonManager.saveUniversityToJson(university, "university.json");

        // Зчитати університет з файлу у форматі JSON
        University restoredUniversity = jsonManager.loadUniversityFromJson("university.json");

        // Порівняння oldUniversity та newUniversity за допомогою методу equals
        boolean isEqual = university.equals(restoredUniversity);
        System.out.println("Are universities equal? " + isEqual);
    }
}
