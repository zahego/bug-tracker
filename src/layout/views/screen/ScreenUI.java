/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout.views.screen;
import layout.views.FilterUI.FilterUI;
import common.Comment.CommentsAllHold;
import java.awt.Toolkit;
import layout.views.AlertUI.AlertUI;
import java.awt.*;
import javax.swing.*;
import layout.views.project.ProjectUIDropdown;
import layout.views.sprint.SprintUIDropdown;
import layout.views.team.TeamUIDropdown;
import layout.views.user.UserUIDropdown;
import layout.views.setting.SettingUI;
import layout.views.AlertUI.AlertBoardUI;

import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import common.Alert.AlertHold;
import common.Task.TaskHold;
import common.User.CurrentUserhold;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 *
 * @author tug70
 */
public class ScreenUI extends javax.swing.JFrame{
    
    //drop down section
    
    /**
     * Creates new form ScreenUI
     */
    public ScreenUI() {
        CommentsAllHold.populateCommentsAllHold();
        TaskHold.loadTask();
        TaskHold.loadEmptyTask();
        initComponents();
        AlertRender();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        productName = new javax.swing.JLabel();
        boardsHolder = new javax.swing.JPanel();
        projectUI = new layout.views.project.ProjectUIDropdown();
        teamUI = new layout.views.team.TeamUIDropdown();
        userUI = new layout.views.user.UserUIDropdown();
        sprintUI = new layout.views.sprint.SprintUIDropdown();
        settingUI = new layout.views.setting.SettingUI();
        layoutUI = new layout.views.layout.LayoutUI();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dev Screen");
        setBounds(new java.awt.Rectangle(0, 0, 100, 100));

        productName.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        productName.setForeground(new java.awt.Color(255, 102, 102));
        productName.setText("BUG TRACKER 3000");

        javax.swing.GroupLayout boardsHolderLayout = new javax.swing.GroupLayout(boardsHolder);
        boardsHolder.setLayout(boardsHolderLayout);
        boardsHolderLayout.setHorizontalGroup(
            boardsHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boardsHolderLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addGroup(boardsHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(teamUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(boardsHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boardsHolderLayout.createSequentialGroup()
                        .addComponent(userUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(settingUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sprintUI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(258, 258, 258))
            .addGroup(boardsHolderLayout.createSequentialGroup()
                .addComponent(layoutUI, javax.swing.GroupLayout.PREFERRED_SIZE, 1871, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        boardsHolderLayout.setVerticalGroup(
            boardsHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boardsHolderLayout.createSequentialGroup()
                .addGroup(boardsHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boardsHolderLayout.createSequentialGroup()
                        .addComponent(projectUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(teamUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(boardsHolderLayout.createSequentialGroup()
                        .addComponent(sprintUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(boardsHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(settingUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(layoutUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        
        AlertButton = new JButton("Alert\r\n");
        
        AlertButton.addActionListener(new ActionListener() {
        	
        	public void actionPerformed(ActionEvent arg0) {
        		if (CurrentUserhold.getUser() != null) {
        		AlertUI alert = new AlertUI();
        		alert.setVisible(true);
        		
        	}else {
            	JOptionPane.showMessageDialog(null, "You must log in to see Alert","Alert", JOptionPane.OK_OPTION);
            }}
        }); 
        
        
       
        
        
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(boardsHolder, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(779)
        			.addComponent(productName)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(AlertButton))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(15)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(productName, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        				.addComponent(AlertButton, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addComponent(boardsHolder, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents
     public void displayJFrame(){
         setIconImage(Toolkit.getDefaultToolkit().getImage(FilterUI.class.getResource("/layout/resource/BugTracker.png")));
        this.setVisible(true);
    }
     
     public static void renderUI(){
         getProjectUI().renderUI();
         getTeamUI().renderUI();
         getSprintUI().renderUI();
         getUserUI().renderUI();
         
         
     }
     
    public static void displayProjectCreate(boolean display){
        
    };

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel boardsHolder;
    private javax.swing.JPanel jPanel1;
    private static layout.views.layout.LayoutUI layoutUI;
    private javax.swing.JLabel productName;
    private static layout.views.project.ProjectUIDropdown projectUI;
    private static layout.views.setting.SettingUI settingUI;
    private static layout.views.sprint.SprintUIDropdown sprintUI;
    private static layout.views.team.TeamUIDropdown teamUI;
    private static layout.views.user.UserUIDropdown userUI;
    private static JButton AlertButton;
    // End of variables declaration//GEN-END:variables

    
    
    public void AlertRender() {
    	System.out.println("Test Screen : " + AlertHold.getAlertList().size());
    	for (int i = 0; i < AlertHold.getAlertList().size();i++) {
            if(AlertHold.getAlertList().get(i).getReceivers().contains(CurrentUserhold.getUser().getID())) {
           // if (AlertHold.getAlertList() != null) {
            	AlertButton.setForeground(Color.RED);
            	
            } else {
            	AlertButton.setForeground(Color.BLACK);
            }}
    	
    }
    
    
    /**
     * @return the AlertButton
     */
    public static JButton getAlertButton() {
        return AlertButton;
    }

    /**
     * @param aUserUI the userUI to set
     */
    public static void setAlertButton(JButton alertbutton) {
    	AlertButton = alertbutton;
    }
    
    /**
     * @return the userUI
     */
    public static UserUIDropdown getUserUI() {
        return userUI;
    }

    /**
     * @param aUserUI the userUI to set
     */
    public static void setUserUI(UserUIDropdown aUserUI) {
        userUI = aUserUI;
    }

    /**
     * @return the projectUI
     */
    public static ProjectUIDropdown getProjectUI() {
        return projectUI;
    }

    /**
     * @param aProjectUI the projectUI to set
     */
    public static void setProjectUI(ProjectUIDropdown aProjectUI) {
        projectUI = aProjectUI;
    }

    /**
     * @return the teamUI
     */
    public static TeamUIDropdown getTeamUI() {
        return teamUI;
    }

    /**
     * @param aTeamUI the teamUI to set
     */
    public static void setTeamUI(TeamUIDropdown aTeamUI) {
        teamUI = aTeamUI;
    }

    /**
     * @return the sprintUI
     */
    public static SprintUIDropdown getSprintUI() {
        return sprintUI;
    }

    /**
     * @param aSprintUI the sprintUI to set
     */
    public static void setSprintUI(SprintUIDropdown aSprintUI) {
        sprintUI = aSprintUI;
    }

    /**
     * @return the settingUI
     */
    public static SettingUI getSettingUI() {
        return settingUI;
    }

    /**
     * @param aSettingUI the settingUI to set
     */
    public static void setSettingUI(SettingUI aSettingUI) {
        settingUI = aSettingUI;
    }

    /**
     * @return the layoutUI
     */
    public static layout.views.layout.LayoutUI getLayoutUI() {
        return layoutUI;
    }

    /**
     * @param aLayoutUI the layoutUI to set
     */
    public static void setLayoutUI(layout.views.layout.LayoutUI aLayoutUI) {
        layoutUI = aLayoutUI;
    }
}
