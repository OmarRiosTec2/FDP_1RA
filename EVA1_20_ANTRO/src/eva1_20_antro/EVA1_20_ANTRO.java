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
    final static int ACCESO_EDAD = 19;
    final static int ACCESO_CRED = 2008;
    public static void main(String[] args) {
        int edad, creden;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("***bienvenido a mamitas***");
        System.out.print("Introduce su edad: ");
        edad = captu.nextInt();
        System.out.print("año de su credencial: ");
        creden = captu.nextInt();
        if(edad > ACCESO_EDAD){
            if(creden < ACCESO_CRED){
            System.out.println("ACCESO CONCEDIDO");
            }else{
            System.out.println("ACCESO DENEGADO");
            }
            }else{
            System.out.println("ACCESO DENEGADO");
    }
   } 
}
