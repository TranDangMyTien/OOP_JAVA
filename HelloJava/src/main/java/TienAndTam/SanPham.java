/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienAndTam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author mytie
 */
public class SanPham {
    private static int dem; //Mã số sản phẩm tăng dần theo số sản phẩm 
    private String tenSP;
    private double giaSP;
    private int id; //Mã sản phẩm, số nguyên tăng dần 
    Scanner sc = new Scanner(System.in); //Tạo đối tượng để người dùng nhập thông tin từ bàn phím 
    
    private List<KhuyenMai> KM = new ArrayList<>();
    
    //THỬ 
    //private List<LoaiA> KMA = new ArrayList<>();
    
    {
       id = ++dem; //Id tăng dần theo số lượng sản phẩm 
    }
    
    public SanPham(){ //Hàm khởi tạo không tham số 
        
    }
    
    public SanPham(String tenSP, double giaSP, int id, List<KhuyenMai> km) {
        this.tenSP = tenSP;
        this.giaSP = giaSP;
        this.id = id;
        this.KM=km;

    }
    
    //Hàm nhập từng sản phẩm 
    public  void nhapSP(){
        System.out.print("Nhap ten san pham : "); //Không xuống dòng 
        this.tenSP = sc.nextLine();
        System.out.print("Nhap gia san pham : "); //Không xuống dòng 
        this.giaSP = sc.nextInt();
    }
    
    //Hàm hiển thị 1 sản phầm khi cần trích xuất 
    public void hienThiSP(){
        System.out.printf("Ma san pham %d\n", this.id);
        System.out.printf("Ten san pham %s\n", this.tenSP);
        System.out.printf("Gia san pham %f\n", this.giaSP);
    }
    
    
    
    
    public void themKMChoSP(KhuyenMai... s) {
        this.KM.addAll(Arrays.asList(s));
    }
    public void xuatDSKM() {
        this.KM.forEach(s->s.hienthiKM());
    }
    
    
   
    
    
    
    public List<KhuyenMai> TimKiemKM(String ma) { 
        return this.KM.stream().filter(s->s.getMaKM().contains(ma)).collect(Collectors.toList());
    }
    /**
     * @return the dem
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @param Dem the dem to set
     */
    public static void setDem(int Dem) {
        dem = Dem;
    }

    /**
     * @return the tenSP
     */
    public String getTenSP() {
        return tenSP;
    }

    /**
     * @param tenSP the tenSP to set
     */
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    /**
     * @return the giaSP
     */
    public double getGiaSP() {
        return giaSP;
    }

    /**
     * @param giaSP the giaSP to set
     */
    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
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
     * @return the KM
     */
    public List<KhuyenMai> getKM() {
        return KM;
    }

    /**
     * @param KM the KM to set
     */
    public void setKM(List<KhuyenMai> KM) {
        this.KM = KM;
    }

    
}
 