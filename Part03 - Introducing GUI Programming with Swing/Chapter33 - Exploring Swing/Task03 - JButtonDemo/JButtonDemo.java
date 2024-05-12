import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JButtonDemo implements ActionListener {
	JLabel jlab;
	
	public JButtonDemo() {
		JFrame jfrm = new JFrame("JButtonDemo");
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setSize(500, 450);
		ImageIcon hourglass = new ImageIcon("test1.png");
		JButton jb = new JButton(hourglass);
		jb.setActionCommand("test1");
		jb.addActionListener(this);
		jfrm.add(jb);
		ImageIcon analog = new ImageIcon("test2.png");
		jb = new JButton(analog);
		jb.setActionCommand("test2");
		jb.addActionListener(this);
		jfrm.add(jb);
		ImageIcon digital = new ImageIcon("test3.png");
		jb = new JButton(digital);
		jb.setActionCommand("test3");
		jb.addActionListener(this);
		jfrm.add(jb);
		ImageIcon stopwatch = new ImageIcon("test4.png");
		jb = new JButton(stopwatch);
		jb.setActionCommand("test4");
		jb.addActionListener(this);
		jfrm.add(jb);
		jlab = new JLabel("Choose a test");
		jfrm.add(jlab);
		jfrm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		jlab.setText("You selected " + ae.getActionCommand());
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new JButtonDemo();
			}
		});
	}
}