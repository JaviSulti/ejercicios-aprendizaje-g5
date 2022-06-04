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
public class A26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Bienvenida/o. A continuacion, se mostrara la matriz de 100 elementos geenrada por el sistema.\n");
        int [] [] ma26 = new int [10][10];
        genero(ma26);
        imprimo (ma26);
        
        System.out.println("\nPor favor, ingrese los 9 valores de la nueva matriz que desea buscar en la anterior.\n");
        Scanner teclado = new Scanner (System.in);
        int [] [] maP = new int [3] [3];
        genero2 (maP);
        
        System.out.println("La matriz P generada es: \n");
        imprimo2 (maP);
        
        for (int j = 0; j < ma26.length; j++){
            for (int i = 0; j < ma26.length; i++){
                while (j < 8 && i <8){
                    if (ma26[i][j]==maP[0][0]){
                        } else if ((ma26[i+1][j]==maP[1][0]) && (ma26[i+2][j]==maP[2][0])){
                        } else if ((ma26[i][j+1]==maP[0][1]) && (ma26[i+1][j+1]==maP[1][1]) && (ma26[i+2][j+1]==maP[2][1])) {
                        }else if ((ma26[i][j+2]==maP[0][2]) && (ma26[i+1][j+2]==maP[1][2]) && (ma26[i+2][j+2]==maP[2][2])){
                    
                        System.out.println("Te encontre wuachi.");
                            
                        } else {
                            System.out.println("No te encontre.");
                        }
                }
            }
        }
        
    }
    
    public static void genero (int [] [] ma26){
        for (int j=0; j<ma26.length;j++){
            for (int i=0; i<ma26.length;i++){
                ma26[i][j]=(int) (Math.random() * 10);
            }
        }
    }
    
    public static void imprimo (int [] [] ma26){
          for (int j=0; j<ma26.length;j++){
            System.out.println("");
            for (int i=0; i<ma26.length;i++){
                System.out.print(ma26[i][j]+ " ");
            }
        }
        System.out.println("");
    }
    
    public static void genero2 (int [] [] maP){
         for (int n=0; n<maP.length; n++){
            for (int m = 0; m < maP.length; m++){
                System.out.print("Fila "+(n+1)+", Columna "+(m+1)+" > ");
                Scanner teclado = new Scanner(System.in).useDelimiter("\n");
                maP [m] [n] = teclado.nextInt();
            }
        }
    }
    
        public static void imprimo2 (int [] [] maP){
          for (int j=0; j<maP.length;j++){
            System.out.println("");
            for (int i=0; i<maP.length;i++){
                System.out.print(maP[i][j]+ " ");
            }
        }
        System.out.println("");
    }
    
}
