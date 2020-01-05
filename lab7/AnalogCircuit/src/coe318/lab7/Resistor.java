/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;


/**
 *
 * @author Mustafa
 */
//Most of the following code was adopted from the Previos lab (lab6
public class Resistor { 
    double resistance; 
    Node node1;
    Node node2;
    static int counter=1;
    int resistorId;
    
    public Resistor(double resistance, Node node1,Node node2){
        if (resistance <=0){
            throw new IllegalArgumentException("Cannot be Negative");
        }
        if (node1 == null|| node2==null){
             throw new IllegalArgumentException("Cannot be null");
    }
    this.resistance=resistance; 
    this.node1=node1;
    this.node2=node2;
    resistorId=counter;
    counter=counter+1;
}

    public Node[] getnodes(){
    Node [] nodes={node1,node2};
    return nodes;
}
    @Override
    public String toString(){
        return ("R:"  + this.resistorId + " "+ node1+" " + node2 + " " + resistance);
        }
    
}
