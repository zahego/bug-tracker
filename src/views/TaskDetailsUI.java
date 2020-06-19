package views;

import javax.swing.JInternalFrame;

import common.Task.Task;
import javax.swing.JTextField;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class TaskDetailsUI extends JInternalFrame {

	private static final long serialVersionUID = -8773391650087353989L;
	private JTextField txtFafafafafa;


	/**
	 * Create the frame.
	 */
	public TaskDetailsUI(Task task) {
		setSize(500, 500);
		setMaximizable(true);
		setIconifiable(true);
		setResizable(true);
		setClosable(true);
		setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
		
		txtFafafafafa = new JTextField();
		txtFafafafafa.setText("fafafafafa");
		txtFafafafafa.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(txtFafafafafa, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(txtFafafafafa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		);
		getContentPane().setLayout(groupLayout);
		show();
	}

}
