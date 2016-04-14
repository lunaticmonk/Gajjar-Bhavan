package app.example.android.com.hostel4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.batch.android.Batch;

/**
 * Created by Sumedh on 16/03/2016.
 */
public class Page_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_2);
    }

    @Override
    protected void onStart()
    {
        super.onStart();

        Batch.onStart(this);
    }

    @Override
    protected void onStop()
    {
        Batch.onStop(this);

        super.onStop();
    }

    @Override
    protected void onDestroy()
    {
        Batch.onDestroy(this);

        super.onDestroy();
    }

    @Override
    protected void onNewIntent(Intent intent)
    {
        Batch.onNewIntent(this, intent);

        super.onNewIntent(intent);
    }

    public void News(View view){
        Intent intent=new Intent(this,News.class);
        startActivity(intent);
    }

    public void Mess(View view){
        Intent intent=new Intent(this,mess.class);
        startActivity(intent);
    }

    public void Gallery(View view){
        Intent intent=new Intent(this,gallery.class);
        startActivity(intent);

    }


    public void Events(View view){
        Intent intent=new Intent(this,events.class);
        startActivity(intent);
    }
    public void Complaint(View view){
        Intent intent=new Intent(this,Complaint.class);
        startActivity(intent);
    }
    public void Notifications(View view){
        Intent intent=new Intent(this,notifications.class);
        startActivity(intent);
    }



}
