/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosDeBusqueda;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author luisa
 */
public class MBusqueda_Arreglos01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        int x;
        do {
            System.out.println("\nSeleccione una opción: \n1. Ingresar manualmente su arreglo \n2. Implementar arreglo de 50 números predeterminado \n3. Salir");
            x=entrada.nextInt();
            switch (x){
                case 1: ingresarManualmenteArreglos(); break;
                case 2: arregloDeCincuenta(); break;
            }
        } while(x!=3); 
    
    }
    
     public static void ingresarManualmenteArreglos(){
        Scanner entrada = new Scanner (System.in);
        System.out.print("BUSQUEDA SECUENCIAL EN ARREGLOS \nIngrese el número de datos del archivo: ");
        int array[] = new int[entrada.nextInt()];
        
        //Pedir el arreglo
        for (int i=0; i<array.length; i++){
            System.out.print("Teclee el numero de la posicon " + i + ": ");
            array[i]=entrada.nextInt();
        }
        
        mostrarArreglo(array);
        
        
        System.out.println(MetodosDeBusqueda.busquedaSecuencial(array, buscarNumero()));
        
    }
     public static int buscarNumero(){
         Scanner entrada= new Scanner (System.in);
         System.out.print("\n¿Que numero desea buscar en el arreglo? ");
         return entrada.nextInt();
     }
     public static void arregloDeCincuenta(){
         int cincuenta[]= new int[50];
         int contador=0;
         for (int i=0; i<cincuenta.length; i++){
             cincuenta[i]=contador;
             contador+=2;
         }
         mostrarArreglo(cincuenta);
         int n= buscarNumero();
         System.out.print("SECUENCIAL: " + MetodosDeBusqueda.busquedaSecuencial(cincuenta, n) + "\nBINARIO: " + MetodosDeBusqueda.busquedaBinaria(cincuenta, n));        
     }
     
     public static void mostrarArreglo(int array[]){
         //Mostrar el arreglo
        System.out.println("El arreglo es el siguiente: ");
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
     }
}
