package layout.views.SwitchBoardPopUp;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import common.Task.Task;
import layout.views.BoardUI.BoardUI;


public class SwitchBoardPopUp extends JPopupMenu {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JMenuItem switchMenu;
	private Task task;
	BoardUI parentBoard;
	
    public SwitchBoardPopUp(Task task, BoardUI parentBoard) {
    	this.task = task;
    	this.parentBoard = parentBoard;
    	switchMenu = new JMenuItem("Click Me!");
        add(switchMenu);
    }
}