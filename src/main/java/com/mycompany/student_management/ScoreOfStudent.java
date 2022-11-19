/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student_management;

/**
 *
 * @author Admin
 */
public class ScoreOfStudent {
    private String idStudent,idSub;
    private int soTin;
    double diemQT,diemGK,diemKTHP,diemTB;

    public ScoreOfStudent(String idStudent, String idSub, int soTin, double diemQT, double diemGK, double diemKTHP, double diemTB) {
        this.idStudent = idStudent;
        this.idSub = idSub;
        this.soTin = soTin;
        this.diemQT = diemQT;
        this.diemGK = diemGK;
        this.diemKTHP = diemKTHP;
        this.diemTB = diemTB;
    }

    public ScoreOfStudent() {
    }

    public String getIdStudent() {
        return idStudent;
    }

    public String getIdSub() {
        return idSub;
    }

   

    public int getSoTin() {
        return soTin;
    }

    public double getDiemQT() {
        return diemQT;
    }

    public double getDiemGK() {
        return diemGK;
    }

    public double getDiemKTHP() {
        return diemKTHP;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public void setIdSub(String idSub) {
        this.idSub = idSub;
    }

 
    public void setSoTin(int soTin) {
        this.soTin = soTin;
    }

    public void setDiemQT(double diemQT) {
        this.diemQT = diemQT;
    }

    public void setDiemGK(double diemGK) {
        this.diemGK = diemGK;
    }

    public void setDiemKTHP(double diemKTHP) {
        this.diemKTHP = diemKTHP;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    
}
