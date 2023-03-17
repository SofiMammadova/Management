/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.service.impl;

import az.perfect.service.inter.MenuService;
import java.util.Scanner;

/**
 *
 * @author sofiya.mammadova
 */
public class MenuLoginService implements MenuService{ //implementasiya eliyen class

    @Override
    public void process() {
       // System.out.println("Login process is working!");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter username: ");
        String username = sc.next();
        
        System.out.print("enter password: ");
        String password = sc.next();
        
        if(!(username.equals("admin") && password.equals("123"))){
           System.exit(0);
        }
    }
    
}
