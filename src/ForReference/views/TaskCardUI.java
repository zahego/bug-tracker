package ForReference.views;

import javax.swing.JPanel;

import ForReference.common.Task.Task;
import ForReference.common.Ultilities.Utilities;

import javax.swing.JLabel;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class TaskCardUI extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6568130148772142970L;

	/**
	 * Create the panel.
	 */
	public TaskCardUI(Task task) {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBackground(Color.WHITE);
		JLabel quickSummary = new JLabel(task.getQuickSummary());
		JLabel taskType = new JLabel(task.getType().name());
		String dateString = Utilities.getDateString(task.getReportedDate());
		JLabel rpDate = new JLabel(dateString);
		JLabel taskStatus = new JLabel(task.getStatus().name());
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(quickSummary, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(taskType)
							.addPreferredGap(ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
							.addComponent(rpDate)
							.addGap(43)
							.addComponent(taskStatus)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(quickSummary, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(taskType)
						.addComponent(taskStatus)
						.addComponent(rpDate))
					.addContainerGap())
		);
		setLayout(groupLayout);
	}

}
