package _06_Console_Store;

import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class Item {
	String item;

	public abstract JLabel getItem();

	public Item() {
		if(new Random().nextBoolean()) {
			this.item = "toy1.jpeg";
		}
		else {
			this.item = "toy2.jpeg";
		}
	}
}
