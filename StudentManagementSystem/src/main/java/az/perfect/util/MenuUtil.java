/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.util;
import java.util.Scanner;

/**
 *
 * @author sofiya.mammadova
 */
public class MenuUtil {
    public static void showMenu(){//PROSTO POKAZIVAET MENU
        Menu m[] = Menu.values(); //bize array qaytarir
        for(int i = 0; i < m.length; i++){
            if(m[i] != Menu.UNKNOWN) //chtobi on UNKNOWN v menu ne vivodil
            System.out.println(m[i]);        
        }    //dobavlaem eto v enum Menu v metod findNumber, kotoriy vernet Menu 
    }
    
    
    public static void menuProcess(){
        System.out.println("Please, select what do you want to do from menubar");
        showMenu();
        Scanner sc = new Scanner(System.in);//vvodim chislo, chtobi kakoy-to vibor iz menu srabotal
        int sm = sc.nextInt();
        Menu.findNumber(sm).enumProcess();//etot vvedenniy nami nomer otpravlaem v class Menu v metod findNumber(naprimer,mi vveli "2" i nam vernuli Register)
        //.enumProcess() oznachaet - v classe Menu rabotaet metod enumProcess dla Register
        //a enumProcess zastavlaet rabotat process (ETO 3-YA PEREMENNAYA V ENUME REGISTER, t.e. MenuRegisterService()), naxodashiysa vnutri REGISTER
        //druqimi slovami, vizivaetsa process MenuRegisterService()
    
    }
    
}
