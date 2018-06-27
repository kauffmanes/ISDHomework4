// Demonstrating Shapes
import java.awt.*;
import javax.swing.*;

public class ShowShape extends JApplet {
	
	// model - this contains all of the values that
	// we pass to the view
	
	// default values
	String MESSAGE;
	String SHAPE;
	Color COLOR;
	Color BGCOLOR;
	String FTSTYLE;
	int FTSIZE;
	int X;
	int Y;

	// Container container;
	// JPanel mainPanel, sidebarPanel;

	// put everything here that is only run when applet first runs
	public void init() {

		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(0, 2)); // two columns

		JPanel sidebarPanel = new JPanel();
		sidebarPanel.setBackground(Color.BLUE);

		JLabel sidebarLabel = new JLabel("Welcome!");
		sidebarLabel.setForeground(Color.WHITE);
		sidebarPanel.add(sidebarLabel);

		JPanel displayPanel = new JPanel();
		JTextArea message = new JTextArea("Something here!");
		displayPanel.add(message);

	// // set defaults
		// MESSAGE = "Hi.";
		// SHAPE = "OVAL";
		// FTSTYLE = "REGULAR";
		// FTSIZE = 16;
		// X = 100;
		// Y = 100;
		
		// // set up canvas
		// setForeground(Color.black);
		// setBackground(Color.lightGray);

		// container = getContentPane();
		// sidebarPanel = new JPanel(new GridLayout(3,1));

		// // set up dropdown for shape
		// Choice shapeChoice = new Choice();
		// shapeChoice.add("Oval");
		// shapeChoice.add("Round rectangle");
		// shapeChoice.add("Rectangle");

		// container.add(sidebarPanel);
		// sidebarPanel.add(shapeChoice);

		// // set up dropdown for background color
		// Choice bgColorChoice = new Choice();
		// bgColorChoice.add("Red");
		// bgColorChoice.add("Green");
		// bgColorChoice.add("Blue");
		// bgColorChoice.add("Cyan");
		// bgColorChoice.add("Magenta");
		// bgColorChoice.add("Yellow");
		// bgColorChoice.add("Black");
		// bgColorChoice.add("White");

		// // set up dropdown for foreground color
		// Choice colorChoice = new Choice();
		// colorChoice.add("Red");
		// colorChoice.add("Green");
		// colorChoice.add("Blue");
		// colorChoice.add("Cyan");
		// colorChoice.add("Magenta");
		// colorChoice.add("Yellow");
		// colorChoice.add("Black");
		// colorChoice.add("White");

		// // create a panel to hold all the controls
		// Panel sidebar = new JPanel();
		// sidebar.setLayout(new GridLayout(1,4,3,3));
		// sidebar.add(shapeChoice);
		// sidebar.add(bgColorChoice);
		// sidebar.add(colorChoice);

		// // message
		// JLabel messageLabel = new JLabel("Message to display:");
		// JTextArea message = new JTextArea();

		// // shape
		// JLabel shapeLabel = new JLabel("Shape:");

		// // background color
		// JLabel bgColorLabel = new JLabel("Background color:");

		// // foreground
		// JLabel colorLabel = new JLabel("Foreground color:");

		// // typeface
		// JLabel typefaceLabel = new JLabel("Typeface:");

		// // font size
		// JLabel ftSizeLabel = new JLabel("Font size:");

		// // font style
		// JLabel ftStyleLabel = new JLabel("Font style:");

		// // X
		// JLabel xLabel = new JLabel("Width (x):");

		// // Y
		// JLabel yLabel = new JLabel("Height (y):");

		// add(messageLabel);
		// add(message);
		// add(shapeLabel);
		// add(bgColorLabel);
		// add(colorLabel);
		// add(typefaceLabel);
		// add(ftSizeLabel);
		// add(ftStyleLabel);
		// add(xLabel);
		// add(yLabel);

	}

	// view - this is the part that the user sees
	// public void paint (Graphics g) {

	// 	// draw everything here
	// 	g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
	// 	g.drawOval((getWidth() / 2) - X / 2, (getHeight() / 2) - Y / 2, X, Y);
	// 	g.drawString("hey world", 25, 50);
		
	// }

	// controller - these are the inputs that the user controls
}