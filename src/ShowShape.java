// Demonstrating Shapes
import java.awt.*;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ShowShape extends JFrame implements DocumentListener{
	
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
	public ShowShape() {

		setSize(800,800);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(0, 2)); // two columns
		getContentPane().add(mainPanel);
		
		JPanel sidebarPanel = new JPanel();
		sidebarPanel.setLayout(new GridLayout(8, 0)); // eight rows
		sidebarPanel.setBackground(new Color(60,63,111));
		mainPanel.add(sidebarPanel);

		JLabel sidebarLabel = new JLabel("Welcome!");
		sidebarLabel.setForeground(Color.WHITE);
		sidebarPanel.add(sidebarLabel);

		JPanel displayPanel = new JPanel();
		displayPanel.setLayout(new GridLayout(2,0));
		displayPanel.setBackground(Color.WHITE);
		mainPanel.add(displayPanel);
		
		JLabel displayLabel = new JLabel("Please select the values on the left to customize the banner!");
		displayPanel.add(displayLabel);

	// set defaults
		 //MESSAGE = "Hi.";
		 //SHAPE = "OVAL";
		 //FTSTYLE = "REGULAR";
		 //FTSIZE = 16;
		 //X = 100;
		 //Y = 100;
		
		 // set up canvas
		 //setForeground(Color.black);
		 //setBackground(Color.lightGray);

		 //container = getContentPane();
		 
		
		// message
		JLabel messageLabel = new JLabel("Message to display:");
		messageLabel.setForeground(Color.WHITE);
		JTextField msg = new JTextField(20);
		
    //Shape
		JLabel shapeLabel = new JLabel("Shape:");
		shapeLabel.setForeground(Color.WHITE);

		// set up dropdown for shape
		Choice shapeChoice = new Choice();
		shapeChoice.add("Oval");
		shapeChoice.add("Round rectangle");
		shapeChoice.add("Rectangle");
		 
		//Background Color
		JLabel bgColorLabel = new JLabel("Background color:");
		bgColorLabel.setForeground(Color.WHITE);

		// set up dropdown for background color
		Choice bgColorChoice = new Choice();
		bgColorChoice.add("Red");
		bgColorChoice.add("Green");
		bgColorChoice.add("Blue");
		bgColorChoice.add("Cyan");
		bgColorChoice.add("Magenta");
		bgColorChoice.add("Yellow");
		bgColorChoice.add("Black");
		bgColorChoice.add("White");

		//Foreground Color
		JLabel colorLabel = new JLabel("Foreground color:");
		colorLabel.setForeground(Color.WHITE);
		// set up dropdown for foreground color
		Choice colorChoice = new Choice();
		colorChoice.add("Red");
		colorChoice.add("Green");
		colorChoice.add("Blue");
		colorChoice.add("Cyan");
		colorChoice.add("Magenta");
		colorChoice.add("Yellow");
		colorChoice.add("Black");
		colorChoice.add("White");

		// typeface
		// JLabel typefaceLabel = new JLabel("Typeface:");

		//font size
		JLabel ftSizeLabel = new JLabel("Font size:");
		ftSizeLabel.setForeground(Color.WHITE);

		// // font style
		JLabel ftStyleLabel = new JLabel("Font style:");
		ftStyleLabel.setForeground(Color.WHITE);

		// X
		JLabel xLabel = new JLabel("Width (x):");
		xLabel.setForeground(Color.WHITE);
		JTextField x = new JTextField(5);

		// Y
		JLabel yLabel = new JLabel("Height (y):");
		yLabel.setForeground(Color.WHITE);
		JTextField y = new JTextField(5);




		//MESSAGE
		JPanel messagePnl = new JPanel();
		messagePnl.setBackground(new Color(60,63,111));
		messagePnl.add(messageLabel);
		messagePnl.add(msg);

		//SHAPE
		JPanel shapePnl = new JPanel();
		shapePnl.setBackground(new Color(60,63,111));
		shapePnl.add(shapeLabel);
		shapePnl.add(shapeChoice);

		//BGCOLOR
		JPanel bgcolorPnl = new JPanel();
		bgcolorPnl.setBackground(new Color(60,63,111));
		bgcolorPnl.add(bgColorLabel);
		bgcolorPnl.add(bgColorChoice);

		//COLOR
		JPanel colorPnl = new JPanel();
		colorPnl.setBackground(new Color(60,63,111));
		colorPnl.add(colorLabel);
		colorPnl.add(colorChoice);

		//FTSIZE
		JPanel ftSizePnl = new JPanel();
		ftSizePnl.setBackground(new Color(60,63,111));
		ftSizePnl.add(ftSizeLabel);

		//FTSTYLE
		JPanel ftStylePnl = new JPanel();
		ftStylePnl.setBackground(new Color(60,63,111));
		ftStylePnl.add(ftStyleLabel);

		//XY
		JPanel xyPnl = new JPanel();
		xyPnl.setBackground(new Color(60,63,111));
		xyPnl.add(xLabel);
		xyPnl.add(x);
		xyPnl.add(yLabel);
		xyPnl.add(y);

		//Add all control panels to sidebar
		sidebarPanel.add(messagePnl);
		sidebarPanel.add(shapePnl);
		sidebarPanel.add(bgcolorPnl);
		sidebarPanel.add(colorPnl);
		sidebarPanel.add(ftSizePnl);
		sidebarPanel.add(ftStylePnl);
		sidebarPanel.add(xyPnl);

		//Get user actions
		String MESSAGE = msg.getText();
		String SHAPE = shapeChoice.getSelectedItem();
		String BGCOLOR = bgColorChoice.getSelectedItem();
		String COLOR = colorChoice.getSelectedItem();
		String tmpX = x.getText();
		String tmpY = y.getText();
	}
	
	@Override
	public void insertUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void changedUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}
		private boolean shapeWillNotFit(int a, int b) {
			return !!(a > (b / 2));
		}
		
		public void paintComponent(Graphics g) {
			
			
			// store a temp version of each param to perform validation o
		 
		 /*
			String MESSAGE = this.getParameter("MESSAGE");
			String SHAPE = this.getParameter("SHAPE");
			String COLOR = this.getParameter("COLOR");
			String BGCOLOR = this.getParameter("BGCOLOR");
			String FTSTYLE = this.getParameter("FTSTYLE");
			String tmpX = this.getParameter("X");
			String tmpY = this.getParameter("Y");
			String tmpFtSize = this.getParameter("FTSIZE");
	                String tmpH = this.getParameter("HEIGHT");
	                String tmpW = this.getParameter("WIDTH");
			
			// parsed params (can't parseInt on something that doesn't exist,
			// so have to make temp values and then check for existence.
			int X, Y, HEIGHT, WIDTH;
			int FTSIZE;
		 
			
			// check if params are empty and provide defaults
			if (tmpX != null) { X = Integer.parseInt(tmpX); } else { X = 30; }
			if (tmpY != null) { Y = Integer.parseInt(tmpY); } else { Y = 50; }
	                if (tmpW != null) { WIDTH = Integer.parseInt(tmpW); } else { WIDTH = 100; }
			if (tmpH != null) { HEIGHT = Integer.parseInt(tmpH); } else { HEIGHT = 250; }
			if (tmpFtSize != null) { FTSIZE = Integer.parseInt(tmpFtSize); } else { FTSIZE = 12; }
			if (MESSAGE == null) { MESSAGE = "Hi."; }
			if (SHAPE == null) { SHAPE = "OVAL"; }
			if (COLOR == null) { COLOR = "blue"; }
			if (BGCOLOR == null) { BGCOLOR = "orange"; }
			if (FTSTYLE == null) { FTSTYLE = "REGULAR"; }
			
			if (COLOR.equalsIgnoreCase("black")) { setForeground(Color.black); }
			else if (COLOR.equalsIgnoreCase("blue")) { setForeground(Color.blue); }
			else if (COLOR.equalsIgnoreCase("cyan")) { setForeground(Color.cyan); }
			else if (COLOR.equalsIgnoreCase("darkGray")) { setForeground(Color.darkGray); }
			else if (COLOR.equalsIgnoreCase("gray")) { setForeground(Color.gray); }
			else if (COLOR.equalsIgnoreCase("green")) { setForeground(Color.green); }
			else if (COLOR.equalsIgnoreCase("lightGray")) { setForeground(Color.lightGray); }
			else if (COLOR.equalsIgnoreCase("magenta")) { setForeground(Color.magenta); }
			else if (COLOR.equalsIgnoreCase("orange")) { setForeground(Color.orange); }
			else if (COLOR.equalsIgnoreCase("pink")) { setForeground(Color.pink); }
			else if (COLOR.equalsIgnoreCase("red")) { setForeground(Color.red); }
			else if (COLOR.equalsIgnoreCase("white")) { setForeground(Color.white); }
			else if (COLOR.equalsIgnoreCase("yellow")) { setForeground(Color.yellow); }
			else { //showStatus("You must use a valid Java color for the 'COLOR' field."); }
			
			// validate background color
			if (BGCOLOR.equalsIgnoreCase("black")) { setBackground(Color.black); }
			else if (BGCOLOR.equalsIgnoreCase("blue")) { setBackground(Color.blue); }
			else if (BGCOLOR.equalsIgnoreCase("cyan")) { setBackground(Color.cyan); }
			else if (BGCOLOR.equalsIgnoreCase("darkGray")) { setBackground(Color.darkGray); }
			else if (BGCOLOR.equalsIgnoreCase("gray")) { setBackground(Color.gray); }
			else if (BGCOLOR.equalsIgnoreCase("green")) { setBackground(Color.green); }
			else if (BGCOLOR.equalsIgnoreCase("lightGray")) { setBackground(Color.lightGray); }
			else if (BGCOLOR.equalsIgnoreCase("magenta")) { setBackground(Color.magenta); }
			else if (BGCOLOR.equalsIgnoreCase("orange")) { setBackground(Color.orange); }
			else if (BGCOLOR.equalsIgnoreCase("pink")) { setBackground(Color.pink); }
			else if (BGCOLOR.equalsIgnoreCase("red")) { setBackground(Color.red); }
			else if (BGCOLOR.equalsIgnoreCase("white")) { setBackground(Color.white); }
			else if (BGCOLOR.equalsIgnoreCase("yellow")) { setBackground(Color.yellow); }
			else {// showStatus("You must use a valid Java color for the 'BGCOLOR' field."); }
			
			//g.drawRect(0, 0 , WIDTH, HEIGHT); //todo - remove this before submit
			
			// draw the shape
			if (SHAPE.equalsIgnoreCase("RECT")) {
				if (shapeWillNotFit(X, WIDTH) || shapeWillNotFit(Y, HEIGHT)) {
					//showStatus("That shape 'X' is too big to fit.");
				} else {
					g.drawRect((WIDTH/2) - (X/2), (HEIGHT/2) - (Y/2), X, Y);
				}
			} else if (SHAPE.equalsIgnoreCase("ROUNDRECT")) {
				if (shapeWillNotFit(X, WIDTH) || shapeWillNotFit(Y, HEIGHT)) {
					//showStatus("That shape is too big to fit.");
				} else {
					g.drawRoundRect((WIDTH/2) - (X/2), (HEIGHT/2) - (Y/2), X, Y, 15, 15);
				}
			} else if (SHAPE.equalsIgnoreCase("OVAL")) {
				if (shapeWillNotFit(X, WIDTH) || shapeWillNotFit(Y, HEIGHT)) {
					//showStatus("That shape is too big to fit.");
				} else {
					g.drawOval((WIDTH/2) - (X/2), (HEIGHT/2) - (Y/2), X, Y);
				}
			} else {
				//showStatus("You must use 'RECT', 'ROUNDRECT', or 'OVAL' for the shape field.");
			}
			
			// draw the font style
			if (FTSTYLE.equalsIgnoreCase("REGULAR")) {
				g.setFont(new Font("SansSerif", Font.PLAIN, FTSIZE));
			} else if (FTSTYLE.equalsIgnoreCase("BOLD")) {
				g.setFont(new Font("SansSerif", Font.BOLD, FTSIZE));
			} else if (FTSTYLE.equalsIgnoreCase("BOLD ITALIC")) {
				g.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, FTSIZE));
			}
			
			FontMetrics metrics = g.getFontMetrics();
					
			// check if font-width is bigger than width
			if (metrics.stringWidth(MESSAGE) > WIDTH) {
				//showStatus("That font size is too big.");
				// switch to using a fluid font
				drawFluidString(g, MESSAGE, HEIGHT, WIDTH, g.getFont().getStyle(), g.getFont().getSize());
			} else {
				// draw information	
				drawCenteredString(g, MESSAGE, metrics.stringWidth(MESSAGE), HEIGHT, WIDTH);
			}
			}
			}
			*/
		}
		
		/*
		 * To get the width of the message, we have to get the font metrics
		 * Source: https://stackoverflow.com/questions/27706197/how-can-i-center-graphics-drawstring-in-java
		 */
		public void drawCenteredString (Graphics g, String text, int fontWidth, int h, int w) {
			FontMetrics metrics = g.getFontMetrics();
			int x = (w / 2) - (fontWidth / 2);
			int y = (h / 2) - (metrics.getAscent() / 2);
			g.drawString(text, x, y);
		}
		
		/**
		 * to make a fluid font size that will fit, we can just test decreasing the font size until the message width fits 
		 */
		public void drawFluidString(Graphics g, String text, int h, int w, int ftstyle, int ftsize) {
			
			g.setFont(new Font("SansSerif", ftstyle, ftsize));
			FontMetrics metrics = g.getFontMetrics();
			
			int fontWidth = metrics.stringWidth(text);
			
			/* as long as it's too big, decrement the size until it's 10 */
			while (fontWidth > w && ftsize > 10) {
				ftsize -= 1;
				g.setFont(new Font("SansSerif", ftstyle, ftsize));
				metrics = g.getFontMetrics();
				fontWidth = metrics.stringWidth(text);
			}
			
			if (fontWidth > w) {
				//showStatus("That font is too big");
			} else {
				drawCenteredString(g, text, fontWidth, h, w);
			}			
	}

	// view - this is the part that the user sees
	 public static void main(String[] args) {
	       ShowShape ss = new ShowShape();
	       ss.setVisible(true);
	       ss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       
	    }

	// controller - these are the inputs that the user controls
}