/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.service.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author sofiya.mammadova
 */
public class FileUtility {
    public static void writeIntoFile(String filename, String text) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename));) {//t.k. mi vruchnuyu ne budem zakrivat file
            //t.e. ne budem pisat bw.close(), metod TRY sam avtomatom eto sdelaet blaqodara stroke sverhu
            //eto nazivaetsa TRY WITH RECOURCES
            bw.write(text);
        }
    }
//.txt fayldan Stringi oxumaq

    public static String readFromFile(String filename) throws IOException {
        try (InputStream in = new FileInputStream(filename);
                InputStreamReader r = new InputStreamReader(in);
                BufferedReader reader = new BufferedReader(r);) {
            String line = null;
            String result = "";
            while ((line = reader.readLine()) != null) {
                result = result + line + "\n";
            };
            return result;
        }
        
    }
    
}
