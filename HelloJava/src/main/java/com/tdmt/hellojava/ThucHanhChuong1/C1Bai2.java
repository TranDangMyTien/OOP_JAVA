/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdmt.hellojava.ThucHanhChuong1;

import java.util.Scanner;

/**
 *
 * @author mytie
 */
public class C1Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap bac n = ");
        int n = sc.nextInt();
        System.out.print("Nhap x = ");
        double x = sc.nextDouble();
        
        double gt = 0;
        for (int i = 0; i <= n; i++) //i chạy từ 0-n => n+1 số hạng 
        {
            System.out.printf("Nhap he so thu %d = ", i);
            double a = sc.nextDouble(); //Nhập giá trị thực cho a 
            //a chạy từ x^0 tới x^n 
            gt += a * Math.pow(x, i); //Tính f(x) 
        }
        
        System.out.printf("Gia tri = %.2f\n", gt);
    }
}
