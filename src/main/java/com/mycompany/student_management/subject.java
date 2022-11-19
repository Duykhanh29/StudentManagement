/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student_management;

/**
 *
 * @author Admin
 */
public class subject {
    private String id,name;
    private int soTin;

    public subject() {
    }

    public subject(String id, String name, int soTin) {
        this.id = id;
        this.name = name;
        this.soTin = soTin;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSoTin() {
        return soTin;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSoTin(int soTin) {
        this.soTin = soTin;
    }
    
}
