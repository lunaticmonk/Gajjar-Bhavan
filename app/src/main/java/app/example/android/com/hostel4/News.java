package app.example.android.com.hostel4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.client.Firebase;
import com.firebase.ui.FirebaseListAdapter;

/**
 * Created by Sumedh on 19/03/2016.
 */
public class News extends AppCompatActivity {
    private Firebase mRef;
    ListView mListview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news);
        Firebase.setAndroidContext(this);
       // Firebase.getDefaultConfig().setPersistenceEnabled(true);

        //mRef.keepSynced(true);
        mRef = new Firebase("https://glaring-heat-6174.firebaseio.com");

    }

    @Override
    public void onStart() {
        super.onStart();
        mListview=(ListView) findViewById(R.id.ListView);

        Firebase messageRef = mRef.child("News");
         final FirebaseListAdapter<String> adapter = new FirebaseListAdapter<String>(this, String.class, R.layout.news, messageRef) {
            @Override
            protected void populateView(View view, String s) {
                TextView textView = (TextView)view.findViewById(R.id.textview_heading);
                textView.setText(s);
            }
         };
        mListview.setAdapter(adapter);


    }
}



