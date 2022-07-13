package com.devsuperior.dsmeta.entities;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sales")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer visited, deals;
    private String sellerName;
    private Double amount;
    private LocalDate date;

/* 
    public Sale(Long id, Integer visited, Integer deals, String sellerName, Double amount, LocalDate date) {
        this.id = id;
        this.visited = visited;
        this.deals = deals;
        this.sellerName = sellerName;
        this.amount = amount;
        this.date = date;
    }
*/


    public Sale() {
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVisited() {
        return this.visited;
    }

    public void setVisited(Integer visited) {
        this.visited = visited;
    }

    public Integer getDeals() {
        return this.deals;
    }

    public void setDeals(Integer deals) {
        this.deals = deals;
    }

    public String getSellerName() {
        return this.sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    //Mapeamento objeto relacional 

    

    
}
