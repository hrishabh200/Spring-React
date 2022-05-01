package com.java.springbootproject.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.springbootproject.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>
{

}
