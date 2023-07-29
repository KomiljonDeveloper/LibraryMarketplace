package com.company.simplelibrarymarketplace.repository;

import com.company.simplelibrarymarketplace.modul.OrdersBooks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersBooksRepository extends JpaRepository<OrdersBooks,Integer> {
}
