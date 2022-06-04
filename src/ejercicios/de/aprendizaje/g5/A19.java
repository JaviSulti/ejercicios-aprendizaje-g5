/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.de.aprendizaje.g5;

import static java.lang.Character.toLowerCase;
import java.util.Scanner;

/**
 *
 * @author javie
 */
public class A19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    ///Crear una funcion que convierta euros a dolares, yenes o libras.
    // La funcion tiene como parametros: cantidad de euros y moneda a convertir en tipo cadena.
    //La funcion no va a devolver ningun valor y mostrara el cambio indicado, nada mas.
    
        System.out.println("Bienvenido al CAMBIAEITOR: la aplicacion que le realizara el cambio de euros a otras monedas.");
        System.out.print("Por favor, ingrese en numeros la cantidad de euros a convertir: ");
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        double euros = teclado.nextDouble();

        if (euros>0) {
            System.out.println("Por favor, escriba el nombre de la moneda a la que quiera convertir los "+euros+" euros: dolares, yenes o libras.");
            String convertir = teclado.next();
            
            if (convertir.toLowerCase().equals("dolares") || convertir.toLowerCase().equals("yenes") || convertir.toLowerCase().equals("libras")){
                
                conversion (euros,convertir);
                
           
            } else {
                System.out.println("La moneda ingresada no es correcta. Por favor, intentelo mas tarde.");
            }
            
        } else {
            System.out.println("Ud. ha ingresado un valor de moneda incorrecto. Intentelo mas tarde.");
        }
        
    }
    
    public static void conversion (double euros, String convertir){
        
        switch (convertir){
            case "libras":
                System.out.println("Los "+euros+" equivalen a "+euros*0.86+ "libras.");
                break;
            case "dolares":
                System.out.println("Los "+euros+" equivalen a "+euros*1.28611+ "dolares.");
                break; 
            case "yenes":
                System.out.println("Los "+euros+" equivalen a "+euros*129.852+ "yenes.");
                break; 
                
        }
    System.out.println("Gracias por haber confiado en el CAMBIAETOR.");
    }
    
}
