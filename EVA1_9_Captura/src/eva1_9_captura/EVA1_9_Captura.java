/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_captura;

import java.util.Scanner;

/**
 *
 * @author OMARABIUD
 */
public class EVA1_9_Captura {
    
    public static void main(String[] args) {
        String nombre;
        int edad;
        double promedio;
        Scanner input = new Scanner(System.in);//CREAMOS EL SCANNER
        
        System.out.println("Introduce el nombre completo:");
        nombre = input.nextLine();//nextLne() --> CAPTURA TEXTO
        //COMO CAPTURAR EN JAVA:
        
        System.out.println("introduce la edad");
        edad = input.nextInt();
        
        System.out.println("Captura el promedio");
        promedio = input.nextDouble();
        
        System.out.println("el nombre capturado es:");
        System.out.println(nombre);
        System.out.println("La edad es:");
        System.out.println(edad);
        System.out.println("El promedio es");
        System.out.println(promedio);
    }
    
}
