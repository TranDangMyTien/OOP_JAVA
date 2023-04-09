/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdmt.hellojava.ThucHanhChuong1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author mytie
 */
public class C1Bai3 {
    public static void main(String[] args) throws FileNotFoundException {
        //Câu a 
        Scanner sc = new Scanner (System.in);//Tạo đối tượng để nhập dữ liệu từ bàn phím 
        System.out.print("Nhap chuoi s = "); //Lấy cả khoảng trắng dừng khi enter hoặc gặp kí tự \n
        String s = sc.nextLine();//Khai báo chuỗi s và tạo giá trị 
        System.out.println(s.substring(0, s.indexOf("@")));
        //Hàm substring cắt lấy chuỗi con 
        //Hàm indexOf vị trí đầu tiên gặp kí tự hoặc chuỗi đã cho
        System.out.printf("Chuoi sau khi cat %s",s);
        
        //Câu b 
        int count = 0; //Khởi tạo biến đếm kí tự in hoa, gán cho nó giá trị ban đầu 
        for (int i = 0; i < s.length(); i++) //Hàm s.length() trả về số kí tự chuỗi (tính từ 1) 
        {
            if(Character.isUpperCase(s.charAt(i)) == true)
                //Lớp Character làm việc với ký tự; isUpperCase : có phải là ký tự in hoa 
                //s.charAt(i) : Lấy ký tự tại vị trí i 
                //Có thể ko ghi true, nhưng ghi cho nó dễ hình dung 
                count ++; 
        }
         System.out.println(count); //Số ký tự in hoa 
        
        
        //Câu c 
        //ĐỌC THÌ DÙNG Scanner f = new Scanner("Đường dẫn")
        //GHI THÌ DÙNG PrintWriter pw = new PrintWriter("Đường dẫn")
        File docFile = new File("src\\main\\java\\com\\tdmt\\hellojava\\ThucHanhChuong1\\input.txt");
        //Lấy file để đọc dữ liệu 
        //Đường dẫn có thể là \\ hay / đều như nhau 
        Scanner sf = new Scanner(docFile); //Tạo lớp để lấy dữ liệu từ file 
        String m = sf.nextLine(); 
        //Khởi tạo chuỗi s, chuỗi này nhận cả khoảng trắng 
        //Chuỗi này lấy dữ liệu từ file : chức năng trong bài này để chứa chuỗi sau khi thay đổi 
        m = m.replaceAll("\\{file\\}", "TAP TIN");
        //Thay đổi tất cả "{file}" thành "TAP TIN" 
        //replaceAll : hàm thay đổi tất cả 
        //Gán giá trị mới (chuỗi sau khi thay đổi) cho m 
        //Để nhập kí tự { vào Netbeans thì trước kí tự phải có \\ để ko bị lỗi
        sf.close(); //Đọc file xong phải đóng file lại 
        
        File ghiFile = new File("src\\main\\java\\com\\tdmt\\hellojava\\ThucHanhChuong1\\output.txt");
        //Nếu file chưa có nó sẽ tạo 1 file mới theo đường dẫn 
        PrintWriter pw = new PrintWriter(ghiFile); //Lớp để ghi file 
        //Nhớ import 
        pw.println(m); //Ghi chuỗi m vào file 
        System.out.println("Chuoi da duoc ghi thanh cong!!");
        pw.close(); //Ghi xong nhớ đóng lại 
    }
    
    //Câu d chưa hiểu lắm 
    String chuoi1 = "   java     is      simple   , java is ;,,;,;,;,;   gooddddddddd     ";
    String[] a = chuoi1.trim().split("[\\s,;]+");
    //s.trim() hàm xóa ký tự khoảng trắng đầu và cuối chuỗi 
    // split("[\\s,;]+"); ????? CHƯA HIỂU NHA 
   
    
    //Câu e chưa hiểu luôn nha HIX 
    String chuoi2 = " java    iS     sIMple   ";
    String[] b = chuoi2.trim().split("\\s+");
    String kq = "";
//    for (String x: a)
//           kq += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
//       System.out.println(kq);
}