/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screen;
import TrungAndAnhIntegration.layout.views.FilterViews;
import java.awt.*;
import javax.swing.*;
import layout.LayoutUI;
import project.ProjectUIDropdown;
import sprint.SprintUIDropdown;
import team.TeamUIDropdown;
import user.UserUIDropdown;
import setting.SettingUI;
import javax.swing.GroupLayout.Alignment;
/**
 *
 * @author tug70
 */
public class ScreenUI extends javax.swing.JFrame{
    
    //drop down section
    private static UserUIDropdown userUI = new UserUIDropdown();
    private static ProjectUIDropdown projectUI= new ProjectUIDropdown();
    private static TeamUIDropdown teamUI =new TeamUIDropdown();
    private static SprintUIDropdown sprintUI = new SprintUIDropdown();
    private static SettingUI settingUI= new SettingUI();
    
    private static LayoutUI layoutUI=new LayoutUI();
    /**
     * Creates new form ScreenUI
     */
    public ScreenUI() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(FilterViews.class.getResource("/TrungAndAnhIntegration/layout/resource/BugTracker.png")));
        initComponents();
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
        dropDownsHolder = new javax.swing.JPanel();
        productName = new javax.swing.JLabel();
        boardsHolder = new javax.swing.JPanel();

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
        setMaximumSize(new java.awt.Dimension(1900, 1000));
        setPreferredSize(new java.awt.Dimension(1900, 1104));

        productName.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        productName.setForeground(new java.awt.Color(255, 102, 102));
        productName.setText("BUG TRACKER 3000");

        javax.swing.GroupLayout boardsHolderLayout = new javax.swing.GroupLayout(boardsHolder);
        boardsHolder.setLayout(boardsHolderLayout);
        boardsHolderLayout.setHorizontalGroup(
            boardsHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        boardsHolderLayout.setVerticalGroup(
            boardsHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 898, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dropDownsHolder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(boardsHolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(800, 800, 800)
                .addComponent(productName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dropDownsHolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boardsHolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        GroupLayout gl_dropDownsHolder = new GroupLayout(dropDownsHolder);
        gl_dropDownsHolder.setHorizontalGroup(
        	gl_dropDownsHolder.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 1882, Short.MAX_VALUE)
        );
        gl_dropDownsHolder.setVerticalGroup(
        	gl_dropDownsHolder.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 53, Short.MAX_VALUE)
        );
        dropDownsHolder.setLayout(gl_dropDownsHolder);

        pack();
    }// </editor-fold>//GEN-END:initComponents
     public void displayJFrame(){
        
        JPanel j=new JPanel();
        JPanel j2=new JPanel();
        //JPanel j1=new JPanel();
        j.add(getUserUI());
        j.add(getSettingUI());
        GridLayout layout2=new GridLayout(1, 2);
        j.setLayout(layout2);
        j2.add(j);
        //row 1
        dropDownsHolder.add(getProjectUI());
        //dropDownsHolder.add(j);
        dropDownsHolder.add(getSprintUI());
        //row 2
        dropDownsHolder.add(getTeamUI());
        //dropDownsHolder.add(j1);
        dropDownsHolder.add(j);
        //dropDownsHolder.add(getUserUI());
        //dropDownsHolder.add(getSettingUI());
        
        
        
        getProjectUI().renderUI();
        
        this.pack();
        //FlowLayout layout=new FlowLayout();
        GridLayout layout=new GridLayout(2, 2);
        
        getProjectUI().setLayout(new FlowLayout(FlowLayout.LEFT));
        j2.setLayout(new FlowLayout(FlowLayout.RIGHT));
        getSprintUI().setLayout(new FlowLayout(FlowLayout.RIGHT));
        getTeamUI().setLayout(new FlowLayout(FlowLayout.LEFT));
        //getSettingUI().setLayout(new FlowLayout(FlowLayout.RIGHT));
        dropDownsHolder.setLayout(layout);
        dropDownsHolder.setBorder(BorderFactory.createEmptyBorder(0, 100, 0, 100));
        
        
        BorderLayout layout3=new BorderLayout();
        boardsHolder.setLayout(layout3);
        boardsHolder.add(layoutUI, BorderLayout.CENTER);
        
        
        
        this.setVisible(true);
    }
     
     public static void renderUI(){
         getProjectUI().renderUI();
         getTeamUI().renderUI();
         getUserUI().renderUI();
         getSprintUI().renderUI();
     }
     
    public static void displayProjectCreate(boolean display){
        
    };

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel boardsHolder;
    private javax.swing.JPanel dropDownsHolder;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel productName;
    // End of variables declaration//GEN-END:variables

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
}
