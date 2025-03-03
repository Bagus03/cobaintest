/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mod4;
import java.text.NumberFormat;
import java.util.Locale;

public class Publication {
    String title;
    int price;
    int page;
    
    public Publication (String title, int price, int page) {
    this.title = title;
    this.price = price;
    this.page = page;
 }
    public String getTitle() {
        return title;
   }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    
    public static void printHeader() {
        System.out.println("===== Mencari Informasi Buku =====");
    }

    public static String formatCurrency(int amount) {
          Locale myIndonesianLocale = new Locale("in", "ID");
          NumberFormat formatter = NumberFormat.getCurrencyInstance(myIndonesianLocale);
          return formatter.format(amount);
    }

    public void PrintBookInfo() {
       System.out.println(title + " (Price List: " + formatCurrency(price) + ")");
    }
}


