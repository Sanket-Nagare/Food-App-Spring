package com.food.foodSpringApp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.food.foodSpringApp.dto.Customer;
import com.food.foodSpringApp.repository.CustomerRepo;
import java.util.List;
import java.util.Optional;

@Repository
public class CustomerDao {
	@Autowired
	CustomerRepo customerRepo;
	
	public Customer saveCustomer(Customer customer) {
		return customerRepo.save(customer);
	}
	
	public Optional<Customer> getCustomerById(int id) {
		return customerRepo.findById(id);
	}
	
	public List<Customer> getAllCustomer() {
		return customerRepo.findAll();
	}
	
	public Customer updateCustomer(Customer customer) {
		return customerRepo.save(customer);
	}
	
	public void deleteCustomer(int id) {
		customerRepo.deleteById(id);
	}
	
}