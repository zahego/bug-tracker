/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout.views.SortUI;

import layout.views.BoardUI.BoardUI;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import java.awt.Toolkit;

/**
 *
 * @author tug70
 */
public class SortUI extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BoardUI toSort;
	private ButtonGroup group;
	private JButton confirmSortButton;
	private JRadioButton summaryAscSortButton;	
	JRadioButton summaryDescSortButton;   
    JRadioButton idAscSortButton;  
    JRadioButton idDescSortButton;    
    JRadioButton severityDescSortButton;    
    JRadioButton severityAscSortButton;    
    JRadioButton dueDateSortButton;
	
	
    /**
     * Creates new form SortUI
     */
    public SortUI(BoardUI boardUI) {
    	setTitle("Bug Tracker 3000 - Sort");
    	setIconImage(Toolkit.getDefaultToolkit().getImage(SortUI.class.getResource("/layout/resource/BugTracker.png")));
    	toSort = boardUI;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void initComponents() {

        setPreferredSize(new Dimension(280, 340));
        confirmSortButton = new JButton("Confirm");
        confirmSortButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        
        JLabel sortByLabel = new JLabel("Sort by:");
        group = new ButtonGroup();        
        summaryAscSortButton = new JRadioButton("Summary (A-Z)");       
        summaryDescSortButton = new JRadioButton("Summary (Z-A)");       
        idAscSortButton = new JRadioButton("Task ID (Asc)");        
        idDescSortButton = new JRadioButton("Task ID (Desc)");      
        severityDescSortButton = new JRadioButton("Severity (High to Low)");      
        severityAscSortButton = new JRadioButton("Severity (Low to High)");     
        dueDateSortButton = new JRadioButton("Most Recent Due Date");
        
        group.add(summaryAscSortButton);
        group.add(summaryDescSortButton);
        group.add(idAscSortButton);
        group.add(idDescSortButton);
        group.add(severityAscSortButton);
        group.add(severityDescSortButton);
        group.add(dueDateSortButton);
        
        confirmSortButton.addActionListener(new ActionListener()
        {
        	  public void actionPerformed(ActionEvent e)
        	  {
    			  if(summaryAscSortButton.isSelected()) {
    				toSort.sortSummaryAsc();
    			  }
    			  else if(summaryDescSortButton.isSelected()) {
    				toSort.sortSummaryDesc();
      			  }
    			  else if(idAscSortButton.isSelected()) {
    				toSort.sortIDAsc();
      			  }
    			  else if(idDescSortButton.isSelected()) {
    				toSort.sortIDDesc();
      			  }
    			  else if(severityDescSortButton.isSelected()) {
    				System.out.print("hooray");
    				toSort.sortSeverityDesc();
      			  }
    			  else if(severityAscSortButton.isSelected()) {
    				toSort.sortSeverityAsc();
      			  }
    			  else if(dueDateSortButton.isSelected()) {
    				toSort.sortDueDate();
      			  }
        		  dispose();
        	  }
        });
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(36)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(sortByLabel)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(10)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(summaryDescSortButton)
        						.addComponent(summaryAscSortButton)
        						.addComponent(idAscSortButton)
        						.addComponent(severityDescSortButton)
        						.addComponent(idDescSortButton)
        						.addComponent(severityAscSortButton)
        						.addComponent(dueDateSortButton))))
        			.addContainerGap(85, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(101, Short.MAX_VALUE)
        			.addComponent(confirmSortButton)
        			.addGap(94))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(19)
        			.addComponent(sortByLabel)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(summaryAscSortButton)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(summaryDescSortButton)
        			.addGap(3)
        			.addComponent(idAscSortButton)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(idDescSortButton)
        			.addGap(3)
        			.addComponent(severityDescSortButton)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(severityAscSortButton)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(dueDateSortButton)
        			.addGap(18)
        			.addComponent(confirmSortButton)
        			.addContainerGap(21, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }
}