package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllDoctors() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getDoctorById(Integer employeeId) {
        return employeeRepository.findById(employeeId);
    }

    public List<Employee> getDoctorsByStatus(String status) {
        return employeeRepository.findByStatus(status);
    }

    public List<Employee> getDoctorsByDepartment(String department) {
        return employeeRepository.findByDepartment(department);
    }
}