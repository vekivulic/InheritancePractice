/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FourthAbstraction;

/**
 *
 * @author vekivulic
 */
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        FantasyCreature fantasy= new FantasyCreature();
        Unicorn unicorn= new Unicorn();
        unicorn.fly();
        unicorn.setColor("yelow, blue, pink, red and white");
        fantasy.setColor("yeloo, blue, red, orange, pink");
        System.out.println(unicorn.getColor() + fantasy.getColor());
    }
    
}
