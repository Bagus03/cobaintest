/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */    
package Main;

import java.util.Scanner;


class Main {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in) ;
        double miles = 1.6;
        
        System. out.println ("Masukkan jumlah mil: ");
        double userInput = input.nextDouble ();
        
        double kilometer = userInput * miles;
        System.out.printf("&.1f mil setara dengan %.1f kilometer\n", userInput, kilometer) ;
    }
}




