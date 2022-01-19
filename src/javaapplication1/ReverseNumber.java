/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author kbgon
 */

public class ReverseNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any word");
        String x = input.next();
        
        char[] c = new char[x.length()];
        
        for(int i=c.length-1;i>=0;i--){
            c[i]=x.charAt(i);
            System.out.print(c[i]);
        }
    }
            
}
