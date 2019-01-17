import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class test12 {
	
	int eins;
	int zwei;
	int drei;
	
	
	int[] obenlinks   = {eins, zwei, drei};
	int[] obenmitte   = {eins, zwei, drei};
	int[] obenrechts  = {eins, zwei, drei};
	int[] mittelinks  = {eins, zwei, drei};
	int[] mittemitte  = {eins, zwei, drei};
	int[] mitterechts = {eins, zwei, drei};
	int[] untenlinks  = {eins, zwei, drei};
	int[] untenmitte  = {eins, zwei, drei};
	int[] untenrechts = {eins, zwei, drei};

	private JFrame frame;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test12 window = new test12();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public test12() {
		
		 ImageIcon eins = new ImageIcon("weiss.png");
		 ImageIcon zwei = new ImageIcon("kreuz.jpg");
		 ImageIcon drei = new ImageIcon("kreis.png");	
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(1000, 1000, 1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(3, 3, 0, 0));
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Spieler=Spieler1) {
					Arrays.setObenlinks()=Arrays.getZwei();
					
					
				}
			}
		});
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_2 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_6 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton = new JButton("New button");
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_5 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_8);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
