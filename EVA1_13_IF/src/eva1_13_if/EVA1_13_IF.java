/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author OMARABIUD
 */
public class EVA1_13_IF {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        double califa;
       
       System.out.println("Introduce tu calificacion: ");
       califa = input.nextDouble();
       if (califa >= 70){//SECCIÓN VERDADERO
           System.out.println("Aprovaste");
           } else {      //SECCIÓN FALSO
           System.out.println("reprobado");
       }
    }
    
}
