package _06_duck;
import javax.swing.JOptionPane;
public class Doggo {
	int numberOfFriends;
	String favoriteFood;
	void bark(){
		JOptionPane.showMessageDialog(null,"bork");
	}
		void play(){
			JOptionPane.showMessageDialog(null, "he play");
		}
		Doggo(String favoriteFood, int numberOfFriends) {
	      	this.favoriteFood = favoriteFood;
	      	this.numberOfFriends = numberOfFriends;
	}
}
