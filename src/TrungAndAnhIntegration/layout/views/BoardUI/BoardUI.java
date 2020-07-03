package TrungAndAnhIntegration.layout.views.BoardUI;

import javax.swing.JPanel;

import TrungAndAnhIntegration.common.Board.Board;
import TrungAndAnhIntegration.common.Enum.BoardType;
import TrungAndAnhIntegration.common.Task.Task;
import TrungAndAnhIntegration.layout.views.TaskUI.TaskCardUI;
import TrungAndAnhIntegration.layout.views.TaskUI.TaskDetailsUI;

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
	
	Board board;
	/**
	 * Create the panel.
	 */
	public BoardUI(BoardType type) {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		board = new Board(type);
		renderBoard();
	}
	
	public void renderBoard() {
		List<Task> tasks = board.read();
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
	}
	
	public void filter() {
		
	}
	
	public void refresh() {
		this.board.refresh();
		this.removeAll();
		renderBoard();
	}
	
	public void sortSummaryAsc() {
		this.board.sortSummaryAsc();
		this.removeAll();
		renderBoard();
	}
	
	public void sortSummaryDesc() {
		this.board.sortSummaryDesc();
		this.removeAll();
		renderBoard();
	}
	
	public void sortDueDate() {
		this.board.sortDueDate();
		this.removeAll();
		renderBoard();
	}
	
	public void sortSeverityAsc() {
		this.board.sortSeverityAsc();
		this.removeAll();
		renderBoard();
	}
	
	public void sortSeverityDesc() {
		this.board.sortSeverityDesc();
		this.removeAll();
		renderBoard();
	}
	
	public void sortIDAsc() {
		this.board.sortIDAsc();
		this.removeAll();
		renderBoard();
	}
	
	public void sortIDDesc() {
		this.board.sortIDDesc();
		this.removeAll();
		renderBoard();
	}
}
