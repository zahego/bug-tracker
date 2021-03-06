/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout.views.CommentUI;

import common.Comment.Comment;
import common.Enum.TaskStatus;
import common.Task.TaskHold;
import common.Ultilities.Utilities;
import common.User.User;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import layout.views.screen.ScreenUI;

/**
 *
 * @author tug70
 */
public class CommentUI extends javax.swing.JPanel {

    /**
     * Creates new form CommentUI
     */
    public CommentUI() {
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

        dateDate = new javax.swing.JLabel();
        commentPanel = new javax.swing.JPanel();
        commentString = new javax.swing.JLabel();
        taskStatusEnum = new javax.swing.JLabel();
        profilePic = new javax.swing.JLabel();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        dateDate.setText("date");

        commentPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        commentString.setText("comment");

        taskStatusEnum.setText("taskStatus");

        javax.swing.GroupLayout commentPanelLayout = new javax.swing.GroupLayout(commentPanel);
        commentPanel.setLayout(commentPanelLayout);
        commentPanelLayout.setHorizontalGroup(
            commentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(commentPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(commentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(commentPanelLayout.createSequentialGroup()
                        .addComponent(profilePic, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(taskStatusEnum, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(commentString, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        commentPanelLayout.setVerticalGroup(
            commentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, commentPanelLayout.createSequentialGroup()
                .addComponent(commentString, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(commentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(taskStatusEnum)
                    .addComponent(profilePic, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateDate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(commentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dateDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(commentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if (evt.getClickCount() == 2) {
            int result = JOptionPane.showConfirmDialog(null, "Delete Comment?", "Alert",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {
                Comment commentDelete = new Comment();
                for (int i = 0; i < TaskHold.getTaskList().get(taskID - 1).getComments().getComment().size(); i++) {
                    if (TaskHold.getTaskList().get(taskID - 1).getComments().getComment().get(i).getCommentID() == commentID) {
                        commentDelete=TaskHold.getTaskList().get(taskID - 1).getComments().getComment().get(i);
                        TaskHold.getTaskList().get(taskID - 1).getComments().getComment().remove(i);
                        break;
                    }
                }
                this.setVisible(false);
                ScreenUI.getLayoutUI().refreshAllBoard();
            }
        }
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel commentPanel;
    private javax.swing.JLabel commentString;
    private javax.swing.JLabel dateDate;
    private javax.swing.JLabel profilePic;
    private javax.swing.JLabel taskStatusEnum;
    // End of variables declaration//GEN-END:variables

    private int taskID;
    private int commentID;

    public void renderUI(int num) {
    }

    /**
     * @return the commentString
     */
    public javax.swing.JLabel getCommentString() {
        return commentString;
    }

    /**
     * @param commentString the commentString to set
     */
    public void setCommentString(String commentString) {
        this.commentString.setText(commentString);
    }

    /**
     * @return the dateDate
     */
    public javax.swing.JLabel getDateDate() {
        return dateDate;
    }

    /**
     * @param dateDate the dateDate to set
     */
    public void setDateDate(Date dateDate) {
        this.dateDate.setText(Utilities.getDateString(dateDate));
    }

    /**
     * @return the profilePic
     */
    public javax.swing.JLabel getProfilePic() {
        return profilePic;
    }
    
    public ClassLoader getClassLoader() {
    	ClassLoader cLoader = null;
    	try {
    		Class cls = Class.forName("layout.views.CommentUI.CommentUI");
    		// returns the ClassLoader object assosciated with this Class
    		cLoader = cls.getClassLoader();
    	}
    	catch (Exception e) {
    		System.out.println(e);
    	} return cLoader;
    }

    /**
     * @param profilePic the profilePic to set
     */
    public void setProfilePic(String profilePic) {
        try {
        ImageIcon icon = new ImageIcon(ImageIO.read(getClassLoader().getResource(profilePic)));
        // should set int for size here
        icon = new ImageIcon(icon.getImage().getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH)); 
        this.profilePic.setIcon(icon);
        }
        catch (Exception e) {
        	System.out.println(e);
        }
    }

    /**
     * @return the taskStatusEnum
     */
    public javax.swing.JLabel getTaskStatusEnum() {
        return taskStatusEnum;
    }

    /**
     * @param taskStatusEnum the taskStatusEnum to set
     */
    public void setTaskStatusEnum(TaskStatus taskStatusEnum) {
        this.taskStatusEnum.setText(taskStatusEnum.name());
    }

    public void renderCommentUI(Comment comment) {
        this.setCommentString(comment.getComment());
        this.setDateDate(comment.getDate());
        this.setTaskStatusEnum(comment.getTaskStatus());
        this.setTaskID(comment.getTaskID());
        this.setCommentID(comment.getCommentID());
        int commenterID = comment.getCommenterID();
        User commenter = User.getUserFromDatabase(commenterID - 1);
        this.setProfilePic(commenter.getProfilePic());
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
     * @return the commentID
     */
    public int getCommentID() {
        return commentID;
    }

    /**
     * @param commentID the commentID to set
     */
    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }
}
