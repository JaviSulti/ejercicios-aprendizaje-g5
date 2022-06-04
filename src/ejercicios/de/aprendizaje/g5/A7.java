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
public class A7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenida/o al PRIMATEITOR: el ultra programa que le ayudara a saber si un numero es par o impar.");
        System.out.println("Por favor, ingrese el numero deseado.");
        
        int num;
        Scanner leernumero = new Scanner (System.in);
        num = leernumero.nextInt();
        
        if (num % 2 == 0){
            System.out.println("El numero " + num + " es PAR.");
        } else {
            System.out.println("El numero " + num + " es IMPAR.");
        }
       
    }
    
}
