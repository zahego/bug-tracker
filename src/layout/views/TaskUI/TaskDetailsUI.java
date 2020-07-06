package layout.views.TaskUI;

import common.Comment.CommentsOneTaskHold;
import common.Enum.TaskType;
import common.Project.Projecthold;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import common.Task.Task;
import common.Task.TaskHold;
import common.Team.Userhold;
import common.Ultilities.Utilities;
import common.User.CurrentUserhold;
import javax.swing.BoxLayout;

import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import layout.views.CommentUI.CommentUI;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import layout.views.CommentUI.CommentAddUI;
import layout.views.screen.ScreenUI;

public class TaskDetailsUI extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 3694449758122544394L;
    private JPanel contentPane;
    private JLabel projectIDLabel;
    private JLabel sprintIDLabel;
    private JLabel taskIDLabel;
    private JLabel assignerLabel;
    private JLabel assigneesLabel;
    private JLabel fullDescriptionLabel;
    private JLabel replicateLabel;
    private JLabel suggestionLabel;
    private JLabel taskID;
    private JLabel projectID;
    private JLabel sprintID;
    private JTextArea quickSummary;
    private JLabel reportedDate;
    private JLabel taskStatus;
    private JLabel severity;
    private JLabel dueDate;
    private JTextArea fullDescriptionString;
    private JTextArea replicateString;
    private JTextArea SuggestionString;
    private JLabel imageFile2;
    private JLabel imageFile1;
    private JLabel imageFile3;
    private JLabel assignerProfilePic;
    private JLabel assigneeIconPic;
    private JButton addCommentButton;
    private JButton addFileButton;
    private JButton updateButton;
    private JButton deleteButton;

    /**
     * Create the frame.
     */
    public TaskDetailsUI(Task task) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 556, 760);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        contentPane.add(tabbedPane, BorderLayout.CENTER);

        JPanel taskInfo = new JPanel();
        tabbedPane.addTab("Task info", null, taskInfo, null);

        //////////////////////////////////////////////////////////////populate the info of task //////////////////////////////////////////////////////
        //////////////////////////const////////////////////////
        projectIDLabel = new JLabel("project ID:");
        sprintIDLabel = new JLabel("sprint ID:");
        taskIDLabel = new JLabel("ID:");
        assignerLabel = new JLabel("Assigner");
        assigneesLabel = new JLabel("Assignees");
        fullDescriptionLabel = new JLabel("Description");
        replicateLabel = new JLabel("Replicate:");
        suggestionLabel = new JLabel("Suggestion");
        ///////////////////////end of const///////////////////

        //////////////////////variable///////////////////////
        taskID = new JLabel(String.valueOf(task.getID()));
        projectID = new JLabel(String.valueOf(task.getProjectID()));
        sprintID = new JLabel(String.valueOf(task.getSprintID()));
        quickSummary = new JTextArea(task.getQuickSummary());
        reportedDate = new JLabel(Utilities.getDateString(task.getReportedDate()));
        taskStatus = new JLabel(task.getStatus().toString());
        severity = new JLabel(String.valueOf(task.getSeverity()));
        System.out.println(String.valueOf(task.getDueDate()));
        dueDate = new JLabel(Utilities.getDateString(task.getDueDate()));
        fullDescriptionString = new JTextArea(task.getFullDescription());
        replicateString = new JTextArea(task.getToReplicate());
        SuggestionString = new JTextArea(task.getSuggestion());
        imageFile2 = new JLabel("");
        imageFile1 = new JLabel("");
        imageFile3 = new JLabel("");
        if (task.getAttachedFile() != null) {
            ImageIcon image = new ImageIcon(task.getAttachedFile().getAbsolutePath());
            image = new ImageIcon(image.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH));
            imageFile1.setIcon(image);
        }

        assignerProfilePic = new JLabel("icon");
        //get assigner
        ImageIcon assignerIcon = new ImageIcon(Userhold.getUsers().get(task.getAssignerID() - 1).getProfilePic());
        assignerIcon = new ImageIcon(assignerIcon.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
        assignerProfilePic.setIcon(assignerIcon);

        assigneeIconPic = new JLabel("N/A");
        //could check the condition of 3 user, assigned user, pm and admin as well
        if (task.getAssignees().size() == 2) {
            if (task.getAssignees().get(0) != 8) {
                ImageIcon assigneeIcon = new ImageIcon(Userhold.getUsers().get(task.getAssignees().get(0) - 1).getProfilePic());
                assigneeIcon = new ImageIcon(assigneeIcon.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
                assigneeIconPic.setIcon(assigneeIcon);
            } else {
                ImageIcon assigneeIcon = new ImageIcon(Userhold.getUsers().get(task.getAssignees().get(1) - 1).getProfilePic());
                assigneeIcon = new ImageIcon(assigneeIcon.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
                assigneeIconPic.setIcon(assigneeIcon);
            }
            //randomly render user based on mod 3 and 4 just to make the task look busy
        } else if (task.getAssignees().size() == 5) {
            if (task.getAssignees().get(0) != 8) {
                if (task.getID() % 3 == 0) {
                    ImageIcon assigneeIcon = new ImageIcon(Userhold.getUsers().get(task.getAssignees().get(0) - 1).getProfilePic());
                    assigneeIcon = new ImageIcon(assigneeIcon.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
                    assigneeIconPic.setIcon(assigneeIcon);
                }
                if (task.getID() % 4 == 0) {
                    ImageIcon assigneeIcon = new ImageIcon(Userhold.getUsers().get(task.getAssignees().get(1) - 1).getProfilePic());
                    assigneeIcon = new ImageIcon(assigneeIcon.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
                    assigneeIconPic.setIcon(assigneeIcon);
                }
            }
        }

        ////////////////////////end of variable////////////////////////
        ///////////////////////button/////////////////////////////////
        addCommentButton = new JButton("Add Comment");
        addFileButton = new JButton("Add File");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");
        //////////////////////end of button//////////////////////////

        /////////////////////design////////////////////////////////
        quickSummary.setFont(new Font("Tahoma", Font.BOLD, 14));
        reportedDate.setHorizontalAlignment(SwingConstants.CENTER);
        taskStatus.setHorizontalAlignment(SwingConstants.CENTER);
        severity.setHorizontalAlignment(SwingConstants.CENTER);
        dueDate.setHorizontalAlignment(SwingConstants.CENTER);
        imageFile2.setHorizontalAlignment(SwingConstants.CENTER);
        imageFile1.setHorizontalAlignment(SwingConstants.CENTER);
        imageFile3.setHorizontalAlignment(SwingConstants.CENTER);
        assignerProfilePic.setHorizontalAlignment(SwingConstants.CENTER);
        assigneeIconPic.setHorizontalAlignment(SwingConstants.CENTER);
        ////////////////////end of desingn//////////////////////////

        /////////////////////////////////////////////////////////////////////////////end of populate task info//////////////////////////////////////////
        GroupLayout gl_panel = new GroupLayout(taskInfo);
        gl_panel.setHorizontalGroup(
                gl_panel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                                        .addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
                                                .addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
                                                        .addGroup(gl_panel.createSequentialGroup()
                                                                .addComponent(addCommentButton)
                                                                .addGap(2)
                                                                .addComponent(addFileButton)
                                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                                .addComponent(updateButton)
                                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                                .addComponent(deleteButton))
                                                        .addGroup(gl_panel.createSequentialGroup()
                                                                .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                                                                        .addGroup(gl_panel.createSequentialGroup()
                                                                                .addComponent(taskIDLabel, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                                                .addComponent(taskID, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                                                                                .addComponent(projectIDLabel, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18)
                                                                                .addComponent(projectID, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18)
                                                                                .addComponent(sprintIDLabel, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
                                                                                .addGroup(gl_panel.createSequentialGroup()
                                                                                        .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                                                                                                .addGroup(gl_panel.createSequentialGroup()
                                                                                                        .addComponent(assignerLabel)
                                                                                                        .addGap(12)
                                                                                                        .addComponent(assignerProfilePic, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                                                                                        .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                                                        .addComponent(assigneesLabel)
                                                                                                        .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                                                        .addComponent(assigneeIconPic, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                                                                                        .addGap(105)
                                                                                                        .addComponent(severity, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(gl_panel.createSequentialGroup()
                                                                                                        .addComponent(imageFile1, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                                                                                                        .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                                                        .addComponent(imageFile2, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                                                                                                        .addPreferredGap(ComponentPlacement.RELATED)
                                                                                                        .addComponent(imageFile3, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)))
                                                                                        .addGap(25))
                                                                                .addComponent(quickSummary, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 283, GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(gl_panel.createSequentialGroup()
                                                                                .addComponent(fullDescriptionLabel, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(300)))
                                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                                .addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
                                                                        .addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
                                                                                .addComponent(sprintID, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(reportedDate, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                                                                .addComponent(dueDate, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                        .addComponent(taskStatus, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
                                                                .addGap(5)))
                                                .addGap(30))
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addComponent(replicateLabel, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(465, Short.MAX_VALUE))
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addComponent(suggestionLabel, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(440, Short.MAX_VALUE))
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addComponent(SuggestionString, GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                                                .addGap(30))
                                        .addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
                                                .addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
                                                        .addComponent(fullDescriptionString, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                                                        .addComponent(replicateString, GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE))
                                                .addGap(30))))
        );
        gl_panel.setVerticalGroup(
                gl_panel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(projectID)
                                        .addComponent(projectIDLabel)
                                        .addComponent(taskIDLabel)
                                        .addComponent(taskID)
                                        .addComponent(sprintIDLabel)
                                        .addComponent(sprintID))
                                .addGap(18)
                                .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(quickSummary, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(reportedDate))
                                .addGap(18)
                                .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                                                        .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
                                                                .addComponent(assignerLabel)
                                                                .addComponent(assigneesLabel)
                                                                .addComponent(assignerProfilePic, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(assigneeIconPic, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                                                .addGap(53)
                                                .addComponent(fullDescriptionLabel))
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addComponent(dueDate)
                                                .addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                                .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
                                                        .addComponent(taskStatus, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(severity, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
                                                .addGap(52)))
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(fullDescriptionString, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                .addGap(18)
                                .addComponent(replicateLabel)
                                .addGap(18)
                                .addComponent(replicateString, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(suggestionLabel)
                                .addGap(18)
                                .addComponent(SuggestionString, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(imageFile1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(imageFile2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(imageFile3, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
                                .addGap(45)
                                .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(addCommentButton)
                                        .addComponent(addFileButton)
                                        .addComponent(updateButton)
                                        .addComponent(deleteButton))
                                .addContainerGap())
        );
        taskInfo.setLayout(gl_panel);
        if (!task.getType().name().equals("BUGREPORT")) {
            replicateLabel.setVisible(false);
            suggestionLabel.setVisible(false);
            replicateString.setVisible(false);
            SuggestionString.setVisible(false);
        }

        JPanel commentHistory = new JPanel();
        commentHistory.setLayout(new BoxLayout(commentHistory, BoxLayout.PAGE_AXIS));
        JScrollPane scroll = new JScrollPane(commentHistory, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        tabbedPane.addTab("Comment History", null, scroll, null);

        if (task.getComments() != null) {
            if (task.getComments().getComment() != null) {
                if (!task.getComments().getComment().isEmpty()) {
                    for (int i = 0; i < task.getComments().getComment().size(); i++) {
                        CommentUI comment = new CommentUI();
                        comment.renderCommentUI(task.getComments().getComment().get(i));
                        commentHistory.add(comment);
                    }
                }
            }
        }
        createEvents(task);
    }

    private void createEvents(Task task) {
        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    task.setQuickSummary(quickSummary.getText());
                    task.setFullDescription(fullDescriptionString.getText());
                    task.setToReplicate(replicateString.getText());
                    task.setSuggestion(SuggestionString.getText());
                    TaskHold.getTaskList().set(Integer.parseInt(taskID.getText()) - 1, task);

                ScreenUI.getLayoutUI().refreshAllBoard();
            }
        });
        addCommentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CommentAddUI commentAdd = new CommentAddUI();
                commentAdd.setUserNameString(CurrentUserhold.getUser().getName());
                commentAdd.setTaskID(task.getID());
                commentAdd.setCurrentTaskStatus(task.getStatus());
                commentAdd.setProjectNameString(Projecthold.getProjects().get(task.getProjectID() - 1).getName());
                commentAdd.setVisible(true);
            }
        });
        addFileButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //OpenFile() function for GUI only
                JFileChooser file = new JFileChooser();
                file.setCurrentDirectory(new File(System.getProperty("user.home")));
                //filter the files
                FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
                file.addChoosableFileFilter(filter);
                int result = file.showSaveDialog(null);
                //if the user clicks on save in Jfilechooser
                if (result == JFileChooser.APPROVE_OPTION) {
                    task.setAttachedFile(file.getSelectedFile());
                } //if the user cancels
                else if (result == JFileChooser.CANCEL_OPTION) {
                    System.out.println("No File Select");
                }
            }

        });
    }
}
