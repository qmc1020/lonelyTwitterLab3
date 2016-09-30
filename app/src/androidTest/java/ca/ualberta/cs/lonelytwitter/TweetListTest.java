package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by mqu on 9/29/16.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2{

    public TweetListTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("Adding tweet");
        try {
            tweets.add(tweet);
            assertTrue(tweets.hasTweet(tweet));
        }catch(IllegalArgumentException e){
            assertTrue(Boolean.FALSE);
        }

        try {
            tweets.add(tweet);
            assertTrue(tweets.hasTweet(tweet));
        }catch(IllegalArgumentException e){
            assertTrue(Boolean.TRUE);
        }

    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
    }

    public void testHasTweet(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
    }

    public void testGetTweets(){
        TweetList list = new TweetList();
        Tweet tweet1 = new NormalTweet("test1");
        tweet1.setDate(new Date(5232));
        list.add(tweet1);
        Tweet tweet2 = new NormalTweet("test2");
        tweet2.setDate(new Date(1823));
        list.add(tweet2);
        Tweet tweet3 = new NormalTweet("test3");
        tweet3.setDate(new Date(3232));
        list.add(tweet3);

        ArrayList<Tweet> orderedList = new ArrayList<Tweet>();
        orderedList.add(tweet2);
        orderedList.add(tweet3);
        orderedList.add(tweet1);



        ArrayList<Tweet> returnedList = list.getTweets();

        for (int i=0;i<3;i++){

            assertEquals(returnedList.get(i).getMessage(), orderedList.get(i).getMessage());
        }

    }

    public void testGetCount(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        int returnedCount = list.getCount();
        int count = 1;
        assertEquals(returnedCount, count);
        Tweet tweet2 = new NormalTweet("test2");
        list.add(tweet2);
        count ++;
        returnedCount = list.getCount();
        assertEquals(returnedCount, count);
    }


    public void testDelete(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        list.delete(tweet);
        assertFalse(list.hasTweet(tweet));
    }
}
