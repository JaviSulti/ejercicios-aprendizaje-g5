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
public class A10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        System.out.println("Bienvenida/o al FRASE-ATOR: el fabuloso programa que le dira si la primera letra de una palabra o frase comienza con una A");
        System.out.println("Por favor, ingrese la Palabra o Frase deseada.");
        
        String frase;
        Scanner teclado = new Scanner (System.in);
        frase = teclado.nextLine();
        
        //if (frase.substring(0,0) == "A") {
            //System.out.println("CORRECTO.");
       // } else {
           // System.out.println("INCORRECTO.");
       // }        OJO, aca salta una advertencia de que NO ESTA BUENO COMPARAR CARACTERES CON EL OPERADOR DE IGUALDAD. Hay que utilziar el metodo iquals.
       // https://www.youtube.com/watch?v=kpRO0a8Ky9k 
       
      
       if ((frase.substring(0,1)).equals("A")){ //OJO aca, la primera letra la da el 0 . 1
           System.out.println("CORRECTO. La palabra/frase ingresada comienza con la letra A");
       } else {
           System.out.println("INCORRECTO. La palabra/frase ingresada NO comienza con la letra A");
       }
           
    }
    
}
