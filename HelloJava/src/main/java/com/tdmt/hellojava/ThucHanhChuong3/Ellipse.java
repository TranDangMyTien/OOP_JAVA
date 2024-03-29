/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdmt.hellojava.ThucHanhChuong3;

/**
 *
 * @author mytie
 */
public class Ellipse {
    private double bkTrucLon;
    private double bkTrucBe;
    //Phương thức khởi tạo có đối số 
    public Ellipse(double bkTrucLon, double bkTrucBe) {
        this.bkTrucLon = bkTrucLon;
        this.bkTrucBe = bkTrucBe;
    }
    //Phương thức - hàm tính diện tích 
    public double tinhDienTich() {
        return Math.PI * this.bkTrucBe * this.bkTrucLon;
    }
    //Phương thức - hàm tính chu vi 
    public double tinhChuVi() {
        return 2 * Math.PI * Math.sqrt((Math.pow(this.bkTrucBe, 2) + Math.pow(this.bkTrucLon, 2)) / 2);
    }
    //Phương thức - hàm ghi đè, trả về kiểu chuỗi 
    public String layTen() {
        return "Hinh Ellipse";
    }
    
    public void hienThi() {
        System.out.println(this.layTen());
        System.out.printf("Dien tich: %.1f\nChu vi: %.1f\n", this.tinhDienTich(),
                this.tinhChuVi());
    }
    
    
    
    
    
    /**
     * @return the bkTrucLon
     */
    public double getBkTrucLon() {
        return bkTrucLon;
    }

    /**
     * @param bkTrucLon the bkTrucLon to set
     */
    public void setBkTrucLon(double bkTrucLon) {
        this.bkTrucLon = bkTrucLon;
    }

    /**
     * @return the bkTrucBe
     */
    public double getBkTrucBe() {
        return bkTrucBe;
    }

    /**
     * @param bkTrucBe the bkTrucBe to set
     */
    public void setBkTrucBe(double bkTrucBe) {
        this.bkTrucBe = bkTrucBe;
    }
    
    
    
}

