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
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tool tool= new Tool();
        Device device = new Device();
        tool.purpose();
        tool.setType("electric tool");
        System.out.println("This tool is " + tool.getType()+".");
    }
    
}
