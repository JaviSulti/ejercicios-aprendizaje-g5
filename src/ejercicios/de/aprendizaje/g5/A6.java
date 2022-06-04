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
public class A6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido/a al COMPARATOR: el mas avanzado comparador de numeros.");
        System.out.println("Para saber cual es el mayor de entre dos numeros, por favor, ingrese el primer numero");
        Scanner leernum = new Scanner (System.in);
        int num1;
        num1 = leernum.nextInt();
        System.out.println("Ingrese el segundo numero.");
        int num2;
        num2 = leernum.nextInt();
        
        if (num1>num2){
            System.out.println("El mayor numero ingresado es: " + num1);
        } else {
            System.out.println("El mayor numero ingresado es: " + num2);
        }
    }
}
