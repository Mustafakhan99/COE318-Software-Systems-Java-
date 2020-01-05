/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

import java.util.ArrayList;

/**
 *
 * @author Mustafa
 */
public class Circuit { 
    ArrayList <Resistor> resistors;
    static  Circuit instance=null;
    
    private Circuit(){
        resistors=new ArrayList <Resistor>();
        
    }
    static  Circuit getInstance() {
        if (instance==null){
            instance=new Circuit();
           
        }
       
            return instance;
    }
    void AddResistor(Resistor r){
        resistors.add(r);
    }
    
}
