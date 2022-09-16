/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.registro_to_object;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author luis.pilamunga
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            File doc =new File("D:\\LeakedData.txt");
            BufferedReader obj =new BufferedReader(new FileReader(doc));
            listaReg reg=new listaReg();
            String linea;
            int cont=0;
            while((linea=obj.readLine())!=null){
                
                String [] campos_obj={};
                campos_obj=linea.split(",");
                System.out.println(campos_obj.length);

                reg.addReg(campos_obj[0], campos_obj[1], campos_obj[2], campos_obj[3],
                        campos_obj[4], campos_obj[5], campos_obj[6],
                        campos_obj[7], campos_obj[8], campos_obj[9],
                        campos_obj[10], campos_obj[11], campos_obj[12], campos_obj[13]);
                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }
    
}
