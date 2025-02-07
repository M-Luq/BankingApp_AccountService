package com.example.demo.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.TransactionDTO;

@FeignClient(name="transactions",url="https://localhost:8082/transactions")
public interface TransactionClient {
	
	@PostMapping(value = "/save")
	public String saveTransaction(@RequestBody TransactionDTO dto);
	

}
