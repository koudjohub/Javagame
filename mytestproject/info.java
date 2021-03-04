package com.javacoding.mytestproject;

import javax.management.StringValueExp;
import java.util.Scanner;

public class info {
    public static  void Playerinput() {

        String game = " Please enter your name : ";
        System.out.println(game);
        Scanner Val = new Scanner(System.in);
        String X = Val.nextLine();
        System.out.println(" Hello " + X);
        game = " Dear " + X + " please specify your age : ";
        System.out.println(game);
        double ageChceck = Val.nextDouble();
boolean access = ageChceck>15;
        if (ageChceck < 15) {
            System.out.println(" Sorry " + X + " you are too young for the game, you will be allow to play in  " + (15 - ageChceck + "year(s)")); }

       // if (ageChceck > 15) { System.out.println(" Welcome " + X + " you may proceed");  }
       // if (ageChceck == 15) { System.out.println(X + " Happy birthday ");
        //System.out.println(" Welcome " + X + " you may proceed with your first game "); }
       // if (ageChceck > 70) { System.out.println(X + " Make sure you don't play too long,  to avoid  eyes problem  "); }
       // else { System.out.println(); }
       // if (ageChceck < 15) { System.out.println(" Goodbye " + X + " see you in " + (15 - ageChceck + "year(s)")); }

        else { FreshBrain Game = new FreshBrain();
        FreshBrain.Game();



            }}


    }


