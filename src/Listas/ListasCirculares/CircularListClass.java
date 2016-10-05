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
public class CircularListClass <T>{
    //Atributos
    nodeClass pivot;
    
   
    //Constructor nulo
    public CircularListClass(){
        this.pivot=null;
    }
    //Metodos
    public void insert(T d){
        nodeClass node= new nodeClass(d);
        if (!(isEmpty())){ //Si no esta vacia
                            //Insertamos el nodo al inicio y recorremos los nodos
            node.next=pivot;
            findLast().next=node;
            pivot=node;
        } else {
            pivot=node;
            node.next=pivot;
            
        }
    }
    private nodeClass findLast(){
        nodeClass aux=pivot;
        do{
            aux=aux.next;
        } while (aux.next!=pivot);
        return aux;
    }
    public void delete(T data){
        nodeClass aux=pivot;
        if (!(isEmpty())){
            do{
                aux=aux.next;
            } while (aux.next!=pivot && aux.getData()!=data);
        } else { 
            System.out.println("¡☠☠☠!");
        }        
    }
    public void showList(){
        nodeClass aux=pivot;
        if (!(isEmpty())){
            do{
                System.out.println("["+aux.getData()+"]->");
                aux=aux.next;
            } while (aux.next!=pivot);
        } else { 
            System.out.println("¡☠!");
        }
    }
    public boolean isEmpty(){
        return this.pivot==null;
    }
}

