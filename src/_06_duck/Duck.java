package _06_duck;

import javax.swing.JOptionPane;

public class Duck {
	int numberOfFriends;
	String favoriteFood;
	void quack(){
		JOptionPane.showMessageDialog(null,"quack");
		
	}
		void waddle(){
			JOptionPane.showMessageDialog(null, "and he waddled away");
		}
		Duck(String favoriteFood, int numberOfFriends) {
	      	this.favoriteFood = favoriteFood;
	      	this.numberOfFriends = numberOfFriends;
	}

}

