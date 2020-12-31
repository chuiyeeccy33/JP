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
public class add_trainer1 {
     private String trainerID;
    private String trainerName;
    private String trainerage;
    private String trainergender;
    private String trainerdob;
    private String trainerpassword;
    private String trainerusername;
    
     //constructor

    public add_trainer1(String trainerID, String trainerName, String trainerage, String trainergender, String trainerdob, String trainerusername, String trainerpassword){
        this.trainerID = trainerID;
        this.trainerName = trainerName;
        this.trainerage = trainerage;
        this.trainergender = trainergender;
        this.trainerdob = trainerdob;
        this.trainerusername = trainerusername;
        this.trainerpassword = trainerpassword;
    }
    //getter 
    public String getTrainerID() {
        return trainerID;
    }
    //setter methods
    public void setTrainerID(String trainerID) {
        this.trainerID = trainerID;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getTrainerage() {
        return trainerage;
    }

    public void setTrainerage(String trainerage) {
        this.trainerage = trainerage;
    }
    public String getTrainergender() {
        return trainergender;
    }

    public void setTrainergender(String trainergender) {
        this.trainergender = trainergender;
    }
    public String getTrainerdob() {
        return trainerdob;
    }

    public void setTrainerdob(String trainerdob) {
        this.trainerdob = trainerdob;
    }
    
     public String getTrainerusername() {
        return trainerusername;
    }

    public void setTrainerusername(String trainerusername) {
        this.trainerusername = trainerusername;
    }
    
    public String getTrainerpassword() {
        return trainerpassword;
    }

    public void setTrainerpassword(String trainerpassword) {
        this.trainerpassword = trainerpassword;
    }
    
}
