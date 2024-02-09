package org.github.mahambach;

import java.math.BigDecimal;
import java.util.List;

public class BonusMain {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "John Doe", "Math");

        List<Student> studentList = List.of(
                new Student(1, "Alice", "1234 Main St", new BigDecimal("3.5")),
                new Student(2, "Bob", "5678 Elm St", new BigDecimal("3.0")),
                new Student(3, "Charlie", "91011 Oak St", new BigDecimal("3.8")),
                new Student(4, "Daisy", "121314 Pine St", new BigDecimal("4.0")),
                new Student(5, "Eve", "151617 Cedar St", new BigDecimal("3.7")),
                new Student(6, "Frank", "181920 Maple St", new BigDecimal("3.9")),
                new Student(7, "Grace", "212223 Birch St", new BigDecimal("3.6")),
                new Student(8, "Hank", "242526 Spruce St", new BigDecimal("3.4")),
                new Student(9, "Ivy", "272829 Fir St", new BigDecimal("3.3")),
                new Student(10, "Jack", "303132 Palm St", new BigDecimal("3.2")),
                new Student(11, "Kate", "333435 Pineapple St", new BigDecimal("1.0")),
                new Student(12, "Liam", "363738 Banana St", new BigDecimal("1.7")),
                new Student(13, "Mia", "394041 Apple St", new BigDecimal("2.1")),
                new Student(14, "Noah", "424344 Orange St", new BigDecimal("2.3")),
                new Student(15, "Olivia", "454647 Lemon St", new BigDecimal("3.1")),
                new Student(16, "Paul", "484950 Lime St", new BigDecimal("3.0")),
                new Student(17, "Quinn", "515253 Grape St", new BigDecimal("4.0")),
                new Student(18, "Ryan", "545556 Cherry St", new BigDecimal("3.7")),
                new Student(19, "Sofia", "575859 Blueberry St", new BigDecimal("5.0")),
                new Student(20, "Tyler", "606162 Raspberry St", new BigDecimal("4.0"))
        );

        Course course = new Course(1, "Math", teacher, studentList);

        University university = new University(1, "University of Math", List.of(course));


        System.out.println("Average Grade of the course " + course.getName() + ": " + UniversityService.calculateAverageGradeOfCourse(course));
        System.out.println();
        System.out.println("Average Grade of the University " + university.getName() + ": " + UniversityService.calculateAverageGradeOfUniversity(university));
        System.out.println();
        System.out.println("Students with a grade of 2 or higher in the University " + university.getName() + ": ");
        List<Student> goodStudents = UniversityService.getGoodStudents(university);
        goodStudents.forEach(System.out::println);
    }
}
