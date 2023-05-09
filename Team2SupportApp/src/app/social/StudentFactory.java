package app.social;

import app.Student;

public class StudentFactory {
    public static Student[] createStudents(int numStudents) {
        Student[] students = new Student[numStudents];
        for (int i = 0; i < numStudents; i++) {
            String name = "Student " + (i + 1);
            String id = "ID " + (i + 1);
            String userName = "User " + (i + 1);
            String password = "Password " + (i + 1);
            Student student = new Student(name, id, userName, password, null);
            students[i] = student;
        }
        return students;
    }
}
