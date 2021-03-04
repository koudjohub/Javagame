package com.javacoding.mytestproject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FreshBrain {

    public static void Game() {


        Date DecemberDate = new Date();
        System.out.println(DecemberDate);
        SimpleDateFormat timeformat = new SimpleDateFormat("yyyy:MM: dd:hh:mm:ss");
        System.out.println("the game stated at : " + timeformat.format(DecemberDate));
        System.out.println(" Please answer  with the question below ");
        {
            System.out.println(" What is the color of Sky:");
            Scanner D = new Scanner(System.in);
            String C = D.next();
            String ans1= C.equals("Blue")? "correct": "wrong";
            System.out.println( ans1);
                }
                {

                    System.out.println(" How many country  form Europe :");
                    Scanner E = new Scanner(System.in);
                    int G = E.nextInt();

                    String ans2 = G == 44 ? " Correct" : "wrong";
                    System.out.println(ans2);

                }
                {
                    System.out.println(" How many days takes an egg to become chicken  :");
                    Scanner b = new Scanner(System.in);
                    int F = b.nextInt();
                    String ans3 = F == 21 ? " Correct" : " Wrong ";
                    System.out.println(ans3);

                }
                {
                    System.out.println(" What is the name of the oldest University : ");
                    Scanner U = new Scanner(System.in);
                    String M = U.next();
                    String ans4 = M.equals(" Tombouctou") ? " Correct" : " Wrong ";
                    System.out.println(ans4);

                    System.out.println(" How many bone has human body  :");
                    Scanner SD = new Scanner(System.in);
                    int KS = SD.nextInt();

                    int ansS = 209;

                    Boolean ans5 = true;
                    System.out.println(ans5);
                }

                {
                    Date endtimeDate = new Date();
                    System.out.println(endtimeDate);
                    SimpleDateFormat timeendformat = new SimpleDateFormat("yyyy:MM: dd:hh:mm:ss");
                    System.out.println("the game is finished at : " + timeendformat.format(endtimeDate));
                }
            }
        }

