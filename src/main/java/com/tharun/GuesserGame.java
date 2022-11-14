package com.tharun;

import java.util.Scanner;

class Umpire {
    int storeGuesserNum;
    int storePlayer1Num;
    int storePlayer2Num;
    int storePlayer3Num;

    void collectNumFromGuesser()
    {
        Guesser g=new Guesser();
        storeGuesserNum=g.guesserNum();

    }
    void collectNumFromPlayer()
    {
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        storePlayer1Num=p1.playerNum();
        storePlayer2Num=p2.playerNum();
        storePlayer3Num=p3.playerNum();

    }
    void compare()
    {
        if(storeGuesserNum==storePlayer1Num)
        {
            if(storeGuesserNum==storePlayer2Num && storeGuesserNum==storePlayer3Num)
            {
                System.out.println("All players won the game");
            } 
            else if (storeGuesserNum==storePlayer2Num)
            {
                System.out.println("Player 1 and 2 won the game");
            }
            else if(storeGuesserNum==storePlayer3Num)
            {
                System.out.println("Player 1 and 3 won the game");
            }
            else {
                System.out.println("player1 won the game");
            }
        }
        else if (storeGuesserNum==storePlayer2Num)
        {
             if (storeGuesserNum==storePlayer3Num)
            {
                System.out.println("both players 2 and 3 won the game");
            }
            else {
                System.out.println("player2 won the game");
            }
        }
        else if(storeGuesserNum==storePlayer3Num)
        {

                System.out.println("player3 won the game");
        }
        else
        {
            System.out.println("no player won the game");
        }
    }
}

class Guesser
{
    int guessNum;
    int guesserNum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the guesser Number:");
        guessNum=sc.nextInt();
        return guessNum;
    }
}

class Player
{
    int playerNum;
    int playerNum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the player number:");
        playerNum=sc.nextInt();
        return playerNum;

    }
}

public class GuesserGame {
    public static void main(String[] args) {

        Umpire u=new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();


    }


}
