/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdmt.hellojava.ThucHanhChuong2;

import java.text.ParseException;
import java.util.Date;
import java.util.stream.DoubleStream;

/**
 *
 * @author mytie
 */
public class HocVien {
    private static int dem; //Mã số sinh viên tăng dần theo số học sinh 
    private int id; //Mã số sinh viên 
    private String hoTen;
    private String queQuan;
    private Date ngaySinh; //Kiểu ngày tháng nhưng khi nhập vào nó lại là dạng chuỗi 
    private double[] diem; //Mảng chứa điểm 3 môn của các sinh viên 
    {
        id = ++dem; //Id tăng dần theo số lượng học sinh 
    }
    //Hàm khởi tạo ko chứa tham số 
    public HocVien() {
        
    }
    //Hàm khởi tạo có đối số ==> Tạo đối tượng để trích xuất từng phần của mỗi học sinh
    public HocVien(String hoTen, String queQuan, Date ngaySinh) {
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
    }
    //Hàm khởi tạo có đối số ==> Tạo đối tượng để trích xuất tất cả phần của một học sinh 
    //throws ParseException để dùng f.parse 
    //Nhớ import 
    public HocVien(String hoTen, String queQuan, String ngaySinh) throws ParseException {
         this(hoTen, queQuan, CauHinh.f.parse(ngaySinh));
         //Từ lớp cấu hình . để lấy f . tiếp để dùng parse chuyển kiểu dữ liệu chuỗi thành ngày tháng 
         //f để format nó theo đề bài là ngày/tháng/năm 
     }
    //Hàm nhập họ tên, quê quán, ngày sinh 
    //throws ParseException khi dùng f.parse và nhớ import 
    public void nhapHv() throws ParseException {
        System.out.print("Ho ten = ");
        this.hoTen = CauHinh.sc.nextLine();
        //Nhập họ tên của học sinh gián tiếp qua lớp CauHinh 
        //Thay vì viết sc.nextLine()
        //Viết như vậy thì class HocVien đỡ khai báo Scanner sc = new Scanner(System.in);
        System.out.print("Que quan = ");
        this.queQuan = CauHinh.sc.nextLine();
        System.out.print("Ngay sinh (dd/MM/yyyy) = ");
        this.ngaySinh = CauHinh.f.parse(CauHinh.sc.nextLine());
        //Nhập ngày sinh học sinh bằng gián tiếp qua lớp CauHinh và format nó về kiểu ngày/tháng/năm như bài 
    }
    
    //Hàm nhập điểm cho học sinh (điểm lần lượt của 3 môn)
    public void nhapDiem() {
        //Khởi tạo số lượng cho mảng gián tiếp qua clas CauHinh
        this.diem = new double[CauHinh.SO_MON_HOC];
        for (int i = 0; i < CauHinh.SO_MON_HOC; i++) {
            System.out.printf("Nhap mon thu %d: ", i + 1);
            this.diem[i] = Double.parseDouble(CauHinh.sc.nextLine());
            //mảng diem kiểu double 
            //Nhập điểm gián tiếp qua class CauHinh 
            //Khi nhập nó nhận kiểu string ==> Chuyển đổi thành kiểu double để gán vào mảng điểm 
            //Double.parseDouble(Đối tượng cần chuyển): Chuyển từ string về duoble, không cần 
            //Không cần throws ParseException
        }
    }
    //Hàm tính trung bình điểm của 1 học sinh 
    public double tinhTrungBinh(){
        return DoubleStream.of(this.diem).average().getAsDouble();
    }
    //CHƯA HIỂU VỀ DOUBLESTREAM VÀ GETASDOUBLE 
    
    //Hàm kiểm tra học bổng 
    public boolean isHocBong() {
        for (double d: this.diem)
            if (d < 5)
                return false;
        
        return this.tinhTrungBinh() >= 8;
    }
    
    //Hàm hiển thị 1 học sinh khi cần trích xuất 
    public void hienThi() {
        System.out.printf("Id: %d\n", this.id);
        System.out.printf("Ho ten: %s\n", this.hoTen);
        System.out.printf("Que quan: %s\n", this.queQuan);
        System.out.printf("Ngay sinh: %s\n", CauHinh.f.format(this.ngaySinh));
        if (this.diem != null) {
            for (double d: this.diem) //vòng lập for nâng cao 
                System.out.printf("%.1f\t", d); //In ra 3 cột điểm của 1 học sinh 
            
            System.out.printf("\nDiem trung binh: %.1f\n", this.tinhTrungBinh());
        }
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the queQuan
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * @param queQuan the queQuan to set
     */
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    /**
     * @return the ngaySinh
     */
    public Date getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the diem
     */
    public double[] getDiem() {
        return diem;
    }

    /**
     * @param diem the diem to set
     */
    public void setDiem(double[] diem) {
        this.diem = diem;
    }
    
    
}
