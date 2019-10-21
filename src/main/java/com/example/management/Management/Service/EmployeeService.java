package com.example.management.Management.Service;

import com.example.management.Management.Entity.Employee;
import com.example.management.Management.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
@Autowired
private EmployeeRepository employeeRepository;
public List<Employee> show()
{
    List<Employee> al=new ArrayList<>();
    for(Employee e: employeeRepository.findAll())
    {
        al.add(e);

    }
    return al;
}

public String add(Employee employee)
{
    employeeRepository.save(employee);
    return "ADDED SUCCESSFULLY";

}
public String name(int id)
{
    for(Employee e:employeeRepository.findAll())
    {
        if(e.getEmp()==id)
        {
            return e.getName();
        }
    }
    return new ResponseEntity<String>(HttpStatus.BAD_REQUEST).toString();

}


}
