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
public class Bai3 {
    //Một ma trận được gọi là ma trận đối xứng trước hết nó phải là ma trận vuông (có số dòng và số cột bằng nhau) 
    //và các phần tử của nó đối xứng nhau qua đường chéo chính. Viết chương trình nhập từ bàn phím các phần tử của ma trận A, 
    //kích thước m dòng, n cột (1 <= m, n <= 5). 
    //Kiểm tra xem ma trận vừa nhập có phải là ma trận đối xứng hay không?
    public static void main(String[] args) {
	int n;	// bậc của ma trận 
	int kt = 0;
	Scanner scanner = new Scanner(System.in);
		
	do {
		System.out.println("Nhập vào số bậc của ma trận: ");
		n = scanner.nextInt();
	} while (n < 1);
		
	// ma trận A là ma trận vuông
	// có n dòng và n cột
	int[][] A = new int[n][n];
		
	System.out.println("Nhập các phần tử cho ma trận A:");
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			System.out.print("A[" + i + "," + j + "] = ");
			A[i][j] = scanner.nextInt();
		}
	}
		
	System.out.println("Ma trận A vừa nhập:");
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			System.out.print(A[i][j] + "\t");
		}
		System.out.println("\n");
	}
		
	// kiểm tra các phần tử nằm dưới đường chéo chính
	// và phần tử đối xứng với nó qua đường chéo chính
	// có bằng nhau hay không
	// nếu bằng nhau thì ma trận đó là ma trận đối xứng
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < i; j++) {
			if (A[i][j] == A[j][i]) {
				kt = 1;
			} else {
				kt = 0;
			}
		}
	}
		
	if (kt == 1) {
		System.out.println("Ma trận vừa nhập là ma trận đối xứng");
	} else {
		System.out.println("Ma trận vừa nhập là ma trận không đối xứng");
	}
    }
}
