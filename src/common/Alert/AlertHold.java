package common.Alert;

import java.util.ArrayList;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import common.Alert.Alert;
import common.Project.Project;
import common.Ultilities.Utilities;



public class AlertHold {

	 private static List<Alert> alertList = new ArrayList<>();
	    private static List<Alert> emptyAlertList = new ArrayList<>();

	    
	
	    
	    public static void loadAlert() {
	    	getAlertList().clear();
	   
	    	try {

	    	    JSONArray alerts = Utilities.readFile("alert");
	            for (Object alertObj : alerts) {
	                JSONObject alert = (JSONObject) alertObj;
	                int iD = Long.valueOf((long) alert.get("id")).intValue();
	                int senderID = Long.valueOf((long) alert.get("senderID")).intValue();
	                String name = (String) alert.get("name");
	                String message = (String) alert.get("message");

	                List<Integer> receiverIDs = new ArrayList<>();
	                
	                JSONArray receiverFromDB = (JSONArray) alert.get("receiverIDs");
	                if (receiverFromDB != null) {
	                    for (int i = 0; i < receiverFromDB.size(); i++) {
	                    	receiverIDs.add(((Long) receiverFromDB.get(i)).intValue());
	                    	 System.out.println("Test Database" + receiverIDs.get(i));
	                    	 
	                    	
	                    }
	                    
	                    
	                } 	getAlertList().add(new Alert(iD, name, message, receiverIDs, senderID)) ;              
             
	            }
	            }

	        catch (Exception e) {
	            e.printStackTrace();
	        }}
	    
	    public static void loadEmptyAlert() {
	        getEmptyAlertList().add(new Alert(0, "Nothing here", "Nothing here"));
	        System.out.print("testAlert");
	       
	    }
	    
	    public static List<Alert> add() {
	        List<Alert> ret = new ArrayList<>();
	        //System.out.print("Add" + getAlertList().size() );
	                for (int i = 0; i < getAlertList().size(); i++) {
	                        ret.add(getAlertList().get(i));
	                        
	                     //   System.out.print("Add" + getAlertList().get(i).getID() );
	                }
					return ret;
	
	    }
	    
	    public static void bublesort(ArrayList<Integer> receiver){
	        for(int i=0;i<receiver.size()-1;i++){
	            for(int j=0;j<receiver.size()-i-1;j++){
	                if(receiver.get(j)>receiver.get(j+1)){
	                    
	                    //exchange the 2 team next to each other 
	                    int tempUser=receiver.get(j);
	                    receiver.set(j, receiver.get(j+1));
	                    receiver.set(j+1, tempUser);
	                }
	            }
	        }
	    }
	    public static void insert(Alert new_alert){
	        alertList.add(new_alert);
	    }
	    public static void addAlert(Alert alert) {
	        getAlertList().add(alert);
	    }
	    
	 

	    public static void deleteAlert(int id) throws ArrayIndexOutOfBoundsException {
	       
	    }
	    
	    public static List<Alert> getAlertList() {
	        return alertList;
	    }

	    /**
	     * @param aTaskList the taskList to set
	     */
	    public static void setAlertList(List<Alert> anAlertList) {
	        alertList = anAlertList;
	    }


	    /**
	     * @return the emptyTaskList
	     */
	    public static List<Alert> getEmptyAlertList() {
	        return emptyAlertList;
	    }

	    /**
	     * @param aEmptyTaskList the emptyTaskList to set
	     */
	    public static void setEmptyAlertList(List<Alert> anEmptyAlertList) {
	        emptyAlertList = anEmptyAlertList;
	    }
}
