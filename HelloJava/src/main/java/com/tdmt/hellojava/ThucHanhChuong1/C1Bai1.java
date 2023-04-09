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
public class C1Bai1 {
    public static void main(String[] args) { //Xem như hàm main 
        int n = (int) (Math.random() * 100 + 1); //Random tạo ra số từ 1 - 100 

        Scanner sc = new Scanner(System.in); 
        //Khai báo đối tượng Scanner, giúp chúng ta nhận thông tin từ keyboard

        int x;
        do {
            System.out.print("Nhap so ban doan x = ");
            x = sc.nextByte();

            if (x < n) {
                System.out.println("So ban doan nho hon!!!");
            } else if (x > n) {
                System.out.println("So ban doan lon hon!!!");
            } else {
                System.out.println("CHINH XAC!!!");
            }
        } while (x != n);

    }
}
