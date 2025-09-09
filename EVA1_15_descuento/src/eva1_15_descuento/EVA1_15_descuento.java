/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_descuento;

import java.util.Scanner;

/**
 *
 * @author OMARABIUD
 */
public class EVA1_15_descuento {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double monto, venta;
        
        System.out.println("Ingresa tu monto deseado: ");
        venta = input.nextDouble();
         if (venta >= 1000);//LE DAMOS 15% DE DESCUENTO
            monto = venta * 0.85;
            System.out.println("felicidades tienes un 15%:");
            System.out.println(monto);
           
    }
   } 

