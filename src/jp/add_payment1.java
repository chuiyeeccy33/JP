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
public class add_payment1 {
    private String madeby;
    private String paymentID;
    private String studentID;
    private String studentcourse;
    private String studenttrainer;
    private String studentmonth;
    private String studentfee;
    private String studentpayamount;
    private String studentbalance;
    //constructor

    public add_payment1(String madeby, String paymentID, String studentID, String studentcourse, String studenttrainer, String studentmonth, String studentfee, String studentpayamount, String studentbalance) {
        this.madeby = madeby;
        this.paymentID = paymentID;
        this.studentID = studentID;
        this.studentcourse = studentcourse;
        this.studenttrainer = studenttrainer;
        this.studentmonth = studentmonth;
        this.studentfee = studentfee;
        this.studentpayamount = studentpayamount;
        this.studentbalance = studentbalance;
        
    }
    //getter 
    public String getMadeby() {
        return madeby;
    }
    //setter methods
    public void setMadeby(String madeby) {
        this.madeby = madeby;
    }
    
    public String getPaymentID() {
        return paymentID;
    }
    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
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
    
     public String getStudentpayamount() {
        return studentpayamount;
    }

    public void setStudentpayamount(String studentpayamount) {
        this.studentpayamount = studentpayamount;
    } 
    
     public String getStudentbalance() {
        return studentbalance;
    }

    public void setStudentbalance(String studentbalance) {
        this.studentbalance = studentbalance;
    }    
   
}

