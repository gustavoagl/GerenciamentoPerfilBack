/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gudev.clientmanager.service;

import com.gudev.clientmanager.exception.UserNotFoundException;
import com.gudev.clientmanager.model.Perfil;
import com.gudev.clientmanager.repository.PerfilRep;
import java.util.List;
import java.util.UUID;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Gustavo
 */
@Service
@Transactional
public class PerfilService {

    private final PerfilRep perfilRep;

    @Autowired
    public PerfilService(PerfilRep perfilRep) {
        this.perfilRep = perfilRep;
    }

    public Perfil addPerfil(Perfil perfil) {
        perfil.setPerfilCode(UUID.randomUUID().toString());
        return perfilRep.save(perfil);
    }

    public List<Perfil> findAllPerfil() {
        return perfilRep.findAll();
    }

    public Perfil updatePerfil(Perfil perfil) {
        return perfilRep.save(perfil);
    }

    //tentar achar um id pelo return  senao joga expection
    public Perfil findPerfilById(Long id) {
        return perfilRep.findPerfilById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id" + id + "was not found"));
    }

    public void deletePerfil(Long id) {
        perfilRep.deletePerfilById(id);
    }

}
