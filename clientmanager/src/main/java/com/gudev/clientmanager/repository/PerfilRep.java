/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gudev.clientmanager.repository;

import com.gudev.clientmanager.model.Perfil;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Gustavo
 */
public interface PerfilRep extends JpaRepository<Perfil , Long> {

    public void deletePerfilById(Long id);

    public Optional<Perfil> findPerfilById(Long id);
    
}
