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
public class A14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Bienbenido al SUMAREITOR PLUS: el programa que realiza suma de 20 numeros, siempre que el numero no sea negativo.");
        System.out.println("Recuerde que para terminar el programa, Ud. debe ingresar el valor 0.");
        
        Scanner teclado = new Scanner (System.in);
        
        byte i;
        long num, suma;
        suma = 0;
        
        for (i=1;i<=20;i++){
            System.out.println("Ingrese el numero a sumar.");
            num = teclado.nextLong();
            if (num <0){
                System.out.println("No se ha sumado debido a que ingreso un numero negativo.");
                System.out.println("");
            } else if (num > 0){
                suma = suma + num;
                System.out.println("Se ha sumado el numero.");
                System.out.println("");
            } else if (num == 0){
                System.out.println("Ud. ha decido salir del programa.");
                break;
            }
        
        }
        if (i<=20) {
            System.out.println("La suma generada hasta el momento es: " + suma);
        }
        if (i>20) {
            System.out.println("Ud. sumo 20 numeros, sindo la sumatoria total de ellos: " + suma);
        }
    }
    
}
