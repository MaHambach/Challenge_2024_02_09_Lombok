package org.github.mahambach;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UniversityServiceTest {

    @Test
    void testCalculateAverageGradeOfCourse() {
        Course course = new Course(1, "Math",
                new Teacher(1, "Jane Doe", "Math"),
                List.of(
                        new Student(1, "John Doe", "123 Main St", new BigDecimal("2.0")),
                        new Student(2, "Jane Doe", "123 Main St", new BigDecimal("3.0")),
                        new Student(3, "Jack Doe", "123 Main St", new BigDecimal("4.0"))
                )
        );
        BigDecimal expected = new BigDecimal("3.00");

        BigDecimal actual = UniversityService.calculateAverageGradeOfCourse(course);

        assertEquals(expected, actual);
    }

    @Test
    void testCalculateAverageGradeOfUniversity() {
        University university = new University(1, "University of Math", List.of(
                new Course(1, "Math",
                        new Teacher(1, "Jane Doe", "Math"),
                        List.of(
                                new Student(1, "John Doe", "123 Main St", new BigDecimal("2.5")),
                                new Student(2, "Jane Doe", "123 Main St", new BigDecimal("3.2")),
                                new Student(3, "Jack Doe", "123 Main St", new BigDecimal("4.4")),
                                new Student(7, "John Doe", "123 Main St", new BigDecimal("1.3"))
                        )
                ),
                new Course(2, "Physics",
                        new Teacher(2, "John Doe", "Physics"),
                        List.of(
                                new Student(4, "John Doe", "123 Main St", new BigDecimal("1.0")),
                                new Student(5, "Jane Doe", "123 Main St", new BigDecimal("3.0")),
                                new Student(6, "Jack Doe", "123 Main St", new BigDecimal("5.0")),
                                new Student(8, "John Doe", "123 Main St", new BigDecimal("2.0"))
                        )
                )
        ));
        BigDecimal expected = new BigDecimal("3.00");

        BigDecimal actual = UniversityService.calculateAverageGradeOfUniversity(university);

        assertEquals(expected, actual);
    }

    @Test
    void testGetGoodStudents() {
        University university = new University(1, "University of Math", List.of(
                new Course(1, "Math",
                        new Teacher(1, "Jane Doe", "Math"),
                        List.of(
                                new Student(1, "John Doe", "123 Main St", new BigDecimal("2.0")),
                                new Student(2, "Jane Doe", "123 Main St", new BigDecimal("3.0")),
                                new Student(3, "Jack Doe", "123 Main St", new BigDecimal("4.0"))
                        )
                ),
                new Course(2, "Physics",
                        new Teacher(2, "John Doe", "Physics"),
                        List.of(
                                new Student(4, "John Doe", "123 Main St", new BigDecimal("1.0")),
                                new Student(5, "Jane Doe", "123 Main St", new BigDecimal("3.0")),
                                new Student(6, "Jack Doe", "123 Main St", new BigDecimal("5.0"))
                        )
                )
        ));
        List<Student> expected = List.of(
                new Student(1, "John Doe", "123 Main St", new BigDecimal("2.0")),
                new Student(4, "John Doe", "123 Main St", new BigDecimal("1.0"))

        );

        List<Student> actual = UniversityService.getGoodStudents(university);

        assertEquals(expected, actual);
    }
}