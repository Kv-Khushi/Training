package com.reimbursement.controller;

import java.util.List;

import com.reimbursement.entities.User;
import com.reimbursement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userservice;

    @GetMapping("/user")
    public ResponseEntity<List<User>> getAllUser() {
        List<User> list = userservice.getAllUserList();
        if (!list.isEmpty()) {
            return ResponseEntity.ok(list);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @PostMapping("/user")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User newUser = userservice.addUser(user);
        if (newUser != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable("id") Long id) {
        boolean isdeleted = userservice.deleteUser(id);
        if (isdeleted) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }


    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User updatedUser, @PathVariable("id") Long id) {
        User updated = userservice.updateUser(updatedUser, id);
        if (updated!=null) {
            return ResponseEntity.ok().build();

        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}