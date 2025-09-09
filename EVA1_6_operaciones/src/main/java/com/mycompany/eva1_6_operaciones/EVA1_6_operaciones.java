/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_6_operaciones;

/**
 *
 * @author OMARABIUD
 */
public class EVA1_6_operaciones {

    public static void main(String[] args) {
        //ÁREA DE UN CIRCULO
        double area;
        double radio;
        double pi;
        //INICIALIZACIÓN
        pi = 3.1416;
        radio = 5;
        area = pi * radio * radio;
        //IMPRIMIR:
        System.out.println("el area de un circulo de radio = 5 es");
        System.out.println(area);
        
        //NUEVO CIRCULO RADIO 100
        radio = 100;
        area = pi * radio * radio;
        
        
        System.out.println("el area de un circulo de radio = 100 es");
        System.out.println(area);
    }
}
