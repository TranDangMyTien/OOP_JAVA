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
public class Bai3 {
    //Viết chương trình sử dụng các hàm có sẵn trong chuỗi để so sánh 2 chuỗi bất kỳ 
    //nhập từ bàn phím và hiển thị kết quả so sánh ra màn hình.
    //Hàm compareTo(): so sánh 2 chuỗi có phân biệt chữ hoa chữ thường.
    //Hàm compareToIgnoreCase(): so sánh 2 chuỗi nhưng không phân biệt chữ hoa chữ thường.
    public static void main(String[] args) {
	String chuoi1, chuoi2;
	int result;
	Scanner scanner = new Scanner(System.in);
		
	System.out.println("Nhập vào chuỗi thứ nhất: ");
	chuoi1 = scanner.nextLine();
	System.out.println("Nhập vào chuỗi thứ hai: ");
	chuoi2 = scanner.nextLine();
		
	System.out.println("Kết quả so sánh sử dụng hàm compareTo(): ");
	// so sánh 2 chuỗi sử dụng hàm compareTo()
	// compareTo(): so sánh có phân biệt chữ hoa chữ thường
	// nếu biến result < 0 thì chuỗi 1 < chuỗi 2
	// nếu biến result > 0 thì chuỗi 1 > chuỗi 2
	// nếu biến result == 0 thì chuỗi 1 = chuỗi 2
	result = chuoi1.compareTo(chuoi2);
	if (result < 0) {
		System.out.println("Chuỗi " + chuoi1 + " nhỏ hơn " + chuoi2);
	} else if (result > 0) {
		System.out.println("Chuỗi " + chuoi1 + " lớn hơn " + chuoi2);
	} else {
		System.out.println("Chuỗi " + chuoi1 + " bằng " + chuoi2);
	}
		
	System.out.println("Kết quả so sánh sử dụng hàm compareToIgnoreCase(): ");
	// so sánh 2 chuỗi sử dụng hàm compareToIgnoreCase()
	// compareToIgnoreCase(): so sánh không phân biệt chữ hoa chữ thường
	// nếu biến result < 0 thì chuỗi 1 < chuỗi 2
	// nếu biến result > 0 thì chuỗi 1 > chuỗi 2
	// nếu biến result == 0 thì chuỗi 1 = chuỗi 2
	result = chuoi1.compareToIgnoreCase(chuoi2);
	if (result < 0) {
		System.out.println("Chuỗi " + chuoi1 + " nhỏ hơn " + chuoi2);
	} else if (result > 0) {
		System.out.println("Chuỗi " + chuoi1 + " lớn hơn " + chuoi2);
	} else {
		System.out.println("Chuỗi " + chuoi1 + " bằng " + chuoi2);
	}
    }
}
