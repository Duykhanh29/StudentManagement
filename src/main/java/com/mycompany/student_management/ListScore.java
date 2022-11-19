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
public class ListScore {
    ArrayList<ScoreOfStudent> listScore=new ArrayList<>();
    public void add(ScoreOfStudent score)
    {
        listScore.add(score);
    }
    public double getAverageScore(double diemQT,double diemGK,double diemKTHP)
    {
        return 0.7 * diemKTHP + 0.3 * (0.7 * diemGK + 0.3 * diemQT);
    }
    public void insert()
    {
        listScore.add(new ScoreOfStudent("ST01", "Sb01", 6, 8.5, 7, 7, getAverageScore(8.5,7,7)));
        listScore.add(new ScoreOfStudent("ST02", "Sb01", 6, 8.5, 7, 7, getAverageScore(8.5,7,7)));
        listScore.add(new ScoreOfStudent("ST01", "Sb02", 6, 8, 7, 7.2, getAverageScore(8, 7, 7.2)));
        listScore.add(new ScoreOfStudent("ST02", "Sb02", 6, 8.5, 7, 7, getAverageScore(8.5,7,7)));
        listScore.add(new ScoreOfStudent("ST01", "Sb03", 6, 8.5, 7, 7, getAverageScore(8.5,7,7)));
        listScore.add(new ScoreOfStudent("ST02", "Sb01", 6, 8, 7.5, 7, getAverageScore(8,7.5,7)));
        listScore.add(new ScoreOfStudent("ST01", "Sb04", 6, 8.5, 6, 7.5, getAverageScore(8.5,6,7.5)));
        listScore.add(new ScoreOfStudent("ST03", "Sb01", 6, 8, 7, 6, getAverageScore(8,7,6)));
        listScore.add(new ScoreOfStudent("ST01", "Sb05", 6, 7, 7, 7.5, getAverageScore(7,7,7.5)));
        listScore.add(new ScoreOfStudent("ST01", "Sb06", 6, 8,8, 7, getAverageScore(8,8,7)));
        
        listScore.add(new ScoreOfStudent("ST04", "Sb01", 6, 6, 6, 5.5, getAverageScore(6, 6, 5.5)));
        listScore.add(new ScoreOfStudent("ST05", "Sb05", 6, 8, 7, 7.2, getAverageScore(8, 7, 7.2)));
        listScore.add(new ScoreOfStudent("ST06", "Sb06", 6, 9, 8, 7.2,getAverageScore(9, 8, 7.2)));
    }
    public int getSize()
    {
        return listScore.size();
    }
    public ScoreOfStudent getScoreAtIndex(int i)
    {
        return listScore.get(i);
    }
    public boolean equal(String idStudent,String idSubject)
    {
        for(int i=0;i<listScore.size();i++)
        {
            if(listScore.get(i).getIdSub().equals(idSubject)&&listScore.get(i).getIdStudent().equals(idStudent)){
                return true;
            }
        }
        return false;
    }
    public double tinhDiemTrungBinhCuaMotSInhVien(ArrayList<ScoreOfStudent> list){
        double sum=0;
        for(int i=0;i<list.size();i++)
        {
            sum=sum+list.get(i).getDiemTB();
        }
        return sum/list.size();
    }
    public void tinhDiemTrungBinh(String idStudent)
    {
        ArrayList<ScoreOfStudent> list=new ArrayList<>();
        for(int i=0;i<listScore.size();i++)
        {
            if(listScore.get(i).getIdStudent().endsWith(idStudent))
            {
                list.add(listScore.get(i));
            }
        }
    }
    
    
    // liệt có những sinh viên nào trong bảng điểm 
    public ArrayList<String> getIDStudentDistinct()
    {
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<listScore.size();i++){
            if(list.contains(listScore.get(i).getIdStudent())==false){
                list.add(listScore.get(i).getIdStudent());
            }
        }
        return list;
    }
    
    public void showDiemTB()
    {
        for(int i=0;i<listScore.size();i++)
        {
            
        }
    }
    
    // final aim is to push average score for a student 
    
    
    
    // show all score of a certain student
    public ArrayList<ScoreOfStudent> showScoreOfAStudent(String idStudent)
    {
        ArrayList<ScoreOfStudent> list=new ArrayList<>();
        for (int i = 0; i < listScore.size(); i++) {
            if(listScore.get(i).getIdStudent().equals(idStudent))
            {
                list.add(listScore.get(i));
            }
        }
        return list;
    }
    public double getAverageScoreOfAStudent(String idStudent)
    {
        ArrayList<ScoreOfStudent> list=new ArrayList<>();
        list=showScoreOfAStudent(idStudent);
        double sum=0;
        for (int i = 0; i < list.size(); i++) {
            sum=sum+list.get(i).getDiemTB();
        }
        return sum/list.size();
    }
    public int getSOTinOfAStudent(String idStudent)
    {
        ArrayList<ScoreOfStudent> list=new ArrayList<>();
        list=showScoreOfAStudent(idStudent);
        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            sum=sum+list.get(i).getSoTin();
        }
        return sum;
    }
    
    
    // fitler subject 
    public ArrayList<String> getIDSubject(String idStudent)
    {
        ArrayList<String> list=new ArrayList<>();
        for (int i = 0; i < listScore.size(); i++) {
            if(listScore.get(i).getIdStudent().equals(idStudent))
            {
                list.add(listScore.get(i).getIdSub());
            }
        }
        return list;
    }
}
