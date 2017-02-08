/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThirdAbstraction;

/**
 *
 * @author vekivulic
 */
public class LivingOrganism {
    private String genticCode;
    private String foodIntake;

    public LivingOrganism() {
        this.genticCode = genticCode;
        this.foodIntake = foodIntake;
    }
    public void breathe(){
        System.out.println("This object has ability to breathe");
    }

    public String getGenticCode() {
        return genticCode;
    }

    public void setGenticCode(String genticCode) {
        this.genticCode = genticCode;
    }

    public String getFoodIntake() {
        return foodIntake;
    }

    public void setFoodIntake(String foodIntake) {
        this.foodIntake = foodIntake;
    }
    
}
