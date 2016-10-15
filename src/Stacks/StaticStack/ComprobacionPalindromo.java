/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacks.StaticStack;

import java.util.Scanner;

/**
 *
 * @author luisa
 */
public class ComprobacionPalindromo {
        //static Scanner entrada= new Scanner(System.in);
        //static StaticStack sstack= new StaticStack();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        StaticStack sstack= new StaticStack();
        boolean flag=true;
        
        System.out.print("Write your phrase (Max 20 chars): ");
        String y=entrada.nextLine();
        System.out.println("STATIC: ");
        for (int i=0; i<y.length(); i++){
            if (y.charAt(i)!=' '){
                sstack.push(y.charAt(i));
            } 
        }
        sstack.showStack();
        System.out.println("");
        
        for (int i=0; i<y.length(); i++){
            if (y.charAt(i)!=' '){
                System.out.println(sstack.getTop());
                if (y.charAt(i)==sstack.getTop()){
                    sstack.pop();
                } else {
                    flag=false;
                    i=y.length();
                }
            } 
        }
        
        sstack.showStack();
        System.out.println("Palindromo? ....."+flag);
        
        System.out.println("DYNAMIC: ");
        flag=true;
        Stack dstack= new Stack();
        for (int i=0; i<y.length(); i++){
            if (y.charAt(i)!=' '){
                dstack.push(y.charAt(i));
            } 
        }
        dstack.showStack();
        System.out.println("");
        
        for (int i=0; i<y.length(); i++){
            if (y.charAt(i)!=' '){
                System.out.println(dstack.getTop().getData());
                if (y.charAt(i)==dstack.getTop().getData().toString().charAt(0)){
                    dstack.pop();
                } else {
                    flag=false;
                    i=y.length();
                }
            } 
        }
        
        dstack.showStack();
        System.out.println("Palindromo? ....."+flag);
        
    }
    
}
