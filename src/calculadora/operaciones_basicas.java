/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.util.Scanner;

public class operaciones_basicas {
    Scanner entrada = new Scanner (System.in);
    private float numero, numero1, resultado;
    
    
    public void suma (float numero, float numero1){
        System.out.println("muestre el primer numero");
        numero = entrada.nextFloat();
        System.out.println("muestre el segundo nuemro");
        numero1 = entrada.nextFloat();
        resultado = numero + numero1;
        System.out.println("la suma es: " + resultado);
            
        }    
        
    public void resta (float numero, float numero1){
        System.out.println("muestre el primer numero");
        numero = entrada.nextFloat();
        System.out.println("muestre el segundo nuemro");
        numero1 = entrada.nextFloat();
        resultado = numero - numero1;
        System.out.println("la resta es: " + resultado);
        
    }    
    
    public void multiplicacion (float numero, float numero1){
        System.out.println("muestre el primer numero");
        numero = entrada.nextFloat();
        System.out.println("muestre el segundo nuemro");
        numero1 = entrada.nextFloat();
        resultado = numero * numero1;
        System.out.println("la multiplicacion es: " + resultado);
        
    }
    
    public void division (float numero, float numero1){
        System.out.println("muestre el primer numero");
        numero = entrada.nextFloat();
        System.out.println("muestre el segundo nuemro");
        numero1 = entrada.nextFloat();
        
        if (numero1 == 0){
            System.out.println("el cero no es divisible");
        }else{
            resultado = numero / numero1;
            System.out.println("la division es: " + resultado);
                
        }
            
    }    
}    
    

