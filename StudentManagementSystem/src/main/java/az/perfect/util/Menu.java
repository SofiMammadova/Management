/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.util;

import az.perfect.service.impl.MenuAddStudent;
import az.perfect.service.impl.MenuAddTeacher;
import az.perfect.service.impl.MenuExit;
import az.perfect.service.impl.MenuLoginService;
import az.perfect.service.impl.MenuRegisterService;
import az.perfect.service.impl.MenuShowStudent;
import az.perfect.service.impl.MenuShowTeacher;
import az.perfect.service.impl.MenuUnknownService;
import az.perfect.service.inter.MenuService;

/**
 *
 * @author sofiya.mammadova
 */
public enum Menu {
    LOGIN(1,"Login", new MenuLoginService()), //3-yu peremennuyu berem iz package'a az.perfect.service.impl. Her bir servicin icherisinde process metodu var
    REGISTER(2,"Register", new MenuRegisterService()), //3-yu peremennuyu berem iz package'a az.perfect.service.impl. Her bir servicin icherisinde process metodu var
    ADD_STUDENT(3,"Add Student", new MenuAddStudent()),//u druqih net servica v package az.perfect.service.impl, poetomu null
    ADD_TEACHER(4,"Add Teacher", new MenuAddTeacher()), //napisali service dlya add teacher
    SHOW_STUDENT(5,"Show Student", new MenuShowStudent()),
    SHOW_TEACHER(6,"Show Teacher", new MenuShowTeacher()),
    EXIT(7,"Exit", new MenuExit()),
    UNKNOWN(new MenuUnknownService());    //NESMOTRA NA TO,CHTO CONSTRUCTORI VISHEUKAZANNIH ENUMOV PRINIMAYU 3 ZNACHENIYA, ETOMU ENUMU NUZHEN TOLKO SERVICE, ego constr viqaldit tak:
    
    //NESMOTRA NA TO,CHTO CONSTRUCTORI VISHEUKAZANNIH ENUMOV PRINIMAYU 3 ZNACHENIYA, ETOMU ENUMU NUZHEN TOLKO SERVICE
    private Menu(MenuService service) {
        this.service = service;
    }    
    
    
    private int number;
    private String text;  
    private MenuService service;

    private Menu(int number, String text, MenuService service) {//zapolnenniy constructor:LOGIN(1,"Login")
        this.text = text;
        this.number = number;
        this.service = service;
    }

    @Override
    public String toString() {
        return number + "." + text;
    }
    
    public void enumProcess(){//mi xotim, chtobi her bir enum MenuService gotursun
        //uchitivaya polymorph, ih samiy qlavniy - MenuService. Naprim, login MenuLoginService gotursun, Register ise MenuRegisterService gotursun, yeni onun obyektini gotursun
        //poetomu v verxniy constructor odbavim 3-yu peremennuyu MenuService service
        //sdelaem tak, chtob naprimer, pri vibore LOGIN, srabotal enumProcess, t.e icherisindeki servicin processini chagirsin
        service.process();
        //t.e. men LOGIN sechecem,LOGININ enumProcessini chagiracam, enumProcessi ise service.processi chagiracaq, LOGINin service.processi ise MenuLoginService-di
        //a v MenuLoginService u nas srabotaet sout("Login process is working!")
        MenuUtil.menuProcess();
        //MenuUtil.menuProcess(); i enumProcess() postoyanno vizivayut druq druqa
        //t.e. poka mi ne sdelaem esxit, oni budut viizvat dr druqa
    
    }   

    public int getNumber() {  //sozdadim zdes metod getNumber, numberine gore menu tapacaq, poetomu sozdaem vnizu static metod
        return number;
    }
    
    public static Menu findNumber(int selectedNum){//bu metod nomresine gore menunu tapib qaytarir
        Menu m[] = Menu.values(); //bize array qaytarir
        for(int i = 0; i < m.length; i++){
           // System.out.println(m[i]);            
           if(m[i].getNumber()==selectedNum){ //esli to, chto mi vvedli, sootvetstvuyet kakomu-to viboru iz menu (1.login, 2.register i t d) , to verni ego, a esli net, to vernet UNKNOWN
               return m[i]; // no est problema, kol-vo vibora v menu 7 (posledniy Exit), a esli chelovek napishet 50, xota maks= 7
               //poetomu posle Exit-a UNKNOWN adinda bir enum yaziriq
           }
        } 
        return Menu.UNKNOWN; //esli nichego ne nasshel , t.e. vvedonnoqo chisla v vibore menu (1-7) net, toqda verni unknown enum, t.e srabotaet class MenuUnknownService
    }
    
}
