import java.awt.*;
import javax.swing.*;

public class JLabelDemo {
	public JLabelDemo() {
		JFrame jfrm = new JFrame("JLabelDemo");
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setSize(260, 210);
		ImageIcon ii = new ImageIcon("test.png");
		JLabel jl = new JLabel("Test", ii, JLabel.CENTER);
		jfrm.add(jl);
		jfrm.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new JLabelDemo();
			}
		});
	}
}