/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad.Tarea;

import java.util.Scanner;

/**
 *
 * @author luisa
 *///Elabora un método recursivo en Java para calcular x^n siendo n >=0

public class RecursividadT01_xN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Bienvenido a la Calculadora de Exponentes (x^n)");
        System.out.print("Ingrese X: ");
        int x= entrada.nextInt();
        
        System.out.print("Ingrese n: ");
        int n= entrada.nextInt();
        
        System.out.println("El resultado de elevar " + x + " a la potencia numero " + n + ", es de " + T01xN.calcular(x,n));
    }
    
}
