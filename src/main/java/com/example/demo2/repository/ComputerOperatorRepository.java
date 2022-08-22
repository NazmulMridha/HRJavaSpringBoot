package com.example.demo2.repository;

import com.example.demo2.model.ComputerOperator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerOperatorRepository extends JpaRepository <ComputerOperator, Integer> {

}
