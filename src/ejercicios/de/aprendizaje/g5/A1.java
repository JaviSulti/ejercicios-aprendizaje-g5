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
public class A1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingresodenumeros = new Scanner(System.in); //Aca fdefino el objeto que tiene como funcion el ingreso de valores mediante Scanner.
        System.out.println("Bienvenido/a. En este programa, Ud. podra sumar dos numeros.");
        System.out.println("Por favor, ingrese el primer numero:");
        int num1; //Aca lo que hice fue definir el primer valor como numero.
        num1 = ingresodenumeros.nextByte();
        System.out.println("Por favor, ingrese el segundo numero:");
        int num2;
        num2 = ingresodenumeros.nextByte();
        int suma;
                suma = num1 + num2;
        System.out.println("La suma de los dos numeros ingresados es: " + suma);
    }
    
}
