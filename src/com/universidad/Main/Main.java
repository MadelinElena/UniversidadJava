package com.universidad.Main;
import com.universidad.service.UniversityService;

import com.universidad.model.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        UniversityService universityService = new UniversityService();
        Scanner scanner = new Scanner(System.in);

        universityService.initializeData();
        int option = -1;

        while (option != 6) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Ver todos los profesores");
            System.out.println("2. Ver todas las clases");
            System.out.println("3. Crear nuevo estudiante y añadir a una clase");
            System.out.println("4. Crear nueva clase");
            System.out.println("5. Ver clases de un estudiante (por ID)");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    universityService.printTeachers();
                    break;
                case 2:
                    universityService.printAllClasses();
                    System.out.print("Selecciona una clase (índice): ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    universityService.printClassDetails(index);
                    break;
                case 3:
                    System.out.print("Nombre del estudiante: ");
                    String name = scanner.nextLine();
                    System.out.print("ID del estudiante: ");
                    String id = scanner.nextLine();
                    System.out.print("Edad del estudiante: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    Student newStudent = new Student(name, id, age);
                    universityService.printAllClasses();
                    System.out.print("Selecciona una clase (índice): ");
                    int classIndex = scanner.nextInt();
                    scanner.nextLine();
                    universityService.addStudentToClass(newStudent, classIndex);
                    break;
                case 4:
                    System.out.print("Nombre de la clase: ");
                    String className = scanner.nextLine();
                    System.out.print("Nombre del salón: ");
                    String classroom = scanner.nextLine();
                    universityService.printTeachers();
                    System.out.print("Selecciona un profesor (índice): ");
                    int teacherIndex = scanner.nextInt();
                    scanner.nextLine();
                    universityService.printAllStudents();
                    List<Student> selectedStudents = new ArrayList<>();
                    System.out.print("¿Cuántos estudiantes deseas agregar? ");
                    int num = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < num; i++) {
                        System.out.print("Índice del estudiante #" + (i + 1) + ": ");
                        int studentIndex = scanner.nextInt();
                        scanner.nextLine();
                        selectedStudents.add(universityService.getStudent(studentIndex));
                    }
                    universityService.createClass(className, classroom, teacherIndex, selectedStudents);
                    break;
                case 5:
                    System.out.print("ID del estudiante: ");
                    String studentId = scanner.nextLine();
                    universityService.printClassesForStudent(studentId);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }

        scanner.close();
    }
}
