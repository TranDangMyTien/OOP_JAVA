/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdmt.hellojava.DocGhiFile;

//import java.io.File; //Khi tạo file thì mới import vào 
import java.io.PrintWriter;
import java.io.IOException;

/**
 *
 * @author mytie
 */
public class GhiLenFile {
    public static void main(String[] args){
        try {
            //File file = new File("src\\main\\java\\com\\tdmt\\hellojava\\DocGhiFile\\ghiFile.txt");
            PrintWriter pw = new PrintWriter("outFile.txt", "UTF-8");
            //Nếu file ko được tạo trước đó thì nó tạo luôn 
            pw.println("In ra!!!");
            pw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
