/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosDeBusqueda.Vectores;

import java.util.Scanner;

/**
 *
 * @author luisa
 */
public class MBusqueda_Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("BIENVENIDO A CREA TU VECTOR");
        Scanner entrada= new Scanner (System.in);
        int x, y;
        do {
            System.out.println("\nSeleccione una opción: \n1. Dar de alta un vector con busqueda binaria \n2. Dar de alta un vector con busqueda secuencial \n3. Salir");
            x=entrada.nextInt();
            switch (x){
                case 1: BusquedasBinarias vectorb= new BusquedasBinarias(); 
                    do {
                        System.out.println("\nSeleccione una opcion: \n1. Mostrar Vector \n2. Buscar un valor de manera binaria \n3. Regresar al menu original");
                        y=entrada.nextInt();
                        switch (y){
                        case 1: vectorb.mostrarVector();break;
                        case 2: vectorb.solicitarBusqueda();break;
                        }
                    } while(y!=3);break;
                case 2: BusquedasSecuenciales vectors= new BusquedasSecuenciales();
                do {
                        System.out.println("\nSeleccione una opcion: \n1. Mostrar Vector \n2. Buscar un valor de manera binaria \n3. Regresar al menu original");
                        y=entrada.nextInt();
                        switch (y){
                        case 1: vectors.mostrarVector();break;
                        case 2: vectors.solicitarBusqueda();break;
                        }
                    } while(y!=3); break;
            }
        } while(x!=3);
        
    }
    
    public  void menuBinario(){
        Scanner entrada= new Scanner(System.in);
        int x;
        do {
            System.out.println("\nSeleccione una opcion: \n1. Mostrar Vector \n2. Buscar un valor \n3. Regresar al menu original");
            x=entrada.nextInt();
            switch (x){
                case 1:  ;break;
                case 2: BusquedasSecuenciales vectors= new BusquedasSecuenciales(); menuSecuencial();break;
            }
        } while(x!=3);
    }
        
        public static void menuSecuencial(){
            
        }
}
