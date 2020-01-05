/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

/**
 *
 * @author Mustafa
 */
public class Testrun {
    public static void main (String [] args){
        Node n1 = new Node();
            Node n2 = new Node();
            Node n3 = new Node();

    Resistor r1 = new Resistor (22.0, n1, n2);
    Resistor r2 = new Resistor (1.0, n2, n3);
//   
 System.out.println(r1);
//    System.out.println(r2);
    
    Circuit C1 = Circuit.getInstance();
    
   
 C1.AddResistor(r1);
    C1.AddResistor(r2);
    System.out.println (C1);
    }
}

    

