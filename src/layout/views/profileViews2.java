package layout.views;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class profileViews2 extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	
	public JPanel ProfileViews2;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					profileViews2 frame = new profileViews2();
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
	public profileViews2() {
		
		initComponents();
		createEvents();
		

	}

	private void createEvents() {
		// TODO Auto-generated method stub
		
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		setBounds(100, 100, 598, 432);
		setTitle("Bug Tracker 3000 - My Profile 2\r\n");
		setFrameIcon(new ImageIcon(profileViews2.class.getResource("/layout/resource/BugTracker.png")));
		
		JLabel profileViews2 = new JLabel("My Profile 2");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(249)
					.addComponent(profileViews2)
					.addContainerGap(277, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addComponent(profileViews2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(324, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		
	}

}
