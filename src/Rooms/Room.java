package Rooms;
import People.Person;

import java.util.Scanner;

public class Room {
    Person occupant;
    int xLoc,yLoc;

    public Room(int x, int y)
    {
        xLoc = x;
        yLoc = y;
    }

    /**
     * Method controls the results when a person enters this room.
     * @param x the Person entering
     */
    public void enterRoom(Person x)
    {
        System.out.println("You enter a plain old room");
        System.out.println("There is a poke creature! Would you like to catch it?[Y/N]");
        Scanner choice= new Scanner(System.in);
        String decision = choice.nextLine();
        if (decision.equals("Y")){
            System.out.println("You caught Earthera!!");
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
    public void leaveRoom(Person x)
    {
        occupant = null;
    }


}

