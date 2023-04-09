/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdmt.hellojava.ThucHanhChuong2;

/**
 *
 * @author mytie
 */
public class HinhChuNhat {
    private Diem trenTrai; //Khai thuộc tính kiểu Diem; Diem là đối tượng 
    private Diem duoiPhai;
    public HinhChuNhat(Diem trenTrai, Diem duoiPhai) throws Exception {
        if (duoiPhai.getHoanhDo() > trenTrai.getHoanhDo() 
                && trenTrai.getTungDo() > duoiPhai.getTungDo()) {
            this.trenTrai = trenTrai;
            this.duoiPhai = duoiPhai;
        } else
            throw new Exception("Invalid Data!!!");
    }
    //Hàm tính tích diện tích và chu vi 
    public double tinhDienTich() {
        double cr = duoiPhai.getHoanhDo() - trenTrai.getHoanhDo();
        double cd = trenTrai.getTungDo() - duoiPhai.getTungDo();
        
        return cd * cr;
    }

    /**
     * @return the trenTrai
     */
    public Diem getTrenTrai() {
        return trenTrai;
    }

    /**
     * @param trenTrai the trenTrai to set
     */
    public void setTrenTrai(Diem trenTrai) {
        this.trenTrai = trenTrai;
    }

    /**
     * @return the duoiPhat
     */
    public Diem getDuoiPhai() {
        return duoiPhai;
    }

    /**
     * @param duoiPhat the duoiPhat to set
     */
    public void setDuoiPhai(Diem duoiPhai) {
        this.duoiPhai = duoiPhai;
    }
}
