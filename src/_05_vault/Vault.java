package _05_vault;

import java.util.Random;

public class Vault {
int code = random;
Vault(){
	Random random = new Random();
	random.nextInt()+0+1000000;
}
boolean tryCode(int guess) {
	if(guess==code) {
		return true;
	}
	else {
		return false;
	}
	
}
}
