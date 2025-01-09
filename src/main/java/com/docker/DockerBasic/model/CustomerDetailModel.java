package com.docker.DockerBasic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDetailModel {

    private String customer_id;
    private String customer_name;
    private String address;
    private String contact_no;
    private String city;
    private String gender;
}
