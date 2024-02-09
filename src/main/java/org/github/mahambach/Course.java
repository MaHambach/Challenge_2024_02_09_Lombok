package org.github.mahambach;

import lombok.*;

import java.util.List;

@Builder
@Data
@Value
@With
@EqualsAndHashCode
public class Course {
    int id;
    String name;
    Teacher teacher;
    List<Student> students;
}
