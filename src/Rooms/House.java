package Rooms;
import People.Person;

public class House{
    Person occupant;
    int xLoc,yLoc;

    public House(int x, int y)
    {
        xLoc = x;
        yLoc = y;
    }

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    public void enterHouse(Person x)
    {
        System.out.println("Welcome, you have entered the Poke House. I'm Ben, an part-time university student and a full-time pccket creature collector.");
        System.out.println("Your starter poke creature is Firemander.Your mission is to collect all the pocket creatures out there.");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
    /**
     * Removes the player from the room.
     * @param x
     */
    public void leaveHouse(Person x)
    {
        occupant = null;
    }

}
