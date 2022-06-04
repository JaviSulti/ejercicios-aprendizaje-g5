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
public class E6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Bienvenida/o. Por favor, indique la cantidad de personas cuyas estaturas desea ingresar.");
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int N = teclado.nextInt();
        int cont = 0;
        double prom = 0;
        
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese la estatura de la persona numero: "+(+i+1));
            double high = teclado.nextDouble();
            
            prom = high + prom;
            
            if (high <= 1.60) {
                cont = cont + 1;
            }
            
        }
        
        System.out.println("El promedio de las estaturas de las "+N+"personas es: "+prom/N+" metros.");
        System.out.println("La cantidad de personas que miden 1.60 metros es: "+cont);
        
    }
    
}
