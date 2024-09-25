package com.bett.learn.Repository;

import com.bett.learn.Model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrdersRepository extends JpaRepository<Orders, Integer>
{

    List<Orders> findByOrderId(int OrderId);
}
