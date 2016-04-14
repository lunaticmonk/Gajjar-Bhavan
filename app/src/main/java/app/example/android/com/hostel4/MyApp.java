package app.example.android.com.hostel4;

import android.app.Application;
import com.batch.android.Batch;
import com.batch.android.Config;



/**
 * Created by Sumedh on 03/04/2016.
 */
public class MyApp extends Application {
    @Override
    public void onCreate()
    {
        super.onCreate();
        Batch.Push.setGCMSenderId("276060730523");

        Batch.setConfig(new Config("DEV56FA6112CB8417006EF2F2BF112"));
    }
}
