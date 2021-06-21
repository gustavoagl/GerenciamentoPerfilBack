/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gudev.clientmanager.repository;

import com.gudev.clientmanager.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Gustavo
 */
@Repository
public interface UserRep extends JpaRepository<User, Long> {

   public void deleteUserById(Long id);

    public Optional<User> findUserById(Long id);
}
