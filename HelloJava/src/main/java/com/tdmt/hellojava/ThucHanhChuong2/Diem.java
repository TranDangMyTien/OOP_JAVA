/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdmt.hellojava.ThucHanhChuong2;

/**
 *
 * @author mytie
 */
public class Diem {
    private double hoanhDo;//Khởi tạo thuộc tính 
    private double tungDo; //Thuộc tính thường mang kiểu private 
    public Diem(double hoanhDo, double tungDo){ //Hàm khởi tạo có đối số 
     this.hoanhDo = hoanhDo;
     this.tungDo = tungDo;
    }
    
    //Hàm hiển thì thì dùng chung nên dùng stactic
    public void hienThi(){ //Khởi tạo hàm hiển thị 
        System.out.printf("(%.1f, %.1f)", hoanhDo, tungDo);  
        System.out.println();
    }
    public double tinhKhoangCach(Diem d){ 
        // (hoanhDo, tungDo) và (d.hoanhDo, d.tungDo)
        return Math.sqrt(Math.pow(hoanhDo - d.hoanhDo, 2) + Math.pow(tungDo-d.tungDo,2));
    }
    /**
     * 
     * @return hoanhDo
     */
    public double getHoanhDo(){
        return hoanhDo;
    }
    /**
     * 
     * @param hoanhDo 
     */
    public void setHoanhDo(double hoanhDo){
        this.hoanhDo = hoanhDo;
    }
    /**
     * 
     * @return tungDo 
     */
    public double getTungDo(){
        return tungDo;
    }
    public void setTungDo(double tungDo){
        this.tungDo = tungDo;
    }
    
}
