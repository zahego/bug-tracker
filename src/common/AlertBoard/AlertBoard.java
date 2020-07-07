package common.AlertBoard;

import java.util.ArrayList;

import java.util.List;

import common.Alert.Alert;
import common.Alert.AlertHold;


public class AlertBoard {
	
	private List<Alert> alerts;
        
	
	public AlertBoard() {
		
		alerts = new ArrayList<>(AlertHold.add());
        
	}
	public void refresh() {
        setAlerts(new ArrayList<>());
    }
	
	
	public List<Alert> filter(int userID){
		
		List<Alert> ret = new ArrayList<>();
		for(int i = 0; i < this.getAlerts().size(); i++) {
			if(userID==-1||getAlerts().get(i).getReceivers().contains(userID)) {
				ret.add(getAlerts().get(i));
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

