/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.extras.g5;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Bienvenido/a. Por favor, ingrese una letra.");
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        String letra = teclado.next();
        
        if (letra.length()==1){

            if (letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u")||letra.equals("A")||letra.equals("E")||letra.equals("I")||letra.equals("O")||letra.equals("U")){
                System.out.println("La letra ingresada " +letra+ " es una vocal.");
            }else{
                System.out.println("La letra ingresada "+letra+ " no es una vocal.");
            }
            
        }else{
            System.out.println("Ud. ha ingresado mas de una letra.");
        }
    }
}
