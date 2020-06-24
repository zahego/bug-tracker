/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import com.sun.xml.internal.ws.api.Component;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author tug70
 */
public class UserUI extends javax.swing.JPanel implements ListCellRenderer {

    /**
     * Creates new form UserUI2
     */
    public UserUI() {
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

        logOutButton = new javax.swing.JButton();
        UserName = new javax.swing.JLabel();
        UserID = new javax.swing.JLabel();
        UserEmail = new javax.swing.JLabel();
        UserRole = new javax.swing.JLabel();
        Portrait = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));
        setMaximumSize(new java.awt.Dimension(478, 342));

        logOutButton.setText("log out");

        UserName.setBackground(new java.awt.Color(153, 255, 255));
        UserName.setForeground(new java.awt.Color(0, 0, 102));
        UserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserName.setText("NAME");
        UserName.setToolTipText("");
        UserName.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        UserName.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        UserName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        UserName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        UserName.setName(""); // NOI18N
        UserName.setOpaque(true);

        UserID.setBackground(new java.awt.Color(255, 255, 153));
        UserID.setForeground(new java.awt.Color(0, 0, 102));
        UserID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserID.setText("ID");
        UserID.setToolTipText("");
        UserID.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        UserID.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        UserID.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        UserID.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        UserID.setName(""); // NOI18N
        UserID.setOpaque(true);

        UserEmail.setBackground(new java.awt.Color(153, 255, 102));
        UserEmail.setForeground(new java.awt.Color(0, 0, 102));
        UserEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserEmail.setText("EMAIL");
        UserEmail.setToolTipText("");
        UserEmail.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        UserEmail.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        UserEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        UserEmail.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        UserEmail.setName(""); // NOI18N
        UserEmail.setOpaque(true);

        UserRole.setBackground(new java.awt.Color(255, 153, 0));
        UserRole.setForeground(new java.awt.Color(0, 0, 102));
        UserRole.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserRole.setText("ROLE");
        UserRole.setToolTipText("");
        UserRole.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        UserRole.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        UserRole.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        UserRole.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        UserRole.setName(""); // NOI18N
        UserRole.setOpaque(true);

        Portrait.setBackground(new java.awt.Color(255, 255, 255));
        Portrait.setForeground(new java.awt.Color(0, 0, 102));
        Portrait.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Portrait.setToolTipText("");
        Portrait.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Portrait.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Portrait.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Portrait.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Portrait.setName(""); // NOI18N
        Portrait.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Portrait, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserRole, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserID, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Portrait, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(UserName)
                .addGap(27, 27, 27)
                .addComponent(UserID)
                .addGap(27, 27, 27)
                .addComponent(UserEmail)
                .addGap(30, 30, 30)
                .addComponent(UserRole)
                .addGap(18, 18, 18)
                .addComponent(logOutButton))
        );

        Portrait.getAccessibleContext().setAccessibleName("PORTRAIT");

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Portrait;
    private javax.swing.JLabel UserEmail;
    private javax.swing.JLabel UserID;
    private javax.swing.JLabel UserName;
    private javax.swing.JLabel UserRole;
    private javax.swing.JButton logOutButton;
    // End of variables declaration//GEN-END:variables

    
    @Override
    public UserUI getListCellRendererComponent(JList list, Object value,
            int index, boolean isSelected, boolean cellHasFocus) {
        return this;
    }
    /**
     * @return the UserEmail
     */
    public javax.swing.JLabel getUserEmail() {
        return UserEmail;
    }

    /**
     * @param UserEmail the UserEmail to set
     */
    //TODO have set icon
    public void setUserEmail(String UserEmail) {
        this.UserEmail.setText(UserEmail);
    }

    /**
     * @return the UserID
     */
    public javax.swing.JLabel getUserID() {
        return UserID;
    }

    /**
     * @param UserID the UserID to set
     */
    public void setUserID(String UserID) {
        this.UserID.setText(UserID);
    }

    /**
     * @return the UserName
     */
    public javax.swing.JLabel getUserName() {
        return UserName;
    }

    /**
     * @param UserName the UserName to set
     */
    public void setUserName(String UserName) {
        this.UserName.setText(UserName);
    }

    /**
     * @return the UserRole
     */
    public javax.swing.JLabel getUserRole() {
        return UserRole;
    }

    /**
     * @param UserRole the UserRole to set
     */
    public void setUserRole(String UserRole) {
        this.UserRole.setText(UserRole);
    }

    /**
     * @return the logOutButton
     */
    public javax.swing.JButton getLogOutButton() {
        return logOutButton;
    }

    /**
     * @param logOutButton the logOutButton to set
     */
    public void setLogOutButton(javax.swing.JButton logOutButton) {
        this.logOutButton = logOutButton;
    }

    /**
     * @return the Portrait
     */
    public javax.swing.JLabel getPortrait() {
        return Portrait;
    }

    /**
     * @param Portrait the Portrait to set
     */
    public void setPortrait(ImageIcon Portrait) {
        this.Portrait.setIcon(Portrait);
    }
    
    
}
