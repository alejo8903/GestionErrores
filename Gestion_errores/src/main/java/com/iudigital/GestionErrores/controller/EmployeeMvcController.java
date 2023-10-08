package com.iudigital.GestionErrores.controller;

import com.iudigital.GestionErrores.entity.EmployeeEntity;
import com.iudigital.GestionErrores.services.EmployeeOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class EmployeeMvcController {
    @Autowired
    private EmployeeOperations employeeOperations;
    @GetMapping("/list")
    public String getAllEmployees(Model model){
        List<EmployeeEntity> employees = employeeOperations.findAll();
        model.addAttribute("employees", employees);
        return "Index";
    }
}
