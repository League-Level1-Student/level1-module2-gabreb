package _07_tea_party;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

class TeaParty {
	private String name;
	private boolean isWoman;
	private boolean isKnighted;
	private boolean isKnigthed;

	void setName(String n) {
		name = n;
	}

	void isWoman(boolean b) {
		isWoman = b;
	}

	void isKnighted(boolean b2) {
		isKnighted = b2;
	}

	String getName() {
		return this.name;
	}

	boolean getisWoman() {
		return this.isWoman;
	}

	boolean getisKnigthed() {
		return this.isKnigthed;
	}

	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		String message = "Hello ";
		if (isKnighted == true) {
			if (isWoman == true) {
				message = message + "Lady " + name;
			} else {
				message = message + "Sir " + name;
			}
		} else {
			if (isWoman == true) {
				message = message + "Ms. " + name;
			} else {
				message = message + "Mr. " + name;
			}
		}
		return message;
	}
}

