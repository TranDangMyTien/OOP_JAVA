/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienAndTam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author mytie
 */
public class QuanLyKM {
    private List<KhuyenMai> ds = new ArrayList<>();
    
    
    public void themKM(KhuyenMai... km)
    {
        this.ds.addAll(Arrays.asList(km));
    }
    
   public void outputKM()
   {
       this.ds.forEach(s->s.hienthiKM());
   }

   
   public List<KhuyenMai> TimKiemKMTheoMa(String ma) {
       return this.ds.stream().filter(s->s.getMaKM().contains(ma)).collect(Collectors.toList());
   }
    /**
     * @return the ds
     */
    public List<KhuyenMai> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<KhuyenMai> ds) {
        this.ds = ds;
    }
}
