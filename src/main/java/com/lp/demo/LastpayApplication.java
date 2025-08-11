package com.lp.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.lp.demo.entity.Car;
import com.lp.demo.repository.CarRepository;

@SpringBootApplication
public class LastpayApplication {

	public static void main(String[] args) {
		SpringApplication.run(LastpayApplication.class, args);
	}

	@Bean
    CommandLineRunner initData(CarRepository carRepository) {
        return args -> {
            carRepository.save(new Car( "Toyota", "Camry", 25000, "4-door sedan, 2.5L engine", "NEW", 0, 0));
            carRepository.save(new Car( "Toyota", "Corolla", 20000, "Compact sedan, 1.8L engine", "PRE_OWNED", 3, 1));
            carRepository.save(new Car( "Honda", "Civic", 22000, "Compact car, 2.0L engine", "NEW", 0, 0));
            carRepository.save(new Car( "Honda", "Accord", 28000, "Mid-size sedan, 1.5T engine", "PRE_OWNED", 5, 2));
            carRepository.save(new Car( "Ford", "Mustang", 35000, "Sports car, 5.0L V8", "PRE_OWNED", 2, 1));
            carRepository.save(new Car( "Ford", "F-150", 40000, "Pickup truck, 3.5L EcoBoost", "NEW", 0, 0));
        };
    }
	
}
