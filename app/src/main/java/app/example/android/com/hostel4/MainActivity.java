package app.example.android.com.hostel4;

import android.app.Activity;
import android.graphics.PixelFormat;
import android.view.Window;

public class MainActivity extends Activity {
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        window.setFormat(PixelFormat.RGBA_8888);
    }
}