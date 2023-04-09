/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdmt.hellojava.ThucHanhChuong2;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mytie
 */
public class QuanLyHocVien {
    //Khởi tạo danh sách học viên kiêu HocVien(đối tượng) đặt tên là ds; 
    private ArrayList<HocVien> ds = new ArrayList<>();
    //Hàm thêm học viên vào danh sách 
    public void themHv(HocVien h) {
        this.ds.add(h);
    }
    //Nhập thông tin cho từng học viên 
    public void nhapDsHv(int n) throws ParseException {
        for (int i = 0; i < n; i++) { //Mỗi đơn vị là 1 học viên 
            System.out.printf("== Nhap hoc vien thu %d\n", i);
            //Khởi tạo đối tượng, đặt tên cho nó là h 
            HocVien h = new HocVien();
            h.nhapHv(); //Dùng đối tượng . đến hàm nhập học viên 
            this.ds.add(h); //Thêm học viên vào danh sách 
        }
    }
    //Hàm nhập điểm cho một học viên 
    public void nhapDiemDs() {
        this.ds.forEach(h -> {
            System.out.printf("== Nhap diem cho %s\n", h.getHoTen().toUpperCase());
            //h.getHoTen dùng tên đối tượng để trích xuất tới đối tượng và viết in hoa 
            h.nhapDiem(); //Dùng tên đối tượng để truy cập vào hàm nhập điểm cho 1 học sinh (gồm 3 cột điểm)
        });
    }
    //PHẦN FOREACH chưa rõ 
    //Đọc dữ liệu từ file 
    public void docDs() throws FileNotFoundException, ParseException {
        File f = new File("src/main/resources/hocvien.txt");
        try (Scanner sc = new Scanner(f)) { //Khai báo cú pháp đọc file 
            //Đưa nó vào try để cố gắng đọc, vì đôi khi nó ko đọc được file do lỗi gì đó 
            while (sc.hasNext()) { //Kiểm tra nếu file còn tiếp thì đọc 
                HocVien h = new HocVien(); //Khai báo đối tượng, đặt tên là h
                //Phải tạo đối tượng mới ở mỗi hàm riêng biệt khi muốn dùng 
                h.setHoTen(sc.nextLine());
                h.setQueQuan(sc.nextLine());
                h.setNgaySinh(CauHinh.f.parse(sc.nextLine()));
                //Truy cập đến ngày tháng qua lớp CauHinh, chuyển nó về kiểu ngày/tháng/năm như đề bài 
                
                this.ds.add(h); //Thêm đối tượng h vào danh sách 
            }
        }
    }
    
    //Tra cứu học viên thông qua id 
    //Trả về kiểu HocVien 
    public HocVien traCuu(int id) {
        for (HocVien h: this.ds)
            if (h.getId() == id)
                return h;
        return null; //Tìm ko thấy trả về null 
    }
    
    
    //Hàm tra cứu theo từ khóa trong họ và tên
    public ArrayList<HocVien> traCuu(String tuKhoa) {
        ArrayList<HocVien> kq = new ArrayList<>(); 
        //Tạo 1 danh sách rỗng chứa các học viên tra cứu được 
        
        for (HocVien h: this.ds) //Vòng lập for-each 
            if (h.getHoTen().contains(tuKhoa) == true)
                kq.add(h);
        
        return kq; //
    }
    
    
    //Hàm tra cứu học viên có học bỗng 
    public ArrayList<HocVien> traCuu() {
        ArrayList<HocVien> kq = new ArrayList<>();
        //Khởi tạo danh sách chứa các thông tin học viên tìm được 
        //Dach sách kiểu HocVien (đối tượng)
        for (HocVien h: this.ds) //Vòng lập for-each 
            //Cú pháp vòng lập for-each 
            //for (kiểu dữ liệu tên biến: mảng/danh sách) 
            if (h.isHocBong() == true) //Nếu như có học bổng 
                kq.add(h); //Thêm học viên vào danh sách 
        
        return kq;
    }
    
    
    //Hàm hiển thị nguyên danh sách học viên 
    public void hienThi() {
        this.ds.forEach(h -> h.hienThi()); //Hàm forEach xuất danh sách học viên 
        //h.hienThi trả về thông tin của 1 học viên 
    }
    
    //Hàm sắp xếp danh sách học viên theo điểm trung bình 
    public void sapXep() { //Hàm này chưa hiểu lắm 
        this.ds.sort((h1, h2) -> {
            double tb1 = h1.tinhTrungBinh();
            double tb2 = h2.tinhTrungBinh();
            
            if (tb1 > tb2)
                return 1;
            else if (tb1 < tb2)
                return -1;
            return 0;
        });
    }/**
     * @return the ds
     */
    public ArrayList<HocVien> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(ArrayList<HocVien> ds) {
        this.ds = ds;
    }
    
    //CHƯA VIẾT HÀM MAIN 
    
    
    
}
