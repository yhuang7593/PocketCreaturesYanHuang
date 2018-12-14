package Rooms;

import People.Person;

public class Road extends Room{
    public Road(int x, int y) {
        super(x, y);
    }

    @Override
    public void enterRoom(Person x)
    {
        System.out.println("You have entered a room.");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
}
