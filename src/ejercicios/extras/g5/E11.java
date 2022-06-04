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
public class E11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Bienvenido. Este programal le indicara cuantos digitos tiene el numero ingresado por Ud. Recuerde que debe ser un entero positivo.");
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        System.out.println("\nPor favor, ingrese el numero deseado.");
        int num = teclado.nextInt();
        int aux = num;
        int div;
        int i = 0;
        if (num < 0) {
            System.out.println("El numero ingresado debe ser positivo.");
        }else if (num>0 && num<10){
            System.out.println("El numero ingresado tiene 1 digito.");
        } else {
            
            do {                
                div = num/10;
                num = div;
                i = i + 1;
            } while (num>0);
            
            System.out.println("La cantidad de digitos que tiene el numero "+aux+" es: "+i);
            
        }
        
    }
    
}
