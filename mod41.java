/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mod4;

public class mod41 {

    public static void main(String[] args) {
       Publication book1 = new Publication("Three Kingdoms", 5000, 67);
       Publication book2 = new Publication("a Pie", 8400, 82);
       
        Publication.printHeader();
        
        book1.PrintBookInfo();
        book2.PrintBookInfo();
        
        System.out.println("====================");
        int totalPrice = (book1.getPrice() * book1.getPage()) + (book2.getPrice() * book2.getPage());
        System.out.println(book1.getTitle() + " " + book1.getPage() + " Jilid " );
        System.out.println(book2.getTitle() + " " + book2.getPage() + " Jilid " );                  
        System.out.println("====================");
        System.out.println(Publication.formatCurrency(book1.getPrice() * book1.getPage()) );
        System.out.println(Publication.formatCurrency(book2.getPrice() * book2.getPage()) );
        System.out.println("====================");
        System.out.println("Jumlah Total Pembelian: " + Publication.formatCurrency(totalPrice));
        
    }
}
