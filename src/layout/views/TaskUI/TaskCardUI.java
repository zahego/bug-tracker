package layout.views.TaskUI;

import javax.swing.JPanel;

import common.Task.Task;
import common.Team.Userhold;

import javax.swing.JLabel;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class TaskCardUI extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = -6568130148772142970L;

    /**
     * Create the panel.
     */
    public TaskCardUI(Task task) {
        setMaximumSize(new Dimension(300, 150));
        setBorder(new LineBorder(new Color(0, 0, 0)));
        setBackground(Color.WHITE);
        /////////////////////////////////////////////new integration from Minh's branch start here///////////////////////////////////////////
        JLabel quickSummary = new JLabel(task.getQuickSummary());
        quickSummary.setFont(new Font("Serif", Font.BOLD, 17));
        //condition to rerender the taskType name()
        //declaration to see if this work
        JLabel taskType = new JLabel(task.getType().name());
        taskType.setHorizontalAlignment(SwingConstants.CENTER);
        taskType.setForeground(Color.white);
        if (task.getType().name().equals("BUGREPORT")) {
            taskType.setText("BUG REPPORT");
            taskType.setBackground(new Color(221, 53, 53));

        } else if (task.getType().name().equals("NEWFEATURE")) {
            taskType.setText("NEW FEATURE");
            taskType.setBackground(new Color(22, 148, 165));

        } else if (task.getType().name().equals("TESTREQUEST")) {
            taskType.setText("TEST REQUEST");
            taskType.setBackground(new Color(240, 120, 23));
        } else if (task.getType().name().equals("TASK")) {
            taskType.setForeground(new Color(22, 148, 165));
            taskType.setBackground(new Color(249, 246, 248));
        } else {
            //IMPROVEMENT case
            taskType.setBackground(new Color(251, 207, 160));
        }
        taskType.setOpaque(true);

        String severrity = String.valueOf(task.getSeverity());
        JLabel severity = new JLabel(severrity);
        severity.setHorizontalAlignment(SwingConstants.CENTER);
        severity.setForeground(new Color(119, 38, 61));
        if (severrity.equals("1")) {
            severity.setBackground(new Color(231, 241, 243));
        } else if (severrity.equals("2")) {
            severity.setBackground(new Color(231, 241, 243));
        } else if (severrity.equals("3")) {
            severity.setBackground(new Color(197, 240, 226));
        } else if (severrity.equals("4")) {
            severity.setBackground(new Color(197, 240, 226));
        } else if (severrity.equals("5")) {
            severity.setBackground(new Color(196, 230, 180));
        } else if (severrity.equals("6")) {
            severity.setBackground(new Color(196, 230, 180));
        } else if (severrity.equals("7")) {
            severity.setBackground(new Color(251, 199, 146));
        } else if (severrity.equals("8")) {
            severity.setBackground(new Color(251, 199, 146));
        } else if (severrity.equals("9")) {
            severity.setBackground(new Color(251, 88, 102));
        } else if (severrity.equals("10")) {
            severity.setBackground(new Color(251, 88, 102));
        }
        severity.setOpaque(true);

        JLabel taskStatus = new JLabel(task.getStatus().name());
        taskStatus.setHorizontalAlignment(SwingConstants.CENTER);
        taskStatus.setForeground(Color.WHITE);
        if (task.getStatus().name().equals("ONNEW")) {
            taskStatus.setBackground(new Color(73, 191, 234));
        } else if (task.getStatus().name().equals("ONREVIEW")) {
            taskStatus.setBackground(new Color(236, 83, 81));
        } else if (task.getStatus().name().equals("ONTAKEN")) {
            taskStatus.setBackground(new Color(121, 156, 193));
        } else if (task.getStatus().name().equals("ONGOING")) {
            taskStatus.setBackground(new Color(254, 178, 99));
        } else if (task.getStatus().name().equals("ONFINISH")) {
            taskStatus.setBackground(new Color(56, 220, 192));
        }
        taskStatus.setOpaque(true);

        JPanel date = new JPanel();
        Date dateAfter10 = new Date((new Date()).getTime() - (long) 10 * 24 * 3600 * 1000);
        Date dateAfter20 = new Date((new Date()).getTime() - (long) 20 * 24 * 3600 * 1000);
        Date dateAfter30 = new Date((new Date()).getTime() - (long) 30 * 24 * 3600 * 1000);
        Date dateAfter40 = new Date((new Date()).getTime() - (long) 40 * 24 * 3600 * 1000);
        Date dateAfter50 = new Date((new Date()).getTime() - (long) 50 * 24 * 3600 * 1000);

        if (task.getReportedDate().compareTo(dateAfter10) < 0) {
            date.setBackground(new Color(204, 202, 203));
        }
        if (task.getReportedDate().compareTo(dateAfter20) < 0) {
            date.setBackground(new Color(238, 187, 199));
        }
        if (task.getReportedDate().compareTo(dateAfter30) < 0) {
            date.setBackground(new Color(234, 134, 139));
        }
        if (task.getReportedDate().compareTo(dateAfter40) < 0) {
            date.setBackground(new Color(234, 114, 71));
        }
        if (task.getReportedDate().compareTo(dateAfter50) < 0) {
            date.setBackground(new Color(193, 50, 46));
        }
        
        //case of ontaken log, ongoing log or any case where task is assigned
        JLabel userIcon = new JLabel("");
        //could check the condition of 3 user, assigned user, pm and admin as well
        if (task.getAssignees().size() == 2) {
            if (task.getAssignees().get(0) != 8) {
                ImageIcon icon = new ImageIcon(Userhold.getUsers().get(task.getAssignees().get(0) - 1).getProfilePic());
                icon = new ImageIcon(icon.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
                userIcon.setIcon(icon);
                
            } else {
                ImageIcon icon = new ImageIcon(Userhold.getUsers().get(task.getAssignees().get(1) - 1).getProfilePic());
                icon = new ImageIcon(icon.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
                userIcon.setIcon(icon);
            }
        //randomly render user based on mod 3 and 4 just to make the task look busy
        } else if (task.getAssignees().size() == 5) {
            if (task.getAssignees().get(0) != 8) {
                if(task.getID()%3==0){
                ImageIcon icon = new ImageIcon(Userhold.getUsers().get(task.getAssignees().get(0) - 1).getProfilePic());
                icon = new ImageIcon(icon.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
                userIcon.setIcon(icon);
                }
                if(task.getID()%4==0){
                 ImageIcon icon = new ImageIcon(Userhold.getUsers().get(task.getAssignees().get(1) - 1).getProfilePic());
                icon = new ImageIcon(icon.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
                userIcon.setIcon(icon);
                }
            }
        }

        //userIcon.setBackground(Color.RED);
        ///////////////////////////////////////////////////End of new integration///////////////////////////////////////
        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addComponent(userIcon, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
                                                .addGap(31)
                                                .addComponent(severity, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18)
                                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
                                                        .addComponent(taskStatus, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(taskType, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                                                .addGap(10))
                                        .addComponent(quickSummary, GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                                .addGap(20))
                        .addComponent(date, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addComponent(quickSummary, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addGap(6)
                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                        .addComponent(userIcon, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addComponent(taskType, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18)
                                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                                        .addComponent(severity, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(taskStatus, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))))
                                .addGap(6)
                                .addComponent(date, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
        );
        setLayout(groupLayout);
    }
}
