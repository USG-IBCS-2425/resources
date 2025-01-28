import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MultiWindow {
	private JFrame startFrame;
	private JLabel welcomeText;

	public MultiWindow() {
		startFrame = new JFrame("Image Example");
		startFrame.setSize(400, 300);
		welcomeText = new JLabel("Welcome to the Image Example", JLabel.CENTER);
		welcomeText.setBounds(100, 50, 200, 40);

		startFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }        
        });

        startFrame.add(welcomeText);
        startFrame.setLayout(null);
        startFrame.setVisible(true);

        JFrame f = new JFrame();
		JPanel p = new JPanel();
		ImageIcon icon = new ImageIcon("daisy.png");
		JLabel lab = new JLabel(icon);
		f.add(p);
		p.add(lab);
		f.pack();
		f.setVisible(true);
    
	}

	public static void main(String[] args) {
		MultiWindow mWin = new MultiWindow();
	}
}