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
public class E13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Bienvenido al Scalereitor. El programa que dibujara una escalera de numeros segun el numero que Ud. ingrese.");
        System.out.print("Por favor, ingrese un numero entero positivo > ");
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int num = teclado.nextInt();
        
        int [] [] maE13 = new int [num][num];
        System.out.println("\nLa escalera generada es:\n");
        for (int j = 0; j < maE13.length; j++) {
            for (int i = 0; i <= j ; i++) {
                System.out.print((i+1));
            }
            System.out.println("");
        }
        
    }
    
}
