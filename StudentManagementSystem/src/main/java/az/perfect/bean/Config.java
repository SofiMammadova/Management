/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.bean;

import java.util.LinkedList;

/**
 *
 * @author sofiya.mammadova
 */
public class Config {//budem ispolz LinkedList - tolko dla zapisi i dla chteniya
    private LinkedList<Teacher> teachers = new LinkedList();    //static deyil t.k.v pamati budem zanimat lishneye mesto, poetomu budem delat instance
    private LinkedList<Student> students = new LinkedList();    //static deyil, t.k.v pamati budem zanimat lishneye mesto, poetomu budem delat instance
    //i t.k oni ne statichnie, Config obyekti yaratmaliyiq ve sonra get setle ishlemeliyik
    //chtob kazhdiy raz ne sozdavat novie config obyekti, sozdaem peremennuyu config tipa Config(t.e. sozdaem obyekt):
    public static Config config = null;//null, chtob bosh boshuna yaddasha yuklenmesin, unvani yoxdu
    
    //pishem takoy metod:
    public static Config instance(){//biz instance chagiran kimi, bize config obyektini qaytaracaq
       if(config==null){//eger config bosh olsa
          config=new Config();//onun yenisini yaradib qaytar
       }
     return config;
    }

    public LinkedList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher teachers) {
        this.teachers.add(teachers);
    }

    public LinkedList<Student> getStudents() {
        return students;
    }

    public void setStudents(Student student) {
        this.students.add(student);
    }
    
    
    
}
