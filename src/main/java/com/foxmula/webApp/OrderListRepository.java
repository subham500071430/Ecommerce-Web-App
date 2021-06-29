package com.foxmula.webApp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderListRepository extends JpaRepository<OrderList,Integer>{

	List<OrderList> findBytid(int tid);
}
