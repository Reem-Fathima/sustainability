package com.project.sustainability.repository.goalsRepo;

import com.project.sustainability.model.goals.SupplierModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepo extends MongoRepository<SupplierModel, Integer> {
}
