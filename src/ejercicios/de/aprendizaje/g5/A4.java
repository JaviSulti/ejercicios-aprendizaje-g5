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
public class A4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido/a al conversor de temperaturas.");
        System.out.println("Aqui podras convertir Centigrados en Fahrenheit.");
        System.out.println("Ingresa los grados en Centrigrados");
        
        float Centi;
        Scanner conversor = new Scanner(System.in);
        Centi = conversor.nextFloat(); //OJO, hay que ingresar con coma, no con punto. Si es con punto salta error.
        
        float Fah;
        Fah = 32+(9*Centi/5);
        
        System.out.println("El equivalente de " + Centi + " Centigrados de " + Fah + " grados Fahrenheit.");
    }
    
}
