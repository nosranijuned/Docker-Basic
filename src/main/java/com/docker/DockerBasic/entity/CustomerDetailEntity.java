package com.docker.DockerBasic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDetailEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long customerId;

    private String customerName;

    private String address;

    private String contactNo;

    private String city;

    private String gender;
}
