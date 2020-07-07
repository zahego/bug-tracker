package common.Alert;


import java.util.ArrayList;

import java.util.List;




import common.User.*;



public class Alert {
	private int ID;
    private String name;
    private String message;
    int sender;
    ArrayList<Integer> receivers;
    private CurrentUserhold currentuserhold;
    int currentuserID;
   
    
    
    public Alert (int iD, String name, String message ) {
		this.ID = iD;
		this.name = name;
		this.message = message;
		this.sender = -1;
		this.receivers = new ArrayList<>();
		this.currentuserID = -1;
		this.currentuserhold = new CurrentUserhold();

		
	}
    
    public Alert (int iD, String name, String message, ArrayList<Integer> receivers, int sender  ) {
		this.ID = iD;
		this.name = name;
		this.message = message;
		this.sender = sender;
		this.receivers = receivers;
		this.currentuserID = -1;
		this.currentuserhold = new CurrentUserhold();

		
	}
    
    public Alert (int iD,String name, String message, ArrayList<Integer> receivers ) {
		this.ID = iD;
		this.name = name;
		this.message = message;
		this.sender = sender;
		this.receivers = receivers;
		this.currentuserID = -1;
		this.currentuserhold = new CurrentUserhold();

		
	}
    
    

	public Alert(int i, String text, String text2, int value, int id2, ArrayList<Integer> receivers2) {
		// TODO Auto-generated constructor stub
	}

	public void setcurrentuserID(int currentuserID) {
		this.currentuserID = currentuserID;
	}
    
    public int getcurrentuserID() {
		return currentuserID;
	}
    
    public void setSender(int sender) {
		this.sender = sender;
	}
    
    public int getSender() {
		return sender;
	}
    
	public ArrayList<Integer> getReceivers() {
		return receivers;
	}

	public void setReceivers(ArrayList<Integer> receivers) {
		this.receivers = receivers;
	}
	
	public void addReceivers(int ID) {
		this.receivers.add(ID);
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}
	
	public CurrentUserhold getcurrentuserhold() {
		return currentuserhold;
	}

	public void setcurrentuserhold(CurrentUserhold currentuserhold) {
		this.currentuserhold = currentuserhold;}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getmessage() {
		return message;
	}

	public void setmessage(String message) {
		this.message = message;
	}
	
	

	
    
   
}
