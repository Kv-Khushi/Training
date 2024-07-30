package com.reimbursement.service;


import com.reimbursement.entities.ClaimRequest;
import com.reimbursement.entities.Department;
import com.reimbursement.entities.User;
import com.reimbursement.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public List <Department> getDepartment(){
        List<Department> list= new ArrayList();
        list= departmentRepository.findAll();
        return list;
    }

    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }



}
