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
public class A24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("Bienvenido/a al ANTISIMETRITOR: el programa que le dira su una matriz es antisimetrica.\nPara ello, primer ingrese la dimension de la matriz que desea generar.");
    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    int N = teclado.nextInt();
               
    int [] [] ma24 = new int [N] [N];
    rellenarma24(ma24);
        
    System.out.println("\n La matriz generada es:");
    escribema24(ma24);
        
    int [] [] ma24T = new int [N] [N];
    rellenarma24T(ma24,ma24T);
    System.out.println("\nLa matriz transpuesta es:");
    escribema24T(ma24T);
    
    boolean flag = true;
    

        for (int j = 0; j<ma24.length;j++){
        
        for (int i = 0; i<ma24.length;i++){
            if (ma24[i][j] != (- ma24T[i][j])){
                flag = false;
                break;
            }
        }
        if (flag == false){
            System.out.println("\nLa matriz NO es Asimetrica.");
            break;
        }
    }
    if (flag == true){
        System.out.println("\nLa matriz es Asimetrica.");
    }
    }
    
    public static void rellenarma24(int [] [] ma24){
    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        for (int j=0; j<ma24.length;j++){
            for (int i=0; i<ma24.length;i++){
                System.out.print("Fila "+j+". Columna "+i+":");
                ma24[i][j]=teclado.nextInt();
            }
        }
    }
    
    public static void escribema24(int [] [] ma24){
        for (int j=0; j<ma24.length;j++){
            System.out.println("");
            for (int i=0; i<ma24.length;i++){
                System.out.print(ma24[i][j]+ " ");
            }
        }
        System.out.println("");
    }
    
    public static void rellenarma24T(int[][] ma24,int[][] ma24T){
        for (int j=0; j<ma24T.length;j++){
            for (int i=0; i<ma24T.length;i++){
                ma24T[i][j]= ma24[j][i];
            }
        }
    }
    
     public static void escribema24T(int [] [] ma24T){
        for (int j=0; j<ma24T.length;j++){
            System.out.println("");
            for (int i=0; i<ma24T.length;i++){
                System.out.print(ma24T[i][j]+ " ");
            }
        }
        System.out.println("");
    }
    
}
