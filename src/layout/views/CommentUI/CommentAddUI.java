/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout.views.CommentUI;

import common.Comment.Comment;
import common.Comment.CommentsAllHold;
import common.Enum.TaskStatus;
import common.Task.TaskHold;
import common.User.CurrentUserhold;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author tug70
 */
public class CommentAddUI extends javax.swing.JFrame {

    /**
     * Creates new form CommentAddUI
     */
    public CommentAddUI() {
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

        commentTitle = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        commentLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CommentString = new javax.swing.JTextArea();
        userNameString = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        projectLabel = new javax.swing.JLabel();
        projectNameString = new javax.swing.JTextField();
        ErrorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        commentTitle.setText("Add Comment");

        userLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userLabel.setText("user:");

        commentLabel.setText("comment");

        CommentString.setColumns(20);
        CommentString.setRows(5);
        jScrollPane1.setViewportView(CommentString);

        userNameString.setEditable(false);
        userNameString.setText("userName");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        projectLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        projectLabel.setText("project:");

        projectNameString.setEditable(false);
        projectNameString.setText("projectName");

        ErrorLabel.setForeground(new java.awt.Color(255, 51, 51));
        ErrorLabel.setText("error");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(commentLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(projectLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(projectNameString))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(userLabel)
                                    .addGap(31, 31, 31)
                                    .addComponent(userNameString, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(addButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cancelButton))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ErrorLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(commentTitle)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(commentTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ErrorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLabel)
                    .addComponent(userNameString, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projectLabel)
                    .addComponent(projectNameString, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(commentLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
       
        Comment comment=new Comment(taskID, CommentsAllHold.getAllCommentHold().size(), CurrentUserhold.getUser().getID(), currentTaskStatus, CommentString.getText(), new Date());
        CommentsAllHold.getAllCommentHold().add(comment);
        if(TaskHold.getTaskList().get(taskID-1).getComments().getComment()==null){
            TaskHold.getTaskList().get(taskID-1).getComments().setComment(new ArrayList<Comment>());
        }
        TaskHold.getTaskList().get(taskID-1).getComments().getComment().add(comment);
        this.dispose();
    }//GEN-LAST:event_addButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CommentAddUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommentAddUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommentAddUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommentAddUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommentAddUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CommentString;
    private javax.swing.JLabel ErrorLabel;
    private javax.swing.JButton addButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel commentLabel;
    private javax.swing.JLabel commentTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel projectLabel;
    private javax.swing.JTextField projectNameString;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userNameString;
    // End of variables declaration//GEN-END:variables
    private int taskID;
    private TaskStatus currentTaskStatus;
    /**E
     * @return the CommentString
     */
    public javax.swing.JTextArea getCommentString() {
        return CommentString;
    }

    /**
     * @param CommentString the CommentString to set
     */
    public void setCommentString(String CommentString) {
        this.CommentString.setText(CommentString);
    }

    /**
     * @return the ErrorLabel
     */
    public javax.swing.JLabel getErrorLabel() {
        return ErrorLabel;
    }

    /**
     * @param ErrorLabel the ErrorLabel to set
     */
    public void setErrorLabel(javax.swing.JLabel ErrorLabel) {
        this.ErrorLabel = ErrorLabel;
    }

    /**
     * @return the addButton
     */
    public javax.swing.JButton getAddButton() {
        return addButton;
    }

    /**
     * @param addButton the addButton to set
     */
    public void setAddButton(javax.swing.JButton addButton) {
        this.addButton = addButton;
    }

    /**
     * @return the cancelButton
     */
    public javax.swing.JButton getCancelButton() {
        return cancelButton;
    }

    /**
     * @param cancelButton the cancelButton to set
     */
    public void setCancelButton(javax.swing.JButton cancelButton) {
        this.cancelButton = cancelButton;
    }

    /**
     * @return the projectNameString
     */
    public javax.swing.JTextField getProjectNameString() {
        return projectNameString;
    }

    /**
     * @param projectNameString the projectNameString to set
     */
    public void setProjectNameString(String projectNameString) {
        this.projectNameString.setText(projectNameString);
    }

    /**
     * @return the userNameString
     */
    public javax.swing.JTextField getUserNameString() {
        return userNameString;
    }

    /**
     * @param userNameString the userNameString to set
     */
    public void setUserNameString(String userNameString) {
        this.userNameString.setText(userNameString);
    }

    /**
     * @return the taskID
     */
    public int getTaskID() {
        return taskID;
    }

    /**
     * @param taskID the taskID to set
     */
    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    /**
     * @return the currentTaskStatus
     */
    public TaskStatus getCurrentTaskStatus() {
        return currentTaskStatus;
    }

    /**
     * @param currentTaskStatus the currentTaskStatus to set
     */
    public void setCurrentTaskStatus(TaskStatus currentTaskStatus) {
        this.currentTaskStatus = currentTaskStatus;
    }
}
