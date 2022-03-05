package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Orders;
import com.example.demo.exception.OrdersNotFoundException;
import com.example.demo.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderRepository orderrepository;

	public List<Orders> getAllOrders() {
		// TODO Auto-generated method stub
		return orderrepository.findAll();
	}

	@Override
	public void saveOrders(Orders orders) {
		this.orderrepository.save(orders);
		
	}

	@Override
	public Orders getOrdersById(int medicine_id) throws OrdersNotFoundException {
		Optional<Orders> optional = orderrepository.findById(medicine_id);
		Orders orders = null;
		if(optional.isPresent()) {
			orders = optional.get();
		}else {
			throw new OrdersNotFoundException("Order not found for id:: " + medicine_id);
		}
		return orders;
	}

	@Override
	public void deleteOrdersById(int medicine_id) {
		this.orderrepository.deleteById(medicine_id);
		
	}
	
}

