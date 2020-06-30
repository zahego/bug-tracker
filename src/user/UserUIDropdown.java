/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.awt.Component;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import log_in.LogInUI;
import screen.ScreenUI;

/**
 *
 * @author tug70
 */
public class UserUIDropdown extends javax.swing.JPanel {
    private static UserUI userUI=new UserUI();
    private static boolean isLogIn;
    /**
     * Creates new form UserUIDropdown
     */
    public UserUIDropdown() {
        initComponents();
        renderUI();
        
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

        setLayout(new java.awt.BorderLayout());

        authentication.setText("Log in");
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
        if(getAuthentication().getText().equals("Log out")){
            getAuthentication().setText("Log in");
            getUserUI().setVisible(false);
            CurrentUserhold.setUser(null);
            ScreenUI.renderUI();
        }
        else if(getAuthentication().getText().equals("Log in")){
            LogInUI loginform= new LogInUI();
            loginform.setVisible(true);
            
        }
    }//GEN-LAST:event_authenticationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton authentication;
    // End of variables declaration//GEN-END:variables
    


    public void renderUI(){
        setUserUI(new UserUI());
        //cuurent user already get set as this method is called but not before
        if(CurrentUserhold.getUser()!=null){
        
        getUserUI().setUserFromDatabase(CurrentUserhold.getUser().getID()-1);
        
        }
        this.add(getUserUI());
        
    }

    /**E
     * @return the userUI
     */
    public static UserUI getUserUI() {
        return userUI;
    }

    /**
     * @param aUserUI the userUI to set
     */
    public static void setUserUI(UserUI aUserUI) {
        userUI = aUserUI;
    }
    
    
    /**
     * @return the isLogIn
     */
    public static boolean isIsLogIn() {
        return isLogIn;
    }

    /**
     * @param aIsLogIn the isLogIn to set
     */
    public static void setIsLogIn(boolean aIsLogIn) {
        isLogIn = aIsLogIn;
    }

    /**
     * @return the authentication
     */
    public javax.swing.JButton getAuthentication() {
        return authentication;
    }

    /**
     * @param authentication the authentication to set
     */
    public void setAuthentication(javax.swing.JButton authentication) {
        this.authentication = authentication;
    }
    
}

