/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_if_votar;

import java.util.Scanner;

/**
 *
 * @author OMARABIUD
 */
public class EVA1_14_IF_VOTAR {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double voto;
       
       System.out.println("Introduce tu annio de nacimiento: ");
       voto = input.nextDouble();
       if (voto <= 2007){
           System.out.println("Puedes votar");
           } else {      
           System.out.println("No puedes votar");
    }
  }
}
