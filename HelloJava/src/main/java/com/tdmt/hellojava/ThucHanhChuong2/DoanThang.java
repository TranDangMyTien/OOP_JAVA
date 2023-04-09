/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdmt.hellojava.ThucHanhChuong2;

/**
 *
 * @author mytie
 */
public class DoanThang {
    private Diem a; //Khởi tạo điểm, Điểm ở đây là đối tượng 
    private Diem b; //Private chỉ dử dụng trong lớp đó thôi
    /**
     * Phương thức khởi tạo 2 tham số 
     * @param a: điểm đầu 
     * @param b: điểm cuối 
     */
    public DoanThang(Diem a, Diem b){ //Điểm ở đây là đối tượng 
        this.a = a;
        this.b = b;
    }
    /**
     * 
     * @return a 
     */
    public Diem getA(){ //Phương thức lấy thuộc tính - biến mà private 
        return a;
    }
    /**
     * 
     * @param a 
     */
    public void setA(Diem a){ //Phương thức chỉnh, thay đổi thuộc tính - biến mà private 
        this.a = a;
    }
    /**
     * 
     * @return b
     */
    public Diem getB(){
        return b;
    }
    /**
     * 
     * @param b 
     */
    public void setB(Diem b){
        this.b = b;
    }    
    //Hàm hiển thị điểm của đoạn thẳng 
    public void hienThi(){
        System.out.printf("[(%.1f,%.1f),(%.1f,%.1f)]\n",a.getHoanhDo(),a.getTungDo(), b.getHoanhDo(), b.getTungDo());
    }
    //Hàm tính độ dài đoạn thẳng 
    public double tinhDoDai(){
        return a.tinhKhoangCach(b);
    }
    //Hàm - phương thức tìm trung điểm, dùng đối tượng khá nhiều 
    public Diem timTrungDiem(){
        double x = (a.getHoanhDo() + b.getHoanhDo()) / 2;
        double y = (a.getTungDo() + b.getTungDo()) / 2;
        return new Diem(x,y); //Đối tượng 
    }
    //Hàm - phương thức kiểm tra song song 
    public boolean isSongSong(DoanThang dt){
         double vt = (a.getHoanhDo() - b.getHoanhDo())*(dt.getA().getTungDo() - dt.getB().getTungDo());
        double vp = (a.getTungDo()- b.getTungDo())*(dt.getA().getHoanhDo()- dt.getB().getHoanhDo());
        
        return vt == vp; //Nếu hai vế bằng nhau thì return true ngược lại thì false 
    }
}
