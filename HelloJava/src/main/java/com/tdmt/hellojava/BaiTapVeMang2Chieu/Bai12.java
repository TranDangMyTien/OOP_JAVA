/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdmt.hellojava.BaiTapVeMang2Chieu;
import java.util.Scanner;
/**
 *
 * @author mytie
 */
public class Bai12 {
    //Viết chương trình xóa dòng có tổng lớn nhất của một ma trận số thực.
    public static void main(String[] args) {
	int m, n;
	double tong = 0, max;
	int rowPosition = 0;	// vị trí dòng
	Scanner scanner = new Scanner(System.in);
		
	System.out.println("Nhập vào số dòng của ma trận: ");
	m = scanner.nextInt();
	System.out.println("Nhập vào số cột của ma trận: ");
	n = scanner.nextInt();
		
	double A[][] = new double[m][n];
        
        System.out.println("Nhập các phần tử cho ma trận: ");	
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			System.out.print("A[" + i + "]["+ j + "] = ");
			A[i][j] = scanner.nextDouble();
		}
	}
		
	System.out.println("Ma trận A vừa nhập:");
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			System.out.print(A[i][j] + "\t");
		}
		System.out.println("\n");
	}
		
	// tìm tổng trên dòng đầu tiên (i = 0) của ma trận
	for (int j = 0; j < n; j++) {
		tong += A[0][j];
	}
		
	max = tong;
		
	for (int i = 1; i < m; i++) {
		tong = 0;
		for (int j = 0; j < n; j++) {
			tong += A[i][j];
		}
			
		// nếu giá trị của tổng các số ở các dòng sau
		// lớn hơn tổng các số ở dòng đầu tiên
		// thì gán max = tong
		if (tong > max) {
			max = tong;
			// lưu lại vị trí dòng có tổng lớn nhất
			rowPosition = i;
		}
	}
		
	for (int i = rowPosition; i < m; i++) {
		for (int j = 0; j < n; j++) {
			// đẩy phần tử ở dòng i + 1 lên
			// vị trí ở dòng i
			A[i][j] = A[i+1][j];
		}
		m--;	// giảm số dòng của ma trận đi 1
	}
		
	System.out.println("Ma trận A sau khi xóa dòng có tổng lớn nhất:");
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			System.out.print(A[i][j] + "\t");
		}
		System.out.println("\n");
	}
    }
}
