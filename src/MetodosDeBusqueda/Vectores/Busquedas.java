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
public abstract class Busquedas {
    //Atributos
    protected int vector[];
    
    public Busquedas(){
        setVector();
    }
    //Metodos
    public void setVector(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int n=entrada.nextInt();
        this.vector = new int[n];
        for (int i=0; i<n; i++){
            System.out.print("Ingrese valor de la posicion " + i + ": \n");
            this.vector[i]=entrada.nextInt();
        }
    }
    public int[] getVector(){
        return this.vector;
    }
    public void solicitarBusqueda(){
        Scanner entrada = new Scanner(System.in);       
        System.out.print("Ingresa elemento a buscar: ");
        mostrarResultado(entrada.nextInt());
    }
    public void mostrarVector(){
        for (int i=0; i<this.vector.length; i++){
            System.out.print("[" + this.vector[i] + "], ");
        }
    }
    public void mostrarResultado(int x){
        System.out.println(buscar(x));
    }
    
    abstract protected String buscar(int x);
    
}
