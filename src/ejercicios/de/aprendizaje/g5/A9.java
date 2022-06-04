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
public class A9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Solo puede introducir palabras o frases de 8 de largo.
        System.out.println("Bienvenida/o al programa LECTOROCHO. Un utilisimo programa que solo le indicara si la palabra o frase ingresada por Ud. contiene 8 caracteres.");
        System.out.println("Por favor, ingrese la palabra o frase deseada.");
        
        String frase;
        Scanner teclado = new Scanner (System.in);
        frase = teclado.nextLine();
        
        int largo;
        largo = frase.length();
        
        if(largo != 8){
            System.out.println("INCORRECTO. La frase/palabra ingresada no contiene 8 caracteres.");
        } else{
            System.out.println("CORRECTO. La frase/palabra ingresada contiene 8 caracteres.");
        }
    }
}
