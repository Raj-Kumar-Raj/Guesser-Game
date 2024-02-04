//package Guesser Game ;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
class Guesser{
     public int takeNumberGuesser () {
        System.out.println("Guesser guess a number ");
        Scanner sc = new Scanner (System.in);
        int guesserNum = sc.nextInt();

        return guesserNum;

     }

}

class Player{
    public int takeNumberPlayer () {
       // System.out.println("player guess a number ");
        Scanner sc = new Scanner (System.in);
        int playerNum = sc.nextInt();

        return playerNum;
    }
}

class Umpire {
    int numFromGuesser ;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser (){
    Guesser g = new Guesser();
    numFromGuesser = g.takeNumberGuesser();
    }
    
    void collectNumFromPlayers (){
    System.out.println("Player1 guess a number");
    Player p1 = new Player();
    numFromPlayer1 = p1.takeNumberPlayer();
     
    System.out.println("Player 2 guess a number");
    Player p2 = new Player();
    numFromPlayer2 = p2.takeNumberPlayer();

    System.out.println("Player 3 guess a number");
    Player p3 = new Player();
    numFromPlayer3 = p3.takeNumberPlayer();

    }

    void compare(){
        if (numFromPlayer1 == numFromGuesser){
            if (numFromPlayer2 == numFromGuesser && numFromPlayer3 ==numFromGuesser){
                System.out.println("All players won the game");
            }

            else if (numFromPlayer2 == numFromGuesser){
                System.out.println("Only player1 and player2 won the game");
            }

            else if (numFromPlayer3 == numFromGuesser){
                System.out.println("Only player1 and player3 won the game");
            }

            else {
                System.out.println("only palyer1 won the game");
            }
        }

        else if (numFromPlayer2 == numFromGuesser){
            if (numFromPlayer3 == numFromGuesser){
                System.out.println("only player1 and player2 won the game");
            }

            else {
                System.out.println("only player2 won the game");
            }
        }

        else if (numFromPlayer3 == numFromGuesser){
            System.out.println("Only player3 won the game");
        }

        else {
            System.out.println("No players won the game");
        }
    }
     
}


public class guesserGame {
     public static void main(String[] args) {
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();
    }
}
