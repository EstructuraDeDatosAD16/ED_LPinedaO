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
public class DoubleList <T>{
    //Atributos
    nodeDL first, last;
    
    //Metodos
    /**
     * Este método inserta un nodo al inicio de la lista
     * @param data es de tipo generico y contiene la informacion importante
     */
    public void insertFirst(T data){
        //Creamos nuestro nodo
        nodeDL node= new nodeDL(data);
        if(isEmpty()){
            this.first=node;
            this.last=node;
        } else{
            node.next=first; //El apuntador siguiente del nuevo nodo, apunta al 
            first.prev=node;
            first=node;
        }
    }
    public void insertLast(T data){
        //Creamos nuestro nodo
        nodeDL node= new nodeDL(data);
        if(isEmpty()){
            this.first=node;
            this.last=node;
        } else{
            node.prev=last; //El apuntador siguiente del nuevo nodo, apunta al 
            last.next=node;
            last=node;
        }
    }
    
    public void eNodeFirst(){
        if (isEmpty()){
            System.out.println("¡☠!");
        } else {
        first=first.next;
        first.prev=null;
        System.out.println("Se borro el primer elemento");
        }
    }
    
    public void eNodeLast(){
        if (isEmpty()){
            System.out.println("¡☠!");
        } else {
            last=last.prev;
            last.next=null;
            System.out.println("Se borro el ultimo elemento");
        }
    }
    
    public boolean isEmpty(){
        return (first==null && last==null);
    }
    
    public boolean delNode(T data){
        nodeDL aux=searchNode(data);
        if(aux==null){
            System.out.println("¡☠☠☠☠☠!");
            return false;
        }else {
            if (aux==first){
                eNodeFirst();
            } else if (aux == last){
                eNodeLast();
            } else {
                aux.next.prev=aux.prev;
                aux.prev.next=aux.next;
                System.out.println("Se borro");               
            }
            return true; 
        }
    }
    
    public nodeDL searchNode(T data){
        nodeDL aux;
        if (isEmpty()){
            return null;
        }  else {  //Si contiene elementos
            aux=first; 
            while (aux.data!=data && aux!=last){
                try {
                aux=aux.next;
                }
                catch (NullPointerException e){
                    return null;
                }
            }
            if (aux.data==data){ return aux; } else { return null;}           
        }
    }
    
    public void showList(){
        if (!(isEmpty())){
            nodeDL aux;
            aux=first;
            do{
                System.out.print("[" + aux.data + "] " );
                aux=aux.next;
            } while(aux!=null);
            System.out.println("");
        } else {
            System.out.println("¡☠!");
        }
        
    }
    
    public void showListAtras(){
        if (!(isEmpty())){
            nodeDL aux;
            aux=last;
            do{
                System.out.print("[" + aux.data + "] " );
                aux=aux.prev;
            } while(aux!=null);
            System.out.println("");
        } else {
            System.out.println("¡☠!");
        }
    }
}
