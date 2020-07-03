package layout.views.layout;

import java.awt.BorderLayout;
import layout.views.project.ProjectUIDropdown;
import common.Project.Projecthold;
import layout.views.screen.ScreenUI;
import layout.views.setting.SettingUI;
import common.Team.Userhold;
import common.User.CurrentUserhold;
import layout.views.user.UserUICreateUpdate;
import java.awt.EventQueue;
import common.User.Role;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProgressBoard2 extends JFrame {

	private JPanel contentPane;
	private static JTable ProgressTable;
	private JButton AddingRow;
	private JButton Delete;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProgressBoard2 frame = new ProgressBoard2();
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
	public ProgressBoard2() {
		
		initcomponent();
		eventHandler();
		renderMemberUI();
	
		
		
	}
	
	
	
	public void renderMemberUI() {
		((DefaultTableModel)ProgressTable.getModel()).setNumRows(0);
		ProgressTable.setModel(new DefaultTableModel(
				new Object[][] {
					
				},
				new String[]  {
					"ID", "Name", "Email", "Role", "Task Posted ", "Task OnGoing"
				}
			));
        int projectID = ProjectUIDropdown.getProjectAccessID();

        for (int i = 0; i < Userhold.getUsers().size(); i++) {
        	
        	
            //all projecti chosen. All team member will be displayed
            if (projectID == -1  ) {
            	if (Userhold.getUsers().get(i).getRole() != Role.ADMIN && Userhold.getUsers().get(i).getRole() != Role.PROJECT_MANAGER) {
            	DefaultTableModel model =(DefaultTableModel) ProgressTable.getModel();
				model.addRow(new Object[] {
						
						Userhold.getUsers().get(i).getID(),
						Userhold.getUsers().get(i).getName(),
						Userhold.getUsers().get(i).getEmail(),
						Userhold.getUsers().get(i).getRole(),
						
		});}
                //display team member based on project
            } else {
                for (int k = 0; k < Projecthold.getProjects().get(projectID - 1).getTeam().length; k++) {
                    //condition to render only team member that the user have access to for the project
                    if (Projecthold.getProjects().get(projectID - 1).getTeam()[k] == Userhold.getUsers().get(i).getID()) {
                    	DefaultTableModel model =(DefaultTableModel) ProgressTable.getModel();
        				model.addRow(new Object[] {
        						
        						Userhold.getUsers().get(k).getID(),
        						Userhold.getUsers().get(k).getName(),
        						Userhold.getUsers().get(k).getEmail(),
        						Userhold.getUsers().get(k).getRole(),
        						TaskCreatedCount(),
        						TaskOngoingAndOntakenCount()
        						
        						
        						
        			
        		});
                      
                    }
                }
            }
        
        
    }}

	
	private Object TaskOngoingAndOntakenCount() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object TaskCreatedCount() {
		return AddingRow;
		// TODO Auto-generated method stub
		}
        
		
	

	private void eventHandler() {
		// TODO Auto-generated method stub
		AddingRow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				DefaultTableModel model =(DefaultTableModel) ProgressTable.getModel();
				model.addRow(new Object[] {
						
						"UserIDget()",
						"Get data",
						"Get data",
						"Get data",
						"Get data",
						"Get data"
						
						
						
			
		});
		


			}});
		
		Delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model =(DefaultTableModel) ProgressTable.getModel();
					if(ProgressTable.getSelectedRow()==-1) {
						if(ProgressTable.getRowCount()==0) {
							
							JOptionPane.showMessageDialog(null, "No data to delete","Progress Board", JOptionPane.OK_OPTION);
						
						} else {
							JOptionPane.showMessageDialog(null, "Select a row to delete","Progress Board", JOptionPane.OK_OPTION);
						}} else {
							model.removeRow(ProgressTable.getSelectedRow());
						}
					}
			});
		
	
	
	}

	private void initcomponent() {
		// TODO Auto-generated method stub
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 757, 540);
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				
				JScrollPane scrollPane = new JScrollPane();
				
				AddingRow = new JButton("Adding Row\r\n");
				
				
				Delete = new JButton("Delete");
				Delete.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				GroupLayout gl_contentPane = new GroupLayout(contentPane);
				gl_contentPane.setHorizontalGroup(
					gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(Delete, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(AddingRow, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addContainerGap())
				);
				gl_contentPane.setVerticalGroup(
					gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 371, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(AddingRow)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Delete)
							.addContainerGap(37, Short.MAX_VALUE))
				);
				
				ProgressTable = new JTable();
				ProgressTable.setEnabled(false);
				
				ProgressTable.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null, null, null, null},
						{null, null, null, null, null, null},
					},
					new String[]  {
						"ID", "Name", "Email", "Role", "Task Posted ", "Task OnGoing"
					}
				));
				scrollPane.setViewportView(ProgressTable);
				contentPane.setLayout(gl_contentPane);
			} }
		
