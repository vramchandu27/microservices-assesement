package com.nkdeug.payment.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    @Id
    @GeneratedValue
    private int paymentId;
    private String paymentStatus;
    private String transactionId;
    private int orderId;
    private double amount;
	public void setPaymentStatus(String paymentProcessing) {
		// TODO Auto-generated method stub
		
	}
	public void setTransactionId(String string) {
		// TODO Auto-generated method stub
		
	}

}
