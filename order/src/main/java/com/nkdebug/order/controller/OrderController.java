package com.nkdebug.order.controller;



import com.nkdebug.order.common.TransactionRequest;
import com.nkdebug.order.common.TransactionResponse;
import com.nkdebug.order.entity.Order;
import com.nkdebug.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/Orderbook")
    public TransactionResponse bookOrder(@RequestBody TransactionRequest transactionRequest) {
        return orderService.saveOrder(transactionRequest);

    }
    @PutMapping("/update/{id}")
    public  Order updateStudent(@PathVariable("id") int id, @RequestBody  Order  Customer){
        return OrderService.updateCustomer (id,  Customer);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable("id") int id){
    	OrderService.Customer(id);
}
}
