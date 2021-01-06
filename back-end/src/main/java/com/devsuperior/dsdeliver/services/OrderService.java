package com.devsuperior.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsdeliver.dtos.OrderDto;
import com.devsuperior.dsdeliver.entities.Order;
import com.devsuperior.dsdeliver.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;

	@Transactional(readOnly = true)
	public List<OrderDto> findAll() {
		List<Order> list = orderRepository.findOrdersWithProducts();

		return list.stream().map(x -> new OrderDto(x)).collect(Collectors.toList());
	}

}
