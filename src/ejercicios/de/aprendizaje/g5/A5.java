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
public class A5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenida/o al programa de calculos CALCULIN. Por favor, ingresa un numero entero deseado.");
        
        Scanner leernum = new Scanner (System.in);
        double num;
        num = leernum.nextLong();
        
        System.out.println("El doble del numero " + num + " es: " + num*2);
        System.out.println("El triple del numero " + num + " es: " + num*3);
        System.out.println("La raiz cuadrada del numero " + num + " es: " + Math.sqrt(num));       

    }
    
}
