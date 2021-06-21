/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gudev.clientmanager.controller;

import com.gudev.clientmanager.model.Perfil;
import com.gudev.clientmanager.service.PerfilService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gustavo
 */
@RestController
@RequestMapping("/perfil")
public class PerfilController {

    private final PerfilService perfilService;

    public PerfilController(PerfilService perfilService) {
        this.perfilService = perfilService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Perfil>> getAllPerfil() {
        List<Perfil> perfil = perfilService.findAllPerfil();
        return new ResponseEntity<>(perfil, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Perfil> getPerfil(@PathVariable("id") Long id) {
        Perfil perfil = perfilService.findPerfilById(id);
        return new ResponseEntity<>(perfil, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Perfil> addPerfil(@RequestBody Perfil perfil) {
        Perfil newperfil = perfilService.addPerfil(perfil);
        return new ResponseEntity<>(newperfil, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Perfil> updatePerfil(@RequestBody Perfil perfil) {
        Perfil updatePerfil = perfilService.updatePerfil(perfil);
        return new ResponseEntity<>(updatePerfil, HttpStatus.OK);
    }
    //"?" para n retornar nada
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePerfil(@PathVariable("id") Long id) {
         perfilService.deletePerfil(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    
    

}
