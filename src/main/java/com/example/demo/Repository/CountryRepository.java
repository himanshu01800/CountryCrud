package com.example.demo.Repository;

import com.example.demo.Model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Integer> {

}
