/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import project.Projecthold;
import holder.task_hold.Taskhold;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.SwingUtilities;

import TrungAndAnhIntegration.common.TaskHold.TaskHold;
import project.Project;
import screen.ScreenUI;
import user.*;

/**
 *
 * @author tug70
 */
public class MainTest {

    public static void main(String args[]) {
        Projecthold projects = new Projecthold();
        Taskhold tasks = new Taskhold();
        User dev = new User(2, Role.DEVELOPER, "chump", "lol", "deve@gmail.com", "dunnt", 2, projects, tasks);
        Project webber=new Project(9, "webber", new Date(), new Date(), new Date(), "strick", new int[0]);
        //System.out.println(dev.getID());
        dev.setID(3);
        //can't print before insert, there's nothing there. TODO need to find a way so that thí is not null
        //System.out.println(dev.getProjecthold().getProjects().get(0).getProjectID());
        TaskHold.loadTask();
        ScreenUI screen=new ScreenUI();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
        screen.displayJFrame();
        }
        });
    }

}
