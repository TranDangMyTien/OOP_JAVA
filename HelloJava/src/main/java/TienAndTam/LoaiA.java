/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienAndTam;

/**
 *
 * @author mytie
 */
public class LoaiA extends KhuyenMai{
    private static int dem;

    private double tiLeGiamGia;
    
    //List<SanPham> = new Ar
    
    {
        maKM = String.format("A%02d", ++dem);
    }
    public LoaiA()
    {
        super();
    }

    public LoaiA(double tiLeGiamGia, String maKM, String ngayTao, String ngayHetHan) {
        super(maKM, ngayTao, ngayHetHan);
        this.tiLeGiamGia = tiLeGiamGia;
    }

    
    
    
    
    @Override
    public void nhapKM() {
        super.nhapKM(); 
        System.out.print("Nhap ti le giam gia: ");
        tiLeGiamGia = sc.nextDouble();
    }

    @Override
    public void hienthiKM() {
        super.hienthiKM(); 
        System.out.printf("Ti le giam gia: %.0f",this.tiLeGiamGia);
        System.out.println("");
        System.out.println("----------------------");
    }
    
    
    
    
    
    
    
    /**
     * @return the tiLeGiamGia
     */
    public double getTiLeGiamGia() {
        return tiLeGiamGia;
    }

    /**
     * @param tiLeGiamGia the tiLeGiamGia to set
     */
    public void setTiLeGiamGia(double tiLeGiamGia) {
        this.tiLeGiamGia = tiLeGiamGia;
    }
}
