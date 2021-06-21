/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gudev.clientmanager.controller;

import com.gudev.clientmanager.model.User;
import com.gudev.clientmanager.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 *
 * @author Gustavo
 */
@Controller
@RequestMapping("/login")
public class UserController {
    
    @Autowired
    private UserService userService;
  

    public UserController(UserService userService) {
        this.userService = userService;
    }

     
    @GetMapping("/list")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> user = userService.findAllNames();
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
    
     @GetMapping("/find/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") Long id) {
        User user = userService.findUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User newuser = userService.createLogin(user);
        return new ResponseEntity<>(newuser, HttpStatus.CREATED);
    }

    @PutMapping("/atualizar")
    public ResponseEntity<User> updateUser(@RequestBody User user){
        User attUser = userService.updateUser(user);
        return new ResponseEntity<>(attUser, HttpStatus.OK);
    }
    
    
     @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") Long id) {
         userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}


