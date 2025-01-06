package com.docker.DockerBasic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDetailModel {

    private Long customerId;

    private String customerName;

    private String address;

    private String contactNo;

    private String city;

    private String gender;
}
