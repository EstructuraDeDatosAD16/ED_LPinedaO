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
public class nodeClass <T>{
    T data;
    nodeClass next;
    
    public nodeClass(T data){
        this.data=data;
        this.next=null;
    }
}
