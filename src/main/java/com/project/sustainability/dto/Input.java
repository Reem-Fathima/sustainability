package com.project.sustainability.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Component

public class Input {
    private Integer questionId;
    private Integer goalId;
    private String goalType;

}
