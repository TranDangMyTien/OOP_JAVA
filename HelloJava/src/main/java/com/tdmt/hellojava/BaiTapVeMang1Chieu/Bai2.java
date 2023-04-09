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
public class Bai2 {
    //Kiểm tra mảng một chiều vừa nhập có phải là mảng đối xứng hay không?
    //Mảng một chiều A có n phần tử là mảng đối xứng nếu mọi phần tử của mảng thỏa mãn 
    //A[i] = A[n - i - 1] với i = 0, 1,..., n - 1.
    
    public static void main(String[] args) {
    int n, kt = 1;
    Scanner scanner = new Scanner(System.in);
         
    do {
        System.out.println("Nhập số phần tử của mảng: ");
        n = scanner.nextInt();
    } while (n <= 0);
         
    int A[] = new int[n];
         
    System.out.println("Nhập giá trị cho các phần tử của mảng: ");
    for (int i = 0; i < n; i++) {
        System.out.print("A[" + i + "] = ");
        A[i] = scanner.nextInt();
    }
         
    // kiểm tra mảng đảo ngược
    // dùng vòng lặp for duyệt i = 0 đến i < n / 2
    // nếu A[i] != A[n - i -1]
    // thì mảng đó không phải mảng đối xứng
    for (int i = 0; i < n / 2; i++) {
        if (A[i] != A[n - i - 1]) {
            kt = 0;
            break;
        }
    }
         
    if (kt == 0) {
        System.out.println("Mảng một chiều vừa nhập không là mảng đối xứng");
    } else {
        System.out.println("Mảng một chiều vừa nhập là mảng đối xứng");
    }
}
}
