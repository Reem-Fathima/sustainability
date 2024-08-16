package com.project.sustainability.controller.suppliercontroller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.project.sustainability.dto.Input;
import com.project.sustainability.model.goals.SupplierModel;
import com.project.sustainability.service.supplierserviceImpl.GoalsServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api")
public class GoalsController {
@Autowired
    GoalsServiceImpl goalsService;
    @PostMapping("/addEnergyData")
    public ResponseEntity<String> addEnergyData(@RequestBody SupplierModel supplierModel) throws JsonProcessingException {

        log.info("Fetching Supplier Id: "+supplierModel.getYear());
        goalsService.addEnergyData(supplierModel);
        return ResponseEntity.ok("Success");
    }



}
