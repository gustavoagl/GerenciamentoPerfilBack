/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gudev.clientmanager.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Gustavo
 */
@Entity
public class Perfil implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String cargo;
    private String telefone;
    private String imagemUrl;
    @Column(nullable = false, updatable = false)
    private String perfilCode;
    
    public Perfil(){
        
    }

    public Perfil(Long id, String name, String email, String cargo, String telefone, String imagemUrl, String perfilCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cargo = cargo;
        this.telefone = telefone;
        this.imagemUrl = imagemUrl;
        this.perfilCode = perfilCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }

    public String getPerfilCode() {
        return perfilCode;
    }

    public void setPerfilCode(String perfilCode) {
        this.perfilCode = perfilCode;
    }

    @Override
    public String toString() {
        return "Perfil{" + "id=" + id + ", name=" + name + ", email=" + email + ", cargo=" + cargo + ", telefone=" + telefone + ", imagemUrl=" + imagemUrl + ", perfilCode=" + perfilCode + '}';
    }

}
