package layout.views.BoardUI;

import javax.swing.JPanel;

import common.Board.Board;
import common.Enum.BoardType;
import common.Task.Task;
import layout.views.TaskUI.TaskCardUI;
import layout.views.TaskUI.TaskDetailsUI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class BoardUI extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7331854978956106556L;
	
	private Board board;
	/**
	 * Create the panel.
	 */
	public BoardUI(BoardType type) {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		board = new Board(type);
		renderBoard();
	}
	
	public void renderBoard() {
		List<Task> tasks = getBoard().read();
		for (int i = 0; i < tasks.size(); i++) {
			Task task = tasks.get(i);
			TaskCardUI card = new TaskCardUI(task);
			card.addMouseListener(new MouseAdapter() { 
		          public void mousePressed(MouseEvent me) { 
		        	  if (me.getClickCount() == 2) {
		        		    TaskDetailsUI details = new TaskDetailsUI(task);
		        		    details.setVisible(true);
		        		    details.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		        	  }
		          } 
		    });
			this.add(card);
		}
                //add new task if there is one or after AddTask
                List<Task> newTasks = getBoard().readNewTask();
                if(!newTasks.isEmpty()){
                for (int i = 0; i < newTasks.size(); i++) {
			Task newtask = newTasks.get(i);
			TaskCardUI card = new TaskCardUI(newtask);
			card.addMouseListener(new MouseAdapter() { 
		          public void mousePressed(MouseEvent me) { 
		        	  if (me.getClickCount() == 2) {
		        		    TaskDetailsUI details = new TaskDetailsUI(newtask);
		        		    details.setVisible(true);
		        		    details.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		        	  }
		          } 
		    });
			this.add(card);
		}}
	}
	
	public void filter() {
		
	}
	
	public void refresh() {
            this.getBoard().refresh();
		this.removeAll();
		renderBoard();
	}
	
	public void sortSummaryAsc() {
            this.getBoard().sortSummaryAsc();
		this.removeAll();
		renderBoard();
	}
	
	public void sortSummaryDesc() {
            this.getBoard().sortSummaryDesc();
		this.removeAll();
		renderBoard();
	}
	
	public void sortDueDate() {
            this.getBoard().sortDueDate();
		this.removeAll();
		renderBoard();
	}
	
	public void sortSeverityAsc() {
            this.getBoard().sortSeverityAsc();
		this.removeAll();
		renderBoard();
	}
	
	public void sortSeverityDesc() {
            this.getBoard().sortSeverityDesc();
		this.removeAll();
		renderBoard();
	}
	
	public void sortIDAsc() {
            this.getBoard().sortIDAsc();
		this.removeAll();
		renderBoard();
	}
	
	public void sortIDDesc() {
            this.getBoard().sortIDDesc();
		this.removeAll();
		renderBoard();
	}

    /**
     * @return the board
     */
    public Board getBoard() {
        return board;
    }

    /**
     * @param board the board to set
     */
    public void setBoard(Board board) {
        this.board = board;
    }
}