package com.iudigital.GestionErrores;

import com.iudigital.GestionErrores.entity.EmployeeEntity;
import com.iudigital.GestionErrores.services.EmployeeOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class IngresoDatos  implements CommandLineRunner {

    @Autowired
    private EmployeeOperations employeeOperations;

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 10; i++) {
            EmployeeEntity employee = new EmployeeEntity();
            employee.setFirstName("FirstName " + i);
            employee.setLastName("LastName " + i);
            employee.setEmail("email" + i + "@example.com");
            employeeOperations.save(employee);
        }
    }
}
