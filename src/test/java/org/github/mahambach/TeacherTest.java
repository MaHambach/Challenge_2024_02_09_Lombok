package org.github.mahambach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {

    @Test
    void id() {
        Teacher teacher = new Teacher(1, "Jane Doe", "Math");
        int id = 1;

        int actual = teacher.id();

        assertEquals(id, actual);
    }

    @Test
    void name() {
        Teacher teacher = new Teacher(1, "Jane Doe", "Math");
        String name = "Jane Doe";

        String actual = teacher.name();

        assertEquals(name, actual);
    }

    @Test
    void subject() {
        Teacher teacher = new Teacher(1, "Jane Doe", "Math");
        String subject = "Math";

        String actual = teacher.subject();

        assertEquals(subject, actual);
    }

    @Test
    void withId() {
        Teacher teacher1 = new Teacher(1, "Jane Doe", "Math");
        Teacher teacherExpected = new Teacher(2, "Jane Doe", "Math");

        Teacher teacherActual = teacher1.withId(2);

        assertEquals(teacherExpected, teacherActual);
    }

    @Test
    void withName() {
        Teacher teacher1 = new Teacher(1, "Jane Doe", "Math");
        Teacher teacherExpected = new Teacher(1, "John Doe", "Math");

        Teacher teacherActual = teacher1.withName("John Doe");

        assertEquals(teacherExpected, teacherActual);
    }

    @Test
    void withSubject() {
        Teacher teacher1 = new Teacher(1, "Jane Doe", "Math");
        Teacher teacherExpected = new Teacher(1, "Jane Doe", "Science");

        Teacher teacherActual = teacher1.withSubject("Science");

        assertEquals(teacherExpected, teacherActual);
    }

    @Test
    void testToString() {
        Teacher teacher = new Teacher(1, "Jane Doe", "Math");
        String expected = "Teacher(id=1, name=Jane Doe, subject=Math)";

        String actual = teacher.toString();

        assertEquals(expected, actual);
    }
}