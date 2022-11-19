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
public class ListStudent {
    ArrayList<Student> listStudent=new ArrayList<>();
    public void insert()
    {
        listStudent.add(new Student("ST01", "Nguyen Van QUang", "Duyfdsafds", "fadsfds", "0987654321", "dsaf", true, 21,-1));
        listStudent.add(new Student("ST02", "Nguyen Van Huy", "Duyfdsafds", "qewr", "0677654321", "dsaf", true, 21,-1));
        listStudent.add(new Student("ST03", "Nguyen QUang", "fdsa", "fdasf", "0987666321", "dsaf", false, 20,-1));
        listStudent.add(new Student("ST04", "Nguyen Van", "fdsa", "fadsfds", "0987654551", "dsaf", true, 20,-1));
        listStudent.add(new Student("ST05", "Van QUang", "65wte", "iur", "0987654360", "dsaf",  false, 19,-1));
        listStudent.add(new Student("ST06", "Nguyen Van Quan", "fasd", "jhg", "0447654321", "dsaf", false, 20,-1));
        listStudent.add(new Student("ST07", "Nguyen Van hOANG", "FDAFD", "jFDShg", "0433333321", "tytu", false, 20,-1));
    }
    public ArrayList<String> getIDStudent()
    {
        ArrayList<String> Ids=new ArrayList<>();
        for (Student st : listStudent) {
            Ids.add(st.getId());
        }
        return Ids;
    }
    public int getSize()
    {
        return listStudent.size();
    }
    public Student getStudentAtIndex(int i)
    {
        return listStudent.get(i);
    }
    public boolean containsStudent(String x)
    {
        for (Student student : listStudent) {
            if(student.getId().equals(x)==true)
            {
                return true;
            }
        }
        return false;
    }
}
