/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl2;

import java.util.Scanner;

/**
 *
 * @author mchyl
 */
public class Main {
 
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        double a;
        System.out.println("Wprowadź liczby wieksze od zera:\n");
while(true){
    a = scan.nextDouble();
    if(a<0){
        break;
    }
}
    }
}
