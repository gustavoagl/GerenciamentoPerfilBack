/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gudev.clientmanager.repository;

import com.gudev.clientmanager.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Gustavo
 */
public interface RoleRep extends JpaRepository<Role, Long> {
    
}
