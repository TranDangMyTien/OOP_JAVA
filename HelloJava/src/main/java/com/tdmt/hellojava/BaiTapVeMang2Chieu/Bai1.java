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
public class Bai1 {
//    Nhập m, n là số dòng và 2 số cột của 2 ma trận 2 chiều A và B từ bàn phím.
//    Nhập giá trị cho các phần tử cho 2 ma trận này.
//    Tính và in ra màn hình ma trận C là tổng của 2 ma trận này.
//    Yêu cầu kỹ thuật: Kiểm tra số dòng, số cột nhập vào không được nhỏ hơn 1.
    
    public static void main(String[] args) {
	int m;	// số dòng của ma trận
	int n;	// số cột của ma trận
	Scanner scanner = new Scanner(System.in);
		
	do {
		System.out.println("Nhập vào số dòng của ma trận:");
		m = scanner.nextInt();
		System.out.println("Nhập vào số cột của ma trận:");
		n = scanner.nextInt();
	} while (m < 1 || n < 1);
		
	// khai báo 2 ma trận A và B có m dòng và n cột
	int A[][] = new int[m][n];
	int B[][] = new int[m][n];
		
	// ma trận tổng C
	int C[][] = new int [m][n];
		
	System.out.println("Nhập các phần tử cho ma trận A:");
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			System.out.print("A[" + i + "," + j + "] = ");
			A[i][j] = scanner.nextInt();
		}
	}
		
	System.out.println("Nhập các phần tử cho ma trận B:");
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			System.out.print("B[" + i + "," + j + "] = ");
			B[i][j] = scanner.nextInt();
		}
	}
		
	System.out.println("Ma trận A:");
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			System.out.print(A[i][j] + "\t");
		}
		System.out.println("\n");
	}
		
	System.out.println("Ma trận B:");
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			System.out.print(B[i][j] + "\t");
		}
		System.out.println("\n");
	}
		
	// Để tính tổng hai ma trận
	// ta sẽ sử dụng 2 vòng lặp for
	// để duyệt i từ 0 đến m và j từ 0 đến n
	// sau đó tính tổng hai phần tử
	// tại vị trí i, j tương ứng của 2 ma trận A, B
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			C[i][j] = A[i][j] + B[i][j];
		}
	}
		
	// hiển thị ma trận tổng C
	System.out.println("Ma trận tổng C:");
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			System.out.print(C[i][j] + "\t");
		}
		System.out.println("\n");
	}
    }
}
