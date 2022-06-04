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
public class A17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Bienvenida/o al dibujante de marcos asterisqueados. Por favor, indique cuantos asteriscos desea tenga los lados del cuadarado.");        
        Scanner teclado = new Scanner (System.in);
        int N = teclado.nextInt();
        int i;
        
        //Arranco con la linea superior del cuadrado
        for (i=0;i<N;i++){
            System.out.print("*");
        }
        
        System.out.println("");
        
        for (i=0;i<N-2;i++){ //Para la parte del centro.
            System.out.print("*");
            for (int j = 0; j < N - 2; j++){
                System.out.print(" ");
                
            }
            System.out.println("*");
            
        }
        
        // TErmino con la lina inferior.
        for (i=0;i<N;i++){
            System.out.print("*");
        }
        System.out.println("");
    }
    
}
