package com.docker.DockerBasic.repository;

import com.docker.DockerBasic.entity.CustomerDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<CustomerDetailEntity, String> {
}
