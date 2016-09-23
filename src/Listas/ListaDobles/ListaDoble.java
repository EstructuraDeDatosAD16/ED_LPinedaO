/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas.ListaDobles;

/**
 *
 * @author luisa
 */
public class ListaDoble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoubleList lista= new DoubleList();
        lista.insertFirst("55");
        lista.insertFirst("33");
        lista.insertFirst("1");
        lista.delNode("hh");
        lista.showList();
        lista.showListAtras();
        
    }
    
}
