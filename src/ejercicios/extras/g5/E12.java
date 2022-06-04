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
public class E12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Bienvenido al TRASTOCATOR. El mismo sustituira el numero 3 por una E.");
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int [] veE12num = new int [3];
        
        //Aca genero un vector con tres numeros.
        for (int i = 0; i < veE12num.length; i++) {
            System.out.print("Por favor, ingrese el valor del numero: "+(i+1)+"> ");
            veE12num [i] = teclado.nextInt();
        }
        //Aca convierto el vector anterior a cadena.
        String  [] veE12Str = new String [3];
        for (int i = 0; i < veE12Str.length; i++) {
            veE12Str [i] = String.valueOf(veE12num[i]);
        }
        
        System.out.print ("El numero convertido es: ");
        for (int i = 0; i < veE12Str.length; i++) {
            if (veE12Str[i].equals("3")) {
                veE12Str[i] = "E";
            }
            System.out.print(veE12Str[i]+" ");
        }
        System.out.println("");

    }
    
}
