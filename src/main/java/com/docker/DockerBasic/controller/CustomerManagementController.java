package com.docker.DockerBasic.controller;

import com.docker.DockerBasic.entity.CustomerDetailEntity;
import com.docker.DockerBasic.model.CustomerDetailModel;
import com.docker.DockerBasic.service.CustomerManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerManagementController {

    @Autowired
    CustomerManagementService managementService;

    @PostMapping("/addCustomer")
    public Object addCustomer(@RequestBody CustomerDetailModel model) {

        return managementService.addCustomer(model);
    }

    @GetMapping("/getAllCustomer")
    public Object getAllCustomer() {

//        return managementService.getAllCustomer();
        return  "testing";
    }

    @GetMapping("/getCustomerDetail")
    public CustomerDetailEntity getCustomer(@RequestParam("customerId") Long customerId) {

        return managementService.getCustomer(customerId);
    }

    @GetMapping("/updateCustomer")
    public Object updateDetail(@RequestBody CustomerDetailModel model) {

        return managementService.updateDetail(model);
    }

    @GetMapping("/deleteCustomer")
    public String deleteCustomer(@RequestParam("customerId") Long customerId) {

        return managementService.deleteCustomer(customerId);
    }
}
