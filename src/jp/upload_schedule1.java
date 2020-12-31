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
public class upload_schedule1 {
    private String trainername;
    private String studentcourse;
    private String studenttime;
    private String studentdate;
    private String studentfee;
    private String studentVenue;

        //constructor

    public upload_schedule1(String studentcourse, String studenttime, String studentdate, String studentfee, String studentVenue, String trainername) {
        
        
        this.studentcourse = studentcourse;
        this.studenttime = studenttime;
        this.studentdate = studentdate;
        this.studentfee = studentfee;
        this.studentVenue = studentVenue;
        this.trainername = trainername;
    }

    //getter 
    public String getStudentcourse() {
        return studentcourse;
    }
//setter
    public void setStudentcourse(String studentcourse) {
        this.studentcourse = studentcourse;
    }
    public String getStudenttime() {
        return studenttime;
    }

    public void setStudenttime(String studenttime) {
        this.studenttime = studenttime;
    }
    public String getStudentdate() {
        return studentdate;
    }

    public void setStudentdate(String studentdate) {
        this.studentdate = studentdate;
    }

    public String getStudentfee() {
        return studentfee;
    }

    public void setStudentfee(String studentfee) {
        this.studentfee = studentfee;
    }
     public String getStudentVenue() {
        return studentVenue;
    }

    public void setStudentVenue(String studentVenue) {
        this.studentVenue = studentVenue;
    }
    public String getTrainername() {
        return trainername;
    }

    public void setTrainername(String trainername) {
        this.trainername = trainername;
    }
}
