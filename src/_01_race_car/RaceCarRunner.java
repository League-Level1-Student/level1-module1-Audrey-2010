package _01_race_car;

import javax.swing.JOptionPane;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	String name=JOptionPane.showInputDialog("What's your racing name?");
	RaceCar car = new RaceCar("kart", 5);

		// 2. Print the RaceCar's position in the race
JOptionPane.showMessageDialog(null,"Commenter: Hey "+name+", you're in fifth place!");
		// 3. Crash the RaceCar
JOptionPane.showMessageDialog(null, "a little while later");
JOptionPane.showMessageDialog(null,"bonk");
JOptionPane.showMessageDialog(null,"Commenter: Uh oh. Looks like "+name+" crashed their car!");
car.crash();
		// 4. If the car is damaged. Bring it in for a pit stop.
car.isDamaged();
car.pit();
JOptionPane.showMessageDialog(null, "Commenter: Hey look, "+name+"'s made it! Three racers passed you while you were being pitted. ");
		// 5. Help the car move into first place.
car.overtake();
JOptionPane.showMessageDialog(null, "Commenter: Looks like "+name+" made a close call with Jerry, but zooms ahead, unharmed. ");
	car.overtake();
	JOptionPane.showMessageDialog(null, "Commenter: Look,"+name+"'s really zoomin this time!");
	car.overtake();
	car.overtake();
	car.overtake();
	car.overtake();
	car.overtake();
	JOptionPane.showMessageDialog(null, "For the seventh annual racing cup, i'm proud to say that "+name+" is the winner! Congrats!");
	}
}
