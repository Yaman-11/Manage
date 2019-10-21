package com.example.management.Management.Controller;


import com.example.management.Management.Entity.Employee;
import com.example.management.Management.Entity.Status;
import com.example.management.Management.Service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StatusController {

    @Autowired
    private StatusService statusService;
    @RequestMapping(method = RequestMethod.POST,value="/addEmp")
    public String add(@RequestBody Status status)
    {
        return statusService.add(status);
    }
    @RequestMapping(method = RequestMethod.GET,value="/show")
    public List<Status> show()
    {
        return statusService.show();

    }


}
