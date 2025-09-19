/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_27_conversiones;

/**
 *
 * @author OMARABIUD
 */
public class EVA1_27_CONVERSIONES {

    public static void main(String[] args) {
       int temp;
       double tempDec = 25.7;
       temp = (int)tempDec;
       System.out.println(temp);
       
       double tempDec2;
       tempDec2 = temp;
       System.out.println(temp);
       
       String cade, mensaje;
       cade = "la temperatura es ";
       mensaje = cade + temp;
       System.out.println(mensaje);
    }
    
}
