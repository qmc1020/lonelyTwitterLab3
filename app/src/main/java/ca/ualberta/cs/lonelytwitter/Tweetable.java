package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

/**
 * Created by watts1 on 9/15/16.
 */
public interface Tweetable {
    /**
     * gets message
     *
     * @return message
     */
    public String getMessage();

    /**
     * gets data
     *
     * @return the date
     */
    public Date getDate();

}
