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
public class E21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Bienvenido al APROBEITOR: el programa que le dira la cantidad de estudiantes que aprobaron el curso.");
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        double veE20[] = new double [4];
        double nota;
        int aprobados = 0;
        
        for (int j = 0; j < 10; j++) {
            System.out.println("Para el estudiante "+ (j+1)+ " ingrese: ");
            System.out.print("La nota del primer trabajo practico evaluativo > ");
            veE20[0] = teclado.nextInt();
            System.out.print("La nota del segundo trabajo practico evaluativo > ");
            veE20[1] = teclado.nextInt();
            System.out.print("La nota del primer integrador > ");
            veE20[2] = teclado.nextInt();
            System.out.print("La nota del segundo integrador > ");
            veE20[3] = teclado.nextInt();
            
            nota = veE20[0]*0.1+veE20[1]*0.15+veE20[2]*0.25+veE20[3]*0.50;
            
            if (nota >=7) {
                aprobados = aprobados + 1;
            }
        }
        System.out.println("La cantidad de estudiantes aprobados es "+aprobados);
        System.out.println("La cantidad de estudiantes desaprobados es "+(10 - aprobados));
    }
}
