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
public class Bai3 {
    //Tìm và in ra màn hình số lượng số nguyên lẻ, số lượng số nguyên chẵn trong mảng.
    
    public static void main(String[] args) {
    int n;
    int soLuongSoNguyenLe = 0, soLuongSoNguyenChan = 0;
    Scanner scanner = new Scanner(System.in);
         
    do {
        System.out.println("Nhập vào số phần tử của mảng: ");
        n = scanner.nextInt();
    } while (n <= 0);
         
    int A[] = new int[n];
         
    System.out.println("Nhập các phần tử cho mảng: ");
    // A.length: trả về độ dài của mảng
    for (int i = 0; i < n; i++) {
        System.out.print("Nhập phần tử thứ " + i + ": ");
        A[i] = scanner.nextInt();
    }
         
    // tính số lượng số nguyên lẻ, chẵn trong mảng
    for (int i = 0; i < n; i++) {
        if (A[i] % 2 == 0) {
            soLuongSoNguyenChan++;
        } else {
            soLuongSoNguyenLe++;
        }
    }
         
    System.out.println("Số lượng số nguyên chẵn trong mảng = " + soLuongSoNguyenChan);
    System.out.println("Số lượng số nguyên lẻ trong mảng = " + soLuongSoNguyenLe);
}
    
}
