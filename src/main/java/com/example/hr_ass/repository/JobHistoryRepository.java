package com.example.hr_ass.repository;


import com.example.hr_ass.model.JobHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface JobHistoryRepository extends JpaRepository<JobHistory,Integer> {
}