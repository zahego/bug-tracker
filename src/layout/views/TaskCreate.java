package layout.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.awt.Image;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TaskCreate extends JFrame implements PropertyChangeListener  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JPanel TaskCreate;
	private JTextField SummaryBox;
	private JComboBox<String> ProjectAssignBar;
	private JComboBox<String> SprintAssignBar ;
	private JComboBox<String> TaskAssignBar;
	private JComboBox<String> PriorityAssignBar;
	private JComboBox<String> AssignedBar;
	private JButton AddFileButton;
	private JTextPane DescriptionBox;
	private JTextPane ReplicateBox;
	private JTextPane SuggestionBox;
	private JButton CreateButton;
	private JTextField DueDateBar;
	private JLabel TaskCreateUpdateTitle;
	private JLabel SummaryLabel;
	private JLabel ProjectAssignLabel;
	private JLabel SprintAssignLabel;
	private JLabel TaskTypeAssignLabel;
	private JLabel PriorityAssignLabel;
	private JLabel DescriptionLabel;
	private JLabel ReplicateLabel;
	private JLabel SuggestionLabel;
	private JLabel DueDateAssignLabel;
	private JLabel MemberAssignLabel;
	private JLabel UploadAssignLabel;
	private JLabel PictureUploadTest;
	
	public ImageIcon ResizeImage(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(PictureUploadTest.getWidth(), PictureUploadTest.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TaskCreate frame = new TaskCreate();
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
	public TaskCreate() {
		
		initComponents();
		createEvents();
		
	}

	private void createEvents() {
		
		
		
		AddFileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//OpenFile() function for GUI only
				 JFileChooser file = new JFileChooser();
		          file.setCurrentDirectory(new File(System.getProperty("user.home")));
		          //filter the files
		          FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
		          file.addChoosableFileFilter(filter);
		          int result = file.showSaveDialog(null);
		           //if the user click on save in Jfilechooser
		          if(result == JFileChooser.APPROVE_OPTION){
		              File selectedFile = file.getSelectedFile();
		              String path = selectedFile.getAbsolutePath();
		              PictureUploadTest.setIcon(ResizeImage(path));
		          }
		           //if the user click on save in Jfilechooser


		          else if(result == JFileChooser.CANCEL_OPTION){
		              System.out.println("No File Select");
		          }
		        }
			
		});
		
		CreateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Add() function
			}
		});
		
		CalendarWindowViews calendar = new CalendarWindowViews();
		calendar.setUndecorated(true);
		calendar.addPropertyChangeListener(this);
		
		
		DueDateBar.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
				
				calendar.setLocation(DueDateBar.getLocationOnScreen().x,(DueDateBar.getLocationOnScreen().y + DueDateBar.getHeight()));
				calendar.setVisible(true);
				
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				calendar.dispose();
			}
		});
		
	}

	private void initComponents() {
		
		
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(TaskCreate.class.getResource("/layout/resource/BugTracker.png")));
		setTitle("Bug Tracker 3000 - Task Create");
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 809);
		TaskCreate = new JPanel();
		TaskCreate.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(TaskCreate);
		
		TaskCreateUpdateTitle = new JLabel("Task Create/ Update");
		TaskCreateUpdateTitle.setFont(new Font("Tahoma", Font.PLAIN, 40));
		
		SummaryLabel = new JLabel("Summary");
		SummaryLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		SummaryBox = new JTextField();
		SummaryBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SummaryBox.setColumns(10);
		
		ProjectAssignBar = new JComboBox<String>();
		
		SprintAssignBar = new JComboBox<String>();
		
		TaskAssignBar = new JComboBox<String>();
		
		PriorityAssignBar = new JComboBox<String>();
		
		ProjectAssignLabel = new JLabel("Project\r\n");
		
		SprintAssignLabel = new JLabel("Sprint\r\n");
		
		TaskTypeAssignLabel = new JLabel("Task Type");
		
		PriorityAssignLabel = new JLabel("Priority\r\n");
		
		DescriptionLabel = new JLabel("Description");
		DescriptionLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		ReplicateLabel = new JLabel("Replicate");
		ReplicateLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		SuggestionLabel = new JLabel("Suggestion\r\n");
		SuggestionLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		DueDateAssignLabel = new JLabel("Due Date");
		
		MemberAssignLabel = new JLabel("Assigned To");
		
		AssignedBar = new JComboBox<String>();
		
		UploadAssignLabel = new JLabel("Attach File\r\n");
		
		AddFileButton = new JButton("Upload");
		
		
		DescriptionBox = new JTextPane();
		
		ReplicateBox = new JTextPane();
		
		SuggestionBox = new JTextPane();
		
		CreateButton = new JButton("Create\r\n");
		
		DueDateBar = new JTextField();
		
		
		DueDateBar.setColumns(10);
		
		PictureUploadTest = new JLabel("");
		
		
		// Group Layout
		GroupLayout gl_TaskCreate = new GroupLayout(TaskCreate);
		gl_TaskCreate.setHorizontalGroup(
			gl_TaskCreate.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_TaskCreate.createSequentialGroup()
					.addGroup(gl_TaskCreate.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_TaskCreate.createSequentialGroup()
							.addGap(65)
							.addComponent(TaskCreateUpdateTitle, GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
							.addGap(47))
						.addGroup(gl_TaskCreate.createSequentialGroup()
							.addContainerGap()
							.addComponent(SummaryLabel))
						.addGroup(gl_TaskCreate.createSequentialGroup()
							.addContainerGap()
							.addComponent(SummaryBox, GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)))
					.addContainerGap())
				.addGroup(gl_TaskCreate.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_TaskCreate.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_TaskCreate.createSequentialGroup()
							.addComponent(SprintAssignLabel, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addGap(112))
						.addGroup(gl_TaskCreate.createSequentialGroup()
							.addGroup(gl_TaskCreate.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_TaskCreate.createSequentialGroup()
									.addGroup(gl_TaskCreate.createParallelGroup(Alignment.LEADING)
										.addComponent(ProjectAssignBar, 0, 147, Short.MAX_VALUE)
										.addComponent(SprintAssignBar, 0, 147, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_TaskCreate.createSequentialGroup()
									.addComponent(ProjectAssignLabel)
									.addGap(112)))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(18)
					.addComponent(PictureUploadTest, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_TaskCreate.createParallelGroup(Alignment.LEADING)
						.addComponent(TaskAssignBar, 0, 148, Short.MAX_VALUE)
						.addComponent(PriorityAssignBar, 0, 148, Short.MAX_VALUE)
						.addGroup(gl_TaskCreate.createSequentialGroup()
							.addComponent(PriorityAssignLabel, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
							.addGap(103))
						.addGroup(gl_TaskCreate.createSequentialGroup()
							.addComponent(TaskTypeAssignLabel, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
							.addGap(73)))
					.addGap(64))
				.addGroup(gl_TaskCreate.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_TaskCreate.createParallelGroup(Alignment.LEADING)
						.addComponent(DescriptionBox, GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
						.addComponent(ReplicateLabel, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(SuggestionLabel, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
						.addComponent(DescriptionLabel, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
						.addComponent(ReplicateBox, GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
						.addComponent(SuggestionBox, GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
						.addGroup(gl_TaskCreate.createSequentialGroup()
							.addGroup(gl_TaskCreate.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_TaskCreate.createSequentialGroup()
									.addComponent(DueDateAssignLabel, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
									.addGap(118))
								.addGroup(gl_TaskCreate.createSequentialGroup()
									.addComponent(DueDateBar, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_TaskCreate.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_TaskCreate.createSequentialGroup()
									.addComponent(MemberAssignLabel, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
									.addGap(72))
								.addGroup(gl_TaskCreate.createSequentialGroup()
									.addComponent(AssignedBar, 0, 123, Short.MAX_VALUE)
									.addGap(46)))
							.addGap(4)
							.addGroup(gl_TaskCreate.createParallelGroup(Alignment.LEADING)
								.addComponent(AddFileButton, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
								.addComponent(UploadAssignLabel, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
							.addGap(51)))
					.addGap(0))
				.addGroup(gl_TaskCreate.createSequentialGroup()
					.addContainerGap(360, Short.MAX_VALUE)
					.addComponent(CreateButton, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_TaskCreate.setVerticalGroup(
			gl_TaskCreate.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_TaskCreate.createSequentialGroup()
					.addContainerGap()
					.addComponent(TaskCreateUpdateTitle)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(SummaryLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(SummaryBox, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
					.addGroup(gl_TaskCreate.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_TaskCreate.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_TaskCreate.createParallelGroup(Alignment.BASELINE)
								.addComponent(ProjectAssignLabel)
								.addComponent(TaskTypeAssignLabel))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_TaskCreate.createParallelGroup(Alignment.BASELINE)
								.addComponent(ProjectAssignBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(TaskAssignBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(19)
							.addGroup(gl_TaskCreate.createParallelGroup(Alignment.BASELINE)
								.addComponent(SprintAssignLabel)
								.addComponent(PriorityAssignLabel))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_TaskCreate.createParallelGroup(Alignment.BASELINE)
								.addComponent(SprintAssignBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(PriorityAssignBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_TaskCreate.createSequentialGroup()
							.addGap(21)
							.addComponent(PictureUploadTest, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(DescriptionLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(DescriptionBox, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(ReplicateLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(ReplicateBox, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(SuggestionLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(SuggestionBox, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_TaskCreate.createParallelGroup(Alignment.BASELINE)
						.addComponent(DueDateAssignLabel)
						.addComponent(UploadAssignLabel)
						.addComponent(MemberAssignLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_TaskCreate.createParallelGroup(Alignment.BASELINE)
						.addComponent(AddFileButton)
						.addComponent(AssignedBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(DueDateBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(25)
					.addComponent(CreateButton))
		);
		TaskCreate.setLayout(gl_TaskCreate);
	}
	
	
	@Override
	public void propertyChange(PropertyChangeEvent event) {
		//get the selected date from the calendar control and set it to the text field
				if (event.getPropertyName().equals("selectedDate")) {
		            
					java.util.Calendar cal = (java.util.Calendar)event.getNewValue();
					Date selDate =  cal.getTime();
					DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyy");  
	                String strDate = dateFormat.format(selDate);  
					DueDateBar.setText(strDate);
		        }
		
	}
	
	
}
