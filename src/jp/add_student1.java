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
public class add_student1 {
     private String studentID;
    private String studentName;
    private String studentage;
    private String studentgender;
    private String studentdob;
    private String studentpassword;
    private String studentusername;
    
    //constructor

    public add_student1(String studentID, String studentName, String studentage, String studentgender, String studentdob, String studentusername, String studentpassword) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentage = studentage;
        this.studentgender = studentgender;
        this.studentdob = studentdob;
        this.studentusername = studentusername;
        this.studentpassword = studentpassword;
    }
    //getter 
    public String getStudentID() {
        return studentID;
    }
    //setter methods
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentage() {
        return studentage;
    }

    public void setStudentage(String studentage) {
        this.studentage = studentage;
    }
    public String getStudentgender() {
        return studentgender;
    }

    public void setStudentgender(String studentgender) {
        this.studentgender = studentgender;
    }
    public String getStudentdob() {
        return studentdob;
    }

    public void setStudentdob(String studentdob) {
        this.studentdob = studentdob;
    }
    
     public String getStudentusername() {
        return studentusername;
    }

    public void setStudentusername(String studentusername) {
        this.studentusername = studentusername;
    }
    
    public String getStudentpassword() {
        return studentpassword;
    }

    public void setStudentpassword(String studentpassword) {
        this.studentpassword = studentpassword;
    }
    
   
}
