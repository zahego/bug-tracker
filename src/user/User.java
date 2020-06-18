/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;
import project.Project;
import task_hold.Taskhold;
import task.Task;
import java.util.ArrayList; 

/**
 *
 * @author tug70
 */
public class User extends Taskhold{
    private int ID;
    private Role role;
    private String profilePic;
    private String email;
    private String password;
    private int accessRange;
    private ArrayList<Project> projects;
    
    public User(int ID, Role role, String profilePic, String email, String password, int accessRange, ArrayList<Project> projects, Task[] tasks){
     super(tasks);
     this.ID=ID;
     this.role=role;
     this.profilePic=profilePic;
     this.email=email;
     this.password=password;
     this.accessRange=accessRange;
     this.projects=projects;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the role
     */
    public Role getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * @return the profilePic
     */
    public String getProfilePic() {
        return profilePic;
    }

    /**
     * @param profilePic the profilePic to set
     */
    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the accessRange
     */
    public int getAccessRange() {
        return accessRange;
    }

    /**
     * @param accessRange the accessRange to set
     */
    public void setAccessRange(int accessRange) {
        this.accessRange = accessRange;
    }

    /**
     * @return the projects
     */
    public ArrayList<Project> getProjects() {
        return projects;
    }

    /**
     * @param projects the projects to set
     */
    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }
    
    //add individual project for projects[]
    public void addProject(Project project){
        this.projects.add(project);
    }
    
}
