package TrungAndAnhIntegration.common.Board;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import TrungAndAnhIntegration.common.Enum.BoardType;
import TrungAndAnhIntegration.common.Task.Task;
import TrungAndAnhIntegration.common.TaskHold.TaskHold;

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
	
	public void sortSummaryAsc() {
		Collections.sort(tasks, new SortSummaryAsc()); 
	}
	
	public void sortSummaryDesc() {
		Collections.sort(tasks, new SortSummaryDesc()); 
	}
	
	public void sortDueDate() {
		Collections.sort(tasks, new SortDueDate()); 
	}
	
	public void sortSeverityDesc() {
		Collections.sort(tasks, new SortSeverityDesc()); 
	}
	
	public void sortSeverityAsc() {
		Collections.sort(tasks, new SortSeverityAsc()); 
	}
	
	public void sortIDAsc() {
		Collections.sort(tasks, new SortIDAsc()); 
	}
	
	public void sortIDDesc() {
		Collections.sort(tasks, new SortIDDesc()); 
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
