package layout.views.BoardUI;

import javax.swing.JPanel;

import common.Board.Board;
import common.Enum.BoardType;
import common.Task.Task;
import common.Task.TaskHold;
import common.User.CurrentUserhold;
import layout.views.SwitchBoardPopUp.SwitchBoardPopUp;
import layout.views.TaskUI.TaskCardUI;
import layout.views.TaskUI.TaskDetailsUI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import layout.views.project.ProjectUIDropdown;
import layout.views.sprint.SprintUIDropdown;

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
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        board = new Board(type);
        renderBoard(board.read());
    }

    public void renderBoard(List<Task> tasks) {
        if (CurrentUserhold.getUser() != null) {
            //get all task of that particular board || pretty much a population call || tasks now hold all the task of that board
            for (int i = 0; i < tasks.size(); i++) {
                Task task = tasks.get(i);
                
                //render by user?
                if(task.getAssignees().contains(CurrentUserhold.getUser().getID())){
                    //render by project
                    if (ProjectUIDropdown.getProjectAccessID() == -1) {
                        //render by sprint
                        if (SprintUIDropdown.getSprintAccessID() == -1) {
                            TaskCardUI card = new TaskCardUI(task);
                            card.addMouseListener(new MouseAdapter() {
                                public void mousePressed(MouseEvent me) {
                                    if (me.getClickCount() == 2) {
                                        TaskDetailsUI details = new TaskDetailsUI(task);
                                        details.setVisible(true);
                                        details.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                    } else if (me.isPopupTrigger()) {
                                    	SwitchBoardPopUp menu = new SwitchBoardPopUp(task, BoardUI.this);
                                        menu.show(me.getComponent(), me.getX(), me.getY());
                                    }
                                }
                                public void mouseReleased(MouseEvent me) {
                                	if (me.isPopupTrigger()) {
                                    	SwitchBoardPopUp menu = new SwitchBoardPopUp(task, BoardUI.this);
                                        menu.show(me.getComponent(), me.getX(), me.getY());
                                    }
                                }
                            });
                            //this refer to the JPanel 
                            this.add(card);
                        } else if (SprintUIDropdown.getSprintAccessID() == task.getSprintID()) {
                            TaskCardUI card = new TaskCardUI(task);
                            card.addMouseListener(new MouseAdapter() {
                                public void mousePressed(MouseEvent me) {
                                    if (me.getClickCount() == 2) {
                                        TaskDetailsUI details = new TaskDetailsUI(task);
                                        details.setVisible(true);
                                        details.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                    } else if (me.isPopupTrigger()) {
                                    	SwitchBoardPopUp menu = new SwitchBoardPopUp(task, BoardUI.this);
                                        menu.show(me.getComponent(), me.getX(), me.getY());
                                    }
                                }
                                public void mouseReleased(MouseEvent me) {
                                	if (me.isPopupTrigger()) {
                                    	SwitchBoardPopUp menu = new SwitchBoardPopUp(task, BoardUI.this);
                                        menu.show(me.getComponent(), me.getX(), me.getY());
                                    }
                                }
                            });
                            //this refer to the JPanel 
                            this.add(card);
                        }
                    } else if (ProjectUIDropdown.getProjectAccessID() == task.getProjectID()) {
                        if (SprintUIDropdown.getSprintAccessID() == -1) {
                            TaskCardUI card = new TaskCardUI(task);
                            card.addMouseListener(new MouseAdapter() {
                                public void mousePressed(MouseEvent me) {
                                    if (me.getClickCount() == 2) {
                                        TaskDetailsUI details = new TaskDetailsUI(task);
                                        details.setVisible(true);
                                        details.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                    } else if (me.isPopupTrigger()) {
                                    	SwitchBoardPopUp menu = new SwitchBoardPopUp(task, BoardUI.this);
                                        menu.show(me.getComponent(), me.getX(), me.getY());
                                    }
                                }
                                public void mouseReleased(MouseEvent me) {
                                	if (me.isPopupTrigger()) {
                                    	SwitchBoardPopUp menu = new SwitchBoardPopUp(task, BoardUI.this);
                                        menu.show(me.getComponent(), me.getX(), me.getY());
                                    }
                                }
                            });
                            this.add(card);
                        } else if (SprintUIDropdown.getSprintAccessID() == task.getSprintID()) {
                            TaskCardUI card = new TaskCardUI(task);
                            card.addMouseListener(new MouseAdapter() {
                                public void mousePressed(MouseEvent me) {
                                    if (me.getClickCount() == 2) {
                                        TaskDetailsUI details = new TaskDetailsUI(task);
                                        details.setVisible(true);
                                        details.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                    } else if (me.isPopupTrigger()) {
                                    	SwitchBoardPopUp menu = new SwitchBoardPopUp(task, BoardUI.this);
                                        menu.show(me.getComponent(), me.getX(), me.getY());
                                    }
                                }
                                public void mouseReleased(MouseEvent me) {
                                	if (me.isPopupTrigger()) {
                                    	SwitchBoardPopUp menu = new SwitchBoardPopUp(task, BoardUI.this);
                                        menu.show(me.getComponent(), me.getX(), me.getY());
                                    }
                                }
                            });
                            this.add(card);
                        }
                    }
                }
            }

        } //condition for log out
        else {
            for (int i = 0; i < TaskHold.getEmptyTaskList().size(); i++) {
                if ((TaskHold.getEmptyTaskList().get(i).getStatus().name() == "ONNEW" || TaskHold.getEmptyTaskList().get(i).getStatus().name() == "ONREVIEW")
                        && this.getBoard().getType().name() == "BACKLOG") {
                    TaskCardUI card = new TaskCardUI(TaskHold.getEmptyTaskList().get(i));
                    this.add(card);
                } else if (TaskHold.getEmptyTaskList().get(i).getStatus().name() == "ONTAKEN"
                        && this.getBoard().getType().name() == "TAKEN") {
                    TaskCardUI card = new TaskCardUI(TaskHold.getEmptyTaskList().get(i));
                    this.add(card);
                } else if (TaskHold.getEmptyTaskList().get(i).getStatus().name() == "ONGOING"
                        && this.getBoard().getType().name() == "ONGOING") {
                    TaskCardUI card = new TaskCardUI(TaskHold.getEmptyTaskList().get(i));
                    this.add(card);
                } else if (TaskHold.getEmptyTaskList().get(i).getStatus().name() == "ONFINISH"
                        && this.getBoard().getType().name() == "FINISH") {
                    TaskCardUI card = new TaskCardUI(TaskHold.getEmptyTaskList().get(i));
                    this.add(card);
                }

            }
        }
    }

    public void filter() {

    }

    public void refresh() {
        this.getBoard().refresh();
        this.removeAll();
        renderBoard(board.read());
    }

    public void sortSummaryAsc() {
        this.getBoard().sortSummaryAsc();
        this.removeAll();
        renderBoard(board.read());
    }

    public void sortSummaryDesc() {
        this.getBoard().sortSummaryDesc();
        this.removeAll();
        renderBoard(board.read());
    }

    public void sortDueDate() {
        this.getBoard().sortDueDate();
        this.removeAll();
        renderBoard(board.read());
    }

    public void sortSeverityAsc() {
        this.getBoard().sortSeverityAsc();
        this.removeAll();
        renderBoard(board.read());
    }

    public void sortSeverityDesc() {
        this.getBoard().sortSeverityDesc();
        this.removeAll();
        renderBoard(board.read());
    }

    public void sortIDAsc() {
        this.getBoard().sortIDAsc();
        this.removeAll();
        renderBoard(board.read());
    }

    public void sortIDDesc() {
        this.getBoard().sortIDDesc();
        this.removeAll();
        renderBoard(board.read());
    }
    
    public void search(String searchInput) {
    	if(searchInput == null || searchInput.equals("")) {
    		this.removeAll();
            renderBoard(board.read());
    	} else {
    		this.removeAll();
    		renderBoard(board.search(searchInput));
    	}
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
