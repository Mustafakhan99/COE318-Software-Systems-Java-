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
public class VoltageSource {
    private static int next=1;   //instance variable of voltage
    private int voltageId;   //instance variable of next voltage
    double voltage;
    Node [] node= new Node[2];
    
public VoltageSource(double voltage, Node node1, Node node2)
{
    this.voltage=voltage;
    if (node1 == null||node2==null)
    {
        throw new IllegalArgumentException("Error: Nodes cannot be null\n");
        
    }
    else {
        node[0]=node1;
        node[1]=node2;
    }
    voltageId=next;
    next =voltageId+1;
    Circuit.getInstance().addVoltageSource(this); //Adds source to circuit
}
public Node[] getNodes()
{
    return node;
}
 @Override
    public String toString()
    {
        String out;
        out = "V" + Integer.toString(voltageId);
        out += " " + getNodes()[0]+ " " + getNodes()[1];
        out += " DC " + Double.toString(voltage);// Voltage display
        return out;
    }

}