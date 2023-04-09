/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdmt.hellojava;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author mytie
 */
public class SapXepMang {
    public static void main(String[] args){
        Integer[] a = {3,4,1,8}; //Phần này phải viết Integer thay vì viết int như bình thường 
        Arrays.sort(a, Collections.reverseOrder()); //Có 2 cái cần import 
        for (int k: a)
            System.out.printf("%d\t",k);
    }
}
