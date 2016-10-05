/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas.ListasCirculares;

/**
 *
 * @author luisa
 */
public class nodeClass <T>{
    //Atributos
    nodeClass next;
    private T data;
    
    //Metodos
    //Constructor
    public nodeClass(T data){
        this.data=data;
        this.next=null;
    }
    public nodeClass(){
        this.data=null;
        this.next=null;
    }
    public void setData(T data){
        this.data=data;
    }
    public T getData(){
        return this.data;
    }
}
