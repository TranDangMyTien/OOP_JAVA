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
public class Bai10 {
    //Viết chương trình tìm và in ra màn hình phần tử lớn nhất 
    //và vị trí của phần tử đó trong ma trận số nguyên
    public static void main(String[] args) {
	int n, m;
		
	// vị trí dòng và vị trí cột
	int rowPosition = 0, colPosition = 0;
		
	Scanner scanner = new Scanner(System.in);
		
	System.out.println("Nhập vào số dòng của ma trận: ");
	m = scanner.nextInt();
	System.out.println("Nhập vào số cột của ma trận: ");
	n = scanner.nextInt();
		
	int A[][] = new int[m][n];
		
	System.out.println("Nhập các phần tử cho ma trận: ");
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			System.out.print("A[" + i + "]["+ j + "] = ");
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
		
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			// nếu phần tử A tại vị trí i và j
			// lớn hơn phần tử A tại vị trí rowPosition và colPosition
			// thì sẽ lưu lại vị trí của phần tử lớn nhất
			// bằng cách gán vị trí rowPosition = i và colPosition = j
			if (A[i][j] > A[rowPosition][colPosition]) {
				rowPosition = i;
				colPosition = j;
			}
		}
	}

	// hiển thị vị trí của phần tử lớn nhất trong ma trận
	System.out.println("Phần tử lớn nhất trong ma trận là " + A[rowPosition][colPosition]
		+ " có vị trí (" + rowPosition + "," + colPosition + ")");
    }
    
}
