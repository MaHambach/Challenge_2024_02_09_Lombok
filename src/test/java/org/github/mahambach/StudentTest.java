package org.github.mahambach;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getId() {
        Student student = new Student(1, "John Doe", "123 Main St", new BigDecimal("12.0"));
        int id = 1;

        int actual = student.getId();

        assertEquals(id, actual);
    }

    @Test
    void getName() {
        Student student = new Student(1, "John Doe", "123 Main St", new BigDecimal("12.0"));
        String name = "John Doe";

        String actual = student.getName();

        assertEquals(name, actual);
    }

    @Test
    void getAddress() {
        Student student = new Student(1, "John Doe", "123 Main St", new BigDecimal("12.0"));
        String address = "123 Main St";

        String actual = student.getAddress();

        assertEquals(address, actual);
    }

    @Test
    void getGrade() {
        Student student = new Student(1, "John Doe", "123 Main St", new BigDecimal("12.0"));
        BigDecimal grade = new BigDecimal("12.0");

        BigDecimal actual = student.getGrade();

        assertEquals(grade, actual);
    }

    @Test
    void setName() {
        Student student = new Student(1, "John Doe", "123 Main St", new BigDecimal("12.0"));
        String name = "Jane Doe";

        student.setName(name);

        assertEquals(name, student.getName());
    }

    @Test
    void setAddress() {
        Student student = new Student(1, "John Doe", "123 Main St", new BigDecimal("12.0"));
        String address = "456 Main";

        student.setAddress(address);

        assertEquals(address, student.getAddress());
    }

    @Test
    void setGrade() {
        Student student = new Student(1, "John Doe", "123 Main St", new BigDecimal("12.0"));
        BigDecimal grade = new BigDecimal("10.0");

        student.setGrade(grade);

        assertEquals(grade, student.getGrade());
    }

    @Test
    void testEquals() {
        Student student1 = new Student(1, "John Doe", "123 Main St", new BigDecimal("12.0"));
        Student student2 = new Student(1, "John Doe", "123 Main St", new BigDecimal("12.0"));

        boolean actual = student1.equals(student2);

        assertTrue(actual);
    }

    @Test
    void canEqual() {
        Student student1 = new Student(1, "John Doe", "123 Main St", new BigDecimal("12.0"));
        Student student2 = new Student(2, "Jane Doe", "456 Main St", new BigDecimal("10.0"));

        boolean actual = student1.canEqual(student2);

        assertTrue(actual);
    }

    @Test
    void testHashCode() {
        // TODO: Hierzu muss ich noch herausfinden wie das funktioniert.
    }

    @Test
    void testToString() {
        Student student = new Student(1, "John Doe", "123 Main St", new BigDecimal("12.0"));
        String expected = "Student(id=1, name=John Doe, address=123 Main St, grade=12.0)";

        String actual = student.toString();

        assertEquals(expected, actual);
    }
}