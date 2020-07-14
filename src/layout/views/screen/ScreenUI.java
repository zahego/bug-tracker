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
import common.Alert.AlertHold;
import common.Task.TaskHold;
import common.User.CurrentUserhold;
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
    	setIconImage(Toolkit.getDefaultToolkit().getImage(ScreenUI.class.getResource("/layout/resource/BugTracker.png")));
        CommentsAllHold.populateCommentsAllHold();
        TaskHold.loadTask();
        TaskHold.loadEmptyTask();
        initComponents();
        AlertRender();
        AlertHold.loadAlert(); 
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
        AlertButton = new javax.swing.JButton();

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
        setTitle("Bug Tracker 3000");
        setBounds(0, 0, Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);
        setPreferredSize(new java.awt.Dimension(1400, 800));

        productName.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        productName.setForeground(new java.awt.Color(255, 102, 102));
        productName.setText("BUG TRACKER 3000");

        boardsHolder.setPreferredSize(new java.awt.Dimension(1400, 750));

        layoutUI.setPreferredSize(new java.awt.Dimension(1400, 600));

        javax.swing.GroupLayout boardsHolderLayout = new javax.swing.GroupLayout(boardsHolder);
        boardsHolder.setLayout(boardsHolderLayout);
        boardsHolderLayout.setHorizontalGroup(
            boardsHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boardsHolderLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addGroup(boardsHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(teamUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(462, 462, 462)
                .addComponent(userUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(boardsHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sprintUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(settingUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boardsHolderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(layoutUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        boardsHolderLayout.setVerticalGroup(
            boardsHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boardsHolderLayout.createSequentialGroup()
                .addGroup(boardsHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(boardsHolderLayout.createSequentialGroup()
                        .addComponent(projectUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(teamUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(boardsHolderLayout.createSequentialGroup()
                        .addComponent(sprintUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(settingUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(userUI, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(layoutUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        AlertButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        AlertButton.setText("Alert");
        AlertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlertButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(562, 562, 562)
                .addComponent(productName)
                .addGap(18, 18, 18)
                .addComponent(AlertButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(boardsHolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AlertButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addComponent(boardsHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AlertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlertButtonActionPerformed
        if (CurrentUserhold.getUser() != null) {
        		AlertUI alert = new AlertUI();
        		alert.setVisible(true);
        		
        	}else {
            	JOptionPane.showMessageDialog(null, "You must log in to see Alert","Alert", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_AlertButtonActionPerformed
     public void displayJFrame(){
         setIconImage(Toolkit.getDefaultToolkit().getImage(FilterUI.class.getResource("/layout/resource/BugTracker.png")));
         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
         this.setBounds(0, 0, screenSize.width, screenSize.height);
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
    private static javax.swing.JButton AlertButton;
    private javax.swing.JPanel boardsHolder;
    private javax.swing.JPanel jPanel1;
    private static layout.views.layout.LayoutUI layoutUI;
    private javax.swing.JLabel productName;
    private static layout.views.project.ProjectUIDropdown projectUI;
    private static layout.views.setting.SettingUI settingUI;
    private static layout.views.sprint.SprintUIDropdown sprintUI;
    private static layout.views.team.TeamUIDropdown teamUI;
    private static layout.views.user.UserUIDropdown userUI;
    // End of variables declaration//GEN-END:variables

    
    
    public void AlertRender() {
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
