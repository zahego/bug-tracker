package layout.views;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import common.Enum.BoardType;
import common.TaskHold.TaskHold;
import layout.views.BoardUI.BoardUI;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

public class layoutViews extends JFrame {

	private JPanel contentPane;
	private JButton ProfileButton;
	private JButton MinimizeButtonR;
	private JButton MinimizeButtonM;
	private JButton MinimizeButtonL;
	private JButton AddTaskButton;
	private JButton MaximizeButton;
	private JPanel LeftProjectPanel;
	private JPanel RightProjectPanel;
	private JPanel MidProjectPanel;
	private JPanel OnTakenPanel;
	private JPanel OnGoingPanel;
	private JComboBox<String> ProjectBox; // <String or not>
	private JComboBox<String> SprintBox;
	private JComboBox<String> TeamDropdown;
	private JButton DeMinimizeButtonL;
	private JButton DeMinimizeButtonR;
	private JButton DeMinimizeButtonM;
	private JButton DeMaximizeButton;
	private JTextField SearchBarL;
	private JLabel SearchIconL;
	private JTextField SearchBarR;
	private JLabel SearchIconR;
	private JComboBox<String> FilterL;
	private JComboBox<String> SortL;
	private JComboBox<String> FilterR;
	private JComboBox<String> SortR;
	private JLabel test;
	private JScrollPane scrollOngoing;
	private JScrollPane scrollFinish;
	//private String[] projectlist = {"Lion Project", "Cat Project", "Dog Project"};
	//private String[] sprintlist = {"sprint 1", "sprint 2", "sprint 3"};
	//private String[] sortlist = {"A-Z", "Z-A", "Soonest"};
	//private String[] filterlist = {"High Priority", "Medium Priority", "Low Priority"};
	
	
	
	
	

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
		setBounds(100, 100, 813, 628);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
	
		
		
		ProfileButton = new JButton("Profile");
		
		// ComboBox Section
		
		ProjectBox = new JComboBox<String>(/*projectlist*/);
				
				
		SprintBox = new JComboBox<String>(/*sprintlist*/);
				
		
		
		
		JPanel AppName = new JPanel();
		AppName.setBackground(Color.WHITE);
		
		LeftProjectPanel = new JPanel();
		LeftProjectPanel.setBackground(Color.CYAN);
		
		MidProjectPanel = new JPanel();
		MidProjectPanel.setBackground(Color.YELLOW);
		
		RightProjectPanel = new JPanel();
		RightProjectPanel.setBackground(Color.GREEN);
		
		DeMinimizeButtonL = new JButton("+");
		DeMinimizeButtonL.setBackground(new Color(0, 191, 255));
		DeMinimizeButtonL.setVisible(false);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		MinimizeButtonR = new JButton("-");
		MinimizeButtonR.setBackground(new Color(102, 205, 170));
		
		OnTakenPanel = new JPanel();
		OnTakenPanel.setBackground(Color.WHITE);
		
		OnGoingPanel = new JPanel();
		OnGoingPanel.setBackground(Color.WHITE);
		
		MinimizeButtonM = new JButton("-");
		MinimizeButtonM.setBackground(new Color(255, 255, 224));
		
		MaximizeButton = new JButton("+");
		MaximizeButton.setBackground(new Color(255, 255, 224));
		
		DeMaximizeButton = new JButton("-");
		DeMaximizeButton.setBackground(new Color(255, 255, 224));
		
		DeMaximizeButton.setVisible(false);
		
		
		//////////////////////////////Group Layout Mid Panel /////////////////////////////////
		GroupLayout gl_MidProjectPanel = new GroupLayout(MidProjectPanel);
		gl_MidProjectPanel.setHorizontalGroup(
			gl_MidProjectPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_MidProjectPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_MidProjectPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_MidProjectPanel.createSequentialGroup()
							.addComponent(OnTakenPanel, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(OnGoingPanel, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_MidProjectPanel.createSequentialGroup()
							.addComponent(DeMaximizeButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(148)
							.addComponent(MaximizeButton, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(MinimizeButtonM, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))))
		);
		gl_MidProjectPanel.setVerticalGroup(
			gl_MidProjectPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_MidProjectPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_MidProjectPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(MinimizeButtonM, GroupLayout.PREFERRED_SIZE, 11, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_MidProjectPanel.createParallelGroup(Alignment.BASELINE)
							.addComponent(MaximizeButton, GroupLayout.PREFERRED_SIZE, 11, GroupLayout.PREFERRED_SIZE)
							.addComponent(DeMaximizeButton, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_MidProjectPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(OnTakenPanel, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
						.addComponent(OnGoingPanel, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
					.addContainerGap())
		);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JLabel OnGoingLabel = new JLabel("OnGoing");
		
		scrollOngoing = new JScrollPane();
		
		GroupLayout gl_OnGoingPanel = new GroupLayout(OnGoingPanel);
		gl_OnGoingPanel.setHorizontalGroup(
			gl_OnGoingPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_OnGoingPanel.createSequentialGroup()
					.addGap(60)
					.addComponent(OnGoingLabel, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
					.addGap(61))
				.addGroup(gl_OnGoingPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollOngoing, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_OnGoingPanel.setVerticalGroup(
			gl_OnGoingPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_OnGoingPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(OnGoingLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollOngoing, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
					.addContainerGap())
		);
		OnGoingPanel.setLayout(gl_OnGoingPanel);
		
		JLabel OnTakenLabel = new JLabel("OnTaken");
		
		JScrollPane scrollTaken = new JScrollPane();
		GroupLayout gl_OnTakenPanel = new GroupLayout(OnTakenPanel);
		gl_OnTakenPanel.setHorizontalGroup(
			gl_OnTakenPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_OnTakenPanel.createSequentialGroup()
					.addGap(61)
					.addComponent(OnTakenLabel, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
					.addGap(60))
				.addGroup(gl_OnTakenPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollTaken, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_OnTakenPanel.setVerticalGroup(
			gl_OnTakenPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_OnTakenPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(OnTakenLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollTaken, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		OnTakenPanel.setLayout(gl_OnTakenPanel);
		MidProjectPanel.setLayout(gl_MidProjectPanel);
		
		AddTaskButton = new JButton("Add");
		
		
		MinimizeButtonL = new JButton("-");
		MinimizeButtonL.setBackground(new Color(0, 191, 255));
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		// Name of App
		JLabel AppLabel = new JLabel("Bug Tracker 3000");
		AppLabel.setBackground(Color.WHITE);
		GroupLayout gl_AppName = new GroupLayout(AppName);
		gl_AppName.setHorizontalGroup(
			gl_AppName.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_AppName.createSequentialGroup()
					.addGap(49)
					.addComponent(AppLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(49))
		);
		gl_AppName.setVerticalGroup(
			gl_AppName.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_AppName.createSequentialGroup()
					.addContainerGap()
					.addComponent(AppLabel, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
					.addContainerGap())
		);
		AppName.setLayout(gl_AppName);
		
		SearchBarL = new JTextField();
		SearchBarL.setColumns(10);
		
		SearchIconL = new JLabel("");
		SearchIconL.setIcon(new ImageIcon(layoutViews.class.getResource("/layout/resource/Webp.net-resizeimage.png")));
		
		FilterL = new JComboBox<String>(/*filterlist*/);
		
		SortL = new JComboBox<String>(/*sortlist*/);
		
		JScrollPane scrollBacklog = new JScrollPane();
		
		
		GroupLayout gl_LeftProjectPanel = new GroupLayout(LeftProjectPanel);
		gl_LeftProjectPanel.setHorizontalGroup(
			gl_LeftProjectPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_LeftProjectPanel.createSequentialGroup()
					.addComponent(AddTaskButton, GroupLayout.PREFERRED_SIZE, 41, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(SortL, 0, 36, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(FilterL, 0, 33, Short.MAX_VALUE)
					.addGap(11)
					.addComponent(MinimizeButtonL, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_LeftProjectPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(SearchBarL, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
					.addGap(4)
					.addComponent(SearchIconL, GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
					.addGap(18))
				.addGroup(gl_LeftProjectPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollBacklog, GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_LeftProjectPanel.setVerticalGroup(
			gl_LeftProjectPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_LeftProjectPanel.createSequentialGroup()
					.addGroup(gl_LeftProjectPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(MinimizeButtonL, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_LeftProjectPanel.createParallelGroup(Alignment.BASELINE)
							.addComponent(AddTaskButton)
							.addComponent(FilterL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(SortL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_LeftProjectPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(SearchIconL)
						.addComponent(SearchBarL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollBacklog, GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
					.addContainerGap())
		);
		LeftProjectPanel.setLayout(gl_LeftProjectPanel);
		
		SearchBarR = new JTextField();
		SearchBarR.setColumns(10);
		
		SearchIconR = new JLabel("");
		SearchIconR.setIcon(new ImageIcon(layoutViews.class.getResource("/layout/resource/Webp.net-resizeimage.png")));
		
		FilterR = new JComboBox<String>(/*filterlist*/);
		
		SortR = new JComboBox<String>(/*sortlist*/);
		
		scrollFinish = new JScrollPane();
		GroupLayout gl_RightProjectPanel = new GroupLayout(RightProjectPanel);
		gl_RightProjectPanel.setHorizontalGroup(
			gl_RightProjectPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_RightProjectPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_RightProjectPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_RightProjectPanel.createSequentialGroup()
							.addComponent(scrollFinish, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_RightProjectPanel.createSequentialGroup()
							.addGap(33)
							.addComponent(SortR, 0, 37, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(FilterR, 0, 36, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(MinimizeButtonR, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_RightProjectPanel.createSequentialGroup()
							.addComponent(SearchBarR, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
							.addGap(4)
							.addComponent(SearchIconR, GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
							.addGap(14))))
		);
		gl_RightProjectPanel.setVerticalGroup(
			gl_RightProjectPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_RightProjectPanel.createSequentialGroup()
					.addGroup(gl_RightProjectPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(MinimizeButtonR, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_RightProjectPanel.createParallelGroup(Alignment.BASELINE)
							.addComponent(FilterR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(SortR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(7)
					.addGroup(gl_RightProjectPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(SearchBarR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_RightProjectPanel.createSequentialGroup()
							.addGap(5)
							.addComponent(SearchIconR, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollFinish, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
					.addContainerGap())
		);
		RightProjectPanel.setLayout(gl_RightProjectPanel);
		
		DeMinimizeButtonR = new JButton("+");
		DeMinimizeButtonR.setBackground(new Color(102, 205, 170));
		
		DeMinimizeButtonR.setVisible(false);
		
		DeMinimizeButtonM = new JButton("+");
		DeMinimizeButtonM.setBackground(new Color(255, 255, 224));
		
		DeMinimizeButtonM.setVisible(false);
		
		TeamDropdown = new JComboBox<String>();
		
		test = new JLabel("New label");
		
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(72)
					.addComponent(ProjectBox, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(506, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(72)
					.addComponent(SprintBox, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(506, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(87)
									.addComponent(DeMinimizeButtonL, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
									.addGap(246)
									.addComponent(DeMinimizeButtonM, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
									.addGap(237)
									.addComponent(DeMinimizeButtonR, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGap(16))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap(519, Short.MAX_VALUE)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(TeamDropdown, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(ProfileButton, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))))
							.addGap(49))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(21)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(test)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(LeftProjectPanel, GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(MidProjectPanel, GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(RightProjectPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)))))
					.addGap(12))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(295)
					.addComponent(AppName, GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
					.addGap(291))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(13)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(AppName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(test))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(ProjectBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(TeamDropdown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(SprintBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(ProfileButton))
							.addGap(38)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(DeMinimizeButtonR, GroupLayout.PREFERRED_SIZE, 11, GroupLayout.PREFERRED_SIZE)
								.addComponent(DeMinimizeButtonL, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)))
						.addComponent(DeMinimizeButtonM, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(RightProjectPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(LeftProjectPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(MidProjectPanel, GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))
					.addGap(5))
		);
		
		//////////////////////////////////////////////////Merge (Trung)///////////////////////////////////////////////////////
		TaskHold.loadTask();
		BoardUI backlog = new BoardUI(BoardType.BACKLOG);
		BoardUI taken = new BoardUI(BoardType.TAKEN);
		BoardUI ongoing = new BoardUI(BoardType.ONGOING);
		BoardUI finish = new BoardUI(BoardType.FINISH);
		
		scrollBacklog.setViewportView(backlog);
		scrollTaken.setViewportView(taken);
		scrollOngoing.setViewportView(ongoing);
		scrollFinish.setViewportView(finish);
		
		contentPane.setLayout(gl_contentPane);
	}
	
	

	private void createEvents() {
		// TODO Auto-generated method stub
		
		MinimizeButtonL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//JOptionPane.showMessageDialog(null, "Congrats");
				
				LeftProjectPanel.setVisible(false);
				DeMinimizeButtonL.setVisible(true);
				MaximizeButton.setVisible(false);
				}
		});
		
		MinimizeButtonR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RightProjectPanel.setVisible(false);
				DeMinimizeButtonR.setVisible(true);
				MaximizeButton.setVisible(false);
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
				MaximizeButton.setVisible(false);
				MinimizeButtonM.setVisible(false);
				DeMaximizeButton.setVisible(true);
			}
		});
		
		DeMinimizeButtonL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LeftProjectPanel.setVisible(true);
				DeMinimizeButtonL.setVisible(false);
				MaximizeButton.setVisible(true);
			}
		});
		
		DeMinimizeButtonR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RightProjectPanel.setVisible(true);
				DeMinimizeButtonR.setVisible(false);
				MaximizeButton.setVisible(true);
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
				MaximizeButton.setVisible(true);
				MinimizeButtonM.setVisible(true);
			}
		});
		
		// Using JFrame as a current Solution, maybe JInternalFrame provide a better solution
		ProfileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				profileViews profile = new profileViews();
				profile.setVisible(true);
				
			}
		});
		
		AddTaskButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TaskCreate taskcreate = new TaskCreate();
				taskcreate.setVisible(true);
			}
		});
		
		TeamDropdown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//OpenTeamMemberProfile();
			}
		});
		// DropDown Function
		// DropDown Function will be change from addItem into actionListener + creating a String to hold all object + switch to display different option -> 
		ProjectBox.setEditable(true);
		ProjectBox.addItem("Chicken Project");
		ProjectBox.setSelectedItem("Select A Project");	
		
		SprintBox.setEditable(true);
		SprintBox.setSelectedItem("Select A Sprint");
		
		SortL.setEditable(true);
		SortL.addItem("A-Z");
		SortL.addItem("Z-A");
		
		SortL.setSelectedItem("Sort Here");	
		SortL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()== SortL) {
					JComboBox cb = (JComboBox)e.getSource();
					String sorttype = (String)cb.getSelectedItem();
					switch(sorttype) {
					
					case "A-Z": test.setText("A-Z");
						break;
					case "Z-A": test.setText("Z-A");
						break;
					default: test.setText("Try Again");
					
					}
				}
			}
		});
		
		SortR.setEditable(true);
		SortR.setSelectedItem("Sort Here");
		
		FilterL.setEditable(true);
		FilterL.setSelectedItem("Filter Here");
		
		FilterR.setEditable(true);
		
		FilterR.setSelectedItem("Filter Here");
		
		////////////////////////////////////////////////////////
		
	
	}
}
