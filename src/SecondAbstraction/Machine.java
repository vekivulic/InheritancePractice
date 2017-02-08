/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecondAbstraction;

/**
 *
 * @author vekivulic
 */
public class Machine {
    private String parts;
    private String type;

    public Machine() {
        this.parts = parts;
        this.type = type;
    }
    public void purpose(){
        System.out.println("The purpose of this object is to: ");
    }
    public String getParts() {
        return parts;
    }

    public void setParts(String parts) {
        this.parts = parts;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
}
