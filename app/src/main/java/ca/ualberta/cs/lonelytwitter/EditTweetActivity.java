package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {


    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        text = (TextView)findViewById(R.id.textView);

        Bundle extra = getIntent().getExtras();
        text.setText(extra.getString("message")+"  "+extra.getString("date"));


    }
}
