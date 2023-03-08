package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Employee;

public interface EmplyeeRepo extends JpaRepository<Employee, Integer>{

}
