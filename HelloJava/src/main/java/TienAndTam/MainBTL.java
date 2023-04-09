/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienAndTam;
import java.text.ParseException;
import java.util.Scanner;
/**
 *
 * @author mytie
 */
public class MainBTL {
    public static void main(String[] args) throws ParseException {
        //TẠO MENU 
        Scanner sc = new Scanner(System.in);
        int n, luaChon; //Số lượng sản phẩm 
        DanhSachSP ds1 = new DanhSachSP();
       
       
        do{
            System.out.println("\t \t======MENU======");
            System.out.println("\t  1. Them san pham va khuyen mai vao danh sach");
            System.out.println("\t  2. Tim kiem san pham theo ten");
            System.out.println("\t  3. Tim kiem san pham theo gia");
            System.out.println("\t  4. Tim kiem san pham theo loai KM");
            System.out.println("\t  5. Tim kiem san pham theo ID san pham");
            System.out.println("\t  6. Hien thi khuyen mai theo ten ID san pham");
            System.out.println("\t  7. Hien thi khuyen mai theo ten SP");
            System.out.println("\t  8. Xoa ma khuyen ma het hieu luc khoi san pham");
            System.out.println("\t  9. Xem ds KM con x ngay het hieu luc");
            System.out.println("\t \t 0. THOAT ");
            System.out.println("\t \t=================");

            System.out.print("Nhap lua chon cua ban :");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.println("Them san pham vao danh sach !!!");
                    do{ //Kiểm tra n trước 
                        System.out.print("Nhap so luong san pham can quan ly : "); //Nhạp không xuống dòng 
                        n = sc.nextInt();
                        if (n <= 0)
                            System.out.println("Nhap so luong san pham > 0 !!");
                    } while (n <= 0);
                    ds1.nhapDsSP(n);
                    ds1.xuatDsSP();
                    ds1.xuatDsKM();
                break;
                 case 2:
                    System.out.println("Tim kiem san pham theo ten !!!");
                    System.out.print("Nhap ten san pham de tim kiem: ");
                    sc.nextLine();
                    String tuKhoa = sc.nextLine();
                    ds1.traCuuTuKhoa(tuKhoa).forEach(s->s.hienThiSP());
                    
                break;
                 case 3:
                    System.out.println("Tim kiem san pham theo khoang gia !!!");
                    double giaTribd, giaTrikt;
                    System.out.print("Nhap gia tri bat dau : ");
                    giaTribd = sc.nextDouble();
                    System.out.print("Nhap gia tri ket thuc : ");
                    giaTrikt = sc.nextDouble(); 
                    ds1.traCuuGiaTri(giaTribd, giaTrikt).forEach(s->s.hienThiSP());
                    
                break;
                 case 4:
                     System.out.println("Tim kiem theo loai KM!!!");
                     System.out.print("Chon loai khuyen mai can tim kiem (1.Loai A   2.Loai B   3.Loai C): ");
                     int loai= sc.nextInt();
                     if(loai == 1) 
                         ds1.outputLoaiA();
                     else if(loai == 2) 
                         ds1.outputLoaiB();
                     else 
                         ds1.outputLoaiC();
       
                break;
                 case 5:
                     System.out.println("Tim kiem san pham theo ID san pham!!!");
                     System.out.print("Nhap ID de tim san pham : ");
                     int id = sc.nextInt();
                     System.out.println("San pham tim duoc la : ");
                     ds1.traCuuID(id).hienThiSP();
                     
                break;
                 
                 case 6:
                     System.out.print("Nhap id san pham: ");
                     int iD = sc.nextInt();
                     ds1.traCuuID(iD).xuatDSKM();
                break;
                 case 7:
                     System.out.print("Nhap ten san pham: ");
                     sc.nextLine();
                     String ten = sc.nextLine();
                     ds1.traCuuTuKhoa(ten).forEach(s->s.xuatDSKM()); 
                break;
                 case 8: {
                     ds1.xoaKMHetHan();
                     ds1.xuatDsKM();
                 }
                 case 9:
                     System.out.println("Danh sach khuyen mai con X ngay het han!!!");
                     System.out.print("Nhap ngay xet: ");
                     double ngay= sc.nextInt();
                     ds1.XHieuLuc(ngay);

                break;
                default:
                    luaChon = 0;
            }
        } while(luaChon != 0);
        
        
        
        
    }
}
