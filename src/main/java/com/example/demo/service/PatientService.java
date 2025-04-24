package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Patient;
import com.example.demo.repository.PatientRepository;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public Optional<Patient> getPatientById(Integer patientId) {
        return patientRepository.findById(patientId);
    }

    public List<Patient> getPatientsByDateOfBirthRange(LocalDate startDate, LocalDate endDate) {
        return patientRepository.findByDateOfBirthBetween(startDate, endDate);
    }

    public List<Patient> getPatientsByAdmittingDoctorDepartment(String department) {
        return patientRepository.findByAdmittingDoctorDepartment(department);
    }

    public List<Patient> getPatientsWithDoctorOffStatus() {
        return patientRepository.findByAdmittingDoctorStatus("OFF");
    }
}