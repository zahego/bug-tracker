/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout.views.sprint;

import common.Sprint.Sprinthold;
import common.Sprint.Sprint;
import common.Task.TaskHold;
import java.text.SimpleDateFormat;
import java.util.Date;
import layout.views.project.ProjectUIDropdown;
import layout.views.screen.ScreenUI;
import java.awt.Toolkit;

/**
 *
 * @author tug70
 */
public class SprintUICreateUpdate extends javax.swing.JFrame {

    /**
     * Creates new form SprintUICreateUpdate
     */
    public SprintUICreateUpdate() {
    	setTitle("Bug Tracker 3000 - Create Sprint");
    	setIconImage(Toolkit.getDefaultToolkit().getImage(SprintUICreateUpdate.class.getResource("/layout/resource/BugTracker.png")));
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

        IDint = new javax.swing.JTextField();
        buttonSection = new javax.swing.JPanel();
        submitButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        durationLabel = new javax.swing.JLabel();
        IDLabel = new javax.swing.JLabel();
        errorText = new javax.swing.JLabel();
        nameInt = new javax.swing.JTextField();
        durationString = new javax.swing.JTextField();
        createUpdateLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        IDint.setEditable(false);

        submitButton.setText("add");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonSectionLayout = new javax.swing.GroupLayout(buttonSection);
        buttonSection.setLayout(buttonSectionLayout);
        buttonSectionLayout.setHorizontalGroup(
            buttonSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonSectionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitButton)
                .addGap(18, 18, 18)
                .addComponent(deleteButton)
                .addGap(6, 6, 6))
        );
        buttonSectionLayout.setVerticalGroup(
            buttonSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonSectionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(buttonSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(deleteButton))
                .addContainerGap())
        );

        nameLabel.setText("Iteration:");

        durationLabel.setText("Duration:");

        IDLabel.setText("ID:");

        errorText.setForeground(new java.awt.Color(255, 51, 51));
        errorText.setText("error");

        createUpdateLabel.setText("CREATE SPRINT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel)
                    .addComponent(durationLabel)
                    .addComponent(IDLabel))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(IDint, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameInt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(durationString, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                .addGap(0, 88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(createUpdateLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(errorText)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createUpdateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorText)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IDLabel)
                    .addComponent(IDint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(nameInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(durationLabel)
                        .addComponent(durationString, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(buttonSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        //TODO handle case of error of same name
        //add that new sprint Object to the sprinthold ArrayList
        Sprint addSprint = createSprintFromFields();
        if(addSprint.getID()!=-1){
        //TODO refactor this method to make better sense and reduce time complexity
        //check if it's update or not
        boolean updated = false;
        //for updating new sprint
        for (int i = 0; i < Sprinthold.getSprints().size(); i++) {
            if (addSprint.getID() == Sprinthold.getSprints().get(i).getID()) {
                //replace the sprint at i
                Sprinthold.getSprints().set(i, addSprint);
                updated = true;
                break;
            }
        }
        //for inserting new sprint
        if (addSprint.getID() != -1 && updated == false) {
            Sprinthold.insert(addSprint);
        }
        //rerender the dropdown in screenUI
        ScreenUI.getSprintUI().renderUI();
        //Close the Sprint create window
        this.dispose();
        }
        else{
            errorText.setText("There's something wrong with your input, please try again");
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
       
        for (int j = TaskHold.getTaskList().size() - 1; j >= 0; j--) {
            if (TaskHold.getTaskList().get(j).getSprintID() == Integer.parseInt(this.getIDint().getText())) {
                TaskHold.deleteTask(j);
            }
        }
                Sprinthold.delete(Sprinthold.getSprints().get(Integer.parseInt(this.getIDint().getText())-1));
        
        //rerender the dropdown in screenUI
        ScreenUI.getLayoutUI().refreshAllBoard();
        ScreenUI.getSprintUI().renderUI();
        //Close the Sprint create window
        this.dispose();
    }//GEN-LAST:event_deleteButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SprintUICreateUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SprintUICreateUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SprintUICreateUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SprintUICreateUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SprintUICreateUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDLabel;
    private javax.swing.JTextField IDint;
    private javax.swing.JPanel buttonSection;
    private javax.swing.JLabel createUpdateLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel durationLabel;
    private javax.swing.JTextField durationString;
    private javax.swing.JLabel errorText;
    private javax.swing.JTextField nameInt;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
    public Sprint createSprintFromFields() {
        try {
            //get all the attributes to insert in Project class
            int ID = Integer.parseInt(this.getIDint().getText());
            int name = Integer.parseInt(this.getNameInt().getText());
            String duration=this.getDurationString().getText();
            int projectID=ProjectUIDropdown.getProjectAccessID();
            //add all attribute to a new sprint Object
            Sprint addSprint = new Sprint(ID, name, duration, projectID);
            return addSprint;
        } catch (Exception e) {
            System.out.println(e);
            return new Sprint(-1);
        }

    }

    public void setUpdateInformation(Sprint sprint) {
        this.setIDint(sprint.getID());
        this.setNameInt(sprint.getName());
        this.setDurationString(sprint.getDuration());
    }


    /**
     * @return the IDint
     */
    public javax.swing.JTextField getIDint() {
        return IDint;
    }

    /**
     * @param IDint the IDint to set
     */
    public void setIDint(int IDint) {
        this.IDint.setText(String.valueOf(IDint));
    }

    /**
     * @return the createUpdateLabel
     */
    public javax.swing.JLabel getCreateUpdateLabel() {
        return createUpdateLabel;
    }

    /**
     * @param createUpdateLabel the createUpdateLabel to set
     */
    public void setCreateUpdateLabel(String createUpdateLabel) {
        this.createUpdateLabel.setText(createUpdateLabel);
    }

    /**
     * @return the deleteButton
     */
    public javax.swing.JButton getDeleteButton() {
        return deleteButton;
    }

    /**
     * @param deleteButton the deleteButton to set
     */
    public void setDeleteButton(javax.swing.JButton deleteButton) {
        this.deleteButton = deleteButton;
    }


    /**
     * @return the durationString
     */
    public javax.swing.JTextField getDurationString() {
        return durationString;
    }

    /**
     * @param durationString the durationString to set
     */
    public void setDurationString(String durationString) {
        this.durationString.setText(durationString);
    }

    /**
     * @return the errorText
     */
    public javax.swing.JLabel getErrorText() {
        return errorText;
    }

    /**
     * @param errorText the errorText to set
     */
    public void setErrorText(String errorText) {
        this.errorText.setText(errorText);
    }

    /**
     * @return the nameInt
     */
    public javax.swing.JTextField getNameInt() {
        return nameInt;
    }

    /**
     * @param nameInt the nameInt to set
     */
    public void setNameInt(int nameInt) {
        this.nameInt.setText(String.valueOf(nameInt));
    }

    /**
     * @return the submitButton
     */
    public javax.swing.JButton getSubmitButton() {
        return submitButton;
    }

    /**
     * @param submitButton the submitButton to set
     */
    public void setSubmitButton(String submitButton) {
        this.submitButton.setText(submitButton);
    }
}
