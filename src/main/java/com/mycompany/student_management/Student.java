/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student_management;

/**
 *
 * @author Admin
 */
public class Student {
    private String id,name,email,address,phoneNumber,ClassR;
    double averageScore;
    boolean gender;
    int age;

    public Student(String id, String name, String email, String address, String phoneNumber, String ClassR, boolean gender, int age, double averageScore) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.ClassR = ClassR;
        this.averageScore = averageScore;
        this.gender = gender;
        this.age = age;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getClassR() {
        return ClassR;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public boolean isGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setClassR(String ClassR) {
        this.ClassR = ClassR;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
