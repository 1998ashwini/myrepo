package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Orders;

import com.example.demo.exception.OrdersNotFoundException;


public interface OrderService {
		 List<Orders> getAllOrders();
		 void saveOrders(Orders orders);
		 Orders getOrdersById(int id)throws OrdersNotFoundException;
		 void deleteOrdersById(int id);
			
		
	}


