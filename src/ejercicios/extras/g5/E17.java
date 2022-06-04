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
public class E17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Bienvenido/a al identificador de numeros primos. Para ello, por favor, ingrese el numero deseado > ");
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int num = teclado.nextInt();
        
        if (primo (num) == true) {
            System.out.println("El numero "+num+ " es PRIMO.");
        } else {
            System.out.println("El numero "+num+ " es NO es primo.");
        }
        
    }
    
    public static boolean primo (int num){
        int cdadrestos = 0;
        for (int i = 1; i <= num; i++) { //Aca evaludo de uno en uno si el resto da cero desde 1 hasta n.
            int resto = num % i;
            if (resto == 0) { 
                cdadrestos = cdadrestos + 1; //Si da cero, entonces tiene que sumar uno al contador.
            }
        }
        
        if (cdadrestos > 2) {
            return false; //Si tiene mas de dos divisiones con resto cero, quiere decir que ademas de ser divisible por 1 y si mismo, hay otro divisor mas.
        } else {
            return true;
        }
    
    }
}
