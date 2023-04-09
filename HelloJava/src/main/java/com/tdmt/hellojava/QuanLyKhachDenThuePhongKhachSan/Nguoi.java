/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdmt.hellojava.QuanLyKhachDenThuePhongKhachSan;

import java.util.Scanner;

/**
 *
 * @author mytie
 */
public class Nguoi {
    private String hoTen;
    private String soCMND;
    private String queQuan;
    
    
    //Hàm khởi tạo - phương thức khởi tạo 
    public Nguoi() {
        super(); //Không ghi cũng được, ghi ra thì nó tường minh 
        //Không ghi compiler nó cũng gọi 
    }
     
    public Nguoi(String hoTen, String queQuan, String soCMND) {
        super();
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.soCMND = soCMND;
    }
     public String getSoCMND() {
        return soCMND;
    }
    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }
    //Hàm nhập thông tin 1 khách hàng 
    public void nhapThongTinKhachTro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên khách hàng: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập quê quán: ");
        queQuan = scanner.nextLine();
        System.out.print("Nhập số chứng minh nhân dân: ");
        soCMND = scanner.nextLine();
    }
     //Hàm hiển thị thông tin 1 khách hàng 
    public void hienThiThongTinKhachTro() {
        System.out.println("Họ và tên khách hàng: " + hoTen);
        System.out.println("Quê quán: " + queQuan);
        System.out.println("Số chứng minh nhân dân: " + soCMND);
    }
    
    

}



