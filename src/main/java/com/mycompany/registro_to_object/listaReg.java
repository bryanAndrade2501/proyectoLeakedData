/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registro_to_object;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author luis.pilamunga
 */
public class listaReg {
    ArrayList<registro> listreg =new ArrayList();
    
    public void addReg(String id_reg, String nombre, String apellido, String email, String num_1, String num_2, String num_casa, String calle, String ciudad, String pais, String num_4, String tipo, String fecha1, String fecha2){
        registro reg =new registro();
        reg.setId_reg(id_reg);
        reg.setNombre(nombre);
        reg.setApellido(apellido);
        reg.setEmail(email);
        reg.setNum_1(num_1);
        reg.setNum_2(num_2);
        reg.setNum_casa(num_casa);
        reg.setCalle(calle);
        reg.setCiudad(ciudad);
        reg.setPais(pais);
        reg.setNum_4(num_4);
        reg.setTipo(tipo);
        reg.setFecha1(fecha1);
        reg.setFecha2(fecha2);
        
        listreg.add(reg);
    }
    
    public void getReg(){
        
        String string="";
        for (int i = 0; i < listreg.size(); i++) {
            string+=listreg.get(i).getId_reg()+"|"+listreg.get(i).getNombre()+"\n";
            
        }
        JOptionPane.showMessageDialog(null, string);
    }
}
