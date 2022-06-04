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
public class A21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        System.out.println("Bienvenido/a. Por favor, comente cuantos numeros quiere ingresar.");
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int N = teclado.nextInt();
        int [] va21;
        va21 = new int [N];
        
        rellenarvector(N, va21);
        
        System.out.println("Por favor, ingrese el numero a buscar.");
        int num = teclado.nextInt();
        
        //for (int i = 0; i < N; i++){ Esto es para imprimir por pantalla el vector.
            //System.out.print(va21[i]+" ");
        //}
        
        int sum = 0;
        for (int i = 0; i < N; i++){
            if (va21[i] == num){
                sum = sum + 1;
                System.out.println("El numero se encuentra en la posicion: "+i);
            }
        }
        System.out.println("Por lo tanto, el numero "+num+" se encuentra "+sum+" veces repetidas.");
    }
    
    public static void rellenarvector (int N, int[]va21){
        for (int i = 0; i < N; i++)
            va21[i] = (int) (Math.random() * 10);
    }
    
}
