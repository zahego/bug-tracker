package layout.views.SwitchBoardPopUp;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import common.Task.Task;


public class SwitchBoardPopUp extends JPopupMenu {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JMenuItem switchMenu;
	private Task task;
    
    public SwitchBoardPopUp(Task task) {
    	this.task = task;
    	switchMenu = new JMenuItem("Click Me!");
        add(switchMenu);
    }
}