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
public class E20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Bienvenido, a continuacion indique la cantidad de elementos que desea tenga el vector > ");
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int N = teclado.nextInt();
        int [] veE20 = new int [N];
        
        rellenarveE20 (veE20);
        mostrarveE20 (veE20);
    }
    
    public static void rellenarveE20(int [] veE20){
        for (int i = 0; i < veE20.length; i++) {
           veE20 [i] = (int) (Math.random()*100);
        }
    }
    public static void mostrarveE20 (int [] veE20){
        System.out.print("El vector generado aleatoriamente es > ");
        for (int i = 0; i < veE20.length; i++) {
            System.out.print(veE20 [i]+" ");
        }
        System.out.println("");
    }
    
}
