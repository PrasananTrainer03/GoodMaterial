package com.example.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;


@Service
public class EmployeeSearchService {

    private static Map < Long, Employee > employeeRepsitory = null;

    static {

        Stream < String > employeeStream = Stream.of("1,Shamik  Mitra,Java,Architect", "2,Samir  Mitra,C++,Manager",
            "3,Swastika  Mitra,AI,Sr.Architect");

        employeeRepsitory = employeeStream.map(employeeStr -> {
        	String[] info = employeeStr.split(",");
        	return createEmployee(new Long(info[0]), info[1], info[2], info[3]);
        }).collect(Collectors.toMap(Employee::getEmployeeId, emp -> emp));

    }

    private static Employee createEmployee(Long id, String name, String practiceArea, String designation) {
        Employee emp = new Employee();
        emp.setEmployeeId(id);
        emp.setName(name);
        emp.setPracticeArea(practiceArea);
        emp.setDesignation(designation);
        emp.setCompanyInfo("Cognizant");
        return emp;
    }

    public Employee findById(Long id) {
        return employeeRepsitory.get(id);
    }

    public Collection < Employee > findAll() {
        return employeeRepsitory.values();
    }

}