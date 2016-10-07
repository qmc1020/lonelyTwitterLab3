package ca.ualberta.cs.lonelytwitter;

/**
 * Created by watts1 on 9/15/16.
 */

/**
 * one type of tweet
 * will return false with isimportant function
 */
public class NormalTweet extends Tweet {

    public NormalTweet(String message) {
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
