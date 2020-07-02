/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.SwingUtilities;
import layout.LayoutUI;
import screen.ScreenUI;
import setting.SettingUI;
import team.TeamUIDropdown;
import user.CurrentUserhold;

/**
 *
 * @author tug70
 */
public class ProjectUIDropdown extends javax.swing.JPanel {

    //return the project ID when clicked or -1 if all project or add project was clicked
    private static int projectAccessID = -1;
    private boolean editable = false;

    /**
     * Creates new form ProjectUI
     */
    public ProjectUIDropdown() {
        initComponents();
        Projecthold.populateProjecthold();
        this.renderUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        projectDropDown = new javax.swing.JComboBox<>();

        projectDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--all project--", "+ Add project" }));
        projectDropDown.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        projectDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectDropDownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(projectDropDown, 0, 142, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(projectDropDown, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void projectDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectDropDownActionPerformed

        Object selected = this.projectDropDown.getSelectedItem();
        if (selected == "--all project--") {
            ProjectUIDropdown.setProjectAccessID(-1);

        } else if (selected == "+ Add project") {
            //adding new project
            ProjectUICreateUpdate create = new ProjectUICreateUpdate();
            //create new int ID that is the next highest number according to the last item in project size()
            int ID = Projecthold.getProjects().get(Projecthold.getProjects().size() - 1).getID() + 1;
            create.setIDint(ID);
            create.getDeleteButton().setVisible(false);
            create.setCreateUpdateLabel("Create Project");
            create.setSubmitButton("Create");
            create.setVisible(true);
            //reredner team and sprint
            ProjectUIDropdown.setProjectAccessID(-1);
            ScreenUI.getTeamUI().renderUI();
            ScreenUI.getSprintUI().renderUI();
        } else {
            //updating existed project
            for (int i = 0; i < Projecthold.getProjects().size(); i++) {
                if (Projecthold.getProjects().get(i).getName().equals(selected)) {
                    //check access range to see if user are allow to edit project--only PM and higher should do this
                    if (CurrentUserhold.getUser().getAccessRange() > 2) {
                        //check if in setting this is changed to true to prevent annoyance
                        if (SettingUI.isProjectEditToggle() == true) {
                            ProjectUICreateUpdate update = new ProjectUICreateUpdate();
                            update.setUpdateInformation(Projecthold.getProjects().get(i));
                            update.setCreateUpdateLabel("Update Project");
                            update.setSubmitButton("Update");
                            update.setVisible(true);
                            

                        }
                    }
                    //reredner team and sprint and boards
                    
                    ProjectUIDropdown.setProjectAccessID(Projecthold.getProjects().get(i).getID());
                    
                    ScreenUI.getTeamUI().renderUI();
                    ScreenUI.getSprintUI().renderUI();
                    LayoutUI.renderBoard();
                    break;
                }
            }

        }

    }//GEN-LAST:event_projectDropDownActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> projectDropDown;
    // End of variables declaration//GEN-END:variables

    //work for both add and update. Method will rerender
    public void renderUI() {
        projectDropDown.removeAllItems();
        this.projectDropDown.addItem("--all project--");
        //first loop to loop through all project
        for (int i = 0; i < Projecthold.getProjects().size(); i++) {
            //another loop to check the that project at [i]'s team array contain the current user ID
            for (int j = 0; j < Projecthold.getProjects().get(i).getTeam().length; j++) {
                if (CurrentUserhold.getUser() != null) {
                    if (Projecthold.getProjects().get(i).getTeam()[j] == CurrentUserhold.getUser().getID()) {
                        //if team array contain the the user, add the project to project dropdown
                        this.projectDropDown.addItem(Projecthold.getProjects().get(i).getName());
                    }
                } 
            }
        }
        //only allow user with access range higher than 2 to create new project (PM and ADMIN)
        if (CurrentUserhold.getUser() != null) {
            if (CurrentUserhold.getUser().getAccessRange() > 2) {
                this.projectDropDown.addItem("+ Add project");
            }
        }
    }

    /**
     * @return the projectAccessID
     */
    public static int getProjectAccessID() {
        return ProjectUIDropdown.projectAccessID;
    }

    /**
     * @param projectAccessID the projectAccessID to set
     */
    public static void setProjectAccessID(int projectAccessID) {
        ProjectUIDropdown.projectAccessID = projectAccessID;
    }

}
