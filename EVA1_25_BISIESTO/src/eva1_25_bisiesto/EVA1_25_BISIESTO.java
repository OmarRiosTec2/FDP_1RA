/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_25_bisiesto;

import java.util.Scanner;

/**
 *
 * @author OMARABIUD
 */
public class EVA1_25_BISIESTO {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Num1;
        double resu, resu2, resu3;
        System.out.print("pon tu año para saber si bisiesto: ");
        Num1 = input.nextDouble();
        resu = Num1 % 4.0;
        resu2 = Num1 % 100.0;
        resu3 = Num1 % 400.0;
        
        if(resu == 0){
              if(resu2 == 0){
                  if(resu3 == 0){
              System.out.print("el año " + Num1 + " es año bisiesto");
                  }
        }else {
            System.out.print("el año " + Num1 + " no es año bisiesto");
            
            }
              }else{
            System.out.print("el año " + Num1 + "es año bisiesto");
       }         
    } 
  }  

