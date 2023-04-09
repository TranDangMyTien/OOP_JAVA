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
public class KhachSan {
    private int soNgayTro;
    private String loaiPhong;
    private double giaPhong;
    private Nguoi nguoi;  //Khởi tạo thuộc tính - biến kiểu Nguoi (class Nguoi) đặt tên là nguoi. Gần giống như tạo đối tượng Nguoi
    
    //Phương thức khởi tạo - hàm khởi tạo không có đối số 
    //Để nữa thông qua đối tượng KhachSan.lấy cái cần thiết (mà ko cần truyền tham số)
    //Thông thường nó sẽ được mặc định tạo nếu như trong class không có hàm khởi tạo nào
    //Khi đã có một hàm khởi tạo có đối số trong class gòi thì hàm khởi tạo ko có đối số sẽ ko được mặc định tạo ra 
    public KhachSan() { //Không đối số 
        super(); 
    }
    //Hàm khởi tạo có đối số 
    public KhachSan(int soNgayTro, String loaiPhong, double giaPhong, Nguoi nguoi) {
        super();
        this.soNgayTro = soNgayTro;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
        this.nguoi = nguoi;
    }
    //Hàm getter lấy biến kiểu Nguoi (class)
    public Nguoi getNguoi() {
        return nguoi;
    }
    //Hàm setter thay đổi (gán) biến kiểu Nguoi (class)
    public void setNguoi(Nguoi nguoi) {
        this.nguoi = nguoi;
    }
    public void nhapThongTinCanQuanLy() {
        Scanner scanner = new Scanner(System.in);
         
        // nhập thông tin khách trọ
        nguoi = new Nguoi();
        nguoi.nhapThongTinKhachTro();
         
        System.out.print("Nhập số ngày trọ: ");
        //ÉP KIỂU VỀ KIỂU INT 
        //Integer.parseInt(scanner.nextLine());
        soNgayTro = Integer.parseInt(scanner.nextLine()); //Ném ngoại lệ (phòng hờ người nhập sai)
        
        System.out.print("Nhập loại phòng: ");
        loaiPhong = scanner.nextLine();
        System.out.print("Nhập giá phòng: ");
        giaPhong = scanner.nextDouble();
    }
    //Hàm hiển thị thông tin của 1 khách hàng và những nội dung thêm 
    public void hienThiThongTinCanQuanLy() {
        nguoi.hienThiThongTinKhachTro();
        System.out.println("Số ngày trọ: " + soNgayTro);
        System.out.println("Loại phòng: " + loaiPhong);
        System.out.println("Giá phòng: " + giaPhong);
    }
    //Hàm tính tiên trọ 
    public double tinhTien() {
        return soNgayTro * giaPhong;
    }
}
