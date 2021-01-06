package com.devsuperior.dsdeliver.dtos;

import java.time.Instant;

import com.devsuperior.dsdeliver.entities.OrderStatus;

public class OrderDto {

	private Long id;
	private String address;
	private double latitude;
	private double longitude;
	private Instant moment;
	private OrderStatus status;
}
