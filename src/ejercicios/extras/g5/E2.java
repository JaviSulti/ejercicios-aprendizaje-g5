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
public class E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Bienvenido. A continuacion se le pedira que ingrese 4 valores numericos diferentes para cuatro variables. Las cuales luego intercambiaran sus valores.");
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        
        System.out.print("Ingrese el valor de la variable A: ");
        int A = teclado.nextInt();
        System.out.print("Ingrese el valor de la variable B: ");
        int B = teclado.nextInt();
        System.out.print("Ingrese el valor de la variable C: ");
        int C = teclado.nextInt();
        System.out.print("Ingrese el valor de la variable D: ");
        int D = teclado.nextInt();
        int Aux = B;
        System.out.println("\nLos valores intercambiados de las variables son: ");
        System.out.println("Valor de A: "+D);
        System.out.println("Valor de B: "+C);
        System.out.println("Valor de C: "+A);
        System.out.println("Valor de D: "+Aux);
        
    }
    
}
