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
public class A16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        String cadena;
        int largo, suma1, suma2;
        suma1 = 0;
        suma2 = 0;
                
        do {
            System.out.println("Por favor, ingrese la cadena deseada.");
            cadena = teclado.next();
            largo = cadena.length();
            
            if (((cadena.substring(0,1)).equals("X"))&&((cadena.substring(4,5)).equals("O"))){
                suma1 = suma1 + 1;
            }else{
                suma2 = suma2 + 1;
            }
            
        } while ((!cadena.equals("&&&&&")) && (largo == 5));
        
        System.out.println("La cantidad de cadenas ingresadas CORRECTAS es: " + suma1);
        System.out.println("La cantidad de cadenas ingresadas INCORRECTAS es: " + (suma2-1));
        
    }
    
}
