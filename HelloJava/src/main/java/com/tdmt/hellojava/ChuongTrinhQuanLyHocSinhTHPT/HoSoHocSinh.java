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
public class HoSoHocSinh {
    //Khai báo thuộc tính 
    private String lop;
    private Nguoi nguoi; //Thuộc tính kiểu Nguoi (đối tượng) đặt tên nguoi 
     
    public HoSoHocSinh() {
        super();
    }
 
    public HoSoHocSinh(String lop, Nguoi nguoi) {
        super();
        this.lop = lop;
        this.nguoi = nguoi;
    }
     
    public String getLop() {
        return lop;
    }
 
    public void setLop(String lop) {
        this.lop = lop;
    }
 
    public Nguoi getNguoi() {
        return nguoi;
    }
 
    public void setNguoi(Nguoi nguoi) {
        this.nguoi = nguoi;
    }
    
    //Hàm nhập thông tin 1 học sinh 
    public void nhapThongTinHoSo() {
        nguoi = new Nguoi(); 
        nguoi.nhapThongTin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập lớp: ");
        lop = scanner.nextLine();
    }
     
    public void hienThiThongTinHoSo() {
        nguoi.hienThiThongTin();
        System.out.println("Lớp: " + lop);
    }
    
}
