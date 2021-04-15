package com.company;

import java.util.Locale;
import java.util.Scanner;

public class FortuneTeller {

    public static void thisGuyTellsFortunes(){
        int shouldPlay = 1;


        String firstName;
        String lastName;
        int userAge;
        int birthMonth;
        String favColor;
        int numSiblings;

        int retirementYears;
        String vacationHome;
        String transportationMode;
        String bankBalance = "";

        Scanner inputDevice = new Scanner(System.in);

        System.out.println("What is your first name?");
        firstName = inputDevice.next();

        System.out.println("What is your last name?");
        lastName = inputDevice.next();

        System.out.println("What is your age?");
        userAge = inputDevice.nextInt();

        System.out.println("What is your birth month?");
        birthMonth = inputDevice.nextInt();

        favColor = "help";

        do {
            System.out.println("What is your favorite ROYGBIV color? (if unfamiliar with ROYGBIV type: \"help\")");
            favColor = inputDevice.next().toLowerCase();

            if (favColor.toLowerCase().equals("help")) {
                System.out.println("ROYGBIV: colors of the rainbow.\n1.Red\n2.Orange\n3.Yellow\n4.Green\n5.Blue\n6.Indigo\n7.Violet");
            }
        } while(favColor.toLowerCase().equals("help"));

        System.out.println("How many siblings do you have?");
        numSiblings = inputDevice.nextInt();

        if(userAge < 25){
            retirementYears = 666;
        } else {
            retirementYears = 1;
        }

        switch (numSiblings) {
            case 0:
                vacationHome = "Boca Raton";
                break;
            case 1:
                vacationHome = "Vermont";
                break;
            case 2:
                vacationHome = "Germany";
                break;
            case 3:
                vacationHome = "Jackson Hole";
                break;
            case 4:
                vacationHome = "California";
                break;
            default:
                vacationHome = "Hell";
                break;
        }

        switch (favColor){
            case "red":
                transportationMode = "Civic";
                break;
            case "orange":
                transportationMode = "Porsche GT3-RS";
                break;
            case "yellow":
                transportationMode = "Suburban";
                break;
            case "green":
                transportationMode = "Cruze";
                break;
            case "blue":
                transportationMode = "Huracan";
                break;
            case "indigo":
                transportationMode = "Enzo";
                break;
            case "violet":
                transportationMode = "BMW S1000R";
                break;
            default:
                transportationMode = "tuk tuk";
                break;
        }

        switch (birthMonth){
            case 1:
            case 2:
            case 3:
                bankBalance = "$1,000,000,000.00";
                break;
            case 4:
            case 5:
            case 6:
                bankBalance = "$7.00";
                break;
            case 7:
            case 8:
            case 9:
                bankBalance = "$10,048.23";
                break;
            case 10:
            case 11:
            case 12:
                bankBalance = "$123.03";
                break;
        }

        System.out.println(firstName + " " + lastName + " will retire in " + retirementYears + " year(s) with " +
                bankBalance + " in the bank, a vacation home in " + vacationHome + " and travel by " + transportationMode);
    }
}
