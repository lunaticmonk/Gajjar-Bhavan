package app.example.android.com.hostel4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.client.Firebase;
import com.firebase.ui.FirebaseListAdapter;

/**
 * Created by Sumedh on 27/03/2016.
 */
public class events extends AppCompatActivity {
    private Firebase mRef;
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.events);
        Firebase.setAndroidContext(this);
        
        mRef = new Firebase("https://glaring-heat-6174.firebaseio.com");


    }

    @Override
    public void onStart() {
        super.onStart();
        mListView = (ListView) findViewById(R.id.events_listview);
        Firebase messageRef = mRef.child("Events");
        final FirebaseListAdapter<String> adapter = new FirebaseListAdapter<String>(this, String.class, R.layout.events, messageRef) {
            @Override
            protected void populateView(View view, String s) {
                TextView textView = (TextView) view.findViewById(R.id.events_textview);
                textView.setText(s);
            }
        };
            mListView.setAdapter(adapter);

    }
}