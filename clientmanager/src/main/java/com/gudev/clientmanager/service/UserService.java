/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gudev.clientmanager.service;

import com.gudev.clientmanager.exception.UserNotFoundException;
import com.gudev.clientmanager.model.Perfil;
import com.gudev.clientmanager.model.User;
import com.gudev.clientmanager.repository.UserRep;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Gustavo
 */
@Service
public class UserService {

    @Autowired
    UserRep userRep;

    public User createLogin(User user) {
        return userRep.save(user);
    }

    public User updateUser(User user) {
        return userRep.save(user);
    }

    public List<User> findAllNames() {
        return userRep.findAll();
    }

    public User findUserById(Long id) {
        return userRep.findUserById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id" + id + "was not found"));
    }

    public void deleteUser(Long id) {
        userRep.deleteById(id);
    }

}
