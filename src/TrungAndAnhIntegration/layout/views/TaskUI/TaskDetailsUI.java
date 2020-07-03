package TrungAndAnhIntegration.layout.views.TaskUI;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import TrungAndAnhIntegration.common.Task.Task;
import TrungAndAnhIntegration.common.Ultilities.Utilities;

import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TaskDetailsUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3694449758122544394L;
	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public TaskDetailsUI(Task task) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Task info", null, panel, null);
		
		JLabel taskID = new JLabel(String.valueOf(task.getID()));
		
		JLabel projectID = new JLabel(String.valueOf(task.getProjectID()));
		
		JLabel sprintID = new JLabel(String.valueOf(task.getSprintID()));
		
		JLabel quickSummary = new JLabel(task.getQuickSummary());
		
		JLabel assigner = new JLabel("Assigner");
		
		JLabel assignees = new JLabel("Assignees");
		
		JLabel date = new JLabel(Utilities.getDateString(task.getReportedDate()));
		
		JLabel taskStatus = new JLabel(task.getStatus().toString());
		
		JLabel taskIDLabel = new JLabel("ID:");
		
		JLabel sprintIDLabel = new JLabel("Sprint:");
		
		JLabel projectIDLabel = new JLabel("Project ID:");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(quickSummary)
							.addContainerGap())
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(assigner)
								.addComponent(date))
							.addGap(46)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(taskStatus)
								.addComponent(assignees))
							.addGap(262))
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(taskIDLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(taskID, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addGap(95)
							.addComponent(projectIDLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(projectID)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(sprintIDLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(sprintID, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addGap(59))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(projectID)
						.addComponent(taskID)
						.addComponent(taskIDLabel)
						.addComponent(projectIDLabel)
						.addComponent(sprintID)
						.addComponent(sprintIDLabel))
					.addGap(18)
					.addComponent(quickSummary)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(assigner)
						.addComponent(assignees))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(date)
						.addComponent(taskStatus))
					.addContainerGap(352, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}
}
