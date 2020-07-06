/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.SwingUtilities;
import layout.views.screen.ScreenUI;

/**
 *
 * @author tug70
 */
public class MainTest {

    public static void main(String args[]) {
        ScreenUI screen=new ScreenUI();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
        screen.displayJFrame();
        }
        });

        
       
        }

}
