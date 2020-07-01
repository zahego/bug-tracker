package ForReference.common.Board;

import java.util.ArrayList;
import java.util.List;

import ForReference.common.Enum.BoardType;
import ForReference.common.Enum.TaskStatus;
import ForReference.common.Task.Task;
import ForReference.common.Ultilities.Utilities;

public class Board {
	BoardType type;
	List<Task> tasks;
	int counter;
	
	public Board(BoardType type) {
		this.type = type;
		tasks = new ArrayList<>();
		counter = 0;
	}
	
	public void addTask(Task task) {
		tasks.add(task);
		counter++;
	}
	
	public List<Task> search(String searchInput) {
		return new ArrayList<Task>();
	}
	
	public List<Task> read() {
		return tasks;
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}
	
	public static Board generateTestBoard() {
		Board test = new Board(BoardType.LEFTMAINBACKLOG);
		test.addTask(new Task(1, "aaaaa", 1, TaskStatus.ONBACKLOG, Utilities.getDate(2020, 6, 18)));
		test.addTask(new Task(2, "bbbbb", 1, TaskStatus.ONBACKLOG, Utilities.getDate(2020, 6, 18)));
		test.addTask(new Task(3, "ccccc", 1, TaskStatus.ONBACKLOG, Utilities.getDate(2020, 6, 18)));
		test.addTask(new Task(4, "ddddd", 1, TaskStatus.ONBACKLOG, Utilities.getDate(2020, 6, 18)));
		test.addTask(new Task(5, "eeeee", 1, TaskStatus.ONBACKLOG, Utilities.getDate(2020, 6, 18)));
		test.addTask(new Task(6, "fffff", 1, TaskStatus.ONBACKLOG, Utilities.getDate(2020, 6, 18)));
		test.addTask(new Task(7, "ggggg", 1, TaskStatus.ONBACKLOG, Utilities.getDate(2020, 6, 18)));
		test.addTask(new Task(8, "hhhhh", 1, TaskStatus.ONBACKLOG, Utilities.getDate(2020, 6, 18)));
		test.addTask(new Task(9, "iiiii", 1, TaskStatus.ONBACKLOG, Utilities.getDate(2020, 6, 18)));
		test.addTask(new Task(10, "jjjjj", 1, TaskStatus.ONBACKLOG, Utilities.getDate(2020, 6, 18)));
		return test;
	}
}
