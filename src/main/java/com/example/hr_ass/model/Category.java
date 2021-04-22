package com.example.hr_ass.model;


import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class Category {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;

    @Column(name = "categoryName")
    private String cateogoryName;

    @ManyToOne
    @JoinColumn(name = "productId")
    private ProductInformation product;

}