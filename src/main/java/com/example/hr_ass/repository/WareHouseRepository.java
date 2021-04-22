package com.example.hr_ass.repository;


import com.example.hr_ass.model.WareHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface WareHouseRepository extends JpaRepository<WareHouse,Integer> {
}