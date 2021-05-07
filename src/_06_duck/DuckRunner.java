package _06_duck;

public class DuckRunner {

public static void main(String[] args) {
	Duck ducky = new Duck("popsicles",2);
	Doggo haruki = new Doggo("cookie",5);
	ducky.quack();
	ducky.waddle();
	haruki.play();
	haruki.bark();
}
}
