/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FifthAbstraction;

/**
 *
 * @author vekivulic
 */
public class Character {
    private String size;
    private String hair;

    public Character() {
        this.size = size;
        this.hair = hair;
    }
    public void walk(){
        System.out.println("This object has ability to walk");
    }
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }
    
}
