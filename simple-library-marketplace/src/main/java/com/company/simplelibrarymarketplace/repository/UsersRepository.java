package com.company.simplelibrarymarketplace.repository;

import com.company.simplelibrarymarketplace.modul.Author;
import com.company.simplelibrarymarketplace.modul.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users,Integer> {
}
