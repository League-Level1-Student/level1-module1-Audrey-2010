package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	Popcorn popcorn = new Popcorn("cheese");
	for(int i = 0; i<21; i++) {
	popcorn.applyHeat();
	}
String flavor=JOptionPane.showInputDialog("What's the flavor of the popcorn?");
String minutes=JOptionPane.showInputDialog("Hmmm...How long should I cook it in the Microwave?");
popcorn.eat();
}
}
