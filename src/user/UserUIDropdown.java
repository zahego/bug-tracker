/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

/**
 *
 * @author tug70
 */
public class UserUIDropdown extends javax.swing.JPanel {

    /**
     * Creates new form UserUIDropdown
     */
    public UserUIDropdown() {
        initComponents();
        addUI();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        authentication = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 255));
        setLayout(new java.awt.BorderLayout());

        authentication.setText("log out");
        authentication.setMaximumSize(new java.awt.Dimension(300, 25));
        authentication.setPreferredSize(new java.awt.Dimension(300, 25));
        authentication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authenticationActionPerformed(evt);
            }
        });
        add(authentication, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void authenticationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authenticationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authenticationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton authentication;
    // End of variables declaration//GEN-END:variables
    


    public void addUI(){
        UserUI userUI=new UserUI();
        ImageIcon icon = new ImageIcon("src/database/tempIcon.png");
        icon = new ImageIcon(icon.getImage().getScaledInstance(110, 110,  java.awt.Image.SCALE_SMOOTH));  // transform it back
     
        userUI.setPortrait(icon);
        userUI.setUserEmail("hoho@gmail.com");
        //this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(userUI);
    }
    
}

