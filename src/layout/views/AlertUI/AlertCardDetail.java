package layout.views.AlertUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import common.Alert.Alert;
import common.Team.Userhold;
import common.User.CurrentUserhold;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;

public class AlertCardDetail extends JFrame {

	private JPanel contentPane;
	private JLabel SenderLabel;
	private JScrollPane scrollPane;
	private JLabel SenderName;
	private JLabel SenderRole;
	private JTextField textField;
	private JTextField MessageTextField_1;
	private JLabel AlertName;
	private JLabel StatusLabel;
	private JLabel Status;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 * @param alert 
	 */
	public AlertCardDetail(Alert alert) {
		
		

		// TODO Auto-generated method stub
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		SenderLabel = new JLabel("Sender\r\n");
		
	
		
		
		
		scrollPane = new JScrollPane();
		SenderName = new JLabel();
		for (int i = 0; i< Userhold.getUsers().size(); i++)
			if(alert.getSender()==(Userhold.getUsers().get(i).getID())){
				SenderName = new JLabel(Userhold.getUsers().get(i).getName());
			}
			
			
			
			for (int i = 0; i< Userhold.getUsers().size(); i++)
				if(alert.getSender()==(Userhold.getUsers().get(i).getID())){
					SenderRole = new JLabel(Userhold.getUsers().get(i).getRole().toString());
				}
		
		AlertName = new JLabel(alert.getName());
		
		StatusLabel = new JLabel("Status :");
		
		Status = new JLabel(alert.getStatus());
		
		if(alert.getSender()==(CurrentUserhold.getUser().getID())){
			Status = new JLabel("SENT");
		} else {
			Status = new JLabel("RECEIVED");
		}
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 562, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(SenderLabel)
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(SenderRole)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(SenderName)
											.addGap(306)
											.addComponent(StatusLabel)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(Status))))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(253)
							.addComponent(AlertName)))
					.addContainerGap(119, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(8)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(SenderLabel)
							.addComponent(SenderName))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(Status)
							.addComponent(StatusLabel)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(SenderRole)
					.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
					.addComponent(AlertName)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 344, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		MessageTextField_1 = new JTextField(alert.getmessage());
		scrollPane.setViewportView(MessageTextField_1);
		MessageTextField_1.setColumns(10);
		MessageTextField_1.setEditable(false);
		contentPane.setLayout(gl_contentPane);
		
		
		
		
		
		
		
	}
}
