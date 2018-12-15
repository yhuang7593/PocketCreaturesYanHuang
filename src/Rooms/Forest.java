package Rooms;

import People.Person;

import java.util.Scanner;

public class Forest extends Room{
        public Forest(int x, int y) {
            super(x, y);
        }
        public void enterRoom(Person x)
        {
            System.out.println("You have entered the forest.");
            System.out.println("There is a poke creature! Would you like to catch it?[Y/N]");
            Scanner choice= new Scanner(System.in);
            String decision = choice.nextLine();
            if (decision.equals("Y")){
                System.out.println("You caught Waterina!!");
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
    public void leaveForest(Person x)
    {
        occupant = null;
    }
    }

