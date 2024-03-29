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
public class Bai4 {
    //Tìm giá trị lớn nhất trong một ma trận 2 chiều với các phần tử được nhập từ bàn phím.
    public static void main(String[] args) {
	// khai báo số dòng và số cột của ma trận
	int m, n;
		
	Scanner scanner = new Scanner(System.in);
		
	System.out.println("Nhập vào số dòng của ma trận: ");
	m = scanner.nextInt();
	System.out.println("Nhập vào số cột của ma trận: ");
	n = scanner.nextInt();
		
	// khai báo ma trận A có m dòng, n cột
	int A[][] = new int[m][n];
		
	System.out.println("Nhập các phần tử cho ma trận: ");
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			System.out.print("A[" + i + "]["+ j + "] = ");
			A[i][j] = scanner.nextInt();
		}
	}
		
	// tìm phần tử có giá trị lớn nhất trong ma trận
	// giả sử phần tử tại vị trí (0,0) là phần tử lớn nhất
	int max = A[0][0];
		
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			if (max < A[i][j]) {
				max = A[i][j];
			}
		}
	}
		
	System.out.println("Phần tử lớn nhất trong ma trận = " + max);
    }
}
