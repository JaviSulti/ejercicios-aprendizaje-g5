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
public class A13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Bienvenido al SUMATEITOR, el programa que le ayudara a sumar numeros hasta que lleguen a un valor determinado.");
        Scanner teclado = new Scanner (System.in);
        System.out.println("Por favor, ingrese el valor limite positivo. ");
        long limite = teclado.nextLong();
        long num, suma;
        suma = 0;
        System.out.println("Ingrese el numero a sumar.");
        if (limite>0){
            while (suma<limite){
                num = teclado.nextLong();
                suma = suma + num;
                System.out.println("Ingrese un nuevo numero.");
            }
            System.out.println("Ya no ingrese mas numeros, puesto que " + suma + " es mayor que el limite " + limite);
        }else{
            System.out.println("El numero ingresado no es correcto. Vuelva a intentarlo.");
        }
        
        
    }
    
}
