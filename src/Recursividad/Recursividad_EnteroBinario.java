/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

import java.util.Scanner;

/**
 *
 * @author luisa
 */
public class Recursividad_EnteroBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese un numero positivo");
        System.out.println(EnteroBinario.conversionenbi(entrada.nextInt()));
    }
    
}
