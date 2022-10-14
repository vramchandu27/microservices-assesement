package com.nkdebug.order.service;

import com.nkdebug.order.common.TransactionRequest;
import com.nkdebug.order.common.TransactionResponse;
import com.nkdebug.order.entity.Order;
import com.nkdebug.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Random;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private RestTemplate restTemplate;{
    	
	}

	public static Order updateCustomer(int id, Order customer) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void Customer(long rollno) {
		// TODO Auto-generated method stub
		
	}


	public static Order updateCustomer(long id, Order customer) {
		// TODO Auto-generated method stub
		return null;
	}

	public TransactionResponse saveOrder(TransactionRequest transactionRequest) {
		// TODO Auto-generated method stub
		return null;
	}
}
