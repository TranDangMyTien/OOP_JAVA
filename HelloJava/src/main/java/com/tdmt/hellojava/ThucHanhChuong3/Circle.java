/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tdmt.hellojava.ThucHanhChuong3;

/**
 *
 * @author mytie
 */
public class Circle extends Ellipse{
      public Circle(double bk) {
        super(bk, bk);
    }
       @Override
    public String layTen() {
        return "Hinh Circle";
    }
}
