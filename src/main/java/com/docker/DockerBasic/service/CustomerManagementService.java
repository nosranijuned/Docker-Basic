package com.docker.DockerBasic.service;

import com.docker.DockerBasic.entity.CustomerDetailEntity;
import com.docker.DockerBasic.model.CustomerDetailModel;
import com.docker.DockerBasic.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerManagementService {

    @Autowired
    CustomerRepo customerRepo;

    RestTemplate restTemplate = new RestTemplate();

    public CustomerDetailEntity addCustomer(CustomerDetailModel model) {

        CustomerDetailEntity customerDetail = new CustomerDetailEntity();
        customerDetail.setCustomerName(model.getCustomerName());
        customerDetail.setCity(model.getCity());
        customerDetail.setAddress(model.getAddress());
        customerDetail.setGender(model.getGender());
        customerDetail.setContactNo(model.getContactNo());

        return customerRepo.save(customerDetail);
    }

    public List<CustomerDetailEntity> getAllCustomer() {

        return (List<CustomerDetailEntity>) customerRepo.findAll();
    }

    public CustomerDetailEntity getCustomer(Long customerId) {

        CustomerDetailEntity entity = new CustomerDetailEntity();

        Optional<CustomerDetailEntity> customerDetail = customerRepo.findById(customerId);

        if (customerDetail.isPresent()) {
            entity = customerDetail.get();
            return entity;
        }
        return entity;
    }

    public CustomerDetailEntity updateDetail(CustomerDetailModel model) {

        Optional<CustomerDetailEntity> entity = customerRepo.findById(model.getCustomerId());

        CustomerDetailEntity customerDetailEntity = new CustomerDetailEntity();

        if (entity.isPresent()) {
            CustomerDetailEntity customerDetail = new CustomerDetailEntity();
            customerDetail.setCustomerName(model.getCustomerName());
            customerDetail.setCity(model.getCity());
            customerDetail.setAddress(model.getAddress());
            customerDetail.setGender(model.getGender());
            customerDetail.setContactNo(model.getContactNo());
            CustomerDetailEntity detail = customerRepo.save(customerDetail);
            customerRepo.deleteById(model.getCustomerId());
            customerDetailEntity = customerRepo.findById(detail.getCustomerId()).get();

        }
        return customerDetailEntity;
    }

    public String deleteCustomer(Long customerId) {

        Optional<CustomerDetailEntity> entity = customerRepo.findById(customerId);

        if(entity.isPresent()) {
            customerRepo.deleteById(customerId);
            return "Record Deleted";
        } else {
            return "Record not found";
        }
    }
}
