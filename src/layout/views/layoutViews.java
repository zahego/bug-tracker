package layout.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTree;

public class layoutViews extends JFrame {

	private JPanel contentPane;
	private JButton ProfileButton;
	private JButton MinimizeButtonR;
	private JButton MinimizeButtonM;
	private JButton MinimizeButtonL;
	private JButton AddTaskButton;
	private JButton SortButtonR;
	private JButton SortButtonL;
	private JButton FilterButtonR;
	private JButton FilterButtonL;
	private JButton MaximizeButton;
	private JButton TeamMemberList;
	private JPanel LeftProjectPanel;
	private JPanel RightProjectPanel;
	private JPanel MidProjectPanel;
	private JPanel OnTakenPanel;
	private JPanel OnGoingPanel;
	private JComboBox ProjectBox;
	private JComboBox SprintBox;
	private JButton DeMinimizeButtonL;
	private JButton DeMinimizeButtonR;
	private JButton DeMinimizeButtonM;
	private JButton DeMaximizeButton;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					layoutViews frame = new layoutViews();
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
	public layoutViews() {
		
		initComponents();
		createEvents();
		}
		

	
	private void initComponents() {
		
		//Title Setting
		setBackground(Color.LIGHT_GRAY);
		setFont(new Font("Arial", Font.PLAIN, 12));
		setForeground(Color.WHITE);
		setTitle("Bug Tracker 3000\r\n");
		setIconImage(Toolkit.getDefaultToolkit().getImage(layoutViews.class.getResource("/layout/resource/BugTracker.png")));
		
		
		// TODO Auto-generated method stub
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 628);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
	
		
		
		ProfileButton = new JButton("Profile");
		
		// ComboBox Section
		
		ProjectBox = new JComboBox();
				ProjectBox.setEditable(true);
				ProjectBox.addItem("Lion Project");
				ProjectBox.addItem("Cat Project");
				ProjectBox.addItem("Dog Project");
				ProjectBox.setSelectedItem("Select A Project");
				
		SprintBox = new JComboBox();
				SprintBox.setEditable(true);
				SprintBox.addItem("Sprint 1");
				SprintBox.addItem("Sprint 2");
				SprintBox.addItem("Sprint 3");
				SprintBox.setSelectedItem("Select A Sprint");
		
		
		
		JPanel AppName = new JPanel();
		AppName.setBackground(Color.WHITE);
		
		LeftProjectPanel = new JPanel();
		LeftProjectPanel.setBackground(Color.CYAN);
		
		MidProjectPanel = new JPanel();
		MidProjectPanel.setBackground(Color.YELLOW);
		
		RightProjectPanel = new JPanel();
		RightProjectPanel.setBackground(Color.GREEN);
		
		TeamMemberList = new JButton("Team Member List");
		TeamMemberList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		DeMinimizeButtonL = new JButton("+");
		DeMinimizeButtonL.setVisible(false);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		MinimizeButtonR = new JButton("-");
		
		
		SortButtonR = new JButton("Sort");
		
		FilterButtonR = new JButton("Filter");
		
		OnTakenPanel = new JPanel();
		
		OnGoingPanel = new JPanel();
		
		MinimizeButtonM = new JButton("-");
		
		MaximizeButton = new JButton("+");
		
		
		//////////////////////////////Group Layout Mid Panel /////////////////////////////////
		GroupLayout gl_MidProjectPanel = new GroupLayout(MidProjectPanel);
		gl_MidProjectPanel.setHorizontalGroup(
			gl_MidProjectPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_MidProjectPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_MidProjectPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_MidProjectPanel.createSequentialGroup()
							.addComponent(OnTakenPanel, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
							.addGap(9)
							.addComponent(OnGoingPanel, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_MidProjectPanel.createSequentialGroup()
							.addGap(198)
							.addComponent(MaximizeButton, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(MinimizeButtonM, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
		);
		gl_MidProjectPanel.setVerticalGroup(
			gl_MidProjectPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_MidProjectPanel.createSequentialGroup()
					.addGroup(gl_MidProjectPanel.createParallelGroup(Alignment.BASELINE, false)
						.addComponent(MinimizeButtonM, GroupLayout.PREFERRED_SIZE, 11, GroupLayout.PREFERRED_SIZE)
						.addComponent(MaximizeButton, GroupLayout.PREFERRED_SIZE, 11, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_MidProjectPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(OnGoingPanel, GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
						.addComponent(OnTakenPanel, GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))
					.addContainerGap())
		);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JLabel OnGoingLabel = new JLabel("OnGoing");
		
		GroupLayout gl_OnGoingPanel = new GroupLayout(OnGoingPanel);
		gl_OnGoingPanel.setHorizontalGroup(
			gl_OnGoingPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_OnGoingPanel.createSequentialGroup()
					.addContainerGap(39, Short.MAX_VALUE)
					.addComponent(OnGoingLabel)
					.addGap(37))
		);
		gl_OnGoingPanel.setVerticalGroup(
			gl_OnGoingPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_OnGoingPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(OnGoingLabel)
					.addContainerGap(270, Short.MAX_VALUE))
		);
		OnGoingPanel.setLayout(gl_OnGoingPanel);
		
		JLabel OnTakenLabel = new JLabel("OnTaken");
		GroupLayout gl_OnTakenPanel = new GroupLayout(OnTakenPanel);
		gl_OnTakenPanel.setHorizontalGroup(
			gl_OnTakenPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_OnTakenPanel.createSequentialGroup()
					.addGap(37)
					.addComponent(OnTakenLabel)
					.addContainerGap(39, Short.MAX_VALUE))
		);
		gl_OnTakenPanel.setVerticalGroup(
			gl_OnTakenPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_OnTakenPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(OnTakenLabel)
					.addContainerGap(270, Short.MAX_VALUE))
		);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		OnTakenPanel.setLayout(gl_OnTakenPanel);
		MidProjectPanel.setLayout(gl_MidProjectPanel);
		
		AddTaskButton = new JButton("Add");
		
		SortButtonL = new JButton("Sort");
		SortButtonL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		FilterButtonL = new JButton("Filter");
		
		MinimizeButtonL = new JButton("-");
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		// Name of App
		JLabel AppLabel = new JLabel("Bug Tracker 3000");
		GroupLayout gl_AppName = new GroupLayout(AppName);
		gl_AppName.setHorizontalGroup(
			gl_AppName.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_AppName.createSequentialGroup()
					.addGap(22)
					.addComponent(AppLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(27))
		);
		gl_AppName.setVerticalGroup(
			gl_AppName.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_AppName.createSequentialGroup()
					.addContainerGap()
					.addComponent(AppLabel, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
					.addContainerGap())
		);
		AppName.setLayout(gl_AppName);
		GroupLayout gl_LeftProjectPanel = new GroupLayout(LeftProjectPanel);
		gl_LeftProjectPanel.setHorizontalGroup(
			gl_LeftProjectPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_LeftProjectPanel.createSequentialGroup()
					.addComponent(AddTaskButton, GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(SortButtonL, GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(FilterButtonL, GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(MinimizeButtonL, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_LeftProjectPanel.setVerticalGroup(
			gl_LeftProjectPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_LeftProjectPanel.createSequentialGroup()
					.addGroup(gl_LeftProjectPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(MinimizeButtonL, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_LeftProjectPanel.createParallelGroup(Alignment.BASELINE)
							.addComponent(AddTaskButton)
							.addComponent(SortButtonL)
							.addComponent(FilterButtonL)))
					.addGap(307))
		);
		LeftProjectPanel.setLayout(gl_LeftProjectPanel);
		GroupLayout gl_RightProjectPanel = new GroupLayout(RightProjectPanel);
		gl_RightProjectPanel.setHorizontalGroup(
			gl_RightProjectPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_RightProjectPanel.createSequentialGroup()
					.addGap(25)
					.addComponent(SortButtonR, GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(FilterButtonR, GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(MinimizeButtonR))
		);
		gl_RightProjectPanel.setVerticalGroup(
			gl_RightProjectPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_RightProjectPanel.createSequentialGroup()
					.addGroup(gl_RightProjectPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_RightProjectPanel.createParallelGroup(Alignment.BASELINE)
							.addComponent(SortButtonR)
							.addComponent(FilterButtonR))
						.addComponent(MinimizeButtonR, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(315, Short.MAX_VALUE))
		);
		RightProjectPanel.setLayout(gl_RightProjectPanel);
		
		DeMinimizeButtonR = new JButton("+");
		
		DeMinimizeButtonR.setVisible(false);
		
		DeMinimizeButtonM = new JButton("+");
		
		DeMinimizeButtonM.setVisible(false);
		
		DeMaximizeButton = new JButton("-");
		
		DeMaximizeButton.setVisible(false);
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(258)
					.addComponent(AppName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(263))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(72)
					.addComponent(ProjectBox, 0, 178, Short.MAX_VALUE)
					.addGap(156)
					.addComponent(TeamMemberList, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
					.addGap(91))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(72)
					.addComponent(SprintBox, 0, 178, Short.MAX_VALUE)
					.addGap(156)
					.addComponent(ProfileButton, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
					.addGap(91))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(30)
							.addComponent(LeftProjectPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(MidProjectPanel, GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(RightProjectPanel, GroupLayout.PREFERRED_SIZE, 143, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGap(81)
							.addComponent(DeMinimizeButtonL)
							.addGap(206)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(DeMaximizeButton, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 42, Short.MAX_VALUE)
								.addComponent(DeMinimizeButtonM, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
							.addGap(196)
							.addComponent(DeMinimizeButtonR)
							.addGap(49)))
					.addGap(15))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(27)
					.addComponent(AppName, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 1, Short.MAX_VALUE)
							.addComponent(ProjectBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(TeamMemberList))
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(SprintBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(ProfileButton))
					.addGap(50)
					.addComponent(DeMaximizeButton, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(DeMinimizeButtonL, GroupLayout.PREFERRED_SIZE, 12, Short.MAX_VALUE)
						.addComponent(DeMinimizeButtonR, GroupLayout.PREFERRED_SIZE, 11, GroupLayout.PREFERRED_SIZE)
						.addComponent(DeMinimizeButtonM, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(LeftProjectPanel, GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
						.addComponent(MidProjectPanel, GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
						.addComponent(RightProjectPanel, GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))
					.addGap(5))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	

	private void createEvents() {
		// TODO Auto-generated method stub
		
		MinimizeButtonL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//JOptionPane.showMessageDialog(null, "Congrats");
				
				LeftProjectPanel.setVisible(false);
				DeMinimizeButtonL.setVisible(true);
				//LeftProjectPanel.setVisible(false);
				}
		});
		
		MinimizeButtonR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RightProjectPanel.setVisible(false);
				DeMinimizeButtonR.setVisible(true);
			}
		});
		
		MinimizeButtonM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MidProjectPanel.setVisible(false);
				DeMinimizeButtonM.setVisible(true);
			}
		});
		
		MaximizeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LeftProjectPanel.setVisible(false);
				RightProjectPanel.setVisible(false);
				DeMaximizeButton.setVisible(true);
			}
		});
		
		DeMinimizeButtonL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LeftProjectPanel.setVisible(true);
				DeMinimizeButtonL.setVisible(false);
			}
		});
		
		DeMinimizeButtonR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RightProjectPanel.setVisible(true);
				DeMinimizeButtonR.setVisible(false);
			}
		});
		
		DeMinimizeButtonM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MidProjectPanel.setVisible(true);
				DeMinimizeButtonM.setVisible(false);
			}
		});
		
		DeMaximizeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LeftProjectPanel.setVisible(true);
				RightProjectPanel.setVisible(true);
				DeMaximizeButton.setVisible(false);
			}
		});
		
		// Using JFrame as a current Solution, maybe JInternalFrame provide a better solution
		ProfileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				profileViews profile = new profileViews();
				profile.setVisible(true);
				
			}
		});
		
	
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
