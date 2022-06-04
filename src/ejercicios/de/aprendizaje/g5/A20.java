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
public class A20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    int va20[];
    va20 = new int [100];
    va20 = rellenar();
    
     
    //for (int elemento:va20){        Esto es si quisiera imprimir todos sus elementos.
       // System.out.print(elemento + " ");
        //
       //}
    
    imprimirvector (va20);
       
    }
        
    public static int[] rellenar(){
        int va20[];
        va20 = new int [100];
        for (int i = 0; i <va20.length;i++)
            va20[i] = 100 - i;
    return va20;
    }
     
    public static void imprimirvector (int [] va20){
        for (int i = 0; i < va20.length; i++){
            System.out.print(va20[i]+" ");
        }
    }
    
}
