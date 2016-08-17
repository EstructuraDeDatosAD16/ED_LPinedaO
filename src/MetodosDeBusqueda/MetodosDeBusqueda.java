/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosDeBusqueda;

/**
 *
 * @author luisa
 */
public class MetodosDeBusqueda {
    
    public static String busquedaSecuencial(int array[], int n){
        boolean flag=true;
        for (int i=0; i<array.length; i++){
            if (array[i]==n){
                flag=false;
                return ("El número " + n + " se encuentra en la posicion " + i + " en el ciclo numero " + (i+1));
            }
        }
        if (flag){ return "No se encontro el numero";}
        return "";
    }
    
    public static String busquedaBinaria(int array[], int n){
        int start=0;
        int end=array.length-1;
        int center, contador=0;
        boolean flag=true;
        while (start<=end){ //ES IMPORTANTE EL IGUAL PARA EVALUAR LA ULTIMA OPCION
            ++contador;
            center=(start+end)/2;
            if (array[center]==n){
                flag=false;
                return ("El numero " + n + " se encuentra en la posicion " + center + "en el ciclo numero " + contador);
            } else if (n>array[center]){
                start=center+1;
            } else {
                end=center-1;
            }
        }
        if (flag){ return "No se encontro el numero, numero total de ciclos " + contador;}        
        return "";
    }
}
