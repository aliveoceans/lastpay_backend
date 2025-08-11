package com.lp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lp.demo.entity.Car;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    @Query("SELECT DISTINCT c.brand FROM Car c ORDER BY c.brand")
    List<String> findDistinctBrands();

    @Query("SELECT DISTINCT c.model FROM Car c WHERE LOWER(c.brand) = LOWER(?1) ORDER BY c.model")
    List<String> findModelsByBrand(String brand);

    Car findByBrandIgnoreCaseAndModelIgnoreCase(String brand, String model);
}
