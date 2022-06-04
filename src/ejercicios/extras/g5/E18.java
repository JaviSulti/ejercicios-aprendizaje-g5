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
public class E18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Por favor, indique cuantos nuemros quiere sumar > ");
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int N = teclado.nextInt();
        int [] veE18 = new int [N];
        int suma = 0;
        for (int i = 0; i < veE18.length; i++) {
            System.out.print("Por favor, ingrese el valor del numero "+(i + 1)+" > ");
            veE18[i] = teclado.nextInt();
            suma = suma + veE18[i];
        }
        System.out.println("La suma de todos los numeros ingresados es: "+suma);
    }
    
}
