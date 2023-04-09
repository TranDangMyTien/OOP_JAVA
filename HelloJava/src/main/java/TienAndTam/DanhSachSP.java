/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienAndTam;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/** 
 *
 * @author mytie
 */
public class DanhSachSP {
    //private SanPham sanpham; 
    //Khởi tạo danh sách sản phẩm kiểu SanPham (đối tượng) đặt tên là ds; 
    private List<SanPham> ds = new ArrayList<>();
    private List<KhuyenMai> dskm = new ArrayList<>();
    
    
    
    //Hàm thêm từng sản phẩm vào danh sách 
    public void themSP(SanPham sp) {
        this.ds.add(sp);
    }
    //Nhập thông tin cho từng sản phẩm (nhập lần lượt cho cả danh sách)  
    public void nhapDsSP(int n) throws ParseException {


        SanPham[] SP = new SanPham[n];
        for (int i = 0; i < n; i++) { //Mỗi đơn vị là 1 sản phẩm 
            System.out.printf("Nhap thong tin cho san pham thu %d\n", (i + 1));
            //Khởi tạo đối tượng, đặt tên cho nó là sp 
            SP[i] = new SanPham();
            SP[i].nhapSP(); //Dùng đối tượng . đến hàm nhập thông tin cho từng sản phẩm 
            this.ds.add(SP[i]); //Thêm sản phẩm vào danh sách 
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap so luong khuyen mai(1-3): ");
            int m = sc.nextInt();
            KhuyenMai[] KM = new KhuyenMai[m];
            for (int j = 0; j < m; j++)
            {
                System.out.println("Nhap thong tin cho khuyen mai thu " + (j+1));
                System.out.println("1.Loai A");
                System.out.println("2.Loai B");
                System.out.println("3.Loai C");
                System.out.print("Chon: ");
                int chon = sc.nextInt();
                if(chon == 1) {
                    KM[j] = new LoaiA();
                    KM[j].nhapKM();
                    this.dskm.add(KM[j]);
                    SP[i].themKMChoSP(KM[j]);
                    KM[j].themSPChoKM(SP[i]);
                   
                }
                
                if(chon == 2) {
                    KM[j] = new LoaiB();
                    KM[j].nhapKM();
                    this.dskm.add(KM[j]);
                    SP[i].themKMChoSP(KM[j]);
                    KM[j].themSPChoKM(SP[i]);

                    
                }
                
                if(chon == 3) {
                    KM[j] = new LoaiC();
                    KM[j].nhapKM();
                    this.dskm.add(KM[j]);
                    SP[i].themKMChoSP(KM[j]);
                    KM[j].themSPChoKM(SP[i]);
                    
                }
            }
        
        }




    }
    
    public void xuatDsSP() {
        System.out.println("======= Danh sach san pham la =========");
            this.ds.forEach(s -> s.hienThiSP());
            System.out.println("-----------------");
    }
    public void xuatDsKM() {
        System.out.println("======= Danh sach khuyen mai la =========");
            this.dskm.forEach(s -> s.hienthiKM());
    }
    
    public void xoaKMHetHan() throws ParseException {
        KhuyenMai km = null;
        for(KhuyenMai s: dskm){
            if(s.kiemTraHSD() == 1){
                km = s;
            }  
        }
                
        if(km != null) { 
            dskm.removeAll(Arrays.asList(km));            
        }   
        else
            System.out.println("Khong co khuyen mai nao het han");
            
                
     
    }
    
    
    //Hàm tra cứu sản phẩm thông qua id, trả về kiểu SanPham (đối tượng)
    public SanPham traCuuID(int id) { //id mỗi sản phẩm chỉ có 1 nên không cần tạo mảng để chứa 
        for (SanPham sp: this.ds) //Hàm for-each (nâng cao của for) 
            if (sp.getId() == id) //Nếu id nhập vào có xuất hiện trong mảng thì xuất thông tin ra 
                return sp;
        return null; //Tìm ko thấy trả về null 
    }
    
    //Hàm tra cứu theo từ khóa trong tên sản phẩm 
    public List<SanPham> traCuuTuKhoa(String tuKhoa) { //Tên sản phẩm có thể trùng nhau nên tạo mảng để chứa thôn tin từng cái 
        return this.ds.stream().filter(s->s.getTenSP().contains(tuKhoa)).collect(Collectors.toList());

    }
    
    
    
    //Hàm tra cứu theo khoảng giá trị sản phẩm 
    public List<SanPham> traCuuGiaTri(double bd, double kt){ //Nhiều sản phẩm nằm khoảng giá trị nên tạo mảng để chứa thông tin sản phẩm
        return this.ds.stream().filter(s -> s.getGiaSP() >= bd && s.getGiaSP() <= kt).collect(Collectors.toList());

    }
    public void outputLoaiA()
    {
        for(KhuyenMai e:dskm)
        {
            if(e instanceof LoaiA)
               e.xuatDSSP();
        }
    }
    public void outputLoaiB()
    {
        for(KhuyenMai e:dskm)
        {
            if(e instanceof LoaiB)
               e.xuatDSSP();
        }
    }
    public void outputLoaiC()
    {
        for(KhuyenMai e:dskm)
        {
            if(e instanceof LoaiC)
               e.xuatDSSP();
        }
    }
    
    public void XHieuLuc(double x) throws ParseException
    {
        
        for(KhuyenMai s: dskm)
        {
            if(s.tinhNgayChenhLech()==x)
                s.xuatDSSP();
        }
    }
  
    
    /**
     * @return the ds
     */
    public List<SanPham> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<SanPham> ds) {
        this.ds = ds;
    }

    /**
     * @return the dskm
     */
    public List<KhuyenMai> getDskm() {
        return dskm;
    }

    /**
     * @param dskm the dskm to set
     */
    public void setDskm(List<KhuyenMai> dskm) {
        this.dskm = dskm;
    }
    
}
