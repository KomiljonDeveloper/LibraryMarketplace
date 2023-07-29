package com.company.simplelibrarymarketplace.repository;

import com.company.simplelibrarymarketplace.modul.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
