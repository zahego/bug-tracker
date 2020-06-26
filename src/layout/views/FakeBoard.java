package layout.views;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Scrollbar;
import javax.swing.JScrollBar;

public class FakeBoard extends JPanel {

	/**
	 * Create the panel.
	 */
	public FakeBoard() {
		initComponents();
		createEvents();
		
		

	}

	private void createEvents() {
		// TODO Auto-generated method stub
		
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		JLabel BoardTitle = new JLabel("Fake Board");
		
		JScrollBar scrollBar = new JScrollBar();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(42)
					.addComponent(BoardTitle)
					.addPreferredGap(ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
					.addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(BoardTitle)
					.addContainerGap(285, Short.MAX_VALUE))
				.addComponent(scrollBar, GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
		);
		setLayout(groupLayout);
	}
}
