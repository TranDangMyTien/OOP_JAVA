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
public class Bai8 {
    //Thực hiện nhập vào một ma trận vuông và kiểm tra ma trận đó có phải là ma trận tam giác trên không?
    //Tạo ma trận vuông A bậc n (n > 0 và được nhập từ bàn phím), giá trị của các phần tử được nhập từ bàn phím. 
    //Xuất ma trận vừa nhập ra màn hình.
    //Kiểm tra ma trận A có phải là ma trận tam giác trên hay không? 
    //Nếu phải, tính định thức (det(A)) của ma trận A. Biết rằng: Ma trận tam giác trên là ma trận có các phần tử nằm dưới đường chéo chính đều bằng 0. 
    
    public static void main(String[] args) {
    int n, max = 10;
    int kt = 1; // là ma trận tam giác trên
    int dinhThuc = 1;
    Scanner scanner = new Scanner(System.in);
         
    do {
        System.out.println("Nhập vào bậc của ma trận: ");
        n = scanner.nextInt();
    } while (n < 0);
         
    int[][] A = new int[n][n];
    System.out.println("Nhập vào các phần tử của ma trận A: ");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print("A[" + i + "]["+ j + "] = ");
            A[i][j] = scanner.nextInt();
        }
    }
         
    System.out.println("Ma trận A: ");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(A[i][j] + "\t");
        }
        System.out.println("\n");
    }
         
    // kiểm tra ma trận A có phải là ma trận tam giác trên hay không?
    // Ma trận tam giác trên là ma trận 
    // có các phần tử nằm dưới đường chéo chính = 0
    // Đặc điểm của các phần tử này là có chỉ số dòng > chỉ số cột
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < i; j++) {
            if (A[i][j] == 0) {
                kt = 1;
            } else {
                kt = 0;
            }
        }
    }
         
    if (kt == 1) {
        System.out.println("Ma trận A là ma trận tam giác trên.");
    } else {
        System.out.println("Ma trận A không là ma trận tam giác trên");
    }
         
    // tính định thức của ma trận trên
    // định thức của ma trận tam giác trên
    // sẽ bằng tích các phần tử nằm trên đường chéo chính
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            // các phần tử nằm trên đường chéo chính
            // có đặc điểm là chỉ số dòng = chỉ số cột
            if (i == j) {
                dinhThuc *= A[i][j];
            }
        }
    }
         
    System.out.println("Định thức của ma trận trên = " + dinhThuc);
    }

    
}
