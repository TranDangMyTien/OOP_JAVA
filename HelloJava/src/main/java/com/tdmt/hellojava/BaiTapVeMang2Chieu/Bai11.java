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
public class Bai11 {
    //Viết chương trình tìm và in ra phần tử chẵn dương nhỏ nhất trong ma trận.
    public static void main(String[] args) {
	int m, n;
	int min = -1;
	Scanner scanner = new Scanner(System.in);
		
	System.out.println("Nhập vào số dòng của ma trận: ");
	m = scanner.nextInt();
	System.out.println("Nhập vào số cột của ma trận: ");
	n = scanner.nextInt();
		
	int A[][] = new int[m][n];System.out.println("Nhập các phần tử cho ma trận: ");
		
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
		
	// tìm phần tử chẵn dương nhỏ nhất trong ma trận
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			if (A[i][j] > 0 && A[i][j] % 2 == 0) {
				if (min == -1) {
					min = A[i][j];
				} else if (A[i][j] < min) {
					min = A[i][j];
				}
			}
		}
	}
		
	System.out.println("Phần tử chẵn dương nhỏ nhất trong ma trận = " + min);
    }
}
