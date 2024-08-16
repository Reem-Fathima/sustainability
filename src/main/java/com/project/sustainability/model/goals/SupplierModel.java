package com.project.sustainability.model.goals;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "supplierModel")
public class SupplierModel
{
    @Id
//    private String id;
    private Integer supplierID;
    private Integer year;
    private ArrayList<GoalAnswers> goalAnswers;

}
