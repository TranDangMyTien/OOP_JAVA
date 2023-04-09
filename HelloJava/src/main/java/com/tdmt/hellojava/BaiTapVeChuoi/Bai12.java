/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdmt.hellojava.BaiTapVeChuoi;

/**
 *
 * @author mytie
 */
public class Bai12 {
    //Chương trình chuyển đổi từ String sang Char trong java
    public static void main(String args[])
    {
        // Using charAt() method
        String str = "Hello";
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            System.out.println("Kí tự ở vị trí "+i+" là: "+ch);
        }
    }
}
