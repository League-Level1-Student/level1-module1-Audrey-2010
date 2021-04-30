package _05_vault;

import javax.swing.JOptionPane;

public class VaultRunner {
public static void main(String[] args) {
	Vault vault = new Vault();
	Spy spy = new Spy();
int code=spy.findCode(vault);
if(code==-1) {
	JOptionPane.showMessageDialog(null, "You didn't find the code.");
}
else {
	JOptionPane.showMessageDialog(null, "Oh! The code was "+code+"!");
}
}
}
