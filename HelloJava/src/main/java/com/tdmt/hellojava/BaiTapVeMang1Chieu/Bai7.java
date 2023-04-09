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
public class Bai7 {
    //Viết chương trình hiển thị các phần tử chia hết cho 5 trong mảng.
    public static void main(String[] args) {
    int n;
    Scanner scanner = new Scanner(System.in);
         
    do {
        System.out.println("Nhập vào số phần tử của mảng: ");
        n = scanner.nextInt();
    } while (n <= 0);
         
    int A[] = new int[n];
         
    System.out.println("Nhập các phần tử cho mảng: ");
    for (int i = 0; i < n; i++) {
        System.out.print("Nhập phần tử thứ " + i + ": ");
        A[i] = scanner.nextInt();
    }
         
    // tìm và hiển thị các phần tử trong mảng chia hết cho 5
    System.out.println("Các phần tử chia hết cho 5 là: ");
    for (int i = 0; i < n; i++) {
        if (A[i] % 5 == 0) {
            System.out.print(A[i] + "\t");
        }
    }
    }
}
