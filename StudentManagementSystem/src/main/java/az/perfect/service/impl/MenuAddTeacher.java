/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.service.impl;

import az.perfect.bean.Config;
import az.perfect.bean.Teacher;
import az.perfect.service.inter.MenuService;
import java.util.Scanner;

/**
 *
 * @author sofiya.mammadova
 */
public class MenuAddTeacher implements MenuService{

    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter teacher's name: ");
        String name = sc.next();
        
        System.out.print("Enter teacher's surname: ");
        String surname = sc.next();
        
        System.out.println("Enter teacher's age: ");
        int age = sc.nextInt();
        
        System.out.println("Enter schoolname where the teacher works: ");
        String schoolname = sc.next();
        
        System.out.println("Enter the teacher's salary: ");
        double salary = sc.nextDouble();
        
        Teacher t = new Teacher();
        t.setName(name);
        t.setSurname(surname);
        t.setAge(age);
        t.setSchoolName(schoolname);
        t.setSalary(salary);
        
        Config.instance().setTeachers(t); //add elemek uchun
    }
    
}
