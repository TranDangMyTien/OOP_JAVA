/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdmt.hellojava.QuanLyKhachDenThuePhongKhachSan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mytie
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;  // số khách trọ
        KhachSan khachSan; //Khởi tạo biến kiểu KhachSan (class) đặt tên là KhachSan
         
        // tạo 1 ArrayList lưu thông tin khách trọ
        ArrayList<KhachSan> arrKhachSan = new ArrayList<>();
        //ÉP KIỂU VỀ KIỂU INT 
        //Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số lượng khách trọ: ");
        n = Integer.parseInt(scanner.nextLine());
        
        //Tạo vòng lập để nhập thông tin từng khách hàng 
        for (int i = 0; i < n; i++) {
            khachSan = new KhachSan();
            System.out.println("Nhập thông tin khách hàng thứ " + (i+1) + ":");
            khachSan.nhapThongTinCanQuanLy();
            arrKhachSan.add(khachSan); //Thêm lần lượt các thông tin khách hàng vào mảng để quản lý 
        }
         
        // hiển thị danh sách khách trọ
        for (int i = 0; i < arrKhachSan.size(); i++) {
            System.out.println("\nThông tin khách hàng thứ " + (i+1) + ": ");
            arrKhachSan.get(i).hienThiThongTinCanQuanLy();
            //Mảng khách sạn kiểu KhachSan . get (i) để lấy lần lượt thằng i trong mảng ra . để lấy thông tin 
        }
         
        // tính tiền phòng khi khách hàng trả phòng
        System.out.println("\nNhập số chứng minh nhân dân của khách trả phòng: ");
        String tim = scanner.nextLine();
        for (int i = 0; i < arrKhachSan.size(); i++) {
            if (arrKhachSan.get(i).getNguoi().getSoCMND().equalsIgnoreCase(tim)) {
                //Tìm thấy thông tin cmdn của khách hàng, thấy thì mới tính tiền 
                //Mảng khách sạn . get (i) để lấy 1 phần tử trong mảng . getNguoi lấy phần thông tin bên class Nguoi . getCMDN để lấy phần thông tin 
                //cmnd của phần tử thứ i ra . equalsIgnoreCase để so sánh với thông tin mà người dùng nhập 
                //Nhập đúng thì làm tiếp câu lệnh trong if 
                System.out.println("Số tiền phòng = " + arrKhachSan.get(i).tinhTien());
            }
        }
    }
 
}
