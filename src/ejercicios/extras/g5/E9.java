/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.extras.g5;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class E9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Bienvenido/a a la division mediante restas. Para ello, debera declarar dos numeros enteros.");
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor, ingrese el primer numero >");
        int num1 = teclado.nextInt();
        System.out.println("Por favor, ingrese el segundo numero >");
        int num2 = teclado.nextInt();
        int i = 0;
        if (num1 < num2) {
            System.out.println("La division no puede ser ejecutada, ya que el segundo numero es mayor que el primero.");
            
        } else {
            
            do {                
                int residuo = num1 - num2;
                num1 = residuo;
                i = i + 1;
                
            } while (num1 > num2);

            System.out.println("El residuo es: "+num1);
            System.out.println("El cociente es: "+i);
            
        }
        
    }
    
}
