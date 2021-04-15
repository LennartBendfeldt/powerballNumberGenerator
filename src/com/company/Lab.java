package com.company;


//          1. Ask the user for 5 numbers and store them in an array list.
//        Then find the sum, product, largest, and smallest of those numbers.
//
//        2. You are a car dealer - create a hash map of vehicles:
//
//        The model is the Key, the make is the Value.
//
//        Ask the customer what car (model) they are looking for,
//
//        use the HashMap to determine if you have that vehicle, and what make it is.
//
//        (e.g., "Oh, you're looking for a Civic? Our Honda selection is right over here...")


import java.util.*;

public class Lab {

    public static void myNumbers(){

        //Create our integers arraylist
        ArrayList<Integer> integersList = new ArrayList<Integer>();
        Scanner inputDevice = new Scanner(System.in);
        int userInput;


        //Get 5 numbers from the user
        for(int i = 0; i < 5; i++){
            System.out.println("Please enter a number: ");
            userInput = inputDevice.nextInt();

            integersList.add(userInput);
            System.out.println(integersList);
        }


        //Sum the five numbers
        int sum = 0;
        for(Integer myInt :  integersList){
            sum = sum + myInt;
        }
        System.out.println("The sum of your five numbers is: " + sum);


        //Find the product of these 5 numbers
        int product = 1;
        for(Integer myInt :  integersList){
            product = product * myInt;
        }
        System.out.println("The product of your five numbers is: " + product);


        //Find the largest number
        int largest = 0;
        for(Integer myInt :  integersList){
            if(myInt > largest){
                largest = myInt;
            }
        }
        System.out.println("The largest of your five numbers is: " + largest);


        //Find the smallest number
        int smallest = largest;
        for(Integer myInt :  integersList){
            if(myInt < smallest){
                smallest = myInt;
            }
        }
        System.out.println("The smallest of your five numbers is: " + smallest);
    }














    public static void carDealer(){

        HashMap<String, String> dealershipStock = new HashMap<String, String>();

        dealershipStock.put("Civic", "Honda");
        dealershipStock.put("CR-V", "Honda");
        dealershipStock.put("GT3-RS", "Porsche");
        dealershipStock.put("Sierra", "GMC");
        dealershipStock.put("Silverado", "Chevrolet");
        dealershipStock.put("Suburban", "Chevrolet");
        dealershipStock.put("Taurus", "Ford");
        dealershipStock.put("Sentra", "Nissan");
        dealershipStock.put("Tacoma", "Toyota");

        String customerInput;
        Scanner inputDevice = new Scanner(System.in);

        System.out.println("What model are you looking for?");
        customerInput = inputDevice.next();

        String searchStock = dealershipStock.get(customerInput);

        if(searchStock == null){
            System.out.println("Sorry, we do not have that model");
        } else {
            System.out.println("Oh, you're looking for a " + customerInput + "? Here is our selection of " + dealershipStock.get(customerInput) + "s");
        }

        ArrayList<String> models = new ArrayList<String>();


        for (Map.Entry<String, String> entry : dealershipStock.entrySet()) {
            if (entry.getValue().equals(dealershipStock.get(customerInput))) {
                models.add(entry.getKey());
            }
        }

        String modelString = models.toString();

        System.out.println(modelString.replace("[","").replace("]","").replace(",", " "));
    }
}
