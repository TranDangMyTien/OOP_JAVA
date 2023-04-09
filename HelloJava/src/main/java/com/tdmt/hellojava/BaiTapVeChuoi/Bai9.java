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
public class Bai9 {
    //Chuyển chữ hoa thành chữ thường Java bằng mã ASCII
     public static void main(String[] args) {
        // sử dụng class Scanner để nhận dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);
        String message;
        System.out.println("\n\nNhập vào chuỗi cần chuyển đổi: ");
        message = sc.nextLine();
        //khai báo một mảng, sau đó sử dụng phương thức toCharArray()
        //để chuyển đổi message thành một mảng kiểu char
        char[] charArray = message.toCharArray();
        //sử dụng vòng lặp for để duyệt các phần tử trong charArray
        for(int i = 0; i < charArray.length; i++) {
            if(charArray[i] >= 65 && charArray[i] <= 90){
                charArray[i] += 32;
            }
        }
        // chuyển đổi mảng char thành string
        message = String.valueOf(charArray);
        System.out.println("Chuỗi sau khi đổi: \n" + message);
 
        System.out.println("\n---------------------------------");
        System.out.println("Chương trình này được đăng tại Freetuts.net");
    }
}
