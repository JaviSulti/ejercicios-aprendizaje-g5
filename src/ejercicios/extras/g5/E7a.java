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
public class E7a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Bienvenido/a. Por favor, ingrese la cantidad de numeros que desea ingresar.");
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int n = teclado.nextInt();
        int i = 2;
        int Vmax;
        int Vmin;
        float prom;
        
        System.out.println("Por favor, ingrese el primer numero: "); //Aca asigno el primer numero ingresado a Vmax y Vmin para luego comenzar a comparar con esos valores.
        int num = teclado.nextInt();
        Vmin = num;
        Vmax = num;
        prom = num;
        while (i<=(n)){
            System.out.println("Por favor, ingrese el numero "+i);
            num = teclado.nextInt();
            
            if (num > Vmax) {
                Vmax = num;
            }
            
            if (num < Vmin) {
                Vmin = num;
            }
            
            prom = prom + num;
            
        i = i + 1;
        }
        
        System.out.println("El valor maximo de los numeros ingresados es: "+Vmax);
        System.out.println("El valor minimo de los numeros ingresados es: "+Vmin);
        System.out.println("El valor promedio de todos los numeros ingresados es: "+((prom)/n));
        
    }
    
}
