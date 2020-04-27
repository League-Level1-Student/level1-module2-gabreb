package _06_minion;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import static org.junit.Assert.*;

import org.junit.Test;


/*

1. 
Run this MinionTest class. Notice the JUnit tab (by the Package Explorer). It shows a RED bar, because the tests do
not run successfully. Check the Failure Trace below that shows "Minion cannot be resolved to a type". 
This is because there is no Minion class in the package.

2.
 So to make these tests pass, you will first need to create a Minion class with the member variables below:

  			private String name; 
  			private int eyes; 
  			private String color; 
  			private String master;

 3.
  Next, create a constructor, and getters and setters for all the member variables of the Minion class. 
  If they’re done right, all these tests will pass.
  
  To check, run this MinionTest class and the JUnit tab should show a GREEN bar.
    
 */
class Minion {
		private String name; 
		private int eyes; 
		private String color; 
		private String master;
		void setMaster(String w) {
			master = w;
		
		}
		void setName (String n) {
			name = n;
		}
		void setEyes (int e) {
			eyes = e;
		}
		void setColor (String c) {
			color = c;
		}
		
		String getName () {
			return this.name;
		}
		int getEyes () {
			return this.eyes;
		}
		String getColor () {
			return this.color;
		}
		String getMaster() {
			return this.master;
		}
 		
		
		Minion (String name , int eyes, String color, String master) {
			this.name  = name;
			this.color = color;
			this.eyes = eyes;
			this.master = master; 
		}
}
public class MinionTest {

	@Test
	public void testConstructor() {
		Minion stuart = new Minion("Stuart", 1, "yellow", "");
		assertEquals("Stuart", stuart.getName());
		assertEquals(1, stuart.getEyes());
		assertEquals("yellow", stuart.getColor());

		Minion dave = new Minion("Dave", 2, "yellow", "");
		assertEquals("Dave", dave.getName());
		assertEquals(2, dave.getEyes());
		assertEquals("yellow", dave.getColor());
	}

	@Test
	public void testSetters() {
		Minion stuart = new Minion("Stuart", 1, "yellow", "");

		stuart.setMaster("T. Rex");
		assertEquals("T. Rex", stuart.getMaster());

		stuart.setMaster("Napoleon");
		assertEquals("Napoleon", stuart.getMaster());
	}

}



