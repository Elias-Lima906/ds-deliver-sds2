package com.devsuperior.dsdeliver.services;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsdeliver.dtos.OrderDto;
import com.devsuperior.dsdeliver.dtos.ProductDto;
import com.devsuperior.dsdeliver.entities.Order;
import com.devsuperior.dsdeliver.entities.OrderStatus;
import com.devsuperior.dsdeliver.entities.Product;
import com.devsuperior.dsdeliver.repositories.OrderRepository;
import com.devsuperior.dsdeliver.repositories.ProductRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	ProductRepository productRepository;

	@Transactional(readOnly = true)
	public List<OrderDto> findAll() {
		List<Order> list = orderRepository.findOrdersWithProducts();

		return list.stream().map(x -> new OrderDto(x)).collect(Collectors.toList());
	}

	@Transactional
	public OrderDto Insert(OrderDto orderDto) {
		Order order = new Order(null, orderDto.getAddress(), orderDto.getLatitude(), orderDto.getLongitude(),
				Instant.now(), OrderStatus.PENDING);

		for (ProductDto p : orderDto.getProducts()) {
			Product product = productRepository.getOne(p.getId());
			order.getProducts().add(product);
		}

		order = orderRepository.save(order);
		return new OrderDto(order);
	}

}
