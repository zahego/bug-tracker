package layout.views.AlertUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import layout.views.project.ProjectUIDropdown;
import layout.views.screen.ScreenUI;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JScrollBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.ListSelectionModel;
import javax.swing.event.PopupMenuListener;

import common.Alert.Alert;
import common.Alert.AlertHold;
import common.Comment.CommentsOneTaskHold;
import common.Enum.TaskStatus;
import common.Enum.TaskType;
import common.Project.Project;
import common.Project.Projecthold;
import common.Task.Task;
import common.Task.TaskHold;
import common.Team.Userhold;
import common.Ultilities.Utilities;
import common.User.CurrentUserhold;

import javax.swing.event.PopupMenuEvent;

public class AlertSendUI extends JFrame {

	private JPanel AlertSendPanel;
	private JTextField NameString;
	private JTextField messageString;
	
	private JLabel AlertNameLabel;
	private JLabel Message;
	private JScrollPane MessageScrollPane;
	private JLabel ReceiverLabel;
	private JButton SendButton;
	private JScrollPane listScroll;
	private JScrollPane listScroll_1;
	private JScrollPane jScrollPane2;
	private JList<String> SelectedUserList;
	private JList<String> SelectedUserList_1;
	private JComboBox<String> teamDropDown; 
	private JComboBox<String> teamDropDown_1;
	private DefaultListModel<String> listModel = new DefaultListModel<>();
	private JTextField IDint;
	private DefaultListModel<String> listReceiverModel  = new DefaultListModel<>();
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public AlertSendUI() {
		initComponent();
		eventHandler();
		if (!listModel.isEmpty()) {
            listModel.clear();
        }
        this.getSelectedUserList().setModel(listModel);
		
	}

	private void eventHandler() {
		// TODO Auto-generated method stub
		SendButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Add to AlertHold
				
				//Alert addAlert = createAlertFromFields();

		        //TODO refactor this method to make better sense and reduce time complexity
		        
		        //for inserting new Alert
		        
		        //AlertHold.insert(addAlert);
		        addAlert();
               
		        ((JFrame) SendButton.getParent().getParent().getParent().getParent()).dispose();
		        
		        //Close the Alert create window
		       
				
				
			}

			
		});
	}
	/**
     * @return the teamDropDown
     */
	
	
    
	public javax.swing.JComboBox<String> getTeamDropDown() {
        return teamDropDown_1;
    }

    /**
     * @param teamDropDown the teamDropDown to set
     */
    
	public void setTeamDropDown(String teamDropDown) {
        this.teamDropDown_1.addItem(teamDropDown);
    }
	
	public DefaultListModel<String> getListModel() {
        return listModel;
    }

    /**
     * @param listModel the listModel to set
     */
    public void setListModel(DefaultListModel<String> listModel) {
        this.listModel = listModel;
    }
    
    public javax.swing.JScrollPane getListScroll() {
        return listScroll_1;
    }

    /**
     * @param listScroll the listScroll to set
     */
    public void setListScroll(javax.swing.JScrollPane listScroll) {
        this.listScroll_1 = listScroll;
    }

    /**
     * @return the selectedUserList
     */
    public javax.swing.JList<String> getSelectedUserList() {
        return SelectedUserList_1;
    }

    /**
     * @param selectedUserList the selectedUserList to set
     */
    public void setSelectedUserList(javax.swing.JList<String> selectedUserList) {
        this.SelectedUserList_1 = selectedUserList;
    }

	
	public void addList(String add) {
        getListModel().addElement(add);
    }

    public void removeList(int remove) {
        if (remove != -1) {
            getListModel().remove(remove);
        }
    }
    private void selectedUserListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectedUserListMouseClicked
        int selected = this.getSelectedUserList().getSelectedIndex();
        this.removeList(selected);
    }//GEN-LAST:event_selectedUserListMouseClicked
    
	private void teamDropDownPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_teamDropDownPopupMenuWillBecomeVisible
        ProjectUIDropdown.setAllowListEvent(true);
    }//GEN-LAST:event_teamDropDownPopupMenuWillBecomeVisible

    private void teamDropDownPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_teamDropDownPopupMenuWillBecomeInvisible
        ProjectUIDropdown.setAllowListEvent(false);
    }//GEN-LAST:event_teamDropDownPopupMenuWillBecomeInvisible
    
    private void teamDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamDropDownActionPerformed
        Object selected = this.teamDropDown_1.getSelectedItem();

        if (selected != null && ProjectUIDropdown.isAllowListEvent()) {
            if (!this.listModel.contains(selected.toString())) {
                this.addList(selected.toString());
                
            }
        }
        else{
            
        }
    }//GEN-LAST:event_teamDropDownActionPerformed
	
	private void initComponent() {
		
        
        listScroll = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        SelectedUserList = new javax.swing.JList<>();
        SelectedUserList_1 = new JList();
        teamDropDown_1 = new JComboBox();
        teamDropDown_1.addPopupMenuListener(new PopupMenuListener() {
        	public void popupMenuCanceled(PopupMenuEvent e) {
        	}
        	public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
        		teamDropDownPopupMenuWillBecomeInvisible(e);
        	}
        	public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
        		teamDropDownPopupMenuWillBecomeVisible(e);
        	}
        });
		
		//System.out.println("PrintDropDown" + team);
        teamDropDown_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
      // System.out.println("PrintDropDown" + teamDropDown.getSelectedItem());
		
       
        
        SelectedUserList_1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        
        jScrollPane2.setViewportView(SelectedUserList);

        listScroll.setViewportView(jScrollPane2);

		setBounds(100, 100, 638, 795);
		AlertSendPanel = new JPanel();
		AlertSendPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(AlertSendPanel);
		
		AlertNameLabel = new JLabel("Alert Name: ");
		
		NameString = new JTextField();
		NameString.setColumns(10);
		
		Message = new JLabel("Message: ");
		
		MessageScrollPane = new JScrollPane();
		
		ReceiverLabel = new JLabel("Send To: ");
		
		SendButton = new JButton("Send");
		
		
		
		teamDropDown_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teamDropDownActionPerformed(e);
				
			}
		});
		
		listScroll_1 = new JScrollPane();
		
		IDint = new JTextField();
		IDint.setEditable(false);
		IDint.setColumns(10);
		
		GroupLayout gl_AlertSendPanel = new GroupLayout(AlertSendPanel);
		gl_AlertSendPanel.setHorizontalGroup(
			gl_AlertSendPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_AlertSendPanel.createSequentialGroup()
					.addGroup(gl_AlertSendPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_AlertSendPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(SendButton, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_AlertSendPanel.createSequentialGroup()
							.addGap(23)
							.addGroup(gl_AlertSendPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(ReceiverLabel)
								.addGroup(gl_AlertSendPanel.createSequentialGroup()
									.addGroup(gl_AlertSendPanel.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(Message, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(AlertNameLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_AlertSendPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(IDint, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_AlertSendPanel.createParallelGroup(Alignment.LEADING)
											.addComponent(NameString, GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
											.addGroup(gl_AlertSendPanel.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(listScroll_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(teamDropDown_1, Alignment.LEADING, 0, 219, Short.MAX_VALUE))
											.addComponent(MessageScrollPane, GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)))))))
					.addGap(33))
		);
		gl_AlertSendPanel.setVerticalGroup(
			gl_AlertSendPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_AlertSendPanel.createSequentialGroup()
					.addGap(41)
					.addGroup(gl_AlertSendPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(NameString, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
						.addComponent(AlertNameLabel))
					.addGap(25)
					.addGroup(gl_AlertSendPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(Message)
						.addComponent(IDint, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addComponent(MessageScrollPane, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(ReceiverLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(teamDropDown_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(listScroll_1, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
					.addComponent(SendButton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		jScrollPane2 = new JScrollPane();
		listScroll_1.setViewportView(jScrollPane2);
		
		
		SelectedUserList_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		SelectedUserList_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 selectedUserListMouseClicked(e);
			}
		});
		jScrollPane2.setViewportView(SelectedUserList_1);
		
		
		
		messageString = new JTextField();
		MessageScrollPane.setViewportView(messageString);
		messageString.setColumns(10);
		AlertSendPanel.setLayout(gl_AlertSendPanel);
		
	}
	public Alert createAlertFromFields() {
        try {
            //get all the attributes to insert in Alert class
            String name = this.getNameString().getText();
            String message = this.getmessageString().getText();
            int ID = Integer.parseInt(this.getIDint().getText());
            
            
            //Receiver will store ID of users
            ArrayList<Integer> receiver = new ArrayList<>();
            for(int i=0;i<listModel.size();i++){
                int receiverID=Userhold.searchNmeOutputID(listModel.get(i));
                receiver.add(receiverID);
            }
           
            
            //add the current user who send alert
            if(!receiver.contains(CurrentUserhold.getUser().getID())){
                receiver.add(CurrentUserhold.getUser().getID());
            }
            AlertHold.bublesort(receiver);

            //add all attribute to a new alert Object
            Alert addAlert = new Alert(ID, name, message, receiver);
            return addAlert;
            
        } catch (Exception e) {
            System.out.println(e);
            return new Alert(-1, "nothing", "nothing");
        }

    }

    public void setUpdateInformation(Alert alert) {
    	this.setIDint(alert.getID());
        this.setmessageString(alert.getmessage());
        this.setNameString(alert.getName());

    }
   
    public void addAlert() {
        //add task and notify main UI
        ArrayList<Integer> receivers = new ArrayList<>();
        if (listReceiverModel.size() == 0) {
        	receivers = AlertHold.getAlertList().get((int) ((ComboItem) teamDropDown.getSelectedItem()).getValue() - 1).getReceivers();
        } else {
            for (int i = 0; i < listReceiverModel.size(); i++) {
                int userID = Userhold.searchNmeOutputID(listReceiverModel.get(i));
                receivers.add(userID);
            }
            //have to add admin
            if (!receivers.contains(8)) {
            	receivers.add(8);
            }
            //add the current user who create the project, which is usually PM
            if (!receivers.contains(CurrentUserhold.getUser().getID())) {
            	receivers.add(CurrentUserhold.getUser().getID());
            }
        }

        Alert alert = new Alert(AlertHold.getAlertList().size() + 1,
                NameString.getText(),messageString.getText(), receivers);
        
        alert.addReceivers((int) ((ComboItem) teamDropDown.getSelectedItem()).getValue());
        AlertHold.addAlert(alert);
       
            
            
            //ScreenUI.getLayoutUI().addTask();
            /*for (int i = 0; i < this.backlog.getBoard().getNewTasks().size(); i++) {
                System.out.println(this.backlog.getBoard().getNewTasks().get(i).getID());
                System.out.println(this.backlog.getBoard().getNewTasks().get(i).getQuickSummary());
            }*/

        }
    
    

    
    /**
     * @return the nameString
     */
    public javax.swing.JTextField getNameString() {
        return NameString;
    }

    /**
     * @param nameString the nameString to set
     */
    public void setNameString(String nameString) {
        this.NameString.setText(nameString);
    }
    
    /**
     * @return the nameString
     */
    public javax.swing.JTextField getmessageString() {
        return messageString;
    }

    /**
     * @param nameString the nameString to set
     */
    public void setmessageString(String messageString) {
        this.messageString.setText(messageString);
    }
    
    public javax.swing.JTextField getIDint() {
        return IDint;
    }

    /**
     * @param IDint the IDint to set
     */
    public void setIDint(int IDint) {
        this.IDint.setText(String.valueOf(IDint));
    }
    
    
}

class ComboItem {

    private String key;
    private Object value;

    public ComboItem(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public ComboItem(String key, int value) {
        this.key = key;
        this.value = value;
    }

   

    @Override
    public String toString() {
        return key;
    }

    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }}



