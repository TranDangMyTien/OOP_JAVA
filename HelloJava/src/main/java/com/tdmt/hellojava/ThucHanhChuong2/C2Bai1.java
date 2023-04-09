/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdmt.hellojava.ThucHanhChuong2;

import java.util.stream.Stream;

/**
 *
 * @author mytie
 */
public class C2Bai1 {
    public static void main(String[] args) throws Exception { //Xem như hàm main trong C++
        //Tạo đối tượng 1 và gán giá trị luôn 
        Diem d1 = new Diem(5,8);
        d1.hienThi();
        //Tạo đối tượng 2 và gán giá trị luôn 
        Diem d2 = new Diem(8,7);
        d2.hienThi();
        //Tạo biến - thuộc tính 
        double kc = d1.tinhKhoangCach(d2);
        System.out.printf("Khoang cach = %.2f",kc);
        
        DoanThang dt1 = new DoanThang(d1,d2);
        dt1.hienThi(); //Hàm hienThi của d1 d2 và dt1 là khác nhau. Cái là điểm, cái là đoạn thẳng 
        double dd = dt1.tinhDoDai();
        Diem td = dt1.timTrungDiem();
        System.out.print("Trung diem cua doan thang la: ");
        td.hienThi(); //hienThi của điểm ko phải đoạn thẳng 
        
        DoanThang dt2 = new DoanThang(new Diem(1, 0), new Diem(0, 1));
        DoanThang dt3 = new DoanThang(new Diem(2, 0), new Diem(0, 2));
        
        if (dt2.isSongSong(dt3)== true)
            System.out.println("\nSONG SONG");
        else
            System.out.println("\nKHONG");
        
        HinhChuNhat hcn = new HinhChuNhat(new Diem(1, 5), new Diem(7, 2));
        System.out.println("Dien tich hinh chu nhat: " + hcn.tinhDienTich());
        
        System.out.println("=== STREAM ====");
        DoanThang[] a = {dt1, dt2, dt3};
        
        Stream.of(a).forEach(x -> x.hienThi());
        System.out.println("Doan thang dai nhat");
        Stream.of(a).max((dt11, dt22) -> {
            double dai1 = dt11.tinhDoDai();
            double dai2 = dt22.tinhDoDai();
            
            if (dai1 > dai2)
                return 1;
            else if (dai1 < dai2)
                return -1;
            return 0;
        }).get().hienThi();
    }
    
}
