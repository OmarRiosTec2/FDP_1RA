/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_23_compras;

import java.util.Scanner;

/**
 *
 * @author OMARABIUD
 */
public class EVA1_23_COMPRAS {

    final static String ACCESO_EFE = "Y";
    final static String ACCESO_CRED = "Y";
    
    public static void main(String[] args) {
        String efectivo, credito;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("***CAJA DE BURGER DELI***");
        System.out.println("Burger Deli");
        System.out.print("¿Tiene efectivo para pagar? (Y/N): ");
        efectivo = captu.nextLine();
        System.out.println();
        System.out.print("O ¿Tiene Credito para pagar? (Y/N): ");
        credito = captu.nextLine();
        //OPERADOR AND (Y)
        if(efectivo.equals(ACCESO_EFE) || credito.equals(ACCESO_CRED)){
            System.out.println("PUEDE REALIZAR SU COMPRA!");
            }else{
            System.out.println("LO SIENTO POBRE VUELVE OTRO DIA");
    }
   } 
}
