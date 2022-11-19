/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.student_management;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Student_management {

    public static void main(String[] args) {

        System.out.println("Time: " + java.time.LocalDate.now());
        ListScore listScore = new ListScore();
        listScore.insert();
//        ArrayList<String> listId = new ArrayList<>();
//        listId = listScore.getIDStudentDistinct();
//        for (String string : listId) {
//            System.out.println("\t" + string);
//        }
        ArrayList<String> listIdSubject = new ArrayList<>();
        listIdSubject=listScore.getIDSubject("ST01");
        for (String string : listIdSubject) {
            System.out.println("\t" + string);
        }
    }
}
