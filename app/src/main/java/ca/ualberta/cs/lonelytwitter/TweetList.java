package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static junit.framework.Assert.assertFalse;

/**
 * Created by mqu on 9/29/16.
 * the main data class
 * contains all the value we need
 * @see Tweet
 */
public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList() {

    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    /**
     * if adding the same tweet will throws the IllegalArgumentException
     * @throws IllegalArgumentException
     * @param tweet
     */
    public void add(Tweet tweet) {
        if(tweets.contains(tweet)){
            throw new IllegalArgumentException();
        }
        else {
            tweets.add(tweet);
        }
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }

    public Tweet getTweet(int i) {
        return tweets.get(i);
    }



    public int getCount() {
        return tweets.size();
    }

    public ArrayList<Tweet> getTweets() {
        Collections.sort(tweets,Tweet.getCompByDate());
        /*
        Collections.sort(tweets, new Comparator<Tweet>(){
                    public int compare(Tweet s1, Tweet s2) {
                        return s1.getDate().compareTo(s2.getDate());
                    }
                }
        );
        */
        return tweets;
    }
}
