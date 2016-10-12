/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacks;

/**
 *
 * @author luisa
 */
public class nodeClass <T>{
    //Atributes
    private T data;
    private nodeClass next;
    
    //Constructor
    public nodeClass (T data){
        this.data=data;
        this.next=null;
    }
    //Get and Set methods
    public void setData(T data){
        this.data= data;
    }
    public T getData(){
        return this.data;
    }

    public void setNext(nodeClass next) {
        this.next = next;
    }

    public nodeClass getNext() {
        return next;
    }
    
}
