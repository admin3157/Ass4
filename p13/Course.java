package p13;

import java.util.Scanner;

public class Course {

    String studentNames[];
    String courseNames[];
    int size;

    // Constructor
    public Course(int size) {
        this.size = size;
        studentNames = new String[size];
        courseNames = new String[size];
    }

    // Accept details
    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            System.out.print("Enter Student Name " + (i + 1) + ": ");
            studentNames[i] = sc.nextLine();

            System.out.print("Enter Course Name " + (i + 1) + ": ");
            courseNames[i] = sc.nextLine();
        }
    }

    // Display details
    public void displayDetails() {
        System.out.println("\n--- Course Enrollment Details ---");

        for (int i = 0; i < size; i++) {
            System.out.println(
                studentNames[i].toUpperCase() + " -> " + courseNames[i].toUpperCase()
            );
        }
    }

    // Count students in a specific course
    public void countStudentsInCourse(String course) {
        int count = 0;

        for (int i = 0; i < size; i++) {
            // String handling (case-insensitive comparison)
            if (courseNames[i].equalsIgnoreCase(course)) {
                count++;
            }
        }

        System.out.println("\nStudents enrolled in " + course.toUpperCase() + ": " + count);
    }
}