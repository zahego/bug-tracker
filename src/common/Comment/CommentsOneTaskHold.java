/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common.Comment;

import common.Comment.Comment;
import java.util.ArrayList;

/**
 *
 * @author tug70
 */

//the comment hold for 1 task, this is why this is not public
public class CommentsOneTaskHold {
    private ArrayList<Comment> comment;
    public CommentsOneTaskHold(ArrayList<Comment> comment){
        this.comment=comment;
    }
    public CommentsOneTaskHold(){
        
    }
    //without static, this need an instance
    public ArrayList<Comment> populateCommentsOneTakHold(int taskNum){
        int size=Comment.getSizeCommentsOfOneTaskFromDatabase(taskNum);
        //have to declare new array, populate that array then push it back to the static array since this work. 
        //This is probably having something to do with not declaring new ArrayList<>() at the top
        ArrayList<Comment> commentList=new ArrayList<>();
        //for reseting purpose
        setComment(commentList);
        for(int i=0; i<size; i++){
            commentList.add(Comment.getCommentFromDatabase(taskNum, i));
            
        }
        //huh?
        setComment(commentList);
        
        return commentList;
    }

    /**
     * @return the comment
     */
    public ArrayList<Comment> getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(ArrayList<Comment> comment) {
        this.comment = comment;
    }
}
