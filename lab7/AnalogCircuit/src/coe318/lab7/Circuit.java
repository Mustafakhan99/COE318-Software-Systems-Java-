/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;
import java.util.ArrayList;
/**
 *
 * @author Muhammad Mustafa Khan ID:500827365
 */
//Most of the following code was adopted from the Previos lab (lab6)
public class Circuit {
    
    ArrayList<Resistor> resistors;      //Declaration of Arrays
    ArrayList<VoltageSource> voltages;
    private static Circuit instance=null;
    //Get instance 
    public static Circuit getInstance()
    {
        if (instance==null)
            instance=new Circuit();
         
            return instance;
    }
    private Circuit()
    {
        resistors=new ArrayList();
        voltages= new ArrayList();  //Setting voltages and resistors to Arrays
    }
    //Adding resistors
 public void addResistor(Resistor r)
 {
     resistors.add(r);
 }
    //Adding voltage source
 public void addVoltageSource(VoltageSource v)
 {
     voltages.add(v);
     
 }
    @Override
 public String toString()
 {
     int x=0;
     String out="";
     while(x<resistors.size() || x<voltages.size())
     {
         if(x<resistors.size()) 
         {
             out+= resistors.get(x)+"\n";
         }
         if(x<voltages.size())
         {
             out+= voltages.get(x)+"\n";
         }
         x++;
     }
     return out;
 }
         }