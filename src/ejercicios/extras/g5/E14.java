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
public class E14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Por favor, ingrese la cantidad de familias > ");
        int N = teclado.nextInt();
        int suma = 0;
        int edad = 0;
        int cont = 0;
        
        for (int i = 0; i < N; i++) {
            System.out.print("Para la familia numero "+(i+1)+" ingrese la cantidad de hijos > ");
            int M = teclado.nextInt();
            for (int j = 0; j < M; j++) {
                System.out.print("Para el hijo "+(j+1)+" ingrese la edad > ");
                edad = teclado.nextInt();
                suma = suma + edad;
                edad = suma;
                cont = cont + 1;
            }
            System.out.println(suma);
        }
       
        System.out.println("El promedio de edad de todos los hijos es: "+(edad/cont));
        
    }
    
}
