package layout.views.TaskUI;

import javax.swing.JPanel;

import common.Task.Task;
import common.Ultilities.Utilities;
import layout.views.SwitchBoardPopUp.SwitchBoardPopUp;

import javax.swing.JLabel;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TaskCardUI extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = -6568130148772142970L;

    /**
     * Create the panel.
     */
    private Task task;
    
    public TaskCardUI(Task task) {
    	this.task = task;
        setMaximumSize(new Dimension(1000, 150));
        setBorder(new LineBorder(new Color(0, 0, 0)));
        setBackground(Color.WHITE);
        /////////////////////////////////////////////new integration from Minh's branch start here///////////////////////////////////////////
        JLabel quickSummary = new JLabel(task.getQuickSummary());
        quickSummary.setFont(new Font("Serif", Font.BOLD, 17));
        //condition to rerender the taskType name()
        //declaration to see if this work
        JLabel taskType = new JLabel(task.getType().name());

        if (task.getType().name().equals("BUGREPORT")) {
            taskType = new JLabel("BUG REPPORT");
            taskType.setForeground(Color.white);
            taskType.setBackground(new Color(221, 53, 53));

        } else if (task.getType().name().equals("NEWFEATURE")) {
            taskType = new JLabel("NEW FEATURE");
            taskType.setForeground(Color.white);
            taskType.setBackground(new Color(22, 148, 165));

        } else if (task.getType().name().equals("TESTREQUEST")) {
            taskType = new JLabel("TEST REQUEST");
            taskType.setForeground(Color.white);
            taskType.setBackground(new Color(240, 120, 23));
        } else if (task.getType().name().equals("TASK")) {
            taskType.setForeground(new Color(22, 148, 165));
            taskType.setBackground(new Color(249, 246, 248));
        } else {
            //IMPROVEMENT case
            taskType.setForeground(Color.white);
            taskType.setBackground(new Color(251, 207, 160));
        }
        taskType.setOpaque(true);
        ///////////////////////////////////////////////////End of new integration///////////////////////////////////////
        String dateString = Utilities.getDateString(task.getReportedDate());
        JLabel rpDate = new JLabel(dateString);
        JLabel taskStatus = new JLabel(task.getStatus().name());
        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                        .addComponent(quickSummary, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addComponent(taskType)
                                                .addPreferredGap(ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                                .addComponent(rpDate)
                                                .addGap(43)
                                                .addComponent(taskStatus)))
                                .addContainerGap())
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(quickSummary, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(taskType)
                                        .addComponent(taskStatus)
                                        .addComponent(rpDate))
                                .addContainerGap())
        );
        setLayout(groupLayout);
        addMouseListener((MouseListener) new PopClickListener());
    }
    
    class PopClickListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            if (e.isPopupTrigger())
                doPop(e);
        }

        public void mouseReleased(MouseEvent e) {
            if (e.isPopupTrigger())
                doPop(e);
        }

        private void doPop(MouseEvent e) {
            SwitchBoardPopUp menu = new SwitchBoardPopUp(task);
            menu.show(e.getComponent(), e.getX(), e.getY());
        }
    }
}
