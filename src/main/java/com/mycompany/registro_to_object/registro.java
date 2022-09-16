/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registro_to_object;

/**
 *
 * @author luis.pilamunga
 */
public class registro {
    String  id_reg,nombre,apellido,email,num_1,num_2,num_casa,calle,ciudad,pais,num_4,tipo,fecha1,fecha2;

    public registro() {
        id_reg = "";
        nombre = "";
        apellido = "";
        email = "";
        num_1 = "";
        num_2 = "";
        num_casa = "";
        calle = "";
        ciudad = "";
        pais = "";
        num_4 = "";
        tipo = "";
        fecha1 = "";
        fecha2 = "";
    }

    public String getId_reg() {
        return id_reg;
    }

    public void setId_reg(String id_reg) {
        this.id_reg = id_reg;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNum_1() {
        return num_1;
    }

    public void setNum_1(String num_1) {
        this.num_1 = num_1;
    }

    public String getNum_2() {
        return num_2;
    }

    public void setNum_2(String num_2) {
        this.num_2 = num_2;
    }

    public String getNum_casa() {
        return num_casa;
    }

    public void setNum_casa(String num_casa) {
        this.num_casa = num_casa;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNum_4() {
        return num_4;
    }

    public void setNum_4(String num_4) {
        this.num_4 = num_4;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFecha1() {
        return fecha1;
    }

    public void setFecha1(String fecha1) {
        this.fecha1 = fecha1;
    }

    public String getFecha2() {
        return fecha2;
    }

    public void setFecha2(String fecha2) {
        this.fecha2 = fecha2;
    }
    
}