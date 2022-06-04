/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.de.aprendizaje.g5;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class A18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Bienvenido al asterisqueador de numeros.");    
        System.out.println("Por favor, ingrese cuatro numeros enteros comprendidos entre 1 y 20.");
        Scanner teclado = new Scanner (System.in);
        System.out.print("Numero 1: ");
        int num1 = teclado.nextInt();
        System.out.print("Numero 2: ");
        int num2 = teclado.nextInt();
        System.out.print("Numero 3: ");
        int num3 = teclado.nextInt();
        System.out.print("Numero 4: ");
        int num4 = teclado.nextInt();
        int i;
        
        if (num1 >= 1 && num1<= 20 && num2 >= 1 && num2<= 20 && num3 >= 1 && num3<= 20 && num4 >= 1 && num4<= 20){
            System.out.print(num1);
            for (i = 0; i < num1; i++){
                System.out.print("*");
            }
            System.out.println("");
            
            System.out.print(num2);
            for (i = 0; i < num2; i++){
                System.out.print("*");
            }
            System.out.println("");
            
            System.out.print(num3);
            for (i = 0; i < num3; i++){
                System.out.print("*");
            }
            System.out.println("");
            
            System.out.print(num4);
            for (i = 0; i < num4; i++){
                System.out.print("*");
            }
            System.out.println("");
        }else{
            System.out.println("");
            System.out.println("Al menos un de los numeros ingresados, no se encuentra comprendido entre el 1 y el 20.");
        }
        
      }   
}
