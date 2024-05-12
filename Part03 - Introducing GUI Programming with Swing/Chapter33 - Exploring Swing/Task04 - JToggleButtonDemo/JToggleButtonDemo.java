import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JToggleButtonDemo {
	public JToggleButtonDemo() {
		JFrame jfrm = new JFrame("JToggleButtonDemo");
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setSize(200, 100);
		JLabel jlab = new JLabel("Button is off.");
		JToggleButton jtbn = new JToggleButton("On/Off");
		jtbn.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				if(jtbn.isSelected())
					jlab.setText("Button is on.");
				else
					jlab.setText("Button is off.");
			}
		});
		jfrm.add(jtbn);
		jfrm.add(jlab);
		jfrm.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new JToggleButtonDemo();
			}
		});
	}
}