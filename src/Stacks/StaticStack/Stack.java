/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacks.StaticStack;

import Stacks.*;

/**
 *
 * @author luisa
 */
public class Stack <T> {
    //Atributes
    private nodeClass top;
    private int size;
    
    //Constructor
    public Stack(){
        this.top=null;
        this.size=0;
    }
    /**
     * Getter
     * @return stack's top 
     */
    public nodeClass getTop(){
        return top;
    }
    /**
     * Getter
     * @return stack's size 
     */
    public int getSize() {
        return size;
    }
    
    /**
     * isEmpty method
     * @return if the stack is empty
     */
    public boolean isEmpty(){
        return top==null;
    }
    /**
     * Inserta un elemento en el top de la stack
     * @param data 
     */
    public void push(T data){
        nodeClass node=new nodeClass(data);
        if (isEmpty()){ //Si la pila esta vacia
            top=node;
        } else {
            node.setNext(top);
            top=node;
        }
        ++size;
    }
    /**
     * Elimina un elemento de la pila
     */
    public void pop(){
        if (!isEmpty()){
            top=top.getNext();
        } else {
            System.out.println("La pila esta vacía");
        }
        --size;
    }
    /**
     * Delete every node of the stack
     */
    public void emptyStack(){
        top=null;
    }
    public void showStack(){
       if (!isEmpty()){
            nodeClass aux=top;
            do {
                System.out.print(aux.getData() + " - ");
                aux=aux.getNext();
            } while(aux!=null);
        }
        System.out.println("null");
       }
    }


//A traves de la pila, detectar si una frase es palindromo o no 