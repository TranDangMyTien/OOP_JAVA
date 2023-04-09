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
public class Bai5 {
    //Xóa khoảng trắng của một chuỗi được nhập từ bàn phím
    //Ở ví dụ này mình sẽ in hoa ký tự đầu bằng phương pháp thủ công. 
    //Cụ thể là mình sẽ tách chữ ban đầu thành hai phần: 1 phần là ký tự đầu tiên của chữ 
    //và phần thứ hai là các ký tự còn lại.

    //Sau đó sử dụng phương thức toUpperCase() để in hoa phần đầu tiên rồi gộp hai phần đó lại.
    public static void main(String[] args) {
    //Sử dụng class Scanner để lấy dữ liệu từ bàn phím.
    Scanner sc = new Scanner(System.in);
    System.out.print("\nNhập vào chuỗi cần kiểm tra: ");
    String input = sc.nextLine();
    //hiển thị chuỗi ban đầu
    System.out.println("Chuỗi ban đầu: " + input);
 
    //sử dụng phương thức replaceAll() để thay thế " " bằng "".
    input = input.replaceAll("\\s", "");
    System.out.println("Chuỗi sau khi xóa khoảng trắng: " + input);
 
    System.out.println("\n----------------------------------");
    System.out.println("Chương trình này được đăng tại Freetuts.net");
  }
}
