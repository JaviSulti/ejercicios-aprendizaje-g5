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
public class E15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Bienvenido. Siga las instrucciones.");
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el primer numero > ");
        double num1 = teclado.nextDouble();
        System.out.print("Ingrese el segundo numero > ");
        double num2 = teclado.nextDouble();
        
        System.out.println("Seleccione, mediante el numero de la opcion, la operatoria que desea realizar:\n1-SUMA\n2-RESTA\n3-MULTIPLICACION\n4-DIVISION");
        int opc = teclado.nextInt();
        
        switch (opc) {
            case 1:
                System.out.println("El resultado de la suma es: "+suma(num1,num2));
                break;
            case 2:
                System.out.println("El resultado de la resta es :"+resta(num1,num2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicacion es: "+multi(num1,num2));
                break;
            case 4:
                System.out.println("El resultado de la division es: "+divi(num1,num2));
                break;
            default:
                System.out.println("Ud. ingreso una opcion incorrecta.");;
        }
    }
    
    public static double suma(double num1, double num2){
    return num1+num2;
}
    
    public static double resta (double num1, double num2){
    return num1-num2;
    }
    
    public static double multi (double num1, double num2){
        return num1*num2;
    }
    
    public static double divi(double num1, double num2){
        return num1/num2;
    }
    
}


