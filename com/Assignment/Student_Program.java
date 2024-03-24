package com.Assignment;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Student_Program {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose among the following:");
        System.out.println("1. Add a student");
        System.out.println("2. View students");
        System.out.println("3. Remove a student");
        System.out.println("4. Remove all students");
        System.out.println("5. Exit");

        boolean running = true;
        while (running) {
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter the name:");
                    String stuName = scanner.nextLine();
                    Student student = new Student(stuName);
                    studentList.add(student);
                    System.out.println("Student added Successfully!");
                    break;
                case 2:
                    if (studentList.isEmpty()) {
                        System.out.println("Please Enter students first");
                    } else {
                        System.out.println("Total Students: " + studentList.size());
                        for (Student stu : studentList) {
                            System.out.println(stu.getName());
                        }
                    }
                    break;
                case 3:
                    if (studentList.isEmpty()) {
                        System.out.println("Please Enter students first");
                    } else {
                        System.out.println("Please enter the name of the student:");
                        String studentName = scanner.nextLine();
                        boolean found = false;
                        for (Student stu : studentList) {
                            if (stu.getName().equals(studentName)) {
                                studentList.remove(stu);
                                System.out.println(studentName + " removed successfully");
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Student not found, Please try again!");
                        }
                    }
                    break;
                case 4:
                    if (studentList.isEmpty()) {
                        System.out.println("Please Enter students first");
                    } else {
                        studentList.clear();
                        System.out.println("Students removed successfully!");
                    }
                    break;
                case 5:
                    System.out.println("Exiting....");
                    running = false;
                    break;
                default:
                    System.out.println("Please choose a valid option....");
            }
        }
        scanner.close();
    }
}
