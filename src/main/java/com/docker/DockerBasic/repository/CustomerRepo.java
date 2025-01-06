package com.docker.DockerBasic.repository;

import com.docker.DockerBasic.entity.CustomerDetailEntity;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<CustomerDetailEntity, Long> {
}
