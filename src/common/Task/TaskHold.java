package common.Task;

import java.util.List;
import java.io.FileReader;
import java.util.ArrayList;

import common.Enum.BoardType;
import common.Enum.TaskStatus;
import common.Enum.TaskType;
import common.Task.Task;
import common.Ultilities.Utilities;
import java.util.Date;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import layout.views.project.ProjectUIDropdown;
import layout.views.sprint.SprintUIDropdown;
import common.User.CurrentUserhold;

public class TaskHold {

    private static List<Task> taskList = new ArrayList<>();
    private static List<Task> newTaskList = new ArrayList<>();
    private static int currentNewTaskListID = 0;

    //////////////////now this method can handle rerender everytime it is recalled////////////////////////////
    public static void loadTask() {

        getTaskList().clear();
        try {

            if (ProjectUIDropdown.getProjectAccessID() == -1 && CurrentUserhold.getUser() == null) {
                getTaskList().add(new Task(0, TaskType.BUGREPORT, "there is no user record. Log in to see projects", -1, -1, 10, TaskStatus.ONNEW, new Date()));
                getTaskList().add(new Task(1, TaskType.BUGREPORT, "there is no user record. Log in to see projects", -1, -1, 10, TaskStatus.ONTAKEN, new Date()));
                getTaskList().add(new Task(2, TaskType.BUGREPORT, "there is no user record. Log in to see projects", -1, -1, 10, TaskStatus.ONGOING, new Date()));
                getTaskList().add(new Task(3, TaskType.BUGREPORT, "Admin email: anon@anon.anon", -1, -1, 10, TaskStatus.ONFINISH, new Date()));
            } else {

                JSONArray tasks = Utilities.readFile("task");
                for (Object taskObj : tasks) {
                    JSONObject task = (JSONObject) taskObj;

                    //this is so that we dont have to use assigneeFromDB.contains(CurrentUserhold.getUser().getID()), which will continue to loop once again
                    boolean userIDContainsInTaskAssigneeID = false;

                    List<Integer> assigneeIDs = new ArrayList<>();
                    JSONArray assigneeFromDB = (JSONArray) task.get("assigneeIDs");
                    if (assigneeFromDB != null) {
                        for (int i = 0; i < assigneeFromDB.size(); i++) {
                            assigneeIDs.add(((Long) assigneeFromDB.get(i)).intValue());
                            //System.out.println("this is assignee ID; "+((Long) assigneeFromDB.get(i)).intValue());
                            if (CurrentUserhold.getUser().getID() == ((Long) assigneeFromDB.get(i)).intValue()) {
                                userIDContainsInTaskAssigneeID = true;
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
                        if (userIDContainsInTaskAssigneeID == true) {
                            if (ProjectUIDropdown.getProjectAccessID() == -1) {
                                if (SprintUIDropdown.getSprintAccessID() == -1) {
                                    getTaskList().add(new_task);
                                } else if (SprintUIDropdown.getSprintAccessID() == Long.valueOf((long) task.get("sprintID")).intValue()) {
                                    getTaskList().add(new_task);
                                }
                            } else if (ProjectUIDropdown.getProjectAccessID() == Long.valueOf((long) task.get("projectID")).intValue()) {
                                if (SprintUIDropdown.getSprintAccessID() == -1) {
                                    getTaskList().add(new_task);
                                } else if (SprintUIDropdown.getSprintAccessID() == Long.valueOf((long) task.get("sprintID")).intValue()) {
                                    getTaskList().add(new_task);
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
    /*public static void loadNewTask() {
        if (!getNewTaskList().isEmpty()) {
            for (int i = 0; i < getNewTaskList().size(); i++) {
                
            }
        }
    }*/

    public static void addTask(Task task) {
        getTaskList().add(task);
    }

    public static int newTaskIDCalculation() {
        int calculationResult = 0;
        if (getNewTaskList().isEmpty()) {
            currentNewTaskListID = taskList.size() + 1;
            calculationResult = currentNewTaskListID;
        } else {
            currentNewTaskListID = getNewTaskList().get(getNewTaskList().size() - 1).getID() + 1;
            calculationResult = currentNewTaskListID;
        }
        return calculationResult;
    }

    public static void addToNewTaskList(Task task) {
        getNewTaskList().add(task);
    }

    public static void deleteTask(int id) throws ArrayIndexOutOfBoundsException {
        //check condition if id>getTaskList().get(getTaskList().size()-1).getID() or not
        //if yes, delete from taskList
        //else delete from newTaskList
    }

    public static List<Task> filter(BoardType type) {
        List<Task> ret = new ArrayList<>();
        switch (type) {
            case BACKLOG:
                for (int i = 0; i < getTaskList().size(); i++) {
                    if (getTaskList().get(i).getStatus() == TaskStatus.ONNEW || getTaskList().get(i).getStatus() == TaskStatus.ONREVIEW) {
                        ret.add(getTaskList().get(i));
                    }
                }
                break;
            case TAKEN:
                for (int i = 0; i < getTaskList().size(); i++) {
                    if (getTaskList().get(i).getStatus() == TaskStatus.ONTAKEN) {
                        ret.add(getTaskList().get(i));
                    }
                }
                break;
            case ONGOING:
                for (int i = 0; i < getTaskList().size(); i++) {
                    if (getTaskList().get(i).getStatus() == TaskStatus.ONGOING) {
                        ret.add(getTaskList().get(i));
                    }
                }
                break;
            case FINISH:
                for (int i = 0; i < getTaskList().size(); i++) {
                    if (getTaskList().get(i).getStatus() == TaskStatus.ONFINISH) {
                        ret.add(getTaskList().get(i));
                    }
                }
                break;
        }
        return ret;
    }
        public static List<Task> filterForNewList(BoardType type) {
        List<Task> ret = new ArrayList<>();
        switch (type) {
            case BACKLOG:
                for (int i = 0; i < getNewTaskList().size(); i++) {
                    if (getNewTaskList().get(i).getStatus() == TaskStatus.ONNEW || getNewTaskList().get(i).getStatus() == TaskStatus.ONREVIEW) {
                        ret.add(getNewTaskList().get(i));
                    }
                }
                break;
            case TAKEN:
                for (int i = 0; i < getNewTaskList().size(); i++) {
                    if (getNewTaskList().get(i).getStatus() == TaskStatus.ONTAKEN) {
                        ret.add(getNewTaskList().get(i));
                    }
                }
                break;
            case ONGOING:
                for (int i = 0; i < getNewTaskList().size(); i++) {
                    if (getNewTaskList().get(i).getStatus() == TaskStatus.ONGOING) {
                        ret.add(getNewTaskList().get(i));
                    }
                }
                break;
            case FINISH:
                for (int i = 0; i < getNewTaskList().size(); i++) {
                    if (getNewTaskList().get(i).getStatus() == TaskStatus.ONFINISH) {
                        ret.add(getNewTaskList().get(i));
                    }
                }
                break;
        }
        return ret;
    }

    /**
     * @return the taskList
     */
    public static List<Task> getTaskList() {
        return taskList;
    }

    /**
     * @param aTaskList the taskList to set
     */
    public static void setTaskList(List<Task> aTaskList) {
        taskList = aTaskList;
    }

    /**
     * @return the newTaskList
     */
    public static List<Task> getNewTaskList() {
        return newTaskList;
    }

    /**
     * @param aNewTaskList the newTaskList to set
     */
    public static void setNewTaskList(List<Task> aNewTaskList) {
        newTaskList = aNewTaskList;
    }
}