package common.TaskHold;

import java.util.List;
import java.io.FileReader;
import java.util.ArrayList;

import common.Enum.BoardType;
import common.Enum.TaskStatus;
import common.Enum.TaskType;
import common.Task.*;
import common.Ultilities.Utilities;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class TaskHold {
	static List<Task> taskList = new ArrayList<>();
	
	public static void loadTask() {
        try {
            JSONArray tasks = Utilities.readFile("task");
            for(Object taskObj: tasks) {
            	JSONObject task = (JSONObject) taskObj;
            	taskList.add(new Task(Long.valueOf((long) task.get("id")).intValue(), TaskType.valueOf((String) task.get("taskType")), (String) task.get("quickSummary"), Long.valueOf((long) task.get("projectID")).intValue(), Long.valueOf((long) task.get("sprintID")).intValue(), Long.valueOf((long) task.get("severity")).intValue(), TaskStatus.valueOf((String) task.get("taskStatus")), Utilities.stringToDate((String) task.get("date"))));
            }
        } catch (Exception e) {
        	e.printStackTrace();
        }
	}
	
	public static void addTask(Task task) {
		taskList.add(task);
	}
	
	public static void deleteTask(int id) throws ArrayIndexOutOfBoundsException{
		
	}
	
	public static List<Task> filter(BoardType type){
		List<Task> ret = new ArrayList<>();
		switch(type) {
			case BACKLOG:
				for(int i = 0; i< taskList.size(); i++) {
					if(taskList.get(i).getStatus()==TaskStatus.ONNEW||taskList.get(i).getStatus()==TaskStatus.ONREVIEW) {
						ret.add(taskList.get(i));
					}
				}
				break;
			case TAKEN:
				for(int i = 0; i< taskList.size(); i++) {
					if(taskList.get(i).getStatus()==TaskStatus.ONTAKEN) {
						ret.add(taskList.get(i));
					}
				}
				break;
			case ONGOING:
				for(int i = 0; i< taskList.size(); i++) {
					if(taskList.get(i).getStatus()==TaskStatus.ONGOING) {
						ret.add(taskList.get(i));
					}
				}
				break;
			case FINISH:
				for(int i = 0; i< taskList.size(); i++) {
					if(taskList.get(i).getStatus()==TaskStatus.ONFINISH) {
						ret.add(taskList.get(i));
					}
				}
				break;
		}
		return ret;
	}
}
