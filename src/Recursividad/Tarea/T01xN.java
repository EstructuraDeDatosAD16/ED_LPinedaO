/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad.Tarea;

/**
 *
 * @author luisa
 */
public class T01xN {
    
    protected static int calcular(int x, int n){
        if (n==0){
            return 1;
        } else {
            return x*calcular(x, n-1);
        }
    }
}
