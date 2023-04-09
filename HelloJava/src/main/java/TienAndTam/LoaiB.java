/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienAndTam;

/**
 *
 * @author mytie
 */
public class LoaiB extends KhuyenMai{
      private static int dem = (int) (Math.random()*9999 + 1000);
      private double tiLeGiamGia;
      
      {
          maKM = String .format("B%04d", dem);
      }

    public LoaiB() {
        super();
    }
    
    @Override
    public void nhapKM() {
        super.nhapKM(); 
        System.out.print("Nhap ti le giam gia (co dv dinh kem) : ");
        tiLeGiamGia = sc.nextDouble();
    }

    @Override
    public void hienthiKM() {
        super.hienthiKM();
        System.out.printf("Ti le giam gia (co dv dinh kem) : %.0f",this.tiLeGiamGia);
        System.out.println("");
        System.out.println("----------------------");
    }

    
    
    
    
    
    
    
    
    /**
     * @return the dem
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @param aDem the dem to set
     */
    public static void setDem(int aDem) {
        dem = aDem;
    }
}
