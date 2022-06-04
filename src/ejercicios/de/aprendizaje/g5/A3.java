/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.de.aprendizaje.g5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author javie
 */
public class A3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leefrase = new Scanner(System.in);
        System.out.println("Bienvenido/a al convertidor de mayusculas y minusculas.");
        System.out.println("Por favor, ingrese la frase que desea leer en mayusculas y minusculas.");
        String frase;
        frase = leefrase.nextLine();
        System.out.println(frase); //Me esta guardando solo una palabra...
        System.out.println("Muchas gracias, la frase ingresada en minusculas es: " +frase.toLowerCase()+ "y em mayusculas es: " + frase.toUpperCase());
    }
    
}
