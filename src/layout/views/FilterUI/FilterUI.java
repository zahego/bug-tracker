package layout.views.FilterUI;

import common.Enum.BoardType;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import layout.views.BoardUI.BoardUI;
import layout.views.screen.ScreenUI;

public class FilterUI extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public JPanel FilterViews;
    public JLabel lblNewLabel;
    public JRadioButton FilterOption1;

    public JRadioButton FilterOption2;

    public JRadioButton FilterOption3;

    public JRadioButton FilterOption4;

    public JButton FilterButton;

    
    /**
     * Create the frame.
     *
     * @return
     */
    public FilterUI(BoardType board) {

        initComponents();
        createEvents(board);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void createEvents(BoardType board) {
        FilterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (FilterOption1.isSelected()) {
                    if (board == BoardType.BACKLOG) {
                        ScreenUI.getLayoutUI().getBacklog().refresh();
                        ScreenUI.getLayoutUI().getBacklog().renderBoardAssignedTask(new BoardUI(board).getBoard().read());
                    }
                    if (board == BoardType.FINISH) {
                        ScreenUI.getLayoutUI().getFinish().refresh();
                        ScreenUI.getLayoutUI().getFinish().renderBoardAssignedTask(new BoardUI(board).getBoard().read());
                    }
                }
                else if(FilterOption4.isSelected()) {
                    if (board == BoardType.BACKLOG) {
                        ScreenUI.getLayoutUI().getBacklog().refresh();
                        ScreenUI.getLayoutUI().getBacklog().renderBoard(new BoardUI(board).getBoard().read());
                    }
                    if (board == BoardType.FINISH) {
                        ScreenUI.getLayoutUI().getFinish().refresh();
                        ScreenUI.getLayoutUI().getFinish().renderBoard(new BoardUI(board).getBoard().read());
                    }
                }
            }
        });
    }

    private void initComponents() {

        setIconImage(Toolkit.getDefaultToolkit().getImage(FilterUI.class.getResource("/layout/resource/BugTracker.png")));
        setTitle("Bug Tracker 3000 - Filter Options\r\n");
        setResizable(false);

        setBounds(100, 100, 398, 348);
        FilterViews = new JPanel();
        FilterViews.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(FilterViews);

        lblNewLabel = new JLabel("Filter Options");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));

        FilterOption1 = new JRadioButton("Assigned task\r\n");

        FilterOption2 = new JRadioButton("Highest severity task\r\n");

        FilterOption3 = new JRadioButton("Before 30 days");

        FilterOption4 = new JRadioButton("Reset");

        FilterButton = new JButton("Submit\r\n");

        GroupLayout gl_FilterViews = new GroupLayout(FilterViews);
        gl_FilterViews.setHorizontalGroup(
                gl_FilterViews.createParallelGroup(Alignment.LEADING)
                        .addGroup(Alignment.TRAILING, gl_FilterViews.createSequentialGroup()
                                .addGap(125)
                                .addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                .addGap(112))
                        .addGroup(gl_FilterViews.createSequentialGroup()
                                .addGap(117)
                                .addGroup(gl_FilterViews.createParallelGroup(Alignment.LEADING)
                                        .addComponent(FilterButton, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(gl_FilterViews.createSequentialGroup()
                                                .addComponent(FilterOption4)
                                                .addPreferredGap(ComponentPlacement.RELATED))
                                        .addGroup(gl_FilterViews.createSequentialGroup()
                                                .addComponent(FilterOption3)
                                                .addPreferredGap(ComponentPlacement.RELATED))
                                        .addGroup(gl_FilterViews.createSequentialGroup()
                                                .addComponent(FilterOption2)
                                                .addPreferredGap(ComponentPlacement.RELATED))
                                        .addGroup(gl_FilterViews.createSequentialGroup()
                                                .addComponent(FilterOption1)
                                                .addPreferredGap(ComponentPlacement.RELATED)))
                                .addGap(122))
        );
        gl_FilterViews.setVerticalGroup(
                gl_FilterViews.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_FilterViews.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblNewLabel)
                                .addGap(18)
                                .addComponent(FilterOption1)
                                .addGap(18)
                                .addComponent(FilterOption2)
                                .addGap(18)
                                .addComponent(FilterOption3)
                                .addGap(18)
                                .addComponent(FilterOption4)
                                .addGap(18)
                                .addComponent(FilterButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(156, Short.MAX_VALUE))
        );
        FilterViews.setLayout(gl_FilterViews);

    }
}
