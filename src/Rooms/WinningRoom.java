package Rooms;

import Game.Runner;
import People.Person;

import java.util.Scanner;

public class WinningRoom extends Room
{

	public WinningRoom(int x, int y) {
		super(x, y);
	}

	/**
	 * Triggers the game ending conditions.
	 * @param x the Person entering
	 */
	public void enterRoom(Person x) {
		System.out.println("There is a poke creature! Would you like to catch it?[Y/N]");
		Scanner choice= new Scanner(System.in);
		String decision = choice.nextLine();
		if (decision.equals("Y")){
			System.out.println("You caught Earthera!!");
			System.out.println("Congratulations, you actually collected them all already!");
			Runner.gameOff();
		} else {
			System.out.println("You missed your chance :( Keeping trying!");
			System.out.println("Haha...just kidding. This is the winning room! Congratulations, you have collected them all!");
			Runner.gameOff();
		}
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}
	

}
