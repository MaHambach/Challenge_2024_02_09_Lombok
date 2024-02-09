package org.github.mahambach;
//  Create a class UniversityService and implement the following methods there:
//
//  Write a function to calculate the average grade of a Course (Pass the Course as a parameter).
//
//  Write a function to calculate the average grade of the entire University (Pass a University object
//  as a parameter).
//
//  Write a function that retrieves all students from a University with a minimum grade of 2/"Good"
//  and returns them as a list (Pass a University object as a parameter).

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.Collectors;

public class UniversityService {
    public static BigDecimal calculateAverageGradeOfCourse(Course course) {
        return course.getStudents().stream()
                .map(Student::getGrade)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .divide(BigDecimal.valueOf(course.getStudents().size()),2, RoundingMode.HALF_UP);
    }

    public static BigDecimal calculateAverageGradeOfUniversity(University university) {
        return university.getCourses().stream()
                .map(UniversityService::calculateAverageGradeOfCourse)
                .peek(System.out::println)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .divide(BigDecimal.valueOf(
                        university
                                .getCourses()
                                .stream()
                                .flatMap(course -> course.getStudents().stream())
                                .toList()
                                .size()),2, RoundingMode.HALF_UP);
    }

    public static List<Student> getGoodStudents(University university) {
        return university.getCourses().stream()
                .flatMap(course -> course.getStudents().stream())
                .filter(student -> student.getGrade().compareTo(BigDecimal.valueOf(2)) <= 0)
                .collect(Collectors.toList());
    }

}
