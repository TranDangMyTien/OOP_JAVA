/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdmt.hellojava.ChuongTrinhQuanLyHocSinhTHPT;

import java.util.Scanner;

/**
 *
 * @author mytie
 */
public class Nguoi {
    //Khai báo thuộc tính - biến 
    private String hoTen;
    private String gioiTinh;
    private String queQuan;
    
    //Hàm khởi tạo không đối số 
    public Nguoi() {
        super();
    }
    //Hàm khởi tạo có đối số 
    public Nguoi(String hoTen, String gioiTinh, String queQuan) {
        super();
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
    }
     
    public String getQueQuan() {
        return queQuan;
    }
 
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên học sinh: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        gioiTinh = scanner.nextLine();
        System.out.print("Nhập quê quán: ");
        queQuan = scanner.nextLine();
    }
     
    public void hienThiThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Quê quán: " + queQuan);
    }
}
