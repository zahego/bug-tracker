package TrungAndAnhIntegration.common.TaskHold;

import java.util.List;
import java.io.FileReader;
import java.util.ArrayList;

import TrungAndAnhIntegration.common.Enum.BoardType;
import TrungAndAnhIntegration.common.Enum.TaskStatus;
import TrungAndAnhIntegration.common.Enum.TaskType;
import TrungAndAnhIntegration.common.Task.Task;
import TrungAndAnhIntegration.common.Ultilities.Utilities;
import java.util.Date;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import project.ProjectUIDropdown;
import sprint.SprintUIDropdown;
import user.CurrentUserhold;

public class TaskHold {

    static List<Task> taskList = new ArrayList<>();

    //////////////////now this method can handle rerender everytime it is recalled////////////////////////////
    public static void loadTask() {
        taskList.clear();
        try {

            if (ProjectUIDropdown.getProjectAccessID() == -1 && CurrentUserhold.getUser() == null) {
                taskList.add(new Task(0, TaskType.BUGREPORT, "there is no user record. Log in to see projects", -1, -1, 10, TaskStatus.ONNEW, new Date()));
                taskList.add(new Task(1, TaskType.BUGREPORT, "there is no user record. Log in to see projects", -1, -1, 10, TaskStatus.ONTAKEN, new Date()));
                taskList.add(new Task(2, TaskType.BUGREPORT, "there is no user record. Log in to see projects", -1, -1, 10, TaskStatus.ONGOING, new Date()));
                taskList.add(new Task(3, TaskType.BUGREPORT, "Admin email: anon@anon.anon", -1, -1, 10, TaskStatus.ONFINISH, new Date()));
            } else {
                
                JSONArray tasks = Utilities.readFile("task");
                for (Object taskObj : tasks) {
                    JSONObject task = (JSONObject) taskObj;

                    //this is so that we dont have to use assigneeFromDB.contains(CurrentUserhold.getUser().getID()), which will continue to loop once again
                boolean userIDContainsInTaskAssigneeID=false;
                    
                    List<Integer> assigneeIDs = new ArrayList<>();
                    JSONArray assigneeFromDB = (JSONArray)  task.get("assigneeIDs");
                    if (assigneeFromDB != null) {
                        for (int i = 0; i < assigneeFromDB.size(); i++) {
                            assigneeIDs.add(((Long) assigneeFromDB.get(i)).intValue());
                            System.out.println("this is assignee ID; "+((Long) assigneeFromDB.get(i)).intValue());
                            if(CurrentUserhold.getUser().getID()==((Long) assigneeFromDB.get(i)).intValue()){
                                userIDContainsInTaskAssigneeID=true;
                            }
                        }
                    }
                    //create a new task for adding
                    Task new_task = new Task(
                            Long.valueOf((long) task.get("id")).intValue(),
                            TaskType.valueOf((String) task.get("taskType")),
                            (String) task.get("quickSummary"),
                            new ArrayList<>(),
                            Long.valueOf((long) task.get("projectID")).intValue(),
                            Long.valueOf((long) task.get("sprintID")).intValue(),
                            Long.valueOf((long) task.get("severity")).intValue(),
                            TaskStatus.valueOf((String) task.get("taskStatus")),
                            Utilities.stringToDate((String) task.get("dateCreated")),
                            Utilities.stringToDate((String) task.get("dateDue")),
                            "",
                            (String) task.get("fullDescription"),
                            "",
                            Long.valueOf((long) task.get("assignerID")).intValue(),
                            assigneeIDs
                    );
                    
                    if (CurrentUserhold.getUser() != null) {
                        if(userIDContainsInTaskAssigneeID==true){
                        if (ProjectUIDropdown.getProjectAccessID() == -1) {
                            if (SprintUIDropdown.getSprintAccessID() == -1) {
                                taskList.add(new_task);
                            } else if (SprintUIDropdown.getSprintAccessID() == Long.valueOf((long) task.get("sprintID")).intValue()) {
                                taskList.add(new_task);
                            }
                        } else if (ProjectUIDropdown.getProjectAccessID() == Long.valueOf((long) task.get("projectID")).intValue()) {
                            if (SprintUIDropdown.getSprintAccessID() == -1) {
                                taskList.add(new_task);
                            } else if (SprintUIDropdown.getSprintAccessID() == Long.valueOf((long) task.get("sprintID")).intValue()) {
                                taskList.add(new_task);
                            }
                        }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    ////////////////////////////////end of new addition//////////////////////////////////////////////

    public static void addTask(Task task) {
        taskList.add(task);
    }

    public static void deleteTask(int id) throws ArrayIndexOutOfBoundsException {

    }

    public static List<Task> filter(BoardType type) {
        List<Task> ret = new ArrayList<>();
        switch (type) {
            case BACKLOG:
                for (int i = 0; i < taskList.size(); i++) {
                    if (taskList.get(i).getStatus() == TaskStatus.ONNEW || taskList.get(i).getStatus() == TaskStatus.ONREVIEW) {
                        ret.add(taskList.get(i));
                    }
                }
                break;
            case TAKEN:
                for (int i = 0; i < taskList.size(); i++) {
                    if (taskList.get(i).getStatus() == TaskStatus.ONTAKEN) {
                        ret.add(taskList.get(i));
                    }
                }
                break;
            case ONGOING:
                for (int i = 0; i < taskList.size(); i++) {
                    if (taskList.get(i).getStatus() == TaskStatus.ONGOING) {
                        ret.add(taskList.get(i));
                    }
                }
                break;
            case FINISH:
                for (int i = 0; i < taskList.size(); i++) {
                    if (taskList.get(i).getStatus() == TaskStatus.ONFINISH) {
                        ret.add(taskList.get(i));
                    }
                }
                break;
        }
        return ret;
    }
}
