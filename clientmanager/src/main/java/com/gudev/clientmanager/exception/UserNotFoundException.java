/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gudev.clientmanager.exception;

/**
 *
 * @author Gustavo
 */
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message){
        super(message);
        
    }
    
}
