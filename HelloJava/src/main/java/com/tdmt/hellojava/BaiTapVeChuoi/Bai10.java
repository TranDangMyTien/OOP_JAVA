/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdmt.hellojava.BaiTapVeChuoi;

import java.util.Scanner;

/**
 *
 * @author mytie
 */
public class Bai10 {
    public static void main(String[] args) {
        // sử dụng class Scanner để nhận dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);
        String message;
        System.out.println("\nNhập vào chuỗi cần in thường: ");
        message = sc.nextLine();
        System.out.println("Chuỗi sau khi in hoa: ");
        //sử dụng phương thức toLowerCase() để in thường các ký tự trong chuỗi
        System.out.println(message.toLowerCase());
 
        System.out.println("\n---------------------------------");
        System.out.println("Chương trình này được đăng tại Freetuts.net");
    }
}
