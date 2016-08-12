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
public class EnteroBinario {
    protected static String conversionenbi(int n){
            if (n/2==0){
                return "1";
            } else {
                return conversionenbi(n/2) + n%2;
        }
    }
}
