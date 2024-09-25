package com.bett.learn.Controller;


import com.bett.learn.Model.Orders;
import com.bett.learn.Repository.OrdersRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class OrdersController {

           @Autowired
          OrdersRepository    ordersRepository;

    @PostMapping("/orders")
    public ResponseEntity<?> Createorders(@RequestBody Orders orders) {

        if(orders == null || orders.getOrderName().isEmpty()){
            ResponseEntity.badRequest().body("Order name cannot be empty");
        }

        List<Orders> existingorder = ordersRepository.findByOrderId(orders.getOrderId());
         if(!existingorder.isEmpty()){
             return ResponseEntity.status(409).body("Order already exists");
         }
         Orders savedorder = ordersRepository.save(orders);
          return ResponseEntity.ok(savedorder);
        }
    }

