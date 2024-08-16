package com.project.sustainability.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Questions{
    private Integer questionId;
    private Integer percentage;
    private String category;
    private Integer year;
    private String renewableResource;
    private String type;
    private Integer amountOfEnergy;
    private String goal;
    private String reducedData;
    private String packagingType;
    private String reductionDetails;

}
