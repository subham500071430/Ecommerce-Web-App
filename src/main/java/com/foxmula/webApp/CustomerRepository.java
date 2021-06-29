package com.foxmula.webApp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer,Integer>{
   
     List<Customer> findBycid(long cid);
}
