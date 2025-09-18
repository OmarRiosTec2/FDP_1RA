/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_24_calificas;

import java.util.Scanner;

/**
 *
 * @author OMARABIUD
 */
public class EVA1_24_CALIFICAS {
        
    
    public static void main(String[] args) {
        int calificacion;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bienvenido a voletas de calificaciones");
        System.out.print("Ponga su porcentaje de calificacion: "); 
        System.out.println();
        calificacion = input.nextInt();
        
        if(calificacion >= 90 && calificacion<= 100){
            System.out.println("calificacion excelente aprovatoria con A");
        }else if(calificacion >= 80 && calificacion<= 89){
            System.out.println("calificacion aprovatoria con B");
        }else if(calificacion >= 70 && calificacion<= 79){
            System.out.println("calificacion casi aprovatoria con C");
        }else if(calificacion >= 60 && calificacion<= 69){
            System.out.println("calificacion depasada con D");
        }else if(calificacion <= 59 && calificacion>= 0){
            System.out.println("calificacion reprobatoria con F");
       
        
    }
  }
}
