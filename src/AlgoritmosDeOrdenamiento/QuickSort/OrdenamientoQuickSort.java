/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosDeOrdenamiento.QuickSort;

import java.util.Arrays;

/**
 *
 * @author luisa
 */
public class OrdenamientoQuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] arreglo = {20, -3, 1, 3, 7, -11, 43};
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        quickSortClass.quickSort(arreglo, 0, arreglo.length-1);
        //System.out.println("El arreglo es el siguiente: " + Arrays.toString(arreglo));
    }
    
}
