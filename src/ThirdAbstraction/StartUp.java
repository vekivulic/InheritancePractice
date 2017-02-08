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
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // TODO code application logic here
        Human human = new Human ();
        Plant plant = new Plant ();
        human.breathe();
        plant.breathe();
        plant.setGenticCode("multicellular");
    }
    
}
