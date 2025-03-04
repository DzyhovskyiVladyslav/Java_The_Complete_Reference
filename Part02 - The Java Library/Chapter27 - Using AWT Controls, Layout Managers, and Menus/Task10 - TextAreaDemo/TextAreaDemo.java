import java.awt.*;
import java.awt.event.*;

class TextAreaDemo extends Frame {
	
	public TextAreaDemo() {
		setLayout(new FlowLayout());
		String val =
		"JDK 17 is the latest version of one of the most\n" +
		"widely-used computer languages for Internet programming.\n" +
		"Building on a rich heritage, Java has advanced both\n" +
		"the art and science of computer language design.\n\n" +
		"One of the reasons for Java’s ongoing success is its\n" +
		"constant, steady rate of evolution. Java has never stood\n" +
		"still. Instead, Java has consistently adapted to the\n" +
		"rapidly changing landscape of the networked world.\n" +
		"Moreover, Java has often led the way, charting the\n" +
		"course for others to follow.";
		TextArea text = new TextArea(val, 10, 30);
		add(text);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		TextAreaDemo appwin = new TextAreaDemo();
		appwin.setSize(new Dimension(300, 220));
		appwin.setTitle("TextAreaDemo");
		appwin.setVisible(true);
	}
}