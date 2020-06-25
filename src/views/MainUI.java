package views;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import common.Board.Board;
import common.Enum.BoardType;
import common.Task.Task;
import common.TaskHold.TaskHold;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.ScrollPaneConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;

public class MainUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4529166851047998610L;
	private JPanel contentPane;
	Board board;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI frame = new MainUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainUI() {
		TaskHold.loadTask();
		board = new Board(BoardType.BACKLOG);
		List<Task> tasks = board.read();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane boardView = new JScrollPane();
		boardView.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		JLabel title = new JLabel("Board Test");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(boardView, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
						.addComponent(title, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(title, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(boardView, GroupLayout.PREFERRED_SIZE, 413, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JPanel boardPanel = new JPanel();
		boardView.setViewportView(boardPanel);
		boardPanel.setLayout(new BoxLayout(boardPanel, BoxLayout.Y_AXIS));
		for (int i = 0; i < tasks.size(); i++) {
			Task task = tasks.get(i);
			TaskCardUI card = new TaskCardUI(task);
			card.addMouseListener(new MouseAdapter() { 
		          public void mousePressed(MouseEvent me) { 
		        	  if (me.getClickCount() == 2) {
		        		    TaskDetailsUI details = new TaskDetailsUI(task);
		        		    details.setVisible(true);
		        		    details.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		        	  }
		          } 
		    });
			boardPanel.add(card);
		}
		contentPane.setLayout(gl_contentPane);
	}
}
