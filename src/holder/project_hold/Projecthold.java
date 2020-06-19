/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holder.project_hold;
import java.util.ArrayList;
import project.Project;
/**
 *
 * @author tug70
 */
public class Projecthold {
    private ArrayList<Project> projects;
    public Projecthold(){
    }
    public Projecthold(ArrayList<Project> projects){
        this.projects=projects;
    }
    //insert
    //TODO sort as insert
     public void insert(Project new_project){
        this.projects.add(new_project);
    }
    //update
    public void update(int index, Project new_project){
        this.projects.set(index, new_project);
    }
    // bubble sort by ID, smallest to head(0), biggest to tail(n)
    //TODO expand to sort by other attribute
    //TODO test this shit
    public void bublesort(){
        for(int i=0;i<this.projects.size()-1;i++){
            for(int j=0;j<this.projects.size()-i-1;j++){
                if(this.projects.get(j).getProjectID()>this.projects.get(j+1).getProjectID()){
                    
                    //exchange the 2 ID of the adjacent projects
                    int tempID=this.projects.get(j).getProjectID();
                    this.projects.get(j).setProjectID(this.projects.get(j+1).getProjectID());
                    this.projects.get(j+1).setProjectID(this.projects.get(j).getProjectID());
                    
                    //exchange the 2 projects next to each other 
                    Project tempProject=this.projects.get(j);
                    update(j, this.projects.get(j+1));
                    update((j+1), tempProject);
                }
            }
        }
    }
    // delete
    public void delete(Project new_project){
        this.projects.remove(new_project);
    }
    
    // deleteAll
    public void deleteAll(){
        this.projects.clear();
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

}
