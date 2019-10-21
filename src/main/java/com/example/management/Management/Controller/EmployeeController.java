package com.example.management.Management.Controller;

import com.example.management.Management.Entity.Employee;
import com.example.management.Management.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
@Autowired
    private EmployeeService employeeService;
@RequestMapping(method = RequestMethod.GET,value="/showAll")
public List<Employee> show()
{
 return employeeService.show();
}
@RequestMapping(method = RequestMethod.POST,value="/add")
public String add(@RequestBody Employee employee)
{
    return employeeService.add(employee);

}

@RequestMapping(method = RequestMethod.GET,value="/name/{id}")
public String name(@PathVariable int id)
{
       return employeeService.name(id);
}




}
