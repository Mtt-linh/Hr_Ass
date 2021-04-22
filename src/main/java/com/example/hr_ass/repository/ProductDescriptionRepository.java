package com.example.hr_ass.repository;

import com.example.hr_ass.model.ProductDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductDescriptionRepository extends JpaRepository<ProductDescription,Integer> {
}