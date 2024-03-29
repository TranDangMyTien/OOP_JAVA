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
public class Bai5 {
    //Viết chương trình tính tổng các phần tử nằm trên đường chéo chính của một ma trận vuông.
    public static void main(String[] args) {
	int n;	// bậc của ma trận vuông
	int sum = 0;
	Scanner scanner = new Scanner(System.in);
		
	System.out.println("Nhập vào bậc của ma trận: ");
	n = scanner.nextInt();
		
	int A[][] = new int[n][n];
		
	System.out.println("Nhập các phần tử cho ma trận: ");
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			System.out.print("A[" + i + "]["+ j + "] = ");
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
		
	// các phần tử nằm trên đường chéo chính
	// là các phần tử có chỉ số dòng = chỉ số cột
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			// kiểm tra nếu i == j thì mới tính tổng
			if (i == j) {
				sum += A[i][j];
			}
		}
	}

	System.out.println("Tổng các phần tử nằm trên đường chéo chính = " + sum);
    }
}
