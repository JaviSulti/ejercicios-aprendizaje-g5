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
public class A12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Bienvenida/o al VALIDATOR: el programa que le dira si la nota ingresada se encuentra entre 0 y 10, puesto Ud. se ha olvidado los numeros.");
        Byte nota;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Por favor, ingrese la nota deseada.");
        
        do {
            nota = teclado.nextByte();
            if (nota<=0 || nota>=10){
                System.out.println("La nota ingresada no es correcta. Por favor, vuelva a ingresara otro valor.");
            }
        } while (nota<=0 || nota>=10);
        
        System.out.println("Fantastico. La nota ingresada " + nota + " es correcta.");
        
        
    }
    
}
