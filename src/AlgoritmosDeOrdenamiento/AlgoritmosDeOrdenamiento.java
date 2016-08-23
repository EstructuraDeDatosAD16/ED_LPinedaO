/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosDeOrdenamiento;

import java.util.Scanner;

/**
 *
 * @author luisa
 */
public class AlgoritmosDeOrdenamiento {
    //atributos
    int[] vector;
    
    public AlgoritmosDeOrdenamiento(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int n=entrada.nextInt();
        this.vector = new int[n];
        for (int i=0; i<n; i++){
            System.out.print("Ingrese valor de la posicion " + i + ": \n");
            this.vector[i]=entrada.nextInt();
        }
        
    }
    public void mostrarVector(){
        for (int i=0; i<this.vector.length; i++){
            System.out.print("[" + this.vector[i] + "], ");
        }
        System.out.println("");
    }
    
    public void seleccion(){
        for (int i=0; i<this.vector.length; i++){
            int m=i;
            for (int j=i+1; j<this.vector.length; j++){
                if (this.vector[j]<this.vector[m]){
                    m=j;                    
                }
            }
            int aux=this.vector[i];
            this.vector[i]=this.vector[m];
            this.vector[m]=aux;
        }
    }
    
}
