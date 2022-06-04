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
public class E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Bienvenida/o. Por favor, ingrese la cantidad de minutos que desea convertir;");
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int minutos = teclado.nextInt();
        
        if (minutos > 0) {
            System.out.println("Los "+minutos+" declarados equivalen a "+minutos/60+" horas y "+minutos/(60*24)+" dias.");
        }else{
            System.out.println("Ud. ha ingresado un valor incorrecto.");
        }
        
        
    }
    
}
