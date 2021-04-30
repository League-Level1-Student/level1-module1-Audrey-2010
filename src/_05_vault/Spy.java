package _05_vault;


import javax.swing.JOptionPane;

public class Spy {
String name = "James Bond" ;

int findCode(Vault myVault) {
	for(int i = 0; i<1000000; i++) {
	if(myVault.tryCode(i)) {
	JOptionPane.showMessageDialog(null, "Congrats! You cracked the code.");	
	return i;
	}


	}
	
	return -1;	
	}

}

