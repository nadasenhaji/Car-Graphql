package com.example.demo.dao.repository;


import com.example.demo.dao.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {


    public List<Car> findByModel(String model);

    public List<Car> findByModelAndPrice(String model, double price);

}
