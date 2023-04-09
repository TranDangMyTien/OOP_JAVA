/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienAndTam;

/**
 *
 * @author mytie
 */
public class LoaiC extends KhuyenMai{
    private static int dem;
    //Scanner sc = new Scanner(System.in);
    private double tiLeGiamGia;
    
      {
          maKM = String .format("C%04d", dem);
      }
      
       
      public LoaiC()
    {
        super();
    }
    @Override
    public void nhapKM() {
        super.nhapKM(); 
        System.out.print("Nhap ti le giam gia (giam 100% khi mua sp thu 2) : ");
        tiLeGiamGia = sc.nextDouble();
    }

    @Override
    public void hienthiKM() {
        super.hienthiKM(); 
        System.out.printf("Ti le giam gia (giam 100 khi mua sp thu 2) : %.0f",this.tiLeGiamGia);
        System.out.println("");
        System.out.println("----------------------");
    }
      
      
      
      
    /**
     * @return the tiLeGiam
     */
    public double getTiLeGiam() {
        return tiLeGiamGia;
    }

    /**
     * @param tiLeGiam the tiLeGiam to set
     */
    public void setTiLeGiam(double tiLeGiam) {
        this.tiLeGiamGia = tiLeGiam;
    }
}
