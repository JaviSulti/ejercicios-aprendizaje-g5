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
public class A2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leenombre = new Scanner(System.in); //Aca le digo al programaque voy a necesitar leer variables por teclado.
        System.out.println("Bienvenida/o. Por favor, ingrese su mombre."); //Muestro por pantalla lo que necesito.
        String nombre; //Nombre y doy tipo de variable que necesito.
        nombre = leenombre.next(); //Le digo al programa que necesito que lea el nombre usando el objeto leenombre y le asigno valor.
        System.out.println("Muchas gracias " + nombre + " por haber ingresado su nombre.");
        
    }
    
}
