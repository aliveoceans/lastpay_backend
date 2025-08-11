package com.lp.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lp.demo.dto.CarDto;
import com.lp.demo.entity.Car;
import com.lp.demo.repository.CarRepository;

import java.util.List;

@Service
public class DealerService {
    @Autowired
    private CarRepository carRepository;

    public List<String> getBrands() {
        return carRepository.findDistinctBrands();
    }

    public List<String> getModels(String brand) {
        return carRepository.findModelsByBrand(brand);
    }

    public CarDto getCarDetails(String brand, String model) {
        Car car = carRepository.findByBrandIgnoreCaseAndModelIgnoreCase(brand, model);
        return car != null ? new CarDto(car) : null;
    }
}