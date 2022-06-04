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
public class E8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Bienvenido. Recuerde que este programa solo puede leer numeros enteros. Ademas, este programa finalziara cuando ingrese un multiplo de 5.");
        int i = 1;
        int num;
        int contpar = 0;
        int contimpar = 0;
        int contneg = 0;
        
        do {
            
            System.out.println("Por favor, ingrese el numero: "+i);
            Scanner teclado = new Scanner(System.in).useDelimiter("\n");
            num = teclado.nextInt();
            
            if (num%2==0) {
                contpar = contpar + 1;
            } else {
                contimpar = contimpar + 1;
            }
            
            i = i + 1;
            
            if (num<0) {
                contneg = contneg + 1;
            }
            
        } while (num % 5 != 0);
        
        System.out.println("La cantidad de numeros leidos es: "+((i-1)-contneg));
        System.out.println("La cantida de numeros pares ingresados es: "+contpar);
        System.out.println("La cantida de numeros impares ingresados es: "+(contimpar-1));
        
    }
    
}
