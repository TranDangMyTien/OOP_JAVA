/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdmt.hellojava.BaiTapVeMang1Chieu;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mytie
 */
public class Bai10 {
//    Xuất giá trị các phần tử của mảng.
//    Tìm phần tử có giá trị lớn nhất, nhỏ nhất.
//    Đếm số phần tử là số chẵn.
//    Sắp xếp mảng tăng dần.
    public static void main(String[] args) {
    int n;
    Scanner scanner = new Scanner(System.in);
         
    do {
        System.out.println("Nhập vào số phần tử của mảng: ");
        n = scanner.nextInt();
    } while (n < 0);
         
    int A[] = new int[n];
         
    System.out.println("Nhập các phần tử cho mảng: ");
    for (int i = 0; i < n; i++) {
        System.out.print("Nhập phần tử thứ " + i + ": ");
        A[i] = scanner.nextInt();
    }
         
    // Xuất giá trị các phần tử của mảng
    System.out.println("\nMảng ban đầu: ");
    for (int i = 0; i < n; i++) {
        System.out.print(A[i] + "\t");
    }
         
    // Tìm phần tử có giá trị lớn nhất, nhỏ nhất
    int max = A[0]; // khởi tạo phần tử lớn nhất là phần tử đầu tiên
    int min = A[0]; // khởi tạo phần tử bé nhất là phần tử đầu tiên
         
    for (int i = 0; i < n; i++) {
        if (A[i] < min) {
            min = A[i];
        }
             
        if (A[i] > max) {
            max = A[i];
        }
    }
    System.out.print("\nPhần tử lớn nhất trong mảng là " + max);
    System.out.print("\nPhần tử nhỏ nhất trong mảng là " + min);
         
    // Đếm số phần tử là số chẵn
    int soPhanTuChan = 0;
    for (int i = 0; i < n; i++) {
        if (A[i] % 2 == 0) {
            soPhanTuChan++;
        }
    }
    System.out.println("\nSố phần tử chẵn có trong mảng = " + soPhanTuChan);
         
    // Sắp xếp măng tăng dần
    // Java cung cấp cho chúng ta một thư viện có sẵn
    // để sắp xếp mảng, đó là thư viện sort của lớp Arrays
    // mặc định thư viện này sẽ sắp xếp mảng tăng dần
    Arrays.sort(A); //HÀM SẮP XẾP THỨ TỰ TĂNG DẦN   
    System.out.println("\nMảng sau khi sắp xếp: ");
    for (int i = 0; i < n; i++) {
        System.out.print(A[i] + "\t");
    }
    }
}
