/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holder.task_hold;
import java.util.ArrayList;
import task.Task;
/**
 *
 * @author tug70
 */
public class Taskhold {
    private ArrayList<Task> tasks;
    public Taskhold(){
    }
    //constructor 
    public Taskhold(ArrayList<Task> tasks){
        this.tasks=tasks;
    }
    //insert
    public void insert(Task new_task){
        this.tasks.add(new_task);
    }
    //TODO update
    public void update(int index, Task new_task){
        
    }
    //TODO sort
    
    //TODO delete
    
    //TODO deleteAll

    /**
     * @return the tasks
     */
    public ArrayList<Task> getTasks() {
        return tasks;
    }

    /**
     * @param tasks the tasks to set
     */
    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }
    
}
