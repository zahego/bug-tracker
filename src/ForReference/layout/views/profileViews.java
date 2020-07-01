package ForReference.layout.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.SwingConstants;

public class profileViews extends JFrame {

	public JPanel ProfileViews;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					profileViews frame = new profileViews();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public profileViews() {
		
		initComponents();
		createEvents();
		
	}

	

	private void initComponents() {
		
		
		
		setTitle("Bug Tracker 3000 - My Profile");
		//setIconImage(Toolkit.getDefaultToolkit().getImage(profileViews.class.getResource("/layout/resource/BugTracker.png")));
		
		// TODO Auto-generated method stub
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 663, 525);
		ProfileViews = new JPanel();
		ProfileViews.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(ProfileViews);
		
		JLabel MyProfile = new JLabel("My Profile");
		MyProfile.setBackground(Color.ORANGE);
		GroupLayout gl_ProfileViews = new GroupLayout(ProfileViews);
		gl_ProfileViews.setHorizontalGroup(
			gl_ProfileViews.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ProfileViews.createSequentialGroup()
					.addGap(279)
					.addComponent(MyProfile)
					.addContainerGap(300, Short.MAX_VALUE))
		);
		gl_ProfileViews.setVerticalGroup(
			gl_ProfileViews.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ProfileViews.createSequentialGroup()
					.addGap(44)
					.addComponent(MyProfile, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(382, Short.MAX_VALUE))
		);
		ProfileViews.setLayout(gl_ProfileViews);
		
	}
	
	private void createEvents() {
		// TODO Auto-generated method stub
		
	}
}
