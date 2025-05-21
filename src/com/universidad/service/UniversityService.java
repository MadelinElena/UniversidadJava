package com.universidad.service;

import com.universidad.model.*;

import java.util.*;

public class UniversityService {
    private List<Teacher> teachers = new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    private List<UniversityClass> classes = new ArrayList<>();

    public void initializeData() {
        teachers.add(new FullTimeTeacher("Ana", 1000, 5));
        teachers.add(new FullTimeTeacher("Carlos", 1200, 3));
        teachers.add(new PartTimeTeacher("Luisa", 40, 10));
        teachers.add(new PartTimeTeacher("Pedro", 45, 8));

        students.add(new Student("María", "S1", 20));
        students.add(new Student("Juan", "S2", 21));
        students.add(new Student("Laura", "S3", 22));
        students.add(new Student("Sofía", "S4", 19));
        students.add(new Student("Diego", "S5", 23));
        students.add(new Student("Andrés", "S6", 20));

        List<Student> list1 = Arrays.asList(students.get(0), students.get(1));
        List<Student> list2 = Arrays.asList(students.get(2), students.get(3));
        List<Student> list3 = Arrays.asList(students.get(4), students.get(5));
        List<Student> list4 = Arrays.asList(students.get(0), students.get(2));

        classes.add(new UniversityClass("Matemáticas", "A101", teachers.get(0), new ArrayList<>(list1)));
        classes.add(new UniversityClass("Historia", "B202", teachers.get(1), new ArrayList<>(list2)));
        classes.add(new UniversityClass("Biología", "C303", teachers.get(2), new ArrayList<>(list3)));
        classes.add(new UniversityClass("Física", "D404", teachers.get(3), new ArrayList<>(list4)));
    }

    public void printTeachers() {
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(i + ". " + teachers.get(i));
        }
    }

    public void printAllStudents() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(i + ". " + students.get(i));
        }
    }

    public void printAllClasses() {
        for (int i = 0; i < classes.size(); i++) {
            System.out.println(i + ". " + classes.get(i));
        }
    }

    public void printClassDetails(int index) {
        if (index >= 0 && index < classes.size()) {
            UniversityClass c = classes.get(index);
            System.out.println("\n" + c);
            System.out.println("Profesor: " + c.getTeacher());
            System.out.println("Estudiantes:");
            for (Student s : c.getStudents()) {
                System.out.println("- " + s);
            }
        }
    }

    public void addStudentToClass(Student student, int classIndex) {
        if (classIndex >= 0 && classIndex < classes.size()) {
            classes.get(classIndex).addStudent(student);
            students.add(student);
            System.out.println("Estudiante añadido.");
        }
    }

    public void createClass(String name, String room, int teacherIndex, List<Student> selectedStudents) {
        if (teacherIndex >= 0 && teacherIndex < teachers.size()) {
            Teacher teacher = teachers.get(teacherIndex);
            classes.add(new UniversityClass(name, room, teacher, new ArrayList<>(selectedStudents)));
            System.out.println("Clase creada.");
        }
    }

    public Student getStudent(int index) {
        return students.get(index);
    }

    public void printClassesForStudent(String studentId) {
        boolean found = false;
        for (UniversityClass c : classes) {
            for (Student s : c.getStudents()) {
                if (s.getId().equals(studentId)) {
                    System.out.println(c);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Estudiante no encontrado en ninguna clase.");
        }
    }
}
