package common.AlertBoard;

import java.util.ArrayList;

import java.util.List;
import org.apache.commons.lang3.StringUtils;
import common.Alert.Alert;
import common.Alert.AlertHold;


public class AlertBoard {
	
	private List<Alert> alerts;
        
	
	public AlertBoard() {
		
		alerts = new ArrayList<>(AlertHold.add());
        
	}
	public void clear() {
		alerts = new ArrayList<>();
	}
	public void refresh() {
		
        setAlerts(new ArrayList<>(AlertHold.add()));
      //  
    }
	
	//System.out.println("Print Here Here :");
	public static List<Alert> filter(int userID){
		
		List<Alert> ret = new ArrayList<>();
		for(int i = 0; i < AlertHold.getAlertList().size(); i++) {
			if(userID==-1||AlertHold.getAlertList().get(i).getReceivers().contains(userID)) {
				ret.add(AlertHold.getAlertList().get(i));
			}
		}
		return ret;
	}
    

	public List<Alert> read() {
		return getAlerts();
	}
   

    /**
     * @return the tasks
     */
    public List<Alert> getAlerts() {
        return alerts;
    }

    /**
     * @param tasks the tasks to set
     */
    public void setAlerts(List<Alert> alerts) {
        this.alerts = alerts;
        
    }

 
}

