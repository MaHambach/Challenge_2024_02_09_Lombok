package org.github.mahambach;

import lombok.Builder;
import lombok.ToString;
import lombok.With;

@Builder
@With
public record Teacher(
        int id,
        String name,
        String subject
) {
    public String toString() {
        return "Teacher(id=" + this.id() + ", name=" + this.name() + ", subject=" + this.subject() + ")";
    }
}
