package layout.views.BoardUI;

import javax.swing.JPanel;

import common.Board.Board;
import common.Enum.BoardType;
import common.Task.Task;
import layout.views.TaskUI.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class BoardUI extends JPanel {

	Board board;
	/**
	 * Create the panel.
	 */
	public BoardUI(BoardType type) {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		board = new Board(type);
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
}
