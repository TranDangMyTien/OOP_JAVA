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
public class Bai6 {
    //Tách một nửa đầu của mảng ban đầu sang mảng thứ nhất và nửa còn lại sang mảng thứ hai.
    public static void main(String[] args) {
	int n;
	int c = 0;	// số phần tử của mảng thứ nhất
	int d = 0;	// số phần tử của mảng thứ hai
		
	Scanner scanner = new Scanner(System.in);
		
	do {
		System.out.println("Nhập vào số phần tử của mảng: ");
		n = scanner.nextInt();
	} while (n < 0);
		
	int A[] = new int[n];
	int[] mangThuNhat = new int[n];
	int[] mangThuHai = new int[n];
		
	System.out.println("Nhập các phần tử cho mảng: ");
	for (int i = 0; i < n; i++) {
		System.out.print("Nhập phần tử thứ " + i + ": ");
		A[i] = scanner.nextInt();
	}
		
	// duyệt vòng lặp for từ đầu đến giữa mảng
	for (int i = 0; i < n / 2; i++) {
		mangThuNhat[c] = A[i];
		c++;
	}
		
	// duyệt vòng lặp for từ vị trí giữa mảng đến cuối mảng
	for (int i = n / 2; i < n; i++) {
		mangThuHai[d] = A[i];
		d++;
	}
		
	System.out.println("Các phần tử của mảng thứ nhất là: ");
	for (int i = 0; i < c; i++) {
		System.out.print(mangThuNhat[i] + "\t");
	}
		
	System.out.println("\nCác phần tử của mảng thứ hai là: ");
	for (int i = 0; i < d; i++) {
		System.out.print(mangThuHai[i] + "\t");
	}
    }
}
