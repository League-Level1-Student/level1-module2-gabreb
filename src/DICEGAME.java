import java.util.Random;

import javax.swing.JOptionPane;

public class DICEGAME {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;
		int g = 0;
		for (int i = 0; i < 60; i++) {
			Random randy = new Random();
			int x = randy.nextInt(6) + 1;
			if (x == 1) {
				a = a + 1;
			} else if (x == 2) {
				b += 1;
			} else if (x == 3) {
				c += 1;
			} else if (x == 4) {
				d += 1;
			} else if (x == 5) {
				f += 1;
			} else {
				g += 1;
			}
		}
		JOptionPane.showMessageDialog(null, "In 60 tries, you got " + a + " ones, " + b + " twos, " + c + " threes \n" + d + " fours, " + f + " fives, and " + g + " sixes!");
	}
}
