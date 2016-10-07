package ca.ualberta.cs.lonelytwitter;

/**
 * Created by watts1 on 9/15/16.
 */

/**
 * one type of tweet
 * will return true with isimportant function
 */
public class ImportantTweet extends Tweet{

    public ImportantTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }


}
