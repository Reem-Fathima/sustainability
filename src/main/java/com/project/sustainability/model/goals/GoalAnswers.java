package com.project.sustainability.model.goals;

import lombok.*;

import java.util.ArrayList;
@NoArgsConstructor
@AllArgsConstructor
@Data

public class GoalAnswers {
    public String goalType;
    public ArrayList<Answers> answers;

}
