/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdmt.hellojava;

/**
 *
 * @author mytie
 */
public class HieuVeString {
    public static void main(String[] args) {
//Thông thường, string là một chuỗi các ký tự. 
//Nhưng, trong java string là một đối tượng biểu diễn một nối tiếp của các ký tự
//String là bất biến, khi tạo ra thì không thay đổi được 
//Có 2 cách để tạo đối tượng String:
//Sử dụng string literal
    String s = "welcome"; 
    String s1 = "welcome";  
    String s2 = "welcome"; // se khong tao instance moi
    
//Sử dụng từ khóa new
    String s3 = "java";//Tạo chuỗi bằng string literal  
    char ch[] = { 's', 't', 'r', 'i', 'n', 'g', 's' };
    String s4 = new String(ch);//convert mảng char thành chuỗi
    String s5 = new String("example");//Tạo chuỗi bằng từ khóa new 
    System.out.println(s3);
    System.out.println(s4);
    System.out.println(s5);

    
    
//Phương thức của STRING 
    //Phương thức SUBSTRING 
    //Cú pháp: 
    //    public String substring(int startIndex) 
    //    public String substring(int startIndex, int endIndex) Trả về trước endIndex  
    
    //VD 
//    public class SubstringExample {
//      public static void main(String args[]) {
//       String s1 = "hellojava";
//       System.out.println(s1.substring(3, 7));// "loja"  
//       System.out.println(s1.substring(3));// "lojava"  
//      }
//    }
    
    //LẤY ĐỘ DÀI CỦA XÂU 
    //S.length : Trả về số nguyên, tính từ số 1 vd:"java"=4 
    
    
    
    //Phương thức charAt
    //s.charAt(int index) :  Trả về giá trị Char của chuỗi tại vị trí có chỉ số index được chỉ định, Index bắt đầu từ 0.
    
    
    
    //Phương thức INDEXOF()
    //Trả về chỉ số của giá trị ký tự đã cho hoặc chuỗi con. Nếu không tìm thấy trả lại giá trị -1. 
    //Chỉ số (index) được đếm từ 0.
//    int indexOf(int ch) //Trả về vị trị của giá trị Char đã cho.
//    int indexOf(int ch, int fromIndex) //Trả về vị trị của giá trị Char đã cho tính từ vị trí fromIndex.
//    int indexOf(String substring) //Trả về vị trị của chuỗi con.
//    int indexOf(String substring, int fromIndex) //Trả về vị trị của chuỗi con đã cho tính từ vị trí fromIndex.
    


    //Phương thức lastIndexOf
    //Trả vể chỉ số cuối của ký tự hoặc chuỗi con. 
    //Nếu không tìm thấy trả về -1. Giá trị index được tính từ 0.
    //int lastIndexOf(int ch)
    //int lastIndexOf(int ch, int fromIndex)
    //int lastIndexOf(String substring)
    //int lastIndexOf(String substring, int fromIndex)
    //VD
//    public class LastIndexOfExample {
//        public static void main(String args[]) {
//         String s1 = "this is index of example";
//         int index1 = s1.lastIndexOf('s');
//         int index2 = s1.lastIndexOf("ex");
//         System.out.println(index1);//6 
//         System.out.println(index2);//17
//        }
//     }


    //Phương thức isEmpty 
    //Khi chuỗi trống trả về true, ngược lại trả về false.
    //s.isEmpty()

    
    
    //Phương thức concat 
    //Nối thêm chuỗi được chỉ định vào cuối chuỗi đã cho
    //s.concat("...")
    
    
    //Phương thức compareTo
    //So sánh các chuỗi cho trước với chuỗi hiện tại theo thứ tự từ điển. 
    //Nó trả về số dương, số âm hoặc 0.
    //Nếu chuỗi đầu tiên lớn hơn chuỗi thứ hai, nó sẽ trả về số dương (chênh lệch giá trị ký tự). 
    //Nếu chuỗi đầu tiên nhỏ hơn chuỗi thứ hai, nó sẽ trả về số âm và nếu chuỗi đầu tiên là bằng chuỗi thứ hai, nó trả về 0.
    //s.compareTo(s2);
    //VD 
//    public class LastIndexOfExample {
//        public static void main(String args[]) {
//         String s1 = "hello";
//         String s2 = "hello";
//         String s3 = "meklo";
//         String s4 = "hemlo";
//         System.out.println(s1.compareTo(s2)); //0
//         System.out.println(s1.compareTo(s3));  //-5 
//         System.out.println(s1.compareTo(s4));  //-1
//        }
//    }
    
    


    //Phương thức contains 
    //Tìm kiếm chuỗi ký tự trong chuỗi này. 
    //Nó trả về true nếu chuỗi các giá trị char được tìm thấy trong chuỗi này, 
    //nếu không trả về false.
    //s.contains("...")
    //VD
//    public class ContainsExample {
//        public static void main(String args[]) {
//         String name = "what do you know about me";
//         System.out.println(name.contains("do you know")); //true 
//         System.out.println(name.contains("about")); //true 
//         System.out.println(name.contains("hello")); //false 
//        }
//    }
   


    //Phương thức startsWith
    //Kiểm tra tiền tố của chuỗi có khớp với giá trị tiền tố đã nhập không, 
    //nếu đúng trả về true, sai trả về false.
//    public boolean startsWith(String prefix)  
//    public boolean startsWith(String prefix, int offset) 
//    public class StartsWithExample {
//        public static void main(String args[]) {
//         String s1 = "java string startsWith() method sample";
//         System.out.println(s1.startsWith("ja"));  //TRUE
//         System.out.println(s1.startsWith("java string")); //TRUE 
//        }
//    }


    //Phương thức endsWith
    //Kiểm tra nếu chuỗi này kết thúc với hậu tố nhất định. 
    //Nó trả về true nếu chuỗi này kết thúc với hậu tố đã cho, nếu khác thì trả về false.
    //s.endsWith("..")
    

    
    //Phương thức equals 
    //Phương thức equals() so sánh hai chuỗi đưa ra dựa trên nội dung của chuỗi. 
    //Nếu hai chuỗi khác nhau nó trả về false. Nếu hai chuỗi bằng nhau nó trả về true.
    //sequals(s1)  


    
    
    //Phương thức equalsIgnoreCase
    //Phương thức equalsIgnoreCase() so sánh hai chuỗi đưa ra dựa trên nội dung của chuỗi không phân biệt chữ hoa và chữ thường. 
    //Nếu hai chuỗi khác nhau nó trả về false. Nếu hai chuỗi bằng nhau nó trả về true.
    //s1.equalsIgnoreCase(s2)
    
    
    
    
    //Phương thức formart 
    //Trả về một chuỗi được format theo miền địa phương.
    //VD
//    public class FormatExample {
//        public static void main(String args[]) {
//         String name = "sonoo";
//         String sf1 = String.format("name is %s", name); //name is sonoo
//         String sf2 = String.format("value is %f", 32.33434); //value is 32.334340
//         String sf3 = String.format("value is %32.12f", 32.33434);  //value is                  32.334340000000
//
//         System.out.println(sf1);
//         System.out.println(sf2);
//         System.out.println(sf3);
//        }
//     }


    
    //Phương thức replace
    //Để thay thế tất cả các ký tự hoặc chuỗi cũ thành ký tự hoặc chuỗi mới.
//    public String replace(char oldChar, char newChar)  
//    public String replace(CharSequence target, CharSequence replacement) 
    //VD
//    public class ReplaceExample1 {
//        public static void main(String args[]) {
//         String s1 = "viettuts is a very good website";
//         String replaceString = s1.replace('t', 'j');//thay thế tất cả ký tự 't' thành 'j'  
//         System.out.println(replaceString);
//        }
//    }


    //PHÂN BIỆT REPLACE VÀ REPLACEALL 
//    Phương thức replaceAll() nhận tham số vào như một chuỗi.
//    Còn phương thức replace() có thể nhận tham số truyền vào như là ký tự hoặc là chuỗi.
    //VD:
//    String s1="Đây là chuỗi cần thay thế";
//    String replaceString=s1.replaceAll("a","b");//Ở đây "a", "b" là chuỗi
//    String replaceString=s1.replace('a','e');//Ở đây 'a', 'e' là ký tự
//    String replaceString=s2.replace("a","b");//Ở đây "a", "b" là chuỗi


    //Phương thức toCharArray 
    //Chuyển đổi chuỗi thành các mảng ký tự. 
    //Nó trả về một mảng ký từ có độ dài tương đương độ dài của chuỗi.
    //VD
//    public class StringToCharArrayExample {
//        public static void main(String args[]) {
//         String s1 = "hello";
//         char[] ch = s1.toCharArray();
//         for (int i = 0; i < ch.length; i++) {
//          System.out.println(ch[i]);
//         }
//        }
//    }



    //Phương thức toLowerCase
    //Chuyển chuỗi về dạng chữ thường
    //s1.toLowerCase();

    
    //Phương thức toUpperCase
    //Chuyển chuỗi về dạng chữ hoa.
    //s1.toUpperCase();
    
    
    //Phương thức trim
    //s1.trim();
    //Phương thức trim() được sử dụng để xóa khoảng trẳng ở đầu và cuối chuỗi. 
    //Giá trị unicode của khoảng trắng là '\u0020'. Phương thức trim() kiểm tra giá trị unicode trước và sau chuỗi, 
    //nếu tồn tại thì xóa bỏ khoảng trắng đi và trả về chuỗi không có khoảng trắng ở đầu và cuối.
    //VD
//    public class StringTrimExample {
//        public static void main(String args[]) {
//         String s1 = "  hello string   ";
//         System.out.println(s1 + "java"); 
//         System.out.println(s1.trim() + "java");
//        }
//     }


    //Phương thức valueOf 
    //Phương thức valueOf() được sử dụng để chuyển đối kiểu dữ liệu khác thành chuỗi. 
    //Bằng việc sử dụng phương thức valueOf(), bạn có thể chuyển int thành chuỗi, 
    //long thành chuỗi, boolean thành chuỗi, float thành chuỗi, double thành chuỗi, 
    //char thành chuỗi, mảng char thành chuỗi, đối tượng thành chuỗi.
    //VD
//    public class StringValueOfExample {
//        public static void main(String args[]) {
//         int value = 30;
//         String s1 = String.valueOf(value);
//         System.out.println(s1 + 10); //3010 
//        }
//    }


    //Phương thức split 
    //Tách chuỗi này theo biểu thức chính quy(regular expression) và trả về mảng chuỗi.
    //s1.split("ký tự"); Tách chuỗi dựa theo ký tự đó 
    //VD 
//    public class SplitExample {
//        public static void main(String args[]) {
//         String s1 = "java string split method by viettuts";
//         String[] words = s1.split("\\s");//tach chuoi dua tren khoang trang
//         //su dung vong lap foreach de in cac element cua mang chuoi thu duoc
//         for (String w : words) {
//          System.out.println(w);
//         }
//        }
//    }


    }
}
