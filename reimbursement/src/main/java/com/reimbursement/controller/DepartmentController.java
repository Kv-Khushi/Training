package com.reimbursement.controller;


import com.reimbursement.entities.Department;
import com.reimbursement.entities.User;
import com.reimbursement.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {


    @Autowired
    private      DepartmentService departmentService;


    @GetMapping("/departments")
    public ResponseEntity<List<Department>> getAllDepartments(){
        List<Department> list = departmentService.getDepartment();
        if (!list.isEmpty()) {
            return ResponseEntity.ok(list);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
    @PostMapping("/department")
    public ResponseEntity<Department> addDepartments(@RequestBody Department department){
        Department department1=departmentService.addDepartment(department);
        return null;
    }
}

//@PostMapping("/department")
//public ResponseEntity<Department> addDepartment(@RequestBody Department department) {
//    Department newDepartment  =
//    if (newDepartment != null) {
//        return ResponseEntity.status(HttpStatus.CREATED).body(newDepartment);
//    }
//    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//}




