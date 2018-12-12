package Rooms;
import java.util.Scanner;
import People.Person;


public class Lab extends Room {
    public Lab(int x, int y) {
        super(x, y);

    }

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {
        System.out.println("Welcome, you have entered the Poke Lab. I'm Ben, an part-time university student and a full-time pccket creature collector.");
        System.out.println("Your mission is to collect all the pocket creatures out there. If you are ready, enter a to begin.");
        Scanner input=new Scanner(System.in);
        String reponse=input.nextLine();
        if (input.nextLine()=="a"){


        }
    }
}
