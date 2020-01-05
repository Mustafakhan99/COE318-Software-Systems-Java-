/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

/**
 *
 * @author Mustafa Khan
 */
public class UserMain {
    private final Userinterface interact;
    public UserMain(Userinterface interact)
    {
        this.interact=interact;
       
    }
    public static void main(String[]args)
    {
        //Construct object using UserInterface as a paramter.
        UserMain makeCircuit = new UserMain(new UI());
        makeCircuit.interact.User();
        makeCircuit.interact.end();
    }
}
