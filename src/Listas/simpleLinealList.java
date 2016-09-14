/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author luisa
 */
public class simpleLinealList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        linealListClass lista= new linealListClass();
        lista.showList();
        lista.insertLast(100);
        lista.insertFirst(2);
        lista.insertLast(500);
        lista.insertLast(650);
        lista.insertFirst(1);
        lista.showList();
        
        System.out.println("Se borra el inicio");
        lista.borrarInicio();
        lista.showList();
        
        System.out.println("Se borra el final");
        lista.borrarFinal();
        lista.showList();
        
        System.out.println("Se borra el nodo con el valor de 100");
        lista.borrarNodo(100);
        lista.showList();
    }
    
}
