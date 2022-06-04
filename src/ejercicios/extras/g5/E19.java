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
public class E19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Bienvenido, a continuacion Ud. podra comparar dos vectores y saber si son iguales. Por favor indique el tamanio de los vectores > ");
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int N = teclado.nextInt();
        int [] veE181 = new int [N];
        int [] veE182 = new int [N];
        boolean flag = true;
        
        rellenarveE181 (veE181);
        mostrarveE181 (veE181);
        rellenarveE182 (veE182);
        mostrarveE182 (veE182);
        
        for (int i = 0; i < veE181.length; i++) {
            if (veE181 [i] != veE182 [i]) {
                System.out.println("El vector tiene al menos un elemento diferente. ");
                flag = false;
                break;
            }                     
        }
        if (flag == true) {
            System.out.println("El vector tiene todos sus elementos iguales.");
        }
    }
    
    public static void rellenarveE181(int [] veE181){
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        for (int i = 0; i < veE181.length; i++) {
            System.out.print("Por favor, ingrese el elemento "+(i+1)+ " del primer vector > ");
            veE181 [i] = teclado.nextInt();
        }
    }
    public static void mostrarveE181 (int [] veE181){
        System.out.print("El vector ingresado es > ");
        for (int i = 0; i < veE181.length; i++) {
            System.out.print(veE181 [i]+" ");
        }
        System.out.println("");
    }
    public static void rellenarveE182(int [] veE182){
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        for (int i = 0; i < veE182.length; i++) {
            System.out.print("Por favor, ingrese el elemento "+(i+1)+ " del segundo vector > ");
            veE182 [i] = teclado.nextInt();
        }
    }
    public static void mostrarveE182 (int [] veE182){
        System.out.print("El vector ingresado es > ");
        for (int i = 0; i < veE182.length; i++) {
            System.out.print(veE182 [i]+" ");
        }
        System.out.println("");
    }
    
}
