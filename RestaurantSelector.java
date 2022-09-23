// ******************************************
// Dagon Katz
// Activity 5
// 09/12/22
// ******************************************

import java.util.Scanner;

public class RestaurantSelector {
    public static void main(String[] args) {
        String response;
        boolean vegetarian=false;
        boolean vegan=false;
        boolean glutenFree=false;

        Scanner sc = new Scanner (System.in);

        System.out.print("Is anyone in your party a vegetarian?");
        response=sc.nextLine();
        if (response.equals("yes")){
            vegetarian = true;

        }
        System.out.print("Is anyone in your party a vegan?");
        response=sc.nextLine();
        if (response.equals("yes")){
            vegan=true;
        }
        System.out.print("Is anyone in your party gluten free?");
        response=sc.nextLine();
        if (response.equals("yes")){
            glutenFree=true;

        System.out.println("Here are your restaurant choices:");

        if(!vegetarian &&!vegan && !glutenFree ){
            System.out.println("Joe's Gourmet Burgers");
        }
        if (!vegan && !glutenFree){
            System.out.println("Main Street Pizza");

        }
        if (!vegan){
            System.out.println("Main Street Pizza");
        }
        else {
            System.out.println ("Corner's Cafe");
            System.out.println("Chef's Kitchen");
            }

        }


    }
}



