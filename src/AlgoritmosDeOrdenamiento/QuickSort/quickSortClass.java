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
public class quickSortClass {
    public static int[] quickSort(int[] array, int start, int end){
        int i, j, p, temp;
        if (array.length==0 || start>end){
            return null;
        }
        p= array[(start + end)/2];
        //int p = start + (end-start)/2 + 1;
        i=start;
        j=end;
        do {
            while (array[i]<p){
                i++;
            }
            while (array[j]>p){
                j--;
            }
            if (i<=j){
                temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		i++;
		j--;                
            }
            System.out.println(Arrays.toString(array));
        } while (i<=j); 
        
        if (start < j){
            quickSort(array, start, j);
        }
        if (end > i){
            quickSort(array, i, end);
        }
			
        return array;
    }
}

