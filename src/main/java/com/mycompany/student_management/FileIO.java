/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student_management;

import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Admin
 */
public class FileIO {
    File file;
    public void writeData(String string)
    {
        try {
            file=new File("file.txt");
            FileWriter fileWriter=new FileWriter(file);
            fileWriter.write(string);
            fileWriter.close();
            System.out.println("Successful");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void readData(String fileName)
    {
        
    }
}
