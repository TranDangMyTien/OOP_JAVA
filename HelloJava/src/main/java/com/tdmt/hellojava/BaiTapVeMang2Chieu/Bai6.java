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
public class Bai6 {
    //Tìm phần tử có giá trị lớn nhất và nhỏ nhất trên đường chéo chính của một ma trận vuông.
    public static void main(String[] args) {
	int n;	// bậc của ma trận vuông
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
		
	int max = A[0][0];
	int min = A[0][0];
		
	// các phần tử nằm trên đường chéo chính
	// là các phần tử có chỉ số dòng = chỉ số cột
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (i == j && max < A[i][j]) {
				max = A[i][j];
			}
				
			if (i == j && min > A[i][j]) {
				min = A[i][j];
			}
		}
	}
		
	System.out.println("Phần tử lớn nhất nằm trên đường chéo chính = " + max);
	System.out.println("Phần tử nhỏ nhất nằm trên đường chéo chính = " + min);

    }
}
