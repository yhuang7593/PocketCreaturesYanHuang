package Rooms;

import java.util.Scanner;
import People.Person;
public class House extends Room {
    public House(int x, int y) {
        super(x, y);

    }

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {
        System.out.println("Welcome, you have entered the Poke House. I'm Ben, an part-time university student and a full-time pccket creature collector.");
        System.out.println("Your mission is to collect all the pocket creatures out there. If you are ready, enter a to begin.");
        Scanner input=new Scanner(System.in);
        String response=input.nextLine();
        if (input.nextLine()=="a") {
            System.out.println("You got the Firemander!!");
        }
        else if(input.nextLine()=="b") {
            System.out.println("You got the Waterina!!");
        }
        else if(input.nextLine()=="c") {
            System.out.println("You got the Earthera!!");
        }
        else if(input.nextLine()=="d") {
            System.out.println("You got the Airex!!");
        }
        System.out.println("Now that you have a starter, leave the house and go catch the other creatures!");
    }
}