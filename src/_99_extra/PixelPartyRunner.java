package _99_extra;

public class PixelPartyRunner {
public static void main(String[] args) {
	PixelParty p = new PixelParty();
	p.setColor(200, 0, 0);
	for (int i = 0; i < 8; i++) {
	p.drawCircle((60+60*i),30, 30);
	p.saveImage();
	p.displayImage();
	}
}
}
