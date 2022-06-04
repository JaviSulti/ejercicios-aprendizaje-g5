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
public class A11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Bienvenida/o al TIPOMOTORATOR: el utilisimo programa que le dira que tipo de motor vende su empresa con solo colocar un numero.");
        System.out.println("Por favor, ingrese el numero cuyo tipo de bomba desee conocer.");
        Byte tipoMotor;
        Scanner teclado = new Scanner (System.in);
        tipoMotor = teclado.nextByte();
        
        switch (tipoMotor){
            case 1:
                System.out.println("La bomba es una bomba de agua.");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina.");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigon.");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia.");
                break;
            default:
                System.out.println("No existe un valor valido para el tipo de bomba.");
                System.out.println("Sera la bomba tucumana?");
               
        }
        
    }
    
}
