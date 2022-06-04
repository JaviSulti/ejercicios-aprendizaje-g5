/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.de.aprendizaje.g5;

/**
 *
 * @author javie
 */
public class A23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Bienvenido/a. A continuacion se mostrara una matriz cuadrada de tamanio 16 y luego su transpuesta.");
        
        int [] [] ma23 = new int [4] [4];
        
        rellenarma23(ma23);
        System.out.println("\nMatriz:");
        escribema23(ma23);
        
        int [] [] ma23T = new int [4] [4];
        rellenarma23T(ma23,ma23T);
        System.out.println("\nMatriz Transpuesta:");
        escribema23T(ma23T);
    }
    
    public static void rellenarma23(int [] [] ma23){
        for (int j=0; j<ma23.length;j++){
            for (int i=0; i<ma23.length;i++){
                ma23[i][j]=(int) (Math.random() * 10);
            }
        }
    }
    
    public static void escribema23(int [] [] ma23){
        for (int j=0; j<ma23.length;j++){
            System.out.println("");
            for (int i=0; i<ma23.length;i++){
                System.out.print(ma23[i][j]+ " ");
            }
        }
        System.out.println("");
    }
    
    public static void rellenarma23T(int[][] ma23,int[][] ma23T){
        for (int j=0; j<ma23T.length;j++){
            for (int i=0; i<ma23T.length;i++){
                ma23T[i][j]= ma23[j][i];
            }
        }
    }
    
     public static void escribema23T(int [] [] ma23T){
        for (int j=0; j<ma23T.length;j++){
            System.out.println("");
            for (int i=0; i<ma23T.length;i++){
                System.out.print(ma23T[i][j]+ " ");
            }
        }
        System.out.println("");
    }
    
}
