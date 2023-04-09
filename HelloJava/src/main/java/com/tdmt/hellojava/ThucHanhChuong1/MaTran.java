/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdmt.hellojava.ThucHanhChuong1;

import java.util.Scanner;

/**
 *
 * @author mytie
 */
public class MaTran {
    private int soHang; //Khai báo thuộc tính 
    private int soCot; //Thuộc tính thường mang kiểu private 
    private int A[][]; //Private dùng cho các hàm cùng class 
    
    public MaTran(){ //Hàm khởi tạo ko có đối số 
    }
    public MaTran(int i,int j){ //Hàm khởi tạo có đối số 
        this.soHang = i;
        this.soCot = j; 
        A = new int[soHang][soCot];
    }
    int getAij(int i, int j ){//Hàm lấy từ private 
        return A[i][j];
    }
    int soVao(){ //Hàm kt số vào có thỏa đk bài, hàm ko trả trị 
        Scanner sc = new Scanner(System.in);
        int so = 0;
        do {            
            so = sc.nextInt();
            if (so <= 0 || so > 100){
                System.out.println("Nhap lai sai. Nhap lai!!");
                so = sc.nextInt();
            }
        } while (so <= 0 || so > 100);
        return so; 
    }
    //Hàm nhập kích thước cho hàng và cột 
    void nhapKichThuoc(){
        System.out.println("Nhap so hang: ");
        soHang = soVao();
        System.out.println("Nhap so cot: ");
        soCot = soVao();
    }
    //Hàm - phương thức gán giá trị cho mảng (1-100) 
    void nhapMt(){
        A = new int[soHang][soCot];
        System.out.println("Nhap ma tran "+ soHang +"x"+ soCot );
        for(int i = 0; i < soHang; i++){
            for (int j = 0; j < soCot; j++){
               // System.out.print("A["+(i+1)+"]["+(j+1)+"=");
                A[i][j]=(int)(Math.random()*100 + 1);
            }
                
        }
    }
    //Hàm - phương thức xuất mảng 
    void xuatMt(){
        for (int i = 0; i < soHang; i++){
            for (int j = 0; j < soCot; j++){
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }
    //Hàm sắp xếp ma trận theo cột 
    void sortCotDecrease() {
        int temp;
        for(int a=0;a<soCot;a++)
            for(int i=1;i<soHang;i++)
                for(int j=0;j<i;j++)
                    if(A[i][a]>A[j][a]) {
                        temp=A[i][a];
                        A[i][a]=A[j][a];
                        A[j][a]=temp;
                    }
    }
    //Hàm kt nguyên tố 
    boolean isPrime(int a) {
        if(a < 2)
            return false;
        for(int i=2;i<=a/2;i++)
            if(a%i ==0)
                return false;
        return true;
    }//Hàm đếm số nguyên tố trong mảng 
    int countPrime() {
        int amount=0;
        for(int i=0;i<soHang;i++)
            for(int j=0;j<soCot;j++)
                if(isPrime(A[i][j]))
                    amount+=1;
        return amount;
    }
    //Hàm tính tổng trên dòng
    
    
    public static void main(String[] args) {
        MaTran a = new MaTran();//Khởi tạo đối tượng 
        a.nhapKichThuoc();
        a.nhapMt();
        a.xuatMt();
        a.sortCotDecrease();
        System.out.println("Ma tran sau khi sap xep la: ");
        a.xuatMt();
        System.out.println("Ma tran co " +a.countPrime() +" so nguyen to!");
        
    }
}
