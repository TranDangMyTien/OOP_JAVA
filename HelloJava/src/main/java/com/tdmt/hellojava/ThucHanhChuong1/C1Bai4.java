/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdmt.hellojava.ThucHanhChuong1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mytie
 */
public class C1Bai4 {
    //Hàm - Phương thức nhập mảng cótham số đầu vào  
    //static: dùng chung 
    //hàm trả về kiểu mảng 
    public static int[] nhapMang(int n){
       Scanner sc = new Scanner(System.in); //Khởi tạo cho người dùng nhập 
       int[] a = new int[n]; //Khởi tạo mảng a và cấp phát số lượng phần tử cho nó 
       for (int i = 0 ; i < n ; i++)
       {
           System.out.printf("a[%d] = ",i); //Xuất ra a[i]
           a[i] = sc.nextInt();//Nhập giá trị kiểu số nguyên cho phần tử mảng 
       }
       return a;
    }
    //Hàm - phương thức xuất mảng có tham số đầu vào 
    public static void xuatMang(int[] a){
        for (int x : a ) //Hàm nâng cao của for 
        {
            System.out.printf("%d \t", x);
        }
        System.out.println();//Xuống hàng 
    }
    
    //Hàm = phương thức kiểm tra số nguyên tố 
    public static boolean isNt(int a){
        if (a >= 2){
            for (int i = 2; i <= Math.sqrt(a); i++){
            if (a % i == 0 )
                return false;
            }
            return true;
        }
        return false;
    }
    //Hàm - phương thức tính tổng nếu nó là số nguyên tố 
    public static int tongNt(int[] a){
        int tong = 0;
        for ( int x: a) //Trường hợp này có thể bỏ dấu { } ở khối if
            if (isNt(x) == true)
                tong += x;
        return tong; 
               
    }
    //Hàm - phương thức tìm số dương lớn nhất, số âm nhỏ nhất 
    public static void minAndMax(int[] a){
        int max = 0; //Khởi tạo và gán giá trị cho thuộc tính - biến 
        int min = 0; 
        for (int x : a){
            if(x > max)
                max = x;
            else if (x < min)
                min = x;
        }
        if (max == 0)
            System.out.println("Max: *");
        else 
            System.out.println("Max: " + max);
        if (min == 0)
            System.out.println("Min: *");
        else 
            System.out.println("Min: " + min);
    }
    //Hàm - phương thức tìm số nguyên tố nhỏ nhất trong mảng 
    public static int minNt(int[] a){
        int min = a[0]; 
        for ( int x : a){
            if(isNt(x) == true)
            {
                if(x < min )
                    min = x;
            }
        }
        return min; 
    }
    //Hàm - phương thức sắp xếp tăng dần 
    public static void sort(int[] a){
        Arrays.sort(a); //Nhớ import 
    }
    
    //Hàm phương thức tìm kiếm bằng binarySearch
    //Trước khi tìm kiếm bằng binarySearch thì phải sắp xếp mảng trước
    public static int binarySearch(int[] a, int x){
        sort(a);
        return Arrays.binarySearch(a,x);
    }
            
            
    
    
    
    
    
    
    public static void main(String[] args) { //Xem như hàm main 
        Scanner sc = new Scanner(System.in);
        //Khởi tạo mảng a và gán giá trị cho nó 
        int[] a = nhapMang(5); //Có thể cho người dùng nhập sl mảng 
        System.out.print("Mang vua nhap la: ");
        xuatMang(a);
        System.out.println("Tong cac so NT = " + tongNt(a));
        System.out.println("So min va max trong mang: ");
        minAndMax(a);
        System.out.println("So nguyen to min trong mang: " + minNt(a));
        System.out.println("Mang sau khi sap xep tang dan: ");
        sort(a);
        xuatMang(a);
        int x;
        System.out.println("Nhap gia tri x de tim vi tri: ");
        x = sc.nextInt();
        System.out.println("Vi tri cua x là: "+binarySearch(a,x));
    }
}
