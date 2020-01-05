/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Mustafa Khan
 */

  public class UI implements Userinterface {
      
      Circuit c= Circuit.getInstance(); //Instance for circuit
      private Scanner user= new Scanner(System.in);
      
      
      private double magnitude;
      private String part;
      private int n1,n2;
      
      //arraylist to add nodes.
      ArrayList<Node> node= new ArrayList();
      public void User()
      {
        System.out.println("Add parts to circuit by using 'v' as voltage or 'r' as resistor followed by magnitude and two nodes:\nEx: v 0 1 -30.0");  
        System.out.println("To display circuit: spice \nTerminate program: end");
        do {
            
            part=user.next().toLowerCase();
            if (part.equals("v")||part.equals("r)"))
            {
                n1=user.nextInt();
                n2=user.nextInt();
                magnitude=user.nextDouble();
                if(n1<0||n2<0) //if user inputs negative nodes
                {
                throw new IllegalArgumentException("Nodes cannot be negative");
                }
                while(node.size()<=n1||node.size()<=n2)
                {
                    node.add(new Node());
                }
                if(part.equals("r"))
                {
                    new Resistor(magnitude,node.get(n1),node.get(n2));  //adds resistor
                }
                else if(part.equals("v"))
                {
                     new VoltageSource(magnitude,node.get(n1),node.get(n2));  //adds voltage
                }
            }
            else if(part.equals("spice"))  //if input is spice
            {
                spice();
            }
            else if(part.equals("end")) //Need this incase user enters end as first input
            {
                //ends programs and displays nothing
            }
            else  //Invalid inputs
            {
                System.out.println("Enter Valid numbers!");
            }
        }while(!(part.equals("end")));
        
        
      }
    
    public void spice()
    {
        System.out.print(c);
    }
    //Displays All Done when user wants program to end.
    public void end()
    {
        System.out.println("All Done");
    }

  }