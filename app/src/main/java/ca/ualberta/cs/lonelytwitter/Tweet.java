package ca.ualberta.cs.lonelytwitter;

import java.util.Comparator;
import java.util.Date;

/**
 * Created by watts1 on 9/15/16.
 * the class to store tweet and data
 * @see TweetList
 * @see ImportantTweet
 * @see NormalTweet
 */

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    @Override
    public String toString(){
        return message;
    }

    public abstract Boolean isImportant();


    /**
     * use to change the message
     * @param message
     * @throws TweetTooLongException
     */

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140){
            //Do Something!
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    /**
     * the custom comparator for sorting data
     * @return comp
     */

    public static Comparator<Tweet> getCompByDate() {
        Comparator comp = new Comparator<Tweet>() {

            public int compare(Tweet s1, Tweet s2) {
                return s1.getDate().compareTo(s2.getDate());
            }
        };
        return comp;
    };
}
