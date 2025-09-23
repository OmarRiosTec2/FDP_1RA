/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_28_moneda;

import java.util.Scanner;

/**
 *
 * @author OMARABIUD
 */
public class EVA1_28_MONEDA {

    public static void main(String[] args) {
      Scanner captu = new Scanner(System.in);
      int usuario;
     usuario = captu.nextInt();
      System.out.print("elija la cara de la moneda (1/0): ");
     System.out.println(usuario);
     
    
     if(Math.random() <= 0.5)
         System.out.println("cayo en aguila");
     else 
         System.out.println("cayo en cruz");
    }
    
}
