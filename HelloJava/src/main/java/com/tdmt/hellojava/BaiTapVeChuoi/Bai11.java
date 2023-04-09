/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdmt.hellojava.BaiTapVeChuoi;

/**
 *
 * @author mytie
 */
public class Bai11 {
    //Chương trình chuyển đổi từ Char sang String trong java
    public static void main(String args[])
    {
        // Method 1: Using toString() method
        char ch = 'a';
        String str = Character.toString(ch);
        System.out.println("Chuỗi là: "+str);
        // Method 2: Using valueOf() method
        String str2 = String.valueOf(ch);
        System.out.println("Chuỗi là: "+str2);
    }
}
