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
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Child child= new Child();
        child.walk();
        
        child.setHeigth(5);
        System.out.println("This child is " + child.getHeigth() + "inches tall.");
        Person person= new Person();
    }
    
}
