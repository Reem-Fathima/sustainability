package com.project.sustainability.model.goals;

import lombok.*;

import java.util.ArrayList;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Answers {
    public Integer questionId;
    public ArrayList<Response> response;
}
