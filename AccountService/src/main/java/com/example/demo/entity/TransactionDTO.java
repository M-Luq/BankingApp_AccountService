package com.example.demo.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDTO {
	private int transactionId;
	private String transactionType;
	private LocalDate timeOfTransaction;
	private double updatedBalance;
	private int accNo;

}
