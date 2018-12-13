package Rooms;

import Game.Runner;
import People.Person;

public class House extends Room{

	public House(int x, int y) {
        super(x, y);

    }

        /**
         * Triggers the game beginning conditions.
         * @param x the Person entering
         */
        @Override
        public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("Welcome to the house. Before you begin, choose your starter creature.");


    }


    }