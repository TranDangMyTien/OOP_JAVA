/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdmt.hellojava.BaiTapVeChuoi;

/**
 *
 * @author mytie
 */
public class Bai4 {
    //Xóa khoảng trắng của một chuỗi có sẵn
    
    //Cách xóa khoảng trắng của chuỗi
    //Sử dụng phương thức replaceAll() để thay thế ký tự khoảng trắng " " bằng ký tự rỗng "": 
    //replaceAll(" ", "");
    public static void main(String[] args) {
    //khai báo và khởi tạo một chuỗi có nội dung nhất địng
    String sentence = "F   re et     u  t  s.n et";
    System.out.println("\nChuỗi ban đầu: " + sentence);
    //sử dụng phương thức replaceAll() để xóa khoảng trắng
    sentence = sentence.replaceAll(" ", "");
    System.out.println("Chuỗi sau khi xóa khoảng trắng: " + sentence);
 
    System.out.println("\n----------------------------------");
    System.out.println("Chương trình này được đăng tại Freetuts.net");
    }
    
    
    
}
