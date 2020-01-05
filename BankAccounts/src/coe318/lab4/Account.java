/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab4;

/**
 *
 * @author Mustafa Khan
 */
public class Account {
    
    private String name;
    private double balance;
    private int num;
    
    public Account (String name, int num,double balance){
        this.name=name;
        this.num=num;
        this.balance=balance;
    }
    
    public String getName(){
        return name;
    
    }
    public void setName (String name) {
        this.name=name;
        
    }
    public double getBalance(){
        return balance;
        
    }
    public void SetBalance (double balance){
    this.balance=balance;
    }
    public int getNumber() {
        return num;
        
    }
    public void setNumber (int num) {
        this.num=num;
        
    }
    public boolean deposit (double amount){
        if (amount >0)
        {
            this.balance+= amount; 
            return true;
        }
        else 
            return false;
    }
    public boolean withdraw (double amount){
        if (amount >0)
        {
            this.balance -=amount;
            return true;
            
        }
        else 
            return false;
    }
    @Override 
    public String toString() { 
        return "(" +getName()+","+getNumber()+","+
                String.format("$%.2f",getBalance())+")";
    }
}

