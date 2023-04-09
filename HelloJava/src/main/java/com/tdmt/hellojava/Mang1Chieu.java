/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdmt.hellojava;

import java.util.Scanner;

/**
 *
 * @author mytie
 */
public class Mang1Chieu {
    //Khai báo 
    //Cách 1 [Kiểu_dữ_liệu] tên_mảng[];
    //Cách 2 [Kiểu_dữ_liệu][] tên_mảng;
    
    //Cấp phát bộ nhớ cho mảng 
    //Cách 1: [Kiểu_dữ_liệu] tên_mảng[] = new [Kiểu_dữ_liệu] [Số_phần_tử_của_mảng];
    //Cách 2: vd int[] a = new int[] {2, 10, 4, 8, 5};
    
    
    //Truy xuất phần tử mảng 
//    public static void main(String[] args) {
//        // Khai báo và khởi tạo giá trị ban đầu cho mảng
//        char[] kyTu = new char[] {'a', 'b', 'c', 'd', 'e'};
//
//        // hiển thị ký tự tại vị trí thứ 2 trong mảng
//        System.out.println("Ký tự tại vị trí thứ 2 trong mảng là " + kyTu[2]);
//    }
    
    
    
    //Nhập xuất mảng 
    public static void main(String[] args) {
	int size;	// kích thước của mảng
	Scanner scanner = new Scanner(System.in);
		
	System.out.println("Nhập vào độ dài của mảng: ");
	size= scanner.nextInt();
		
	// khai báo và cấp phát bộ nhớ cho mảng
	// mảng này có tên là array và kích thước = size
	int[] array = new int[size];
		
	// array.length: trả về kích thước của mảng
	// vòng lặp này sẽ duyệt i từ 0 đến chiều dài của mảng - 1
	for (int i = 0; i < size; i++) {
		System.out.println("Nhập vào phần tử thứ " + i + ": ");
		array[i] = scanner.nextInt();	// nhập giá trị cho phần tử
	}
		
	// hiển thị giá trị các phần tử trong mảng
	for (int i = 0; i < size; i++) {
		System.out.println("Phần tử thứ " + i + ": " + array[i]);
	}
    }
    
    
    
}
