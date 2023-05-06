package com.prog.muni.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prog.muni.entity.Employee;

@Repository
public interface EmpRepo  extends JpaRepository<Employee, Integer>{

}