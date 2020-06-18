/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.ArrayList;
import project.Project;
import task.Task;
import user.*;
/**
 *
 * @author tug70
 */
public class MainTest {
        public static void main(String args[]) {
            ArrayList<Project> projects=new ArrayList<Project>();
        Task[] tasks=new Task[1];
        User dev=new User(2, Role.DEVELOPER, "lol", "deve@gmail.com", "dunnt", 2, projects, tasks);
            System.out.println(dev.getID());
        }
        
}
