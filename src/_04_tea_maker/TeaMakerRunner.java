package _04_tea_maker;

import javax.swing.JOptionPane;

public class TeaMakerRunner {
public static void main(String[] args) {
	String flavor  = JOptionPane.showInputDialog("What type of tea do you want?");
	TeaBag tea = new TeaBag(flavor);
	Kettle k = new Kettle();
	Cup c = new Cup();
	k.boil();
	c.makeTea(tea, k.getWater());
}
}
