package TrungAndAnhIntegration.layout.views;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

import TrungAndAnhIntegration.common.Enum.BoardType;
import TrungAndAnhIntegration.common.Enum.TaskStatus;
import TrungAndAnhIntegration.common.Enum.TaskType;
import TrungAndAnhIntegration.common.Task.Task;
import TrungAndAnhIntegration.common.TaskHold.TaskHold;
import TrungAndAnhIntegration.common.Ultilities.Utilities;
import TrungAndAnhIntegration.layout.views.BoardUI.BoardUI;
import project.Project;
import project.Projecthold;
import sprint.Sprint;
import sprint.Sprinthold;
import team.Userhold;
import user.CurrentUserhold;
import user.User;

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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskCreate extends JFrame implements PropertyChangeListener  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JPanel TaskCreate;
	private BoardUI backlog;
	private JTextField SummaryBox;
	private JComboBox<ComboItem> ProjectAssignBar;
	private JComboBox<Integer> SprintAssignBar ;
	private JComboBox<ComboItem> TaskTypeAssignBar;
	private JComboBox<Integer> SeverityAssignBar;
	private JComboBox<ComboItem> AssignedBar;
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
	private JLabel SeverityAssignLabel;
	private JLabel DescriptionLabel;
	private JLabel ReplicateLabel;
	private JLabel SuggestionLabel;
	private JLabel DueDateAssignLabel;
	private JLabel MemberAssignLabel;
	private JLabel UploadAssignLabel;
	private JLabel PictureUploadTest;
	private File selectedFile;
	private Date selDate;
	private JLabel error;
        
        private boolean checkCalendarVisisble;
	
	public ImageIcon ResizeImage(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(PictureUploadTest.getWidth(), PictureUploadTest.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
	
	/**
	 * Create the frame.
	 */
	public TaskCreate(BoardUI backlog) {
		checkCalendarVisisble=false;
		this.backlog = backlog;
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
		           //if the user clicks on save in Jfilechooser
		          if(result == JFileChooser.APPROVE_OPTION){
		              selectedFile = file.getSelectedFile();
		              String path = selectedFile.getAbsolutePath();
		              PictureUploadTest.setIcon(ResizeImage(path));
		          }
		           //if the user cancels
		          else if(result == JFileChooser.CANCEL_OPTION){
		              System.out.println("No File Select");
		          }
		        }
			
		});
		
		CreateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Add() function
				if(!errorCheck()) {
					addTask();
				}
			}
		});
		
		CalendarWindowViews calendar = new CalendarWindowViews();
		calendar.setUndecorated(true);
		calendar.addPropertyChangeListener(this);
		
		
		DueDateBar.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(checkCalendarVisisble==false){
				calendar.setLocation(DueDateBar.getLocationOnScreen().x,(DueDateBar.getLocationOnScreen().y + DueDateBar.getHeight()));
				calendar.setVisible(true);
                                checkCalendarVisisble=true;
                                }
                                else{
                                    calendar.dispose();
                                    checkCalendarVisisble=false;
                                }
				
				
			}
			/*
			@Override
			public void mouseClicked(MouseEvent e) {
				calendar.dispose();
			}*/
		});
		
	}

	private void initComponents() {
		
		
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(TaskCreate.class.getResource("/TrungAndAnhIntegration/layout/resource/BugTracker.png")));
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
		
		ProjectAssignBar = new JComboBox<ComboItem>();
		
		SprintAssignBar = new JComboBox<Integer>();
		
		TaskTypeAssignBar = new JComboBox<ComboItem>();
		
		SeverityAssignBar = new JComboBox<Integer>();
		
		ProjectAssignLabel = new JLabel("Project\r\n");
		
		SprintAssignLabel = new JLabel("Sprint\r\n");
		
		TaskTypeAssignLabel = new JLabel("Task Type");
		
		SeverityAssignLabel = new JLabel("Severity");
		
		
		DescriptionLabel = new JLabel("Description");
		DescriptionLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		ReplicateLabel = new JLabel("Replicate");
		ReplicateLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		SuggestionLabel = new JLabel("Suggestion\r\n");
		SuggestionLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		DueDateAssignLabel = new JLabel("Due Date");
		
		MemberAssignLabel = new JLabel("Assigned To");
		
		AssignedBar = new JComboBox<ComboItem>();
		
		UploadAssignLabel = new JLabel("Attach File\r\n");
		
		AddFileButton = new JButton("Upload");
		
		
		DescriptionBox = new JTextPane();
		
		ReplicateBox = new JTextPane();
		
		SuggestionBox = new JTextPane();
		
		CreateButton = new JButton("Create\r\n");
		
		DueDateBar = new JTextField();
		
		
		DueDateBar.setColumns(10);
		
		PictureUploadTest = new JLabel("");
		
		error = new JLabel("");
		error.setForeground(Color.RED);
		
		/////////////////////////////////////////Populate all parameters/////////////////////////////////
		List<Project> projects = Projecthold.getProjects();
		for(int i = 0; i < projects.size(); i++) {
			ProjectAssignBar.addItem(new ComboItem(projects.get(i).getName(), projects.get(i).getID()));
		}
		
		List<User> users = Userhold.getUsers();
		for(int i = 0; i < users.size(); i++) {
			AssignedBar.addItem(new ComboItem(users.get(i).getName(), users.get(i).getID()));
		}
		
		List<Sprint> sprints = Sprinthold.getSprints();
		for(int i = 0; i < sprints.size(); i++) {
			SprintAssignBar.addItem(sprints.get(i).getID());
		}
		
		int[] severities = Utilities.makeSequence(1, 10);
		for(int i = 0; i < severities.length; i++) {
			SeverityAssignBar.addItem(severities[i]);
		}
		
		TaskType[] types = TaskType.getAllTaskTypes();
    	for(int i = 0; i < types.length; i++) {
    		TaskTypeAssignBar.addItem(new ComboItem(types[i].toString(), types[i]));
    	}
		
		// Group Layout
		GroupLayout gl_TaskCreate = new GroupLayout(TaskCreate);
		gl_TaskCreate.setHorizontalGroup(
			gl_TaskCreate.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_TaskCreate.createSequentialGroup()
					.addGroup(gl_TaskCreate.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_TaskCreate.createSequentialGroup()
							.addGap(65)
							.addComponent(TaskCreateUpdateTitle, GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
							.addGap(47))
						.addGroup(gl_TaskCreate.createSequentialGroup()
							.addContainerGap()
							.addComponent(SummaryLabel))
						.addGroup(gl_TaskCreate.createSequentialGroup()
							.addContainerGap()
							.addComponent(SummaryBox, GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)))
					.addContainerGap())
				.addGroup(gl_TaskCreate.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_TaskCreate.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_TaskCreate.createSequentialGroup()
							.addComponent(SprintAssignLabel, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addGap(112))
						.addGroup(gl_TaskCreate.createSequentialGroup()
							.addGroup(gl_TaskCreate.createParallelGroup(Alignment.LEADING)
								.addComponent(ProjectAssignBar, 0, 152, Short.MAX_VALUE)
								.addComponent(SprintAssignBar, 0, 152, Short.MAX_VALUE)
								.addGroup(gl_TaskCreate.createSequentialGroup()
									.addComponent(ProjectAssignLabel)
									.addGap(112)))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(18)
					.addComponent(PictureUploadTest, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_TaskCreate.createParallelGroup(Alignment.LEADING)
						.addComponent(TaskTypeAssignBar, 0, 147, Short.MAX_VALUE)
						.addComponent(SeverityAssignBar, 0, 147, Short.MAX_VALUE)
						.addGroup(gl_TaskCreate.createSequentialGroup()
							.addComponent(SeverityAssignLabel, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
							.addGap(103))
						.addGroup(gl_TaskCreate.createSequentialGroup()
							.addComponent(TaskTypeAssignLabel, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
							.addGap(73)))
					.addGap(64))
				.addGroup(gl_TaskCreate.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_TaskCreate.createParallelGroup(Alignment.LEADING)
						.addComponent(DescriptionBox, GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
						.addComponent(ReplicateLabel, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(SuggestionLabel, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
						.addComponent(DescriptionLabel, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
						.addComponent(ReplicateBox, GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
						.addComponent(SuggestionBox, GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
						.addGroup(gl_TaskCreate.createSequentialGroup()
							.addGroup(gl_TaskCreate.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_TaskCreate.createSequentialGroup()
									.addComponent(DueDateAssignLabel, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
									.addGap(118))
								.addGroup(gl_TaskCreate.createSequentialGroup()
									.addComponent(DueDateBar, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_TaskCreate.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_TaskCreate.createSequentialGroup()
									.addComponent(MemberAssignLabel, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
									.addGap(72))
								.addGroup(gl_TaskCreate.createSequentialGroup()
									.addComponent(AssignedBar, 0, 125, Short.MAX_VALUE)
									.addGap(46)))
							.addGap(4)
							.addGroup(gl_TaskCreate.createParallelGroup(Alignment.LEADING)
								.addComponent(AddFileButton, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
								.addComponent(UploadAssignLabel, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
							.addGap(51)))
					.addGap(0))
				.addGroup(gl_TaskCreate.createSequentialGroup()
					.addContainerGap()
					.addComponent(error)
					.addPreferredGap(ComponentPlacement.RELATED, 308, Short.MAX_VALUE)
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
					.addComponent(SummaryBox, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
					.addGroup(gl_TaskCreate.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_TaskCreate.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_TaskCreate.createParallelGroup(Alignment.BASELINE)
								.addComponent(ProjectAssignLabel)
								.addComponent(TaskTypeAssignLabel))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_TaskCreate.createParallelGroup(Alignment.BASELINE)
								.addComponent(ProjectAssignBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(TaskTypeAssignBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(19)
							.addGroup(gl_TaskCreate.createParallelGroup(Alignment.BASELINE)
								.addComponent(SprintAssignLabel)
								.addComponent(SeverityAssignLabel))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_TaskCreate.createParallelGroup(Alignment.BASELINE)
								.addComponent(SprintAssignBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(SeverityAssignBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_TaskCreate.createSequentialGroup()
							.addGap(21)
							.addComponent(PictureUploadTest, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)))
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
					.addGroup(gl_TaskCreate.createParallelGroup(Alignment.BASELINE)
						.addComponent(CreateButton)
						.addComponent(error)))
		);
		TaskCreate.setLayout(gl_TaskCreate);
	}
	
	
	@Override
	public void propertyChange(PropertyChangeEvent event) {
		//get the selected date from the calendar control and set it to the text field
		if (event.getPropertyName().equals("selectedDate")) {
            
			java.util.Calendar cal = (java.util.Calendar)event.getNewValue();
			selDate =  cal.getTime();
			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyy");  
            String strDate = dateFormat.format(selDate);  
			DueDateBar.setText(strDate);
        }
	}
	
	public boolean errorCheck() {
		if(this.backlog==null) {
			error.setText("Dev Error: backlog has not been passed to TaskCreate constructor");
			return true;
		}
		if(Utilities.compareWithTodayDate(selDate)<0) {
			error.setText("Due date must be after today's date!");
			return true;
		}
		if(CurrentUserhold.getUser()==null) {
			error.setText("You must log in to add new task!");
			return true;
		}
		return false;
	}
	
	public void addTask() {
		//add task and notify main UI
		Task task = new Task(-1, (TaskType) ((ComboItem) TaskTypeAssignBar.getSelectedItem()).getValue(),
				SummaryBox.getText(), (int) ((ComboItem) ProjectAssignBar.getSelectedItem()).getValue(),
				(int) SprintAssignBar.getSelectedItem(), (int) SeverityAssignBar.getSelectedItem(),
				TaskStatus.ONNEW, Utilities.getCurrentDate(), ReplicateBox.getText(),
				DescriptionBox.getText(), SuggestionBox.getText(), selDate, selectedFile,
				CurrentUserhold.getUser().getID(), new ArrayList<Integer>());
		task.addAssignee((int)((ComboItem) AssignedBar.getSelectedItem()).getValue());
		TaskHold.addTask(task);
		System.out.print(TaskHold.filter(BoardType.BACKLOG).size());
		this.backlog.refresh();
		dispose();
	}
}

///////////////////////////To be revised/////////////////////////
class ComboItem
{
    private String key;
    private Object value;

    public ComboItem(String key, String value)
    {
        this.key = key;
        this.value = value;
    }
    
    public ComboItem(String key, int value)
    {
        this.key = key;
        this.value = value;
    }
    
    public ComboItem(String key, TaskType value)
    {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString()
    {
        return key;
    }

    public String getKey()
    {
        return key;
    }

    public Object getValue()
    {
        return value;
    }
}
