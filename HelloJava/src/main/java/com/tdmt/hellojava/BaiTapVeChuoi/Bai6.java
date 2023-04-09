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
public class Bai6 {
    //In hoa ký tự đầu tiên của mỗi chữ trong chuỗi
    //Chuyển chuỗi thành một mang char, khi đó ta có thể dùng vòng lặp for để duyệt từng ký tự trong mảng.
    //Khi đó đơn giản ta chỉ cần sử dụng phương thức toUpperCase() để in hoa ký tự đầu của mỗi phần tử trong mảng.
    //Cuỗi cùng mình sẽ sử dụng phương thức String.valueOf() để chuyển mảng char thành string, rồi in ra màn hình.
    
     public static void main(String[] args) {
    // sử dụng class Scanner để nhận dữ liệu từ bàn phím
    Scanner sc = new Scanner(System.in);
    String message;
    System.out.println("\nNhập vào chuỗi cần in hoa ký tự đầu: ");
    message = sc.nextLine(); //Hàm nhập lấy cả khoảng trắng 
    //Khai báo một mảng, sau đó sử dụng phương thức toCharArray() 
    //để chuyển đổi message thành một mảng kiểu char
    char[] charArray = message.toCharArray();//Hàm tạo mảng 1 chiều và gán giá trị kiểu ký tự cho mảng 
    boolean foundSpace = true; //Tạo biến tạm để tìm chữ cái dầu tiên mỗi chữ 
    //Sử dụng vòng lặp for để duyệt các phần tử trong charArray
    for(int i = 0; i < charArray.length; i++) {
      // Nếu phần tử trong mảng là một chữ cái
      if(Character.isLetter(charArray[i])) {
        // kiểm tra khoảng trắng có trước chữ cái
        if(foundSpace) {
          //đổi chữ cái thành chữ in hoa bằng phương thức toUpperCase()
          charArray[i] = Character.toUpperCase(charArray[i]);
          foundSpace = false;
        }
      }
      else {
        foundSpace = true;
      }
    }
    // Hàm chuyển đổi mảng char thành string
    message = String.valueOf(charArray);
    System.out.println("Chuỗi sau khi đổi: \n" + message);

    System.out.println("\n---------------------------------");
    System.out.println("Chương trình này được đăng tại Freetuts.net");
  }
}
