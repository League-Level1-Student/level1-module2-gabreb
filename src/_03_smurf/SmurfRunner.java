package _03_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf HandySmurf = new Smurf("HandySmurf");
	System.out.println(HandySmurf.getName());
	HandySmurf.eat();
	Smurf PapaSmurf = new Smurf("Papa Smurf");
	System.out.println(PapaSmurf.getName());
	PapaSmurf.getHatColor();
	PapaSmurf.isGirlOrBoy();
	Smurf Smurfette = new Smurf("Smurfette");
	System.out.println(Smurfette.getName());
	Smurfette.getHatColor();
	Smurfette.isGirlOrBoy();
}
}
