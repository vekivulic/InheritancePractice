/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FirstAbstraction;

/**
 *
 * @author vekivulic
 */
public class Human {
    private int heigth;
    private int weigth;

    public Human() {
        this.heigth = heigth;
        this.weigth = weigth;
    }
 
    public void walk(){
        System.out.println("This abject has ability to walk!");
        
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }
    
}
