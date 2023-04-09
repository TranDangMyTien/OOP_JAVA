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
public class Bai7 {
    //Chuyển chữ thường thành chữ hoa trong Java sử dụng mã ASCII
    //Theo như bảng mã ASCII thì tất cả các ký tự chữ hoa (A-Z) có giá trị ASCII nằm trong khoảng từ 65 đến 90. 
    //Các ký tự chữ thường tương ứng (a-z) của chúng có giá trị ASCII từ 97 đến 122 (hơn 32).
    
    public static void main(String[] args) {
    // sử dụng class Scanner để nhận dữ liệu từ bàn phím
    Scanner sc = new Scanner(System.in);
    String message;
    System.out.println("\nNhập vào chuỗi cần in hoa: ");
    message = sc.nextLine();
    //khai báo một mảng, sau đó sử dụng phương thức toCharArray() 
    //để chuyển đổi message thành một mảng kiểu char
    char[] charArray = message.toCharArray();
    //sử dụng vòng lặp for để duyệt các phần tử trong charArray
    for(int i = 0; i < charArray.length; i++) {
      if(charArray[i] >= 97 && charArray[i] <= 122){
        charArray[i] -= 32;
      }
    }
    // chuyển đổi mảng char thành string
    message = String.valueOf(charArray);
    System.out.println("Chuỗi sau khi đổi: \n" + message);
 
    System.out.println("\n---------------------------------");
    System.out.println("Chương trình này được đăng tại Freetuts.net");
  }
}
