import controller.DepartmentCreator;
import controller.FacultyCreator;
import controller.StudentCreator;
import controller.UniversityCreator;
import model.*;

public class Run {
    public static void main(String[] args) {
        createUniversity();
    }

    public static void createUniversity() {
        // Створення студента
        StudentCreator studentCreator = new StudentCreator();
        Student student = studentCreator.createStudent("Kateryna", "Bespalova", Sex.FEMALE);

        // Створення групи
        Group group = new Group("124-20-1", student);

        // Створення кафедри
        DepartmentCreator departmentCreator = new DepartmentCreator();
        Department department = departmentCreator.createDepartment("System analysis", student);

        // Створення факультету
        FacultyCreator facultyCreator = new FacultyCreator();
        Faculty faculty = facultyCreator.createFaculty("Faculty of IT", student);

        // Створення університету
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createUniversity("Dnipro University of Technolody", student);

        // Вивід даних університету
        System.out.println("University: " + university.getName());
        System.out.println("Head: " + university.getHead().getFullName());
        System.out.println();

        System.out.println("Faculty: " + faculty.getName());
        System.out.println("Head: " + faculty.getHead().getFullName());
        System.out.println();

        System.out.println("Department: " + department.getName());
        System.out.println("Head: " + department.getHead().getFullName());
        System.out.println();

        System.out.println("Group: " + group.getName());
        System.out.println("Head: " + group.getHead().getFullName());
    }
}
