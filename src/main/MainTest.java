/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import holder.project_hold.Projecthold;
import holder.task_hold.Taskhold;
import java.util.ArrayList;
import javax.swing.SwingUtilities;
import project.Project;
import screen.ScreenUI;
import user.*;

/**
 *
 * @author tug70
 */
public class MainTest {

    public static void main(String args[]) {
        Projecthold projects = new Projecthold(new ArrayList<>());
        Taskhold tasks = new Taskhold();
        User dev = new User(2, Role.DEVELOPER, "lol", "deve@gmail.com", "dunnt", 2, projects, tasks);
        System.out.println(dev.getID());
        dev.setID(3);
        //can't print before insert, there's nothing there. TODO need to find a way so that thí is not null
        //System.out.println(dev.getProjecthold().getProjects().get(0).getProjectID());
        projects.insert(new Project(1));
        dev.setUserFromDatabase(0);

        //for(int i=0;i<projects.getProjects().size();i++)
        System.out.println(dev.getProjecthold().getProjects().get(0).getProjectID());
        System.out.println(projects.getProjects().get(0).getProjectID());
        //System.out.println(dev.getProjecthold());
        System.out.println(dev.getID());
        ScreenUI screen=new ScreenUI();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
        screen.displayJFrame();
        }
        });

        
       
        }

}
