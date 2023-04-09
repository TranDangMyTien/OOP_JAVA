/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdmt.hellojava.BaiTapVeChuoi;

import java.util.Scanner;

/**
 *
 * @author mytie
 */
public class Bai1 {
    //Viết chương trình nhập từ bàn phím một chuỗi không quá 80 ký tự và một ký tự bất kỳ. 
    //Đếm và in ra màn hình số lần xuất hiện của ký tự đó trong chuỗi vừa nhập.
    public static void main(String[] args) {
        String chuoi; //Khai báo chuỗi 
        char kyTu; //Khai báo ký tự 
        int count = 0;
        //Tạo đối tượng cho người nhập 
        Scanner scanner = new Scanner(System.in); //Import 

        // nếu độ dài chuỗi nhập vào còn lớn hơn 80 thì phải nhập lại
        do {
            System.out.println("Nhập vào 1 chuỗi bất kỳ: ");
            chuoi = scanner.nextLine(); //Hàm nhập chuỗi lấy cả ký tự khoảng trắng 
        } while (chuoi.length() > 80); // < 80 thì kết thúc vòng lập 

        System.out.println("Nhập vào ký tự cần đếm số lần xuất hiện: ");
        kyTu = scanner.next().charAt(0); //Hàm nhập ký tự hay từ (khi gặp khoảng trắng và enter là dừng lại)

        /*
         * đếm và in ra số lần xuất hiện của ký tự đó trong chuỗi
         * duyệt từ đầu đến cuối chuỗi
         * nếu có ký tự nào tại vị trí i bằng với ký tự ch thì tăng biến count lên 1
         */
        for (int i = 0; i < chuoi.length(); i++) { //s.length : Hàm đếm độ dài chuỗi (tính từ số 1)
            if (kyTu == chuoi.charAt(i)) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự " + kyTu +
            " trong chuỗi " + chuoi + " = " + count);
    }
}
