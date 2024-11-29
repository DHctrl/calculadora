/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner Jhostyn = new Scanner(System.in);
        int elegir;
        String continuar;
        float _numero = 0, _numero1 = 0;
        
        operaciones_basicas ope = new operaciones_basicas();
        
        System.out.println("1. elija para realizar la suma");
        System.out.println("2. elija para realizar la ");
        System.out.println("3. elija para realizar la multiplicación");
        System.out.println("4. elija para realizar la division");
        System.out.println("Puede elegir cualquier operacion:");
        elegir = Jhostyn.nextInt();
        
        switch (elegir){
            case 1:
                ope.suma(_numero, _numero1 );
                break;
            case 2:
                ope.resta(_numero, _numero1);
                break;
            case 3:
                ope.multiplicacion(_numero, _numero1);
                break;
            case 4:
                ope.division(_numero, _numero1);
                break;
            default:
                System.out.println("la opcion que elegiste no se encuentra ");
        }
       
    }
}
