/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

/**
 *
 * @author luisa
 */
public class Escalera {
    protected static String bajar(int n){
        if (n==0){ //Caso base
            return "¡Ya acabaste!";
        }else {
            return "Estas en el escalón " + n + "\n" + bajar(n-1); //Caso Dominio
        }
    }
}
