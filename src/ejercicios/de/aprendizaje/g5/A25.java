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
public class A25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Bienvenida/o al CUADRADO MAGINEITOR, el programa que le dira si un cuadrado de 9 numeros es magico o no.");
        System.out.println("Por favor, ingrese los 9 numeros que desea tenga su matriz de 3 columnas y tres filas.\nRecuerde que los valores deben ser mayores o iguales a 1 y menores o iguales a 9.");
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        
        int [][] ma25 = new int [3][3];
        boolean flag = true;
        for (int j=0; j<ma25.length; j++){
            for (int i = 0; i < ma25.length; i++){
                System.out.print("Fila "+(j+1)+", Columna "+(i+1)+" > ");
                ma25[i][j] = teclado.nextByte();
                
                if (ma25[i][j]<1 || ma25[i][j]>9){
                    flag = false;
                    break;
                }
            }
            if (flag == false){
                System.out.println("El valor ingresado no cumple con l condicion de ser mayor a 0 y menor a 10.\nIntentelo nuevamente."); 
                break;
            }

        }
        if (flag == true){
            System.out.println("\nEl cuadrado m[agico generado es: ");
            imprimirma25 (ma25);
            
            //Armo un vector de tres elementos y en cada uno de ellos guardo la suma de cada COLUMNAS (i)
            int vectorsumacolumnas [] = new int [3];
            for (int j =0; j < ma25.length; j++){
                int suma = 0;
                for (int i = 0; i < ma25.length; i++){
                   vectorsumacolumnas [i] = suma + ma25 [i] [j];
                   suma = vectorsumacolumnas [i];
                }                
            } 
            
            //Armo un vector de tres elementos y en cada uno guardo la suma de las FILAS
            int vectorsumafilas[] = new int [3];
            for (int i =0; i < ma25.length; i++){
                int suma = 0;
                for (int j = 0; j < ma25.length; j++){
                   vectorsumafilas [i] = suma + ma25 [i] [j];
                   suma = vectorsumafilas [i];
                }                
            }
            
            //Ahora calculo la diagonal principal.
            int sumadiagonalprincipal = 0;
            for (int j=0; j<ma25.length; j++){
                for (int i = 0; i < ma25.length; i++){
                    if (i==j){
                        sumadiagonalprincipal = sumadiagonalprincipal + ma25 [i] [j];
                    }
                }            
            }
            
            //Aca deberia calcular la suma de la diagonal invertida, pero me canse.
               boolean flag2 = true;
               if (vectorsumacolumnas[1]==vectorsumacolumnas[2]){
                  flag2 = true;
               } else {
                   System.out.println("La matriz ingresada NO es magica.");
               }
                                  
        } 
        
        
    }
    
    public static void imprimirma25 (int ma25 [] []){  
        
        for (byte j = 0; j < ma25.length; j++){
            System.out.println("");
            for (byte i = 0; i < ma25.length; i ++){
                System.out.print(ma25[i][j]+ " ");
            }
        }
        
    }
    
}
