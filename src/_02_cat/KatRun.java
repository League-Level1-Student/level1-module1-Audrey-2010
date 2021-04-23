package _02_cat;
import javax.swing.JOptionPane;

public class KatRun {
Cat cat = new Cat("not-a-cat");


public static void main(String[] args) {
	Cat cat = new Cat("not-a-cat");
	cat.meow();
	cat.printName();
	for(int i = 0; i<11; i++) {
	cat.kill();
	}
}
}
