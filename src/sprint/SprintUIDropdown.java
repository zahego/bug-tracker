/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprint;

import project.ProjectUIDropdown;
import project.Projecthold;
import screen.ScreenUI;
import setting.SettingUI;
import user.*;

/**
 *
 * @author tug70
 */
public class SprintUIDropdown extends javax.swing.JPanel {

    /**
     * Creates new form UserUIDropdown
     */
    public SprintUIDropdown() {
        initComponents();
        Sprinthold.populateSprinthold();
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

        sprintDropdown = new javax.swing.JComboBox<>();

        sprintDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "all sprint", "#1", "#2", "#3", "#4" }));
        sprintDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sprintDropdownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sprintDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sprintDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sprintDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sprintDropdownActionPerformed
        Object selected = this.sprintDropdown.getSelectedItem();
        if (selected == "--all sprint--") {
            //ProjectUIDropdown.setProjectAccessID(-1);

        } else if (selected == "+ Add sprint") {
            //adding new project
            SprintUICreateUpdate create = new SprintUICreateUpdate();
            //create new int ID that is the next highest number according to the last item in project size()
            int ID = Sprinthold.getSprints().get(Sprinthold.getSprints().size() - 1).getID() + 1;
            create.setIDint(ID);
            create.getDeleteButton().setVisible(false);

            create.setCreateUpdateLabel("Create Sprint");
            create.setSubmitButton("Create");
            create.setVisible(true);
        } else {
            //updating existed project
            for (int i = 0; i < Sprinthold.getSprints().size(); i++) {
                if (String.valueOf(Sprinthold.getSprints().get(i).getName()).equals(selected)) {
                    //check access range to see if user are allow to edit project--only PM and higher should do this
                    if (CurrentUserhold.getUser().getAccessRange() > 2) {
                        //check if in setting this is changed to true to prevent annoyance
                        if (SettingUI.isSprintEditToggle() == true) {
                            SprintUICreateUpdate update = new SprintUICreateUpdate();
                            update.setUpdateInformation(Sprinthold.getSprints().get(i));
                            update.setCreateUpdateLabel("Update Sprint");
                            update.setSubmitButton("Update");
                            update.setVisible(true);

                        }
                    }
                    break;
                }
            }

        }

    }//GEN-LAST:event_sprintDropdownActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> sprintDropdown;
    // End of variables declaration//GEN-END:variables
    public void renderUI() {
        sprintDropdown.removeAllItems();
        this.sprintDropdown.addItem("--all sprint--");
        int projectID = ProjectUIDropdown.getProjectAccessID();

        for (int i = 0; i < Sprinthold.getSprints().size(); i++) {

            //all projecti chosen. No sprint will be render
            if (projectID == -1) {
                break;
            } //display sprint based on project
            else {
                //condition to render only sprint with its projectID align with the project ID
                if (Projecthold.getProjects().get(projectID - 1).getID() == Sprinthold.getSprints().get(i).getProjectID()) {
                    this.sprintDropdown.addItem(String.valueOf(Sprinthold.getSprints().get(i).getName()));
                }
            }
        }
        //only allow user with access range higher than 2 to create new project (PM and ADMIN)
        if (CurrentUserhold.getUser() != null) {
            if (CurrentUserhold.getUser().getAccessRange() > 2 && ProjectUIDropdown.getProjectAccessID() != -1) {
                this.sprintDropdown.addItem("+ Add sprint");
            }
        }
    }
}