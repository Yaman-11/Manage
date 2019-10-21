package com.example.management.Management.Service;

import com.example.management.Management.Entity.Employee;
import com.example.management.Management.Entity.Status;
import com.example.management.Management.Repository.EmployeeRepository;
import com.example.management.Management.Repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StatusService {
@Autowired
private StatusRepository statusRepository;
@Autowired
private EmployeeRepository employeeRepository;

    public String add(Status status) {

        statusRepository.save(status);
        if(status.getStatus().equals("fired"))
        {
            for(Employee e:employeeRepository.findAll())
            {
                if(e.getEmp()==status.getEmp())
                {
                    employeeRepository.delete(e);
                }
            }
        }

        return "ADDED SUCCESFULLY";
    }

    public List<Status> show() {
    List<Status> al=new ArrayList<>();
    for(Status s: statusRepository.findAll())
    {
        al.add(s);

    }
    return al;

    }
}
//yaman