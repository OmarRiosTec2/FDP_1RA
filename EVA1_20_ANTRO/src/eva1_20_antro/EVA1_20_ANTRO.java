/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_antro;

import java.util.Scanner;

/**
 *
 * @author OMARABIUD
 */
public class EVA1_20_ANTRO {
    
    public static void main(String[] args) {
        int edad;
        String creden;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("***bienvenido a mamitas***");
        System.out.print("Introduce su edad: ");
        edad = captu.nextInt();
        captu.nextLine();
        System.out.print("¿tiene su ine? (y/n): ");
        creden = captu.nextLine();
        if(edad >= 18){
            if(creden.equals("y")){
            System.out.println("ACCESO CONCEDIDO");
            }else{
            System.out.println("ACCESO DENEGADO");
            }
            }else{
            System.out.println("ACCESO DENEGADO");
    }
   } 
}
