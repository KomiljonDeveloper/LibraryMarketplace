package com.company.simplelibrarymarketplace.repository;

import com.company.simplelibrarymarketplace.modul.Author;
import com.company.simplelibrarymarketplace.modul.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Integer> {
}
