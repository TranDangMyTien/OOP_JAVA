/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdmt.hellojava.BaiTapVeMang1Chieu;

import java.util.Scanner;

/**
 *
 * @author mytie
 */
public class Bai1 {
    //Viết chương trình nhập mảng n số nguyên với các giá trị ngẫu nhiên. 
    //Xuất tổng, tìm giá trị nhỏ nhất và sắp xếp mảng.
    //Dùng phương pháp sắp xếp Exchange sort để sắp xếp các phần tử trong mảng theo thứ tự giảm dần.
    
    
    public static void main(String[] args) {
	int n, size = 100, sum = 0, tempSort;
	Scanner scanner = new Scanner(System.in);
        
        // khởi tạo và cấp phát bộ nhớ cho mảng
	int array[] = new int[size];
	do {
		System.out.print("Nhập vào số phần tử của mảng: ");
		n = scanner.nextInt();
	} while (n < 0 || n > size - 1);
		
	
		
	System.out.println("Nhập các phần tử cho mảng: ");
	for (int i = 0; i < n; i++) {
		System.out.print("Nhập phần tử thứ " + i + ": ");
		array[i] = scanner.nextInt();
	}
		
	// Hiển thị mảng vừa nhập
	System.out.println("Mảng ban đầu: ");
	for (int i = 0; i < n; i++) {
		System.out.print(array[i] + "\t");
	}
		
	// tính tổng các phần tử có trong mảng
	for (int i = 0; i < n; i++) {
		sum += array[i];
	}
	System.out.println("\nTổng các phần tử có trong mảng = " + sum);
		
	// sắp xếp theo thứ tự giảm dần
	for (int i = 0; i < n - 1 ; i++) {
		for (int j = i + 1; j <= n - 1 ; j++) {
			if (array[i] < array[j]) {
				tempSort = array[i];
				array[i] = array[j];
				array[j] = tempSort;
			}
		}
	}
	System.out.println("Mảng sau khi sắp xếp là: ");
	for (int i = 0; i < n; i++) {
		System.out.print(array[i] + "\t");
	}
		
	// tìm phần tử nhỏ nhất
	// sau khi sắp xếp theo thứ tự giảm dần 
	// thì phần tử nhỏ nhất là phần tử cuối cùng trong mảng
	System.out.println("\nPhần tử nhỏ nhất trong mảng là " + array[n - 1]);
}
}
