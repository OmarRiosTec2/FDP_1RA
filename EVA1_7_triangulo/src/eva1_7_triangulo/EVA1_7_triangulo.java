/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_triangulo;

/**
 *
 * @author OMARABIUD
 */
public class EVA1_7_triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // AREA TRIANGULO
        // AREA = (BASE X ALTURA) ENTRE 2;
        double area, base, altura;//tres variables de tipo double
        //INICIALIZACIÓN
        base = 11;
        altura = 3;
        //SE APLICA PRECEDENCIA DE OPERADORES
        area = (base * altura) / 2.0;//CUIDADO CON DIVIDIR ENTRE ENTEROS
        
        System.out.println("tu area del triangulo base 11 y altura 3 es  igual a:");
        System.out.println(area);
    }
    
}
