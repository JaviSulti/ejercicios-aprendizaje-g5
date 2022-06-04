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
public class E16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Bienvenido al Identificador de personas mayores de edad.");
        
        do {
            mayoriaedad ();
        } while (mayoriaedad () == true);
                       
    }
    
    public static boolean mayoriaedad (){
        
        System.out.print("Por favor, ingrese el nombre de la persona > ");
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        String nombre = teclado.next();
        System.out.print("Por favor, ingrese la edad de "+ nombre+" > ");
        int edad = teclado.nextInt();
        
        if (edad >= 18) {
            System.out.println(nombre+" tiene "+edad+" anios y es MAYOR de edad.");
        }else{
            System.out.println(nombre+" tiene "+edad+" anios y es MENOR de edad.");
        }
        
        System.out.println("Si desea realizar otra consulta, coleque el numero 1. De lo contrario coloque otro numero.");
        int opc = teclado.nextInt();
        if (opc == 1) {
            return true;
        } else {
            System.out.println("Ud. ha decidido salir del programa.");
            return false;
        }
        
    }
    
}
