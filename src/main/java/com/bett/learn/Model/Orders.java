package com.bett.learn.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Orders {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

     private int orderId;
     private String orderName;
     private String OrderNumber;


}
