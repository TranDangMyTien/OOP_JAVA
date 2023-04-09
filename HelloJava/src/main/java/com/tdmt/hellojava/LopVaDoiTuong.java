/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdmt.hellojava;

/**
 *
 * @author mytie
 */
public class LopVaDoiTuong {
    //ĐỐI TƯỢNG 
    //Đối tượng là một khái niệm được dùng để chỉ một thực thể cụ thể có trạng thái và hành vi. 
    //Một thực thể sẽ không được gọi là đối tượng nếu thực thể đó không thỏa mãn một trong các điều kiện trên.
    
    
    //LỚP 
    //Lớp là một tập hợp các đối tượng có cùng trạng thái và hành vi, 
    //vì vậy nó định nghĩa các tính chất của một tập hợp các đối tượng cùng kiểu.
    
    
    //VD
//    // thuộc tính (instance variable)
//    private String id;
//    private String name;
//    private String information;
//     
//    // Phương thức này có tên inputInformation và không có giá trị trả về
//    public void inputInformation() {
//         
//    }
//     
//    // Phương thức này có tên showInformation và có kiểu trả về là String
//    public String showInformation() {
//     
//    }
//     
//    // hàm main
//    public static void main(String[] args) {
//         
//    }
    
    
    //Phạm vi truy cập (Access Modifier) của lớp, thuộc tính và phương thức
    //public: có thể truy cập ở mọi nơi trong Project.
    //protected: truy cập được từ trong lớp khai báo, lớp con của lớp khai báo và các lớp cùng gói với lớp khai báo.
    //default: truy cập được từ trong lớp khai báo và các lớp cùng gói với lớp khai báo.
    //private: chỉ có thể truy cập bên trong lớp.
    
    //THUỘC TÍNH Instance variable == BIẾN 
    //Thuộc tính là 1 biến được khai báo bên trong lớp nhưng ở bên ngoài một phương thức, 
    //hàm tạo hoặc 1 khối lệnh. Thuộc tính được khởi tạo khi một lớp được khởi tạo và có thể được sử dụng ở bên trong một hàm, 
    //hàm tạo hoặc trong một khối lệnh trong lớp đó.
    
    //PHƯƠNG THỨC == HÀM 
    //Phương thức là một hàm được viết riêng cho các đối tượng của lớp, 
    //chỉ được phép gọi để tác động lên chính các đối tượng của lớp này. 
    //VD 
    // tạo 1 phương thức có kiểu trả về là void và không có tham số truyền vào
    // để gọi phương thức này trong main() thì phải khai báo là static
    public static void nhap() {
        System.out.println("Đây là ví dụ minh họa cách gọi phương thức void không đối trong Java");
    }
     
    // tạo 1 phương thức có kiểu trả về là void và có tham số truyền vào
    public static void nhapCoDoiSo(String str) {
        System.out.println(str);
    }
     
    // tạo 1 phương thức có kiểu trả về là int và có 2 tham số truyền vào có kiểu int
    public static int tinhTong(int a, int b) {
        return a + b;
    }
     
    public static void main(String[] args) {
        nhap(); // gọi phương thức nhap()
        nhapCoDoiSo("Đây là ví dụ minh họa cách gọi phương thức void có đối số trong Java");
         
        System.out.println("\nĐây là ví dụ minh họa cách gọi phương thức có kiểu trả về"
                + " là int và có tham số truyền vào trong Java");
        int c = tinhTong(3, 5); // c = a + b
        System.out.println("c = " + c);
    }
    
    
    
    //******LƯU Ý****************
    //Hàm - function - method 
    //1 CLASS có thể chứa nhiều hàm trùng tên,khác phần tham số đầu vào nhưng phải khác data type - kiểu dữ liệu (int long..)
    //không cần khác tên biến ==> Tránh trường hợp OVERLOAD/OVERLOADING 
    //Phương thức (hàm) có static thì không được dùng this 
    //STATIC cái chung, khai báo trước khi có đối tượng,thuộc tính/ phương thức nào có static thì chỉ
    //tương tác với cái có static thoi, không tương tác với cái ko có static 
    //Hầu như các phương thức (hàm) toán học đều dùng static 
    
    
    //HÀM TẠO  (Constructor)== PHƯƠNG THỨC KHỞI TẠO 
    //Trong lập trình hướng đối tượng, chúng ta có 1 loại hàm đặc biệt đó là hàm tạo. 
    //Hàm tạo trong Java là hàm có cùng tên với lớp và không có giá trị trả về.
    //Là một loại phương thức đặc biệt được sử dụng để khởi tạo đối tượng.
    //Nó được gọi là hàm tạo (constructor) vì nó xây dựng các giá trị tại thời điểm tạo đối tượng. Không cần thiết phải viết một constructor cho một class. 
    //Đó là bởi vì trình biên dịch java tạo ra một hàm tạo mặc định nếu class của bạn không có.
    
     
    
    
    
    //Một lớp trong Java có thể có một hoặc nhiều hàm tạo. Có 2 loại hàm tạo chúng ta thường gặp đó là: 
    //hàm tạo mặc định (không có đối số) và hàm tạo có đối số.
    //Hàm tạo mặc định là hàm tạo không có tham số đầu vào. 
    //Trong trường hợp người lập trình không định nghĩa bất kỳ hàm tạo nào thì trình biên dịch sẽ tự động tạo ra một phương thức tạo lập mặc định cho lớp này.
    //Hàm tạo có đối số là các hàm tạo do người dùng định nghĩa với các tham số đầu vào khác nhau để khởi tạo dữ liệu cho đối tượng.
   
    
    //TẠO ĐỐI TƯỢNG 
    //Bước 1: Khai báo đối tượng với tên và kiểu dữ liệu của đối tượng đó.
    //Bước 2: Sử dụng từ khóa new để khởi tạo đối tượng.
    //Bước 3: Theo sau từ khóa new là một lời gọi đến hàm tạo (hàm tạo này là hàm tạo mặc định của lớp). 
    //Lời gọi hàm này sẽ khởi tạo giá trị cho đối tượng được khai báo.
    //VD 
//    package object;
// 
//    public class Customer {
//
//        // hàm tạo có đối số
//        public Customer(String name) {
//            System.out.println("Your name: " + name);
//        }
//
//        public static void main(String[] args) {
//            // Khởi tạo đối tượng với giá trị truyền vào là "Freetuts"
//            Customer customer = new Customer("Freetuts");
//        }
//
//    }
    
    
    //Cách truy cập đến thuộc tính: [Tên đối tượng].[Tên thuộc tính];
    //Cách truy cập đến phương thức của lớp: [Tên đối tượng].[Tên phương thức()];
    
    
}
