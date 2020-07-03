
package TrungAndAnhIntegration.common.Board;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import TrungAndAnhIntegration.common.Enum.BoardType;
import TrungAndAnhIntegration.common.Task.Task;
import TrungAndAnhIntegration.common.TaskHold.TaskHold;

public class Board {
	private BoardType type;
	private List<Task> tasks;
        private List<Task> newTasks;
	
	public Board(BoardType type) {
		this.type = type;
		tasks = new ArrayList<>(TaskHold.filter(type));
                newTasks = new ArrayList<>(TaskHold.filterForNewList(type));
	}
	
	public void refresh() {
		setTasks(new ArrayList<>(TaskHold.filter(getType())));
                //do we need to refresh this?
                setNewTasks(new ArrayList<>(TaskHold.filterForNewList(getType())));
	}
	
	public List<Task> filter(int projectID, int sprintID, int userID){
		List<Task> ret = new ArrayList<>();
		for(int i = 0; i < this.getTasks().size(); i++) {
			if((projectID == -1 || getTasks().get(i).getProjectID() == projectID) && (sprintID == -1 || getTasks().get(i).getSprintID() == sprintID)&&(userID==-1||getTasks().get(i).getAssignees().contains(userID))) {
				ret.add(getTasks().get(i));
			}
		}
		return ret;
	}
        public List<Task> filterForNewList(int projectID, int sprintID, int userID){
		List<Task> ret = new ArrayList<>();
                for(int i = 0; i < this.getNewTasks().size(); i++) {
			if((projectID == -1 || getNewTasks().get(i).getProjectID() == projectID) && (sprintID == -1 || getNewTasks().get(i).getSprintID() == sprintID)&&(userID==-1||getNewTasks().get(i).getAssignees().contains(userID))) {
				ret.add(getNewTasks().get(i));
			}
		}
		return ret;
	}
	
	public List<Task> search(String searchInput) {
		return new ArrayList<Task>();
	}
	
	public List<Task> read() {
		return getTasks();
	}
        public List<Task> readNewTask() {
		return getNewTasks();
	}
	
	public void sortSummaryAsc() {
		Collections.sort(getTasks(), new SortSummaryAsc()); 
	}
	
	public void sortSummaryDesc() {
		Collections.sort(getTasks(), new SortSummaryDesc()); 
	}
	
	public void sortDueDate() {
		Collections.sort(getTasks(), new SortDueDate()); 
	}
	
	public void sortSeverityDesc() {
		Collections.sort(getTasks(), new SortSeverityDesc()); 
	}
	
	public void sortSeverityAsc() {
		Collections.sort(getTasks(), new SortSeverityAsc()); 
	}
	
	public void sortIDAsc() {
		Collections.sort(getTasks(), new SortIDAsc()); 
	}
	
	public void sortIDDesc() {
		Collections.sort(getTasks(), new SortIDDesc()); 
	}

    /**
     * @return the type
     */
    public BoardType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(BoardType type) {
        this.type = type;
    }

    /**
     * @return the tasks
     */
    public List<Task> getTasks() {
        return tasks;
    }

    /**
     * @param tasks the tasks to set
     */
    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    /**
     * @return the newTasks
     */
    public List<Task> getNewTasks() {
        return newTasks;
    }

    /**
     * @param newTasks the newTasks to set
     */
    public void setNewTasks(List<Task> newTasks) {
        this.newTasks = newTasks;
    }
}

class SortSummaryAsc implements Comparator<Task> 
{ 
    // Used for sorting in ascending order of 
    // roll name 
    public int compare(Task a, Task b) 
    { 
        return a.getQuickSummary().compareTo(b.getQuickSummary()); 
    } 
} 

class SortSummaryDesc implements Comparator<Task> 
{ 
    // Used for sorting in ascending order of 
    // roll name 
    public int compare(Task a, Task b) 
    { 
        return -(a.getQuickSummary().compareTo(b.getQuickSummary())); 
    } 
} 

class SortDueDate implements Comparator<Task> 
{ 
    // Used for sorting in ascending order of 
    // roll name 
    public int compare(Task a, Task b) 
    { 
    	if (a.getDueDate()==null) return -1;
    	if (b.getDueDate()==null) return 1;
        return a.getDueDate().compareTo(b.getDueDate()); 
    } 
} 

class SortSeverityAsc implements Comparator<Task> 
{ 
    // Used for sorting in ascending order of 
    // roll name 
    public int compare(Task a, Task b) 
    { 
    	int cmp = a.getSeverity() > b.getSeverity() ? +1 : a.getSeverity() < b.getSeverity() ? -1 : 0;
        return cmp;
    } 
} 

class SortSeverityDesc implements Comparator<Task> 
{ 
    // Used for sorting in ascending order of 
    // roll name 
    public int compare(Task a, Task b) 
    { 
    	int cmp = a.getSeverity() > b.getSeverity() ? +1 : a.getSeverity() < b.getSeverity() ? -1 : 0;
        return -cmp;
    } 
} 

class SortIDAsc implements Comparator<Task> 
{ 
    // Used for sorting in ascending order of 
    // roll name 
    public int compare(Task a, Task b) 
    { 
    	int cmp = a.getID() > b.getID() ? +1 : a.getID() < b.getID() ? -1 : 0;
        return cmp;
    } 
} 

class SortIDDesc implements Comparator<Task> 
{ 
    // Used for sorting in ascending order of 
    // roll name 
    public int compare(Task a, Task b) 
    { 
    	int cmp = a.getID() > b.getID() ? +1 : a.getID() < b.getID() ? -1 : 0;
        return -cmp;
    } 
} 