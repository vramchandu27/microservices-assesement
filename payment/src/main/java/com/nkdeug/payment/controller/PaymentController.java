package com.nkdeug.payment.controller;

import com.nkdeug.payment.entity.Payment;
import com.nkdeug.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/doPayment")
    public Payment doPayment(@RequestBody Payment payment) {
        return paymentService.doPayment(payment);
    }
    @GetMapping("/view")
    public List<Payment> viewStudent(){
        return paymentService.viewStudent();
    }
    @PutMapping("/update/{rollno}")
    public Payment updateStudent(@PathVariable("rollno") long rollno, @RequestBody Payment Payment){
        return paymentService.updatePayment(rollno, Payment);
    }
    @DeleteMapping("/delete/{rollno}")
    public void deleteStudent(@PathVariable("rollno") long rollno){
    	paymentService.deletePayment(rollno);
}
}

