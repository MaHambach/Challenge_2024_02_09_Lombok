package org.github.mahambach;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.With;

import java.util.List;

@AllArgsConstructor
@Builder
@Data
@With
public class University {
    private final int id;
    private String name;
    private List<Course> courses;
}
