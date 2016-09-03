/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosDeOrdenamiento.MergeSort;

import java.util.Arrays;

/**
 *
 * @author luisa
 */
public class OrdenamientoMergeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] arreglo = {45, 2300, 11, 9, -10, 403, -8272, 91, 1, 871};
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        arreglo = mergeSortClass.mergeSort(arreglo);
        System.out.println(Arrays.toString(arreglo));
                
    }
    
}
