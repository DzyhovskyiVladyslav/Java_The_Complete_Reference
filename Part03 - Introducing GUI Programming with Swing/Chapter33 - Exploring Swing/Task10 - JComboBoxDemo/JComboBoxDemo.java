import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JComboBoxDemo {
	String[] timepieces = { "test1", "test2", "test3", "test4" };
	public JComboBoxDemo() {
		JFrame jfrm = new JFrame("JCombBoxDemo");
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setSize(400, 250);
		JComboBox<String> jcb = new JComboBox<String>(timepieces);
		jfrm.add(jcb);
		JLabel jlab = new JLabel(new ImageIcon("test1.png"));
		jfrm.add(jlab);
		jcb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String s = (String) jcb.getSelectedItem();
				jlab.setIcon(new ImageIcon(s + ".png"));
			}
		});
		jfrm.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new JComboBoxDemo();
			}
		});
	}
}