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
public class E10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Bienvenido/a al ADIVINEITOR. Ud. debera adivinar el resultado de una multiplicacion de dos numeros enteros entre 0 y 10.");
        int num1, num2;
        num1 = (int) (Math.random()*10);
        num2 = (int) (Math.random()*10);
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int num;
        
        System.out.println("Por favor, ingrese el resultado de la multiplicacion (debe ir de 0 a 100).");
        
        do {
                        
            num = teclado.nextInt();

            if (num>=0 && num <=100) {
                
                if (num == num1*num2) {
                    System.out.println("Correcto!. El numero buscado es: "+num+ "ya que el primer numero es: "+num1+" y el segundo es: "+num2);
                    break;
                }else{
                    System.out.println("Incorrecto, vuelva a intentarlo.");
                }
                
            } else{
                System.out.println("El numero ingresado no es correcto.");
                break;
            }
        } while (num != num1*num2);
            
        
    }
    
}
