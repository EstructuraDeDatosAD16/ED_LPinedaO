/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacks;

import java.util.Scanner;
import EstructurasDeDatos.Stacks.DynamicStack;
/**
 *
 * @author luisa
 */
public class ComprobacionParentesis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DynamicStack stack=new DynamicStack();
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese su operación matemática");
        String y=entrada.next();
        
        boolean flag=true;
        for (int i=0; i<y.length(); i++){
            if (y.charAt(i)=='(' ||y.charAt(i)=='{' ||y.charAt(i)=='['  ){
                stack.push(y.charAt(i));
            }
            if (y.charAt(i)==')' ||y.charAt(i)=='}' ||y.charAt(i)==']'){
                if (stack.getSize()<=0){
                    flag=false;
                } else {
                stack.showStack();
                switch (y.charAt(i)){
                    case ')': 
                        if (stack.getTop().getData().equals('(')){ stack.pop(); } else { flag=false; }break;
                    case ']':
                        if (stack.getTop().getData().equals('[')){ stack.pop(); } else { flag=false; }break;
                    case '}':
                        if (stack.getTop().getData().equals('{')){ stack.pop(); } else { flag=false; }break;
                }
                }
            }
        }
        
        stack.showStack();
        System.out.println(stack.getSize());
        if(stack.getSize()>0 || stack.getSize()<0 || flag==false){
            System.out.println("INVALIDO");
        } else {
            System.out.println("VALIDO");
        }
    }
    
    
}
