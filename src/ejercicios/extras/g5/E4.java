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
public class E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Bienvenido/a. Por favor, ingrese un numero entero entre 1 y 9, el cual sera convertir a romano.");
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        byte num = teclado.nextByte();
        if (num<10&&num>0) {
            switch (num){
                case 1:
                    System.out.println("El numero "+1+ " en romanos es: I.");
                    break;
                case 2:
                    System.out.println("El numero "+1+ " en romanos es: II.");
                    break;
                case 3:
                    System.out.println("El numero "+1+ " en romanos es: III.");
                    break;
                case 4:
                    System.out.println("El numero "+1+ " en romanos es: IV.");
                    break;
                case 5:
                    System.out.println("El numero "+1+ " en romanos es: V.");
                    break;
                case 6:
                    System.out.println("El numero "+1+ " en romanos es: VI.");
                    break;
                case 7:
                    System.out.println("El numero "+1+ " en romanos es: IV.");
                    break;
                case 8:
                    System.out.println("El numero "+1+ " en romanos es: V.");
                    break;
                case 9:
                    System.out.println("El numero "+1+ " en romanos es: VI.");
                    break;
                    
            }
        }else{
            System.out.println("El numero ingresado no es correcto.");
        }
        
    }
    
}
