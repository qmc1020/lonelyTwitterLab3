package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;

import static junit.framework.Assert.assertFalse;

/**
 * Created by mqu on 9/29/16.
 */
public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList() {

    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

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
        return tweets;
    }
}
