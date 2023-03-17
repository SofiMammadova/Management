/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.service.impl;

import az.perfect.bean.Config;
import az.perfect.bean.Student;
import az.perfect.service.inter.MenuService;
import java.util.Scanner;

/**
 *
 * @author sofiya.mammadova
 */
public class MenuAddStudent implements MenuService {

    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter student's name: ");
        String name = sc.next();
                
        System.out.println("Enter student's surname: ");
        String surname = sc.next();
        
        System.out.println("Enter student's age: ");
        int age = sc.nextInt();
        
        System.out.println("Enter stuudent's schoolname: ");
        String schoolname = sc.next();
        
        System.out.println("Enter student's scholarship: ");
        double scholarship = sc.nextDouble();
        
        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);
        s.setAge(age);
        s.setSchoolName(schoolname);
        s.setScholarship(scholarship);
        
        Config.instance().setStudents(s);
        
    }
    
}
