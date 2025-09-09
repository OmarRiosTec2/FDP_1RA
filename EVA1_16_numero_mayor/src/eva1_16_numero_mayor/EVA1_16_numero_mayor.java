/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author OMARABIUD
 */
public class EVA1_16_numero_mayor {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int uno, dos;
        
        System.out.println("introduce el primer numero: ");
        uno = input.nextInt();
        System.out.println("introduce el segundo numero: ");
        dos = input.nextInt();
        if(uno > dos){
        System.out.println("el mayor es: ");
        System.out.println(uno);
        }else{
            if(uno < dos){
        System.out.println("el mayor es: ");
        System.out.println(dos);
        }else{
        System.out.println("los numeros son iguales");
            }
    }
        
        
    }
    
}
