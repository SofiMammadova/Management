/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.service.impl;

import az.perfect.bean.Config;
import az.perfect.bean.Teacher;
import az.perfect.service.inter.MenuService;
import java.util.LinkedList;

/**
 *
 * @author sofiya.mammadova
 */
public class MenuShowTeacher implements MenuService{

    @Override
    public void process() {
        LinkedList<Teacher> teachers = Config.instance().getTeachers();
      /*  for(Teacher t : teachers){    // perviy metod
            System.out.println(t);
        }*/
      teachers.forEach(t -> System.out.println(t));
      
    }
    
}
