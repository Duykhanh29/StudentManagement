/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student_management;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ListSubject {

    ArrayList<subject> listSubject = new ArrayList<>();

    public void insert() {
        subject s = new subject("Sb01", "Math", 6);
        subject s1 = new subject("Sb02", "Physical", 2);
        subject s2 = new subject("Sb03", "Mah", 1);
        subject s3 = new subject("Sb04", "Phical", 6);
        subject s4 = new subject("Sb05", "Math", 6);
        subject s5 = new subject("Sb06", "Physical", 5);
        subject s6 = new subject("Sb07", "Mah", 7);
        subject s7 = new subject("Sb08", "Phical", 3);
        listSubject.add(s);
        listSubject.add(s1);
        listSubject.add(s3);
        listSubject.add(s2);
        listSubject.add(s4);
        listSubject.add(s5);
        listSubject.add(s6);
        listSubject.add(s7);
    }

    public ArrayList<String> returnIDSubject() {
        ArrayList<String> IDs = new ArrayList<String>();
        for (int i = 0; i < listSubject.size(); i++) {
            IDs.add(listSubject.get(i).getId());
        }
        return IDs;
    }

    public ArrayList<Integer> SoTinSubject() {
        ArrayList<Integer> soTins = new ArrayList<Integer>();
        for (int i = 0; i < listSubject.size(); i++) {
            soTins.add(listSubject.get(i).getSoTin());
        }
        return soTins;
    }

    public int getSoTinFromID(String id) {
        for (int i = 0; i < listSubject.size(); i++) {
            if (listSubject.get(i).getId().equals(id) == true) {
                return listSubject.get(i).getSoTin();
            }
        }
        return -1;
    }
    
    public ArrayList<subject> fitlerSubjectForAStudent(ArrayList<String> list)
    {
        ArrayList<subject> newList=new ArrayList<>();
        for (int i = 0; i < listSubject.size(); i++) {
            if(list.contains(listSubject.get(i).getId())==true)
            {
                newList.add(listSubject.get(i));
            }
        }
        return newList;
    }
}
