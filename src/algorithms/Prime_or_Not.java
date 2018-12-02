package algorithms;
import javax.swing.JOptionPane;

public class Prime_or_Not {
	public static void main(String[] args) {
		int count = 0;
		String num = JOptionPane.showInputDialog("What number do you want to know if it is prime or not?");
		int prime = Integer.parseInt(num);
		for (int i = 1; i <= prime; i++) {
			if (prime % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			JOptionPane.showMessageDialog(null, "Your number is PRIME!!");
		}
		if (count > 2) {
			JOptionPane.showMessageDialog(null, "Your number is COMPOSITE!!");
		}
	}
}
