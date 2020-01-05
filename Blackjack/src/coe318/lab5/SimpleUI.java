package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);
    private int level=0;
    private String response;

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
        if (level==0)
        {
            System.out.println("Your Cards:"+game.getYourCards());
            System.out.println("House cards:"+game.getHouseCards());
            do
            {
                response = user.nextLine().toLowerCase();
                
                switch (response) {
                    case "no":              
                        break;
                    case "yes":
                        break;
                    default:
                        System.out.print("Please answer yes or no:");
                        break;
                }
            }while(!(response.equals("yes")||response.equals("no")));
            level = 1;
        }
         else if(response.equals("no"))
        {
            System.out.println("\nHouse's Cards: " + game.getHouseCards());
            System.out.println("Your Cards:    " + game.getYourCards());
        }
        //FIX THIS
    }

  @Override
    public boolean hitMe() {
          if(response.equals("yes"))//Checks if answer is yes. Else, retruns false.
        {
            //After perfoming house's turn, If user wants cards, this reset display to ask for input again durring user's turn.
           
            return true;
             level = 0;
        }
        else
          {
              return false;
          }
    }

  @Override
    public void gameOver() {
       int housescore;
       int youscore;
       
        youscore = game.score(game.getYourCards());
        housescore = game.score(game.getHouseCards());
        System.out.println("\nGame Over");
        System.out.println("House's cards:" + game.getHouseCards());
        System.out.println("Score:" + housescore);
        System.out.println("Your cards:   " + game.getYourCards());
        System.out.println("Score:" + youscore);
        if((youscore<=21 && housescore<=21)||(youscore<=21 && housescore>21));
        {
            if(youscore>housescore || housescore>21)
            {
                System.out.print("\nCongratulations! You won!!!");
            }
            else if(youscore < housescore || youscore == housescore)
            {
                System.out.print("\nOuch, you lose.");
            }
        }
         if(youscore>21)
        {
            System.out.print("\n You Lose.");
        }
    }

}