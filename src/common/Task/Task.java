package common.Task;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import common.Enum.TaskStatus;
import common.Enum.TaskType;


public class Task {
	int ID;
	TaskType type;
	int projectID;
	int sprintID;
	String quickSummary;
	List<String> comments; 
	int severity;
	TaskStatus status;
	Date reportedDate;
	Date dueDate;
	String fullDescription;
	File attachedFile;
	//User mainAssigner;
	//User mainAssignee;
	//User[] assigners;
	//User[] assignees;
	
	public Task (int ID, String quickSummary, int severity, TaskStatus status, Date reportedDate) {
		this.ID = ID;
		this.type = TaskType.TASK;
		this.projectID = -1;
		this.sprintID = -1;
		this.quickSummary = quickSummary;
		this.comments = new ArrayList<>();
		this.severity = severity;
		this.status = status;
		this.reportedDate = reportedDate;
		this.dueDate = null;
		this.fullDescription = quickSummary;
		this.attachedFile = null;
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public TaskType getType() {
		return type;
	}

	public void setType(TaskType type) {
		this.type = type;
	}

	public int getProjectID() {
		return projectID;
	}

	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}

	public int getSprintID() {
		return sprintID;
	}

	public void setSprintID(int sprintID) {
		this.sprintID = sprintID;
	}

	public String getQuickSummary() {
		return quickSummary;
	}

	public void setQuickSummary(String quickSummary) {
		this.quickSummary = quickSummary;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}
	
	public void addComment(String comment) {
		this.comments.add(comment);
	}

	public int getSeverity() {
		return severity;
	}

	public void setSeverity(int severity) {
		this.severity = severity;
	}

	public TaskStatus getStatus() {
		return status;
	}

	public void setStatus(TaskStatus status) {
		this.status = status;
	}

	public Date getReportedDate() {
		return reportedDate;
	}

	public void setReportedDate(Date reportedDate) {
		this.reportedDate = reportedDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getFullDescription() {
		return fullDescription;
	}

	public void setFullDescription(String fullDescription) {
		this.fullDescription = fullDescription;
	}

	public File getAttachedFile() {
		return attachedFile;
	}

	public void setAttachedFile(File attachedFile) {
		this.attachedFile = attachedFile;
	}
}
