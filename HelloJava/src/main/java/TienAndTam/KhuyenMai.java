/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienAndTam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mytie
 */
public class KhuyenMai {
    protected String maKM;
    
    private String ngayTao;
    
    private String ngayHetHan;
    
    private List<SanPham> SP = new ArrayList<>();
    
    Scanner sc= new Scanner(System.in);
    
    
    
    public KhuyenMai(String maKM, String ngayTao, String ngayHetHan) {
        this.maKM = maKM;
        this.ngayTao = ngayTao;
        this.ngayHetHan = ngayHetHan;
    }

    
    

    public KhuyenMai() {
        super();
    }
   
    
    
    
    public void nhapKM()  
    {   
       
        System.out.print("Nhap ngay tao: ");
        this.ngayTao = sc.nextLine();
        System.out.print("Nhap ngay het han: ");
        ngayHetHan=sc.nextLine();
    }
    public void hienthiKM(){
        System.out.printf("Ma khuyen mai: %s\n", this.maKM);
        System.out.printf("Ngay tao: %s\n", this.ngayTao);
        System.out.printf("Ngay het han: %s\n", this.ngayHetHan); 
    }
    
    
    
    
    
    
    public void themSPChoKM(SanPham... s) {
        this.SP.addAll(Arrays.asList(s));
    }
    public void xuatDSSP() {
        System.out.println("======= Danh sach hien tai la =========");
        this.SP.forEach(s->s.hienThiSP());
    }
    
    
    
    
    public double tinhNgayChenhLech() throws ParseException{
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");

       
            Date bd = f.parse(ngayTao);
            Date kt = f.parse(ngayHetHan);
            
            long start = bd.getTime();
            long end = kt.getTime();
            double kq = (Math.abs(start - end) / 1000 / 60 / 60/ 24) ;

        return kq;

    }
    public int kiemTraHSD() throws ParseException {
        Date today = new Date();
        today.getTime();
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        Date hsd = f.parse(ngayHetHan);
        String st = f.format(today);
        if (hsd.compareTo(today) < 0) {
            System.out.println("Hom nay la ngay " + st + ", khuyen mai da het han ");
            return 1;
        } else {
            System.out.println("Hom nay la ngay " + st + ", khuyen mai van con han ");
            return 0;
        }
    }
    
    




    
    
    
    /**
     * @return the maKM
     */
    public String getMaKM() {
        return maKM;
    }

    /**
     * @param maKM the maKM to set
     */
    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    /**
     * @return the ngayTao
     */
    public String getNgayTao() {
        return ngayTao;
    }

    /**
     * @param ngayTao the ngayTao to set
     */
    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    /**
     * @return the ngayHetHan
     */
    public String getNgayHetHan() {
        return ngayHetHan;
    }

    /**
     * @param ngayHetHan the ngayHetHan to set
     */
    public void setNgayHetHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    /**
     * @return the SP
     */
    public List<SanPham> getSP() {
        return SP;
    }

    /**
     * @param SP the SP to set
     */
    public void setSP(List<SanPham> SP) {
        this.SP = SP;
    }
}
