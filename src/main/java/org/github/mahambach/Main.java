package org.github.mahambach;

//Step 1: Add the Lombok dependency to your project and configure IntelliJ to support Lombok.
//        Step 2: Create a simple class "Student" with the following attributes: id, name, address, grade.
//        Step 2.5: Use the appropriate Lombok annotations to generate getters, setters, equals, hashCode, toString, and constructors for the entity.
//Step 3: Create a Teacher record with the following attributes: id, name, subject.
//        Step 4: Create a class Course with the following attributes: id, name, teacher, students.
//        Step 4.5: Use the appropriate Lombok annotations to generate getters, setters, equals, hashCode, toString, and constructors for the entity.
//Step 5: Write a "Main" class where you apply some examples of creating Students, Teachers, and Courses using the constructors.
//Step 6: In the "Main" class, check if the generated Lombok methods work correctly (getter, setter, toString, ...).

//      Step 1: Add the Builder pattern to all entities and create additional objects with the Builder in the main method.
//      Step 2: Use the With annotation to facilitate changing properties.
//      Please post the link to your GitHub repository where you solved this task together.
//      If you have already completed this task earlier, you may work on the bonus task on the next page.


//  Bonus
//
//  Great, you're making good progress! Feel free to work on this voluntary bonus task as well.
//
//  Find out what the Lombok annotation @Value does and use it for the Course class.
//
//  Create a record University with the following attributes: id, name, courses.
//
//  Create a class UniversityService and implement the following methods there:
//
//  Write a function to calculate the average grade of a Course (Pass the Course as a parameter).
//
//  Write a function to calculate the average grade of the entire University (Pass a University object
//  as a parameter).

//  Write a function that retrieves all students from a University with a minimum grade of 2/"Good"
//  and returns them as a list (Pass a University object as a parameter).
import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "John", "Street 1", new BigDecimal("5.0"));
        Student student2 = new Student(2, "Jane", "Street 2", new BigDecimal("10.0"));
        Student student0 = new Student(0, "Jack", "Street 0", new BigDecimal("0.0"));

        System.out.println(student1);
        System.out.println(student2.getId());
        System.out.println(student2.getName());
        System.out.println(student2.getAddress());
        System.out.println(student2.getGrade());

        student0.setName("Jacky");
        student0.setAddress("Street 00");
        student0.setGrade(new BigDecimal("0.1"));
        System.out.println(student0);

        Teacher teacher1 = new Teacher(1, "Mr. Smith", "Math");
        Teacher teacher0 = new Teacher(0, "Mr. & Mrs. Smith", "All");

        System.out.println(teacher1);

        teacher0 = teacher0.withName("Mr. & Mrs. Smithy");
        teacher0 = teacher0.withSubject("All & Everything");
        System.out.println(teacher0);

        Student studentBuild = Student.builder()
                .id(3)
                .name("Jack")
                .address("Street 3")
                .grade(new BigDecimal("3.0"))
                .build();

        Teacher teacherBuild = Teacher.builder()
                .id(3)
                .name("Mr. & Mrs. Smith")
                .subject("All")
                .build();

        Course courseBuild = Course.builder()
                .id(3)
                .name("All")
                .teacher(teacherBuild)
                .students(List.of(studentBuild))
                .build();

        System.out.println();
        System.out.println(studentBuild);
        System.out.println(teacherBuild);
        System.out.println(courseBuild);

        Student studentWith = studentBuild.withName("Jacky");
        studentWith = studentWith.withAddress("Street 33");
        studentWith = studentWith.withGrade(new BigDecimal("3.3"));

        Teacher teacherWith = teacherBuild.withName("Mr. & Mrs. Smithy");
        teacherWith = teacherWith.withSubject("All & Everything");

        Course courseWith = courseBuild.withName("All & Everything");
        courseWith = courseWith.withTeacher(teacherWith);
        courseWith = courseWith.withStudents(List.of(studentWith));

        System.out.println();
        System.out.println(studentWith);
        System.out.println(teacherWith);
        System.out.println(courseWith);
    }
}