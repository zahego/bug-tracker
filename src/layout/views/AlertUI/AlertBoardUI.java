package layout.views.AlertUI;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import common.Alert.Alert;
import common.Alert.AlertHold;
import common.AlertBoard.AlertBoard;
import common.Board.Board;
import common.Enum.BoardType;
import common.Project.Projecthold;
import common.Task.Task;
import common.User.CurrentUserhold;
import layout.views.screen.ScreenUI;

public class AlertBoardUI extends JPanel {

	private AlertBoard board;

	/**
	 * Create the panel.
	 */
	public AlertBoardUI() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		board = new AlertBoard();
		initcomponent();
		eventhandler();
		renderAlertBoard(board.read());

	}

	private void renderAlertBoard(List<Alert> alerts) {
		// TODO Auto-generated method stub
		this.removeAll();
		if (CurrentUserhold.getUser() != null) {
			// get all task of that particular board || pretty much a population call ||
			// tasks now hold all the task of that board

			// List<Alert> alerts = getAlertBoard().getAlerts();
			System.out.println("alert size:"+alerts.size());
			for (int i = 0; i < alerts.size(); i++) {
				
				Alert alert = alerts.get(i);

				// System.out.println("TEst Here : " + alert.getReceivers());
				if (alert.getReceivers().contains(CurrentUserhold.getUser().getID())
						|| alert.getSender() == CurrentUserhold.getUser().getID()) {
					AlertCard card = new AlertCard(alert);

					card.addMouseListener(new MouseAdapter() {
						public void mousePressed(MouseEvent me) {
							if (me.getClickCount() == 2) {
								AlertCardDetail details = new AlertCardDetail(alert);
								details.setVisible(true);
								details.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

							}
						}
					});
					// System.out.println("TEst Here : " + alert.getReceivers());
					this.add(card);
					ScreenUI.getAlertButton().setForeground(Color.RED);

				} else {
					ScreenUI.getAlertButton().setForeground(Color.BLACK);

				}
			}
		}
	}


	public void refresh() {
		this.getAlertBoard().refresh();
		//System.out.println("board " + board.read().get(board.read().size() - 1).getName());
		//board.clear();
		System.out.println("board " + board.read().size());
		 this.removeAll();
		renderAlertBoard(board.read());
		// System.out.println(getAlertBoard().getAlerts().size() );
	}

	public AlertBoard getAlertBoard() {
		// TODO Auto-generated method stub
		return this.board;
	}

	public void setAlertBoard(AlertBoard alertboard) {
		this.board = alertboard;
	}

	private void eventhandler() {
		// TODO Auto-generated method stub

	}

	private void initcomponent() {
		// TODO Auto-generated method stub

	}

}
