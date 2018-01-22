package com.doqi.springreact.repository;

import com.doqi.springreact.domain.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}

