package common.Board;

import java.util.ArrayList;
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
	
	public List<Task> filter(String projectID, String sprintID, int userID){
		List<Task> ret = new ArrayList<>();
		for(int i = 0; i < this.tasks.size(); i++) {
			if((projectID==null||tasks.get(i).getProjectID().equals(projectID))&&(sprintID==null||tasks.get(i).getSprintID().equals(sprintID))&&(userID==-1||tasks.get(i).getAssignees().contains(userID))) {
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
}
