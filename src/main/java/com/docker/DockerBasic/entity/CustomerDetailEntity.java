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
    private String customer_id;
    private String customer_name;
    private String address;
    private String contact_no;
    private String city;
    private String gender;
}
