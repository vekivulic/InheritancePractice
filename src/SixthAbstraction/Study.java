/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SixthAbstraction;

/**
 *
 * @author vekivulic
 */
public class Study {
    private String subject;
    private String learningMaterial;

    public Study() {
        this.subject = subject;
        this.learningMaterial = learningMaterial;
    }
    public void mesaure(){
        System.out.println("default");
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLearningMaterial() {
        return learningMaterial;
    }

    public void setLearningMaterial(String learningMaterial) {
        this.learningMaterial = learningMaterial;
    }
    
    
}
