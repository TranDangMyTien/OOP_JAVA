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
public class Bai2 {
//    Một ma trận được gọi là ma trận thưa nếu số phần tử có giá trị bằng 0 nhiều hơn số phần tử khác 0. Viết chương trình thực hiện các công việc sau:
//
//    Nhập m, n là số dòng và số cột của ma trận hai chiều A từ bàn phím.
//    Nhập giá trị các phần tử của ma trận A từ bàn phím.
//    Kiểm tra và thông báo lên màn hình ma trận vừa nhập là ma trận thưa hay ma trận không thưa.
//    Yêu cầu kỹ thuật: Kiểm tra số dòng, số cột nhập vào không được nhỏ hơn 1.
    public static void main(String[] args) {
	int m, n;
	int soPhanTu0 = 0;		// số phần tử = 0 trong ma trận
	int soPhanTuKhac0 = 0;	// số phần tử khác 0 trong ma trận
	Scanner scanner = new Scanner(System.in);
		
	do {
		System.out.println("Nhập vào số dòng của ma trận:");
		m = scanner.nextInt();
		System.out.println("Nhập vào số cột của ma trận:");
		n = scanner.nextInt();
	} while (m < 1 || n < 1);
		
	// khai báo ma trận A có m dòng, n cột
	int A[][] = new int[m][n];
		
	System.out.println("Nhập các phần tử cho ma trận A:");
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			System.out.print("A[" + i + "," + j + "] = ");
			A[i][j] = scanner.nextInt();
		}
	}
		
	System.out.println("Ma trận A vừa nhập:");
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			System.out.print(A[i][j] + "\t");
		}
		System.out.println("\n");
	}
		
	// kiểm tra ma trận thưa hay không thưa
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			// kiểm tra nếu phần tử tại i, j bằng 0
			// thì tăng biến soPhanTu0 lên 1
			// ngược lại tăng biến soPhanTuKhac0 lên 1
			if (A[i][j] == 0) {
				soPhanTu0++;
			} else {
				soPhanTuKhac0++;
			}
		}
	}
		
	// nếu biến soPhanTu0 lớn hơn soPhanTuKhac0
	// thì ma trận đó là ma trận thưa
	// ngược lại là ma trận không thưa
	if (soPhanTu0 > soPhanTuKhac0) {
		System.out.println("Ma trận vừa nhập là ma trận thưa");
	} else {
		System.out.println("Ma trận vừa nhập là ma trận không thưa");
	}
    }
}
