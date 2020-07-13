/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout.views.user;

import common.User.CurrentUserhold;
import common.User.User;
import javax.imageio.ImageIO;
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

        UserName = new javax.swing.JLabel();
        UserID = new javax.swing.JLabel();
        UserEmail = new javax.swing.JLabel();
        UserRole = new javax.swing.JLabel();
        Portrait = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 0));
        setMaximumSize(new java.awt.Dimension(244, 123));
        setPreferredSize(new java.awt.Dimension(210, 100));

        UserName.setBackground(new java.awt.Color(153, 255, 255));
        UserName.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
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
        UserID.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
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
        UserEmail.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
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
        UserRole.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Portrait, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserRole, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserID, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Portrait, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UserName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UserRole)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    
    public ClassLoader getClassLoader() {
    	ClassLoader cLoader = null;
    	try {
    		Class cls = Class.forName("layout.views.user.UserUI");
    		// returns the ClassLoader object assosciated with this Class
    		cLoader = cls.getClassLoader();
    	}
    	catch (Exception e) {
    		System.out.println(e);
    	} return cLoader;
    }
    
    public void setUserFromDatabase(int num){
        //put this into current user hold
        //this is for testing. Incase the method is called with a num
        CurrentUserhold.setUser(User.getUserFromDatabase(num));
        
        this.setUserName(CurrentUserhold.getUser().getName());
        this.setUserEmail(CurrentUserhold.getUser().getEmail());
        this.setUserID(String.valueOf(CurrentUserhold.getUser().getID()));
        this.setUserRole(CurrentUserhold.getUser().getRole().name());
        
        //set icon
        try {
        ImageIcon icon = new ImageIcon(ImageIO.read(getClassLoader().getResource(CurrentUserhold.getUser().getProfilePic())));
        // should set int for size here
        icon = new ImageIcon(icon.getImage().getScaledInstance(70, 70,  java.awt.Image.SCALE_SMOOTH)); 
        this.setPortrait(icon);
        }
        catch (Exception e) {
        	System.out.println(e);
        }
    }
    public void setUserAtNull(){
        
        this.setUserName("NAME");
        this.setUserEmail("EMAIL");
        this.setUserID("-1");
        this.setUserRole("NO ONE");
        
        try {
        ImageIcon icon = new ImageIcon(ImageIO.read(getClassLoader().getResource("resources/tempIcon.png")));
        // should set int for size here
        icon = new ImageIcon(icon.getImage().getScaledInstance(70, 70,  java.awt.Image.SCALE_SMOOTH)); 
        this.setPortrait(icon);
        }
        catch (Exception e) {
        	System.out.println(e);
        }
        
    }
    
    
}
