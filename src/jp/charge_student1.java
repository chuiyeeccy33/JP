/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp;

/**
 *
 * @author jasmi
 */
public class charge_student1 {
    private String studentchargeID;
    private String studentID;
    private String studentcourse;
    private String studenttrainer;
    private String studentmonth;
    private String studentfee;
    //constructor

    public charge_student1(String studentchargeID, String studentID, String studentcourse, String studenttrainer, String studentmonth, String studentfee) {
        this.studentchargeID = studentchargeID;
        this.studentID = studentID;
        this.studentcourse = studentcourse;
        this.studenttrainer = studenttrainer;
        this.studentmonth = studentmonth;
        this.studentfee = studentfee;
        
    }
    //getter 
    public String getStudentchargeID() {
        return studentchargeID;
    }
    //setter methods
    public void setStudentchargeID(String studentchargeID) {
        this.studentchargeID = studentchargeID;
    }

     public String getStudentID() {
        return studentID;
    }
    
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    
    public String getStudentcourse() {
        return studentcourse;
    }

    public void setStudentcourse(String studentcourse) {
        this.studentcourse = studentcourse;
    }

    public String getStudenttrainer() {
        return studenttrainer;
    }

    public void setStudenttrainer(String studenttrainer) {
        this.studenttrainer = studenttrainer;
    }
    
    public String getStudentmonth() {
        return studentmonth;
    }

    public void setStudentmonth(String studentmonth) {
        this.studentmonth = studentmonth;
    }
    
    public String getStudentfee() {
        return studentfee;
    }

    public void setStudentfee(String studentfee) {
        this.studentfee = studentfee;
    }  
      
}

