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
public class linealListClass <T>{
    nodeClass first;
    nodeClass last;
    
    //Metodos
    public void insertFirst(T n){
        nodeClass node= new nodeClass(n);
        if (isEmpty()){ //Esta vacia
            first=node;
            last=node;
        } else {
            node.next=first;
            first=node;
        }
    }
    public void insertLast(T n){
        nodeClass node= new nodeClass(n);
        if (isEmpty()){ //Esta vacia
            first=node;
            last=node;
        } else {
            last.next=node;
            last=node;
        }
    }
    protected boolean isEmpty(){
        return first==null;
    }
    public void borrarInicio(){
        if (isEmpty()){ //Esta vacia
            System.out.println("☠!");
        } else {
            first=first.next;
        }
    }
    public void borrarFinal(){
        if (isEmpty()){ //Esta vacia
            System.out.println("☠!");
        } else {
            nodeClass aux;
            aux=first;
            while(aux.next.next!=null){
                aux=aux.next;
            }
            aux.next=null;
            last=aux;
        }
    }
    public boolean borrarNodo(T data){ //se borrara el data de un nodo en específico
        if (isEmpty()){ //Esta vacia
            return false;
        } else {
            nodeClass aux;
            if (first.data==data){
                borrarInicio();
                return true;
            } else {
                aux=first;
                while (aux.next.data!=data && aux.next!=null){ //Mientras que no encuentre el dato y no llegue al final de la lista. recorre la lista
                    aux=aux.next;
                }
                if (aux.next!=null && aux.next.data==data){
                    aux.next=aux.next.next;
                    return true;
                } else {
                    return false;
                }
            }
        }
    }
    public void showList(){
        if (!(isEmpty())){
            nodeClass aux;
            aux=first;
            while(aux!=null){
                System.out.print("[" + aux.data + "] " );
                aux=aux.next;
            }
            System.out.println("");
        } else {
            System.out.println("¡☠!");
        }
    }
}

/* Instertar inicio (int n)
Insertar final (int n)
BorrarInicio
BorrarFinal
BorrarNodo(int n)
MuestraLista

*/