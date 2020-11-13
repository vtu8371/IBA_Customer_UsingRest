package com.cg.iba.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.iba.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	@Query("select c from Customer c where customer_id in (select customer_id from customers_accounts where account_id in (select account_id from account where balance=?1) )")                                                      
	List<Customer> listAllcustomer(double minBalance);
	
	@Query("select c from Customer c where c.customer_id in(select ca.customer_id from customers_accounts ca where ca.account_id=?1")
	public List<Customer> viewCustomerDetails(long account_id);

}
