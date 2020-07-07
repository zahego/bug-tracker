package layout.views.AlertUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import common.Alert.AlertHold;
import common.Project.Projecthold;
import common.Team.Userhold;
import common.User.CurrentUserhold;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlertUI extends JFrame {

	private JPanel contentPane;
	private JButton SendAlertButton;
	private JScrollPane AlertBoardPanel;
	private JButton DeleteButton;
	private JScrollPane AlertPanel;
	
	
	
	

	/**
	 * Create the frame.
	 * 
	 */
	public AlertUI() {
		 
	        
	   AlertHold.loadAlert();  
	   AlertHold.loadEmptyAlert();
		initcomponent();
		eventhandler();
		addAlert();
	
	}
	
	private AlertBoardUI alertboard;
	
	private void addAlert() {
		alertboard = new AlertBoardUI();
		// TODO Auto-generated method stub
		AlertPanel.setViewportView(alertboard);
		
	}

	private void eventhandler() {
		// TODO Auto-generated method stub
		SendAlertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlertSendUI alertsend = new AlertSendUI();
				int ID = AlertHold.getAlertList().get(AlertHold.getAlertList().size()-1).getID() + 1;
				alertsend.setIDint(ID);
				alertsend.getTeamDropDown().removeAllItems();
				for (int j = 0; j < Userhold.getUsers().size(); j++) {
	                //remove current user
	                if (Userhold.getUsers().get(j).getID() != CurrentUserhold.getUser().getID()) {
	                    String name = Userhold.getUsers().get(j).getName();
	                    if (!name.isEmpty()) {
	                        alertsend.setTeamDropDown(name);
	                    }
	                }
	                
	            } alertsend.setVisible(true);
			}
		});
		
		DeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alertboard.removeAll();
			
			}
		});
		
		
		
	}

	private void initcomponent() {
		// TODO Auto-generated method stub
		setBounds(100, 100, 655, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		AlertBoardPanel = new JScrollPane();
		
		SendAlertButton = new JButton("Send Alert\r\n");
		DeleteButton = new JButton("Delete Alert\r\n\r\n");
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(AlertBoardPanel, GroupLayout.PREFERRED_SIZE, 594, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(DeleteButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(SendAlertButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)))
					.addContainerGap(21, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(21)
					.addComponent(AlertBoardPanel, GroupLayout.PREFERRED_SIZE, 353, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(SendAlertButton)
					.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
					.addComponent(DeleteButton)
					.addContainerGap())
		);
		
		AlertPanel = new JScrollPane();
		AlertBoardPanel.setViewportView(AlertPanel);
		contentPane.setLayout(gl_contentPane);
		
	}
}
