package com.example.hr_ass.repository;

import com.example.hr_ass.model.OrderItem;
import com.example.hr_ass.model.OderItemID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderItemRepository extends JpaRepository<OrderItem, OderItemID> {
}