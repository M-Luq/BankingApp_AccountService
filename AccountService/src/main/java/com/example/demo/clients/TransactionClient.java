package com.example.demo.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.TransactionDTO;

@FeignClient(name="transactions",url="http://localhost:8082/transactions")
public interface TransactionClient {
	
	@PostMapping(value = "/save")
	public String saveTransaction(@RequestBody TransactionDTO dto);
	
	@GetMapping(value ="/getAll/{id}")
	public List<TransactionDTO> getAllTransaction(@PathVariable int id);
	

}
