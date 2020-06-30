/*
 * To change this license header, choose License Headers in User Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team;
import java.util.ArrayList;
import java.util.Arrays;
import user.CurrentUserhold;
import user.User;
import user.User;
/**
 *
 * @author tug70
 */
public class Userhold {
    private static ArrayList<User> users;
    
    public Userhold(){
    }
    
   
    public static void populateUserhold(){
        ArrayList<User> userList=new ArrayList<>();
        for(int i=0; i<User.getSizeFromDatabase(); i++){
            userList.add(User.getUserFromDatabase(i));
        }
        Userhold.setUsers(userList);
    }

    /**
     * @return the users
     */
    public static ArrayList<User> getUsers() {
        return Userhold.users;
    }

    /**
     * @param users the users to set
     */
    public static void setUsers(ArrayList<User> users) {
        Userhold.users = users;
    }
        //insert
    //TODO sort as insert
     public static void insert(User new_user){
        Userhold.users.add(new_user);
    }
    //update
    public static void update(int index, User new_user){
        Userhold.users.set(index, new_user);
    }
    // bubble sort by ID, smallest to head(0), biggest to tail(n)
    //TODO expand to sort by other attribute
    public static void bublesort(){
        for(int i=0;i<users.size()-1;i++){
            for(int j=0;j<users.size()-i-1;j++){
                if(users.get(j).getID()>users.get(j+1).getID()){
                    
                    //exchange the 2 ID of the adjacent users
                    int tempID=users.get(j).getID();
                    users.get(j).setID(users.get(j+1).getID());
                    users.get(j+1).setID(users.get(j).getID());
                    
                    //exchange the 2 users next to each other 
                    User tempUser=users.get(j);
                    update(j, users.get(j+1));
                    update((j+1), tempUser);
                }
            }
        }
    }
    // delete
    public static void delete(User new_user){
        Userhold.users.remove(new_user);
    }
    
    // deleteAll
    public static void deleteAll(){
        Userhold.users.clear();
    }
    public static User search(String email, String password){
        User user=new User(-1);
        for(int i=0; i<Userhold.getUsers().size();i++){
            if(email.equals(Userhold.getUsers().get(i).getEmail())&&password.equals(Userhold.getUsers().get(i).getPassword())){
                user=Userhold.getUsers().get(i);
                break;
            }
        }
        return user;
    }
}
