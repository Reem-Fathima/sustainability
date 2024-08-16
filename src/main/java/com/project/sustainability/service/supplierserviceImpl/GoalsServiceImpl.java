package com.project.sustainability.service.supplierserviceImpl;

//import com.project.sustainability.model.goals.EQuestion1;
import com.project.sustainability.model.goals.SupplierModel;
import com.project.sustainability.repository.goalsRepo.SupplierRepo;
import com.project.sustainability.service.supplierservice.GoalsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GoalsServiceImpl implements GoalsService {
    @Autowired
    SupplierRepo supplierRepo;
    @Override
    public SupplierModel addEnergyData(SupplierModel supplierModel) {
            log.info("input data"+supplierModel);
           return supplierRepo.save(supplierModel);

    }

    /*@Override
    public boolean addEnergyData(EQuestion1 eQuestion1) {
        log.info("Question Id:"+eQuestion1.getQuestionId());

        return false;
    }*/
}
