import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

public class Launcher extends JFrame implements ActionListener{
	
	JButton buttonEN, buttonPTBR;
	
	Launcher() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Phrase-O-Matic Launcher");
		this.setLayout(new BorderLayout());
		this.setSize(600, 300);
		this.setLocation(380, 200);
		this.setResizable(false);
		
		JPanel panel1 = new JPanel();
		panel1.setPreferredSize(new Dimension(100, 80));
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.LIGHT_GRAY);
		
		JLabel label = new JLabel("Phrase-O-Matic Launcher");
		label.setFont(new Font("Consolas",Font.BOLD,28));
		
		buttonEN = new JButton("English");
		buttonEN.setPreferredSize(new Dimension(110, 32));
		buttonEN.setCursor(new Cursor(Cursor.HAND_CURSOR));
		buttonEN.setFocusable(false);
		buttonEN.addActionListener(this);
		
		buttonPTBR = new JButton("Português");
		buttonPTBR.setPreferredSize(new Dimension(110, 32));
		buttonPTBR.setCursor(new Cursor(Cursor.HAND_CURSOR));
		buttonPTBR.setFocusable(false);
		buttonPTBR.addActionListener(this);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		
		panel1.add(label);
		
		panel2.add(buttonEN);
		panel2.add(buttonPTBR);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttonPTBR) {
			new Application("pt-br");
		}
		else if (e.getSource() == buttonEN) {
			new Application("en");
		}
		
		this.dispose();
	}
	
}