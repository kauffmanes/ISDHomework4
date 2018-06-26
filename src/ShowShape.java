// Demonstrating Shapes
import java.awt.*;
import java.applet.*;

public class ShowShape extends Applet {
	
	// model - this contains all of the values that
	// we pass to the view
	// first, we set defaults
	String MESSAGE = "Hi.";
	String SHAPE = "OVAL";
	Color COLOR = Color.red;
	Color BGCOLOR = Color.black;
	String FTSTYLE = "REGULAR";
	int FTSIZE = 16;
	int X = 100;
	int Y = 100;

	public void init() {
		setForeground(COLOR);
		setBackground(BGCOLOR);

	}

	// view - this is the part that the user sees
	public void paint (Graphics g) {
		// draw everything here
		g.drawOval((getWidth() / 2) - X / 2, (getHeight() / 2) - Y / 2, X, Y);
		g.drawString("Hello world", 25, 50);
	}

	// controller - these are the inputs that the user controls
}