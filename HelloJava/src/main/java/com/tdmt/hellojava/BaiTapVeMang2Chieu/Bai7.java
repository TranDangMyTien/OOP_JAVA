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
public class Bai7 {
    //Thực hiện phép nhân hai ma trận và tìm ma trận chuyển vị của ma trận tích vừa tính được.
    //Tạo 2 ma trận hai chiều A và B có kích thước lần lượt là m1 * n1 và m2 * n2 (với m1, n1, m2, n2 > 0), 
    //giá trị của các phần tử được nhập từ bàn phím. Xuất 2 ma trận vừa nhập ra màn hình.
    
    //Tính và in ra màn hình ma trận C = A * B. 
    //Lưu ý: Điều kiện để ma trận A nhân được với ma trận B là số cột của ma trận A bằng số dòng của ma trận B.
    
    //Nếu tồn tại ma trận tích C, hãy tìm ma trận D là ma trận chuyển vị của ma trận C. 
    //Biết rằng: Ma trận D = CT là ma trận chuyển vị của ma trận C nếu các hàng của ma trận C trở thành các cột của ma trận D và ngược lại. Tức Dij = Cji.

    public static void main(String[] args) {
    int m1, n1; // số dòng và số cột của ma trận A
    int m2, n2; // số dòng và số cột của ma trận B
    char choose;
    Scanner scanner = new Scanner(System.in);
         
    System.out.println("Nhập vào số dòng của ma trận A: ");
    m1 = scanner.nextInt();
    System.out.println("Nhập vào số cột của ma trận A: ");
    n1 = scanner.nextInt();
         
    System.out.println("Nhập vào số dòng của ma trận B: ");
    m2 = scanner.nextInt();
    System.out.println("Nhập vào số cột của ma trận B: ");
    n2 = scanner.nextInt();
         
    int[][] A = new int[m1][n1];
    int[][] B = new int[m2][n2];
         
    // ma trận tích C = A * B
    // sẽ có số dòng là số dòng của ma trận A
    // và số cột là số cột của ma trận B
    int C[][] = new int[m1][n2];
         
    while (m1 > 0 && n1 > 0 && m2 > 0 && n2 > 0) {
        if (n1 != m2) {
            System.out.println("Để nhân hai ma trận thì "
                    + "số cột của ma trận A phải bằng số dòng của ma trận B");
            System.out.println("Nhập lại số cột của ma trận A: ");
            n1 = scanner.nextInt();
            System.out.println("Nhập vào số dòng của ma trận B: ");
            m2 = scanner.nextInt();
        } else {
            // nhập giá trị của các phần tử cho 2 ma trận A
            System.out.println("Nhập vào các phần tử của ma trận A: ");
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n1; j++) {
                    System.out.print("A[" + i + "]["+ j + "] = ");
                    A[i][j] = scanner.nextInt();
                }
            }
                 
            // nhập giá trị của các phần tử cho 2 ma trận B
            System.out.println("Nhập vào các phần tử của ma trận A: ");
            for (int i = 0; i < m2; i++) {
                for (int j = 0; j < n2; j++) {
                    System.out.print("B[" + i + "]["+ j + "] = ");
                    B[i][j] = scanner.nextInt();
                }
            }
                 
            // hiển thị 2 ma trận vừa nhập
            System.out.println("Ma trận A: ");
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n1; j++) {
                    System.out.print(A[i][j] + "\t");
                }
                System.out.println("\n");
            }
             
            System.out.println("Ma trận B: ");
            for (int i = 0; i < m2; i++) {
                for (int j = 0; j < n2; j++) {
                    System.out.print(B[i][j] + "\t");
                }
                System.out.println("\n");
            }
             
            // tính và in ra ma trận C = A * B
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n2; j++) {
                    C[i][j] = 0;
                    for (int k = 0; k < n1; k++) {
                        C[i][j] = C[i][j] + A[i][k] * B[k][j];
                    }
                }
            }
             
            // hiển thị ma trận tích C
            System.out.println("Ma trận tích C: ");
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n2; j++) {
                    System.out.print(C[i][j] + "\t");
                }
                System.out.println("\n");
            }
                 
 
            // tìm ma trận D là ma trận chuyển vị của ma trận C
            // ma trận D là ma trận chuyển vị của ma trận C
            // thì các dòng của ma trận C sẽ trở thành
            // các cột của ma trận D và ngược lại
            // ví dụ: ma trận C có số dòng m1 = 3 và số cột n2 = 4 thì
            // ma trận D sẽ có số dòng n2 = 4 và số cột m1 = 3
            int D[][] = new int[n2][m1];
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n2; j++) {
                    D[j][i] = C[i][j];
                }
            }
                 
            // hiển thị ma trận D
            System.out.println("Ma trận chuyển vị của ma trận C là: ");
            for (int i = 0; i < n2; i++) {
                for (int j = 0; j < m1; j++) {
                    System.out.print(D[i][j] + "\t");
                }
                System.out.println("\n");
            }
                 
            System.out.println("Bạn có muốn tiếp tục không? Bấm y để tiếp tục, n để thoát!");
            choose = scanner.next().charAt(0);
            if (choose == 'y') {
                continue;
            } else {
                System.out.println("Goodbye!");
                break;
            }
        }
 
    }
    }
    
    
}
