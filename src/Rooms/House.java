package Rooms;
import People.Person;
public class House extends Room {
    public House(int x, int y) {
        super(x, y);
    }

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    public void enterRoom(Person x) {
        System.out.println("Welcome, you have entered the Poke House. I'm Ben, an part-time university student and a full-time pccket creature collector.");
        System.out.println("Your starter poke creature is Firemander.Your mission is to collect all the pocket creatures out there.");
    }
}