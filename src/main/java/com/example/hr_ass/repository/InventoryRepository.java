package com.example.hr_ass.repository;

import com.example.hr_ass.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface InventoryRepository extends JpaRepository<Inventory,Integer> {
}