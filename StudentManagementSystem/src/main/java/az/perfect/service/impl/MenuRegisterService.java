/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.service.impl;


import az.perfect.service.inter.MenuService;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sofiya.mammadova
 */
public class MenuRegisterService implements MenuService{//implementasiya eliyen class

    @Override
    public void process() {
        Scanner sc = new Scanner((System.in));
        System.out.println("Welcome to the Register page!");
        System.out.println("Please enter your username: ");
        String username = sc.next();
        
        System.out.println("Please enter your password: ");
        String password = sc.next();
        String info = username + '/' + password;
        
        try {
            FileUtility.writeIntoFile("Users.txt", info);
        } catch (IOException ex) {
            Logger.getLogger(MenuRegisterService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
