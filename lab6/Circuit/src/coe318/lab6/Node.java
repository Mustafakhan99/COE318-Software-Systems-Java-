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
public class Node {
    private static int counter=0;
    private int id;
    public Node () {
        this.id=counter;
        counter=counter+1;
    }
     @Override
    
public String toString (){
        return ""+this.id;
    }
     
}


