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
public class Bai8 {
    //Dùng hàm toUpperCase chuyển chữ thường thành chữ hoa trong Java
    public static void main(String[] args) {
    // sử dụng class Scanner để nhận dữ liệu từ bàn phím
    Scanner sc = new Scanner(System.in);
    String message;
    System.out.println("\n\nNhập vào chuỗi cần in hoa: ");
    message = sc.nextLine();
    System.out.println("Chuỗi sau khi in hoa: ");
    //sử dụng phương thức toUpperCase() để in hoa các ký tự trong chuỗi
    System.out.println(message.toUpperCase());
    System.out.println("\n---------------------------------");
    System.out.println("Chương trình này được đăng tại Freetuts.net");
  }
}
