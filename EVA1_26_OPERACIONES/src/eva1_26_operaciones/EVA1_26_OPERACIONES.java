/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_26_operaciones;

/**
 *
 * @author OMARABIUD
 */
public class EVA1_26_OPERACIONES {

    
    public static void main(String[] args) {
        int Num1 = 2024, Num2 = 4;
        int resu;
        resu = Num1 / Num2;
        System.out.print("2024 / 4 = ");
        System.out.println(resu);
        
        double Num3 = 2024.0, Num4 = 4.0;
        double reu;
        reu = Num3 / Num4;
        System.out.print("2024.0 / 4.0 = ");
        System.out.println(reu);
        
        //CALCULAR EL RESIDUO
        //RESIDUO = MODULO = %
        int num5 = 2024, num6 = 4;
        int resi;
        resi = num5 % num6;//calcular el residuo
        System.out.print("Residuo de 2024 % 4 = ");
        System.out.println(resi);
        if(resi == .0){//divicion entre 4
            System.out.println("puede que sea bisiesto");
        }
    }
    
}
