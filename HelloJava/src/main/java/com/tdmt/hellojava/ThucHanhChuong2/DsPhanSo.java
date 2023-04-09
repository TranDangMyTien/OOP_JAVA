/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdmt.hellojava.ThucHanhChuong2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mytie
 */
//CHƯA TẠO HÀM MAIN      
public class DsPhanSo {
    //Khai báo thuộc tính nên dùng private 
    //Static dùng chung ==> ảnh hưởng chung 
    //final tạo ra và ko được thay đổi về sau 
    
    private static final Scanner sc = new Scanner(System.in);//Nhớ import 
    //Tạo 1 danh sách ArrayList kiểu PhanSo (đối tượng), đặt tên danh sách là ds 
    //Chưa có số lượng cụ thể () để trống 
    private ArrayList<PhanSo> ds = new ArrayList<>(); //Nhớ import 
    
    /**
     * Them phan so co san
     * @param p: phan so can them 
     */
    public void themPhanSo(PhanSo p) { //Thêm 1 phân số vào danh sách (chưa biết cụ thể)
        this.ds.add(p); //p đại diện cho 1 phân số 
        //Cú pháp thêm lá ds.add(đối tượng cần thêm)
    }
    
    /**
     * Nhap phan so can them
     */
    public void themPhanSo() { //Hàm thêm 1 phân số vào danh sách 
        System.out.print("Tu so = ");
        int t = sc.nextInt();
        System.out.print("Mau so = ");
        int m = sc.nextInt();
        //Tạo đối tượng PhanSo và đặt tên là p
        //Gán cho đối tượng này gía trị tử số và mẫu số 
        PhanSo p = new PhanSo(t, m);
        this.ds.add(p); //Thêm vào danh sách phân số đó 
    }
    //Hàm xóa 1 phân số (nhưng chưa cụ thể) 
    public void xoaPhanSo(PhanSo p) {
        this.ds.remove(p);
    }
    
    //Hàm xóa 1 phân số cụ thể 
    public void xoaPhanSo(int tu, int mau) {
        PhanSo p = new PhanSo(tu, mau);
        for (PhanSo q: this.ds)
            if (q.soSanh(p) == 0) { //Kiểm tra, nếu là phân số cần xóa thì mới xóa 
                this.ds.remove(q); //Xóa phân số q ra khỏi danh sách 
                break; //Dừng lại 
            }
    }
    //Cú pháp xóa ra khỏi danh sách là ds.remove(Phần tử cần xóa)
    
    public void sapXep() { //PHẦN NÀY CHƯA HIỂU 
        this.ds.sort((p, q) -> p.soSanh(q));
    }
    
    public PhanSo timMax() { //CHƯA HIỂU 
        return this.ds.stream().max((p, q) -> p.soSanh(q)).get();
    }
    
    public PhanSo tong() { //CHƯA HIỂU 
        return this.ds.stream().reduce(new PhanSo(), (t, p) -> t.cong(p));
        
//        PhanSo t = new PhanSo();
//        for (PhanSo p: this.ds)
//            t = t.cong(p);
//        
//        return t.rutGon();
    }
    
    public void hienThi() {
        // c1
//        for (PhanSo p: this.ds)
//            p.hienThi();
//        System.out.println();
        
        // c2
        this.ds.forEach(p -> p.hienThi());
        System.out.println();
    }

    /**
     * @return the ds
     */
    public ArrayList<PhanSo> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(ArrayList<PhanSo> ds) {
        this.ds = ds;
    }
    
}
