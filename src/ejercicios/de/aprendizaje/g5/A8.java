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
public class A8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Bienvenida/o. Por favor, ingrese la frase a comparar");
        String frase;
        Scanner teclado = new Scanner(System.in);
        frase = teclado.nextLine();

        if(frase.equals("eureka")){
            System.out.println("CORRECTO. Ambas frases coinciden.");
        }else{
            System.out.println("INCORRECTO. Ambas frases no coinciden.");
        }
            
        
    }
    
}
