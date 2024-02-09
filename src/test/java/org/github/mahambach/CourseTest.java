package org.github.mahambach;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @Test
    void getId() {
        Course course1 = new Course(1, "Math",
                new Teacher(1, "Jane Doe", "Math"),
                List.of(
                        new Student(1, "John Doe", "123 Main St", new BigDecimal("12.0"))
                )
        );
        int id = 1;

        int actual = course1.getId();

        assertEquals(id, actual);
    }

    @Test
    void getName() {
        Course course1 = new Course(1, "Math",
                new Teacher(1, "Jane Doe", "Math"),
                List.of(
                        new Student(1, "John Doe", "123 Main St", new BigDecimal("12.0"))
                )
        );
        String name = "Math";

        String actual = course1.getName();

        assertEquals(name, actual);
    }

    @Test
    void getTeacher() {
        Course course1 = new Course(1, "Math",
                new Teacher(1, "Jane Doe", "Math"),
                List.of(
                        new Student(1, "John Doe", "123 Main St", new BigDecimal("12.0"))
                )
        );
        Teacher teacher = new Teacher(1, "Jane Doe", "Math");

        Teacher actual = course1.getTeacher();

        assertEquals(teacher, actual);
    }

    @Test
    void getStudents() {
        Course course1 = new Course(1, "Math",
                new Teacher(1, "Jane Doe", "Math"),
                List.of(
                        new Student(1, "John Doe", "123 Main St", new BigDecimal("12.0"))
                )
        );
        List<Student> students = List.of(
                new Student(1, "John Doe", "123 Main St", new BigDecimal("12.0"))
        );

        List<Student> actual = course1.getStudents();

        assertEquals(students, actual);
    }

    @Test
    void testEquals() {
        Course course1 = new Course(1, "Math",
                new Teacher(1, "Jane Doe", "Math"),
                List.of(
                        new Student(1, "John Doe", "123 Main St", new BigDecimal("12.0"))
                )
        );
        Course course2 = new Course(1, "Math",
                new Teacher(1, "Jane Doe", "Math"),
                List.of(
                        new Student(1, "John Doe", "123 Main St", new BigDecimal("12.0"))
                )
        );

        boolean actual = course1.equals(course2);

        assertTrue(actual);
    }

    @Test
    void testHashCode() {
        // TODO
    }

    @Test
    void testToString() {
        Course course1 = new Course(1, "Math",
                new Teacher(1, "Jane Doe", "Math"),
                List.of(
                        new Student(1, "John Doe", "123 Main St", new BigDecimal("12.0"))
                )
        );
        String expected = "Course(id=1, name=Math, teacher=Teacher(id=1, name=Jane Doe, subject=Math), students=[Student(id=1, name=John Doe, address=123 Main St, grade=12.0)])";

        String actual = course1.toString();

        assertEquals(expected, actual);
    }
}