package common.Board;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import common.Enum.BoardType;
import common.Task.Task;
import common.TaskHold.TaskHold;

public class Board {
	BoardType type;
	List<Task> tasks;
	
	public Board(BoardType type) {
		this.type = type;
		tasks = new ArrayList<>(TaskHold.filter(type));
	}
	
	public void refresh() {
		tasks = new ArrayList<>(TaskHold.filter(type));
	}
	
	public List<Task> filter(int projectID, int sprintID, int userID){
		List<Task> ret = new ArrayList<>();
		for(int i = 0; i < this.tasks.size(); i++) {
			if((projectID == -1 || tasks.get(i).getProjectID() == projectID) && (sprintID == -1 || tasks.get(i).getSprintID() == sprintID)&&(userID==-1||tasks.get(i).getAssignees().contains(userID))) {
				ret.add(tasks.get(i));
			}
		}
		return ret;
	}
	
	public List<Task> search(String searchInput) {
		return new ArrayList<Task>();
	}
	
	public List<Task> read() {
		return tasks;
	}
	
	public void sortAsc() {
		Collections.sort(tasks, new SortSummaryAscending()); 
	}
	
	public void sortDesc() {
		Collections.sort(tasks, new SortSummaryDescending()); 
	}
}

class SortSummaryAscending implements Comparator<Task> 
{ 
    // Used for sorting in ascending order of 
    // roll name 
    public int compare(Task a, Task b) 
    { 
        return a.getQuickSummary().compareTo(b.getQuickSummary()); 
    } 
} 

class SortSummaryDescending implements Comparator<Task> 
{ 
    // Used for sorting in ascending order of 
    // roll name 
    public int compare(Task a, Task b) 
    { 
        return -(a.getQuickSummary().compareTo(b.getQuickSummary())); 
    } 
} 
