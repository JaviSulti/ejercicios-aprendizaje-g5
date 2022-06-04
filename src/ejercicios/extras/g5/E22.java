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
public class E22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Bienvenido. Este programa mostrara la suma de todos los elementos de una matriz de tamanio indicado por Ud.");
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Por favor, ingrese la cantidad de columnas de la matriz > ");
        int N = teclado.nextInt();
        System.out.print("Por favor, ingrese la cantidad de filas de la matriz > ");
        int M = teclado.nextInt();
        int [] [] maE22 = new int [N][M];
        int suma =0;
        
        for (int j = 0; j < M; j++) {
            for (int i = 0; i < N; i++) {
                maE22 [i][j] = (int) (Math.random()*100);
                suma = suma + maE22 [i][j];
            }            
        }
        System.out.print("La matriz generada aleatoriamente es: \n");
        for (int j = 0; j < M; j++) {
            for (int i = 0; i < N; i++) {
                System.out.print(maE22 [i][j]+" ");
            }     
            System.out.println("");
        }
        
        System.out.println("La suma de todos los elementos de la matriz es: "+suma);
    }
    
}
