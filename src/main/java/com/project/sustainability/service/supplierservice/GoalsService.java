package com.project.sustainability.service.supplierservice;

import com.project.sustainability.model.goals.SupplierModel;
import org.springframework.stereotype.Service;

@Service
public interface GoalsService {

   // public boolean addEnergyData(EQuestion1 eQuestion1);
   public SupplierModel addEnergyData(SupplierModel supplierModel);



}
