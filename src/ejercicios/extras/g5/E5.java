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
public class E5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Bienvenido/a. Por favor, indique la clase del socio. Recuerde que la misma puede ser A, B o C.");
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        String clase = teclado.nextLine();
        int costo = 0;

        
        if (clase.length() == 1) {
            
            switch (clase){
                case "A":
                    System.out.println("La clase del socio ingresado es A.\nPor favor, ingrese el costo del tratamiento.");
                    costo = teclado.nextInt();
                    System.out.println("Con el descuento aplicado, el afiliado debe abonar: "+costo*0.5+" pesos.");
                    break;
                 case "B":
                    System.out.println("La clase del socio ingresado es B.\nPor favor, ingrese el costo del tratamiento.");
                    costo = teclado.nextInt();
                    System.out.println("Con el descuento aplicado, el afiliado debe abonar: "+costo*0.65+" pesos.");
                    break;
                 case "C":
                    System.out.println("La clase del socio ingresado es C.\nPor favor, ingrese el costo del tratamiento.");
                    costo = teclado.nextInt();
                    System.out.println("Como esta clase no presenta descuento, el afiliado debe abonar: "+costo*0.65+" pesos.");
                    break;
                 default:
                     System.out.println("Ud. ha ingresado una opcion incorrecta.");
            }
            
        } else {
            System.out.println("Ud. ha ingresado mas de una letra.");
        }
        
    }
    
}
