package org.github.mahambach;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.With;

import java.math.BigDecimal;

@AllArgsConstructor
@Builder
@Data
@With
//  @Getter
//  @Setter
//  @EqualsAndHashCode
//  @ToString
public class Student {
    private final int id;
    private String name;
    private String address;
    private BigDecimal grade;
}
