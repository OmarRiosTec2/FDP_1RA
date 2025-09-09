/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_captura;

import java.util.Scanner;

/**
 *
 * @author OMARABIUD
 */
public class EVA1_11_Captura {
    public static void main(String[] args) {
        //CALCULO DE VELOCIDAD:
        Scanner input = new Scanner(System.in);
        //SOLICITAR DISTANCIA (M) Y TIEMPO (S)
        double M, S, V, kmh;
       
        //CALCULAR LA VELOCIDAD
        System.out.println("La distancia es: ");
        M = input.nextDouble();
        //DECLARAR VARIABLE Y SCANNER
         System.out.println("El tiempo es: ");
        S = input.nextDouble();
        //SOLICITAR DATOS
        V = (M/S);
        //REALIZAR CALCULOS
        System.out.println("la velocidad es: ");
        System.out.println(V);
        //DAR RESULTADO EN KM/HR
        kmh = V * 3.6;
        System.out.println("los kilometros por hora es: ");
        System.out.println(kmh);
    }
    
}
