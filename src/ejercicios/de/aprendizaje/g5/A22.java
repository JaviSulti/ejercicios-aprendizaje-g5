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
public class A22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenida/o. Por favor, indique cuantos numeros desea ingresar.");
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int N = teclado.nextInt();
        
        int[] va22;
        va22 = new int[N];
        
        rellenarvector(N, va22);
        
        int dig1, dig2, dig3, dig4, dig5;
        dig1 = dig2 = dig3 = dig4 = dig5 = 0;
        
        for (int i = 0; i < va22.length; i++){
        
            if ((va22[i]<0)||(va22[i]>99999)){
                System.out.println("Al menos uno de los numeros ingresados, es incorrecto.");
            } else if ((va22[i]>0)&&(va22[i]<9)) {
                dig1 = dig1 +1;
            } else if ((va22[i]>9)&&(va22[i]<99)) {
                dig2 =dig2 +1;           
            } else if ((va22[i]>99)&&(va22[i]<999)) {
                dig3 =dig3 +1;     
            } else if ((va22[i]>999)&&(va22[i]<9999)) {
                dig4 =dig4 +1;  
            } else if ((va22[i]>9999)&&(va22[i]<99999)) {
                dig5 =dig5 +1;  
               }
        
            }
           System.out.println("La cantidad de numeros ingresados que contienen 1 digito es: "+dig1);
           System.out.println("La cantidad de numeros ingresados que contienen 2 digitos es: "+dig2);
           System.out.println("La cantidad de numeros ingresados que contienen 3 digitos es: "+dig3);
           System.out.println("La cantidad de numeros ingresados que contienen 4 digitos es: "+dig4);
           System.out.println("La cantidad de numeros ingresados que contienen 5 digitos es: "+dig5);      
}
    
        public static void rellenarvector(int N, int [] va22){
            Scanner teclado = new Scanner(System.in).useDelimiter("\n");
            System.out.println("A continuacion, debera colocar los "+N+" numeros. Recuerde que los mismos solo pueden tener entre 1 y 5 digitos.");
            for (int i = 0; i < va22.length;i++){
                System.out.print("Ingrese el numero "+(i+1)+": ");
                va22[i] = teclado.nextInt();
            }
        }
}
