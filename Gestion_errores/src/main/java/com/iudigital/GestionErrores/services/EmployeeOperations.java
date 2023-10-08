package com.iudigital.GestionErrores.services;

import com.iudigital.GestionErrores.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeOperations extends JpaRepository<EmployeeEntity, Long> {
}
