package Rooms;

import People.Person;

import java.util.Scanner;

public class Road extends Room{
    public Road(int x, int y) {
        super(x, y);
    }

    public void enterRoom(Person x)
    {
        System.out.println("You have entered the road.");
        System.out.println("There is a poke creature! Would you like to catch it?[Y/N]");
        Scanner choice= new Scanner(System.in);
        String decision = choice.nextLine();
        if (decision.equals("Y")){
            System.out.println("You got the Airex!!");
        }
        else {
            System.out.println("You missed your chance :( Keeping trying!");
        }
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
    /**
     * Removes the player from the room.
     * @param x
     */
    public void leaveRoad(Person x)
    {
        occupant = null;
    }
}
