/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrungAndAnhIntegration.common.CommentHold;

import java.util.ArrayList;

/**
 *
 * @author tug70
 */
public class CommentsAllHold {
    private static ArrayList<CommentsOneTaskHold> allCommentHold;
    
    /*public static void populateCommentsAllHold(){
        
        int size=Project.getSizeFromDatabase();
        //have to declare new array, populate that array then push it back to the static array since this work. 
        //This is probably having something to do with not declaring new ArrayList<>() at the top
        ArrayList<Project> projectList=new ArrayList<>();
        for(int i=0; i<size; i++){
            projectList.add(Project.getProjectFromDatabase(i));
            
        }
        Projecthold.setProjects(projectList);
    }*/
    
    /**
     * @return the allCommentHold
     */
    public static ArrayList<CommentsOneTaskHold> getAllCommentHold() {
        return allCommentHold;
    }

    /**
     * @param aAllCommentHold the allCommentHold to set
     */
    public static void setAllCommentHold(ArrayList<CommentsOneTaskHold> aAllCommentHold) {
        allCommentHold = aAllCommentHold;
    }
}
