package app.example.android.com.hostel4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class gallery extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery);
        ImageView targetImageView=(ImageView) findViewById(R.id.image);
        String internetUrl="http://i.imgur.com/k7XHQZ9.png";

        Glide
                .with(this)
                .load(internetUrl)
                .animate( android.R.anim.slide_in_left ) // or R.anim.zoom_in

                .into(targetImageView);

        ImageView targetImageView1=(ImageView) findViewById(R.id.image1);
        String internetUrl1="http://i.imgur.com/BiEJJGC.jpg";

        Glide
                .with(this)
                .load(internetUrl1)
                .animate( android.R.anim.slide_in_left ) // or R.anim.zoom_in

                .into(targetImageView1);
        ImageView targetImageView2=(ImageView) findViewById(R.id.image2);
        String internetUrl2="http://i.imgur.com/2kesEH8.jpg";


        Glide
                .with(this)
                .load(internetUrl2)
                .animate(android.R.anim.slide_in_left) // or R.anim.zoom_in

                .into(targetImageView2);
        ImageView targetImageView3=(ImageView) findViewById(R.id.image3);
        String internetUrl3="http://i.imgur.com/Hra8IbM.jpg";

        Glide
                .with(this)
                .load(internetUrl3)
                .animate( android.R.anim.slide_in_left ) // or R.anim.zoom_in

                .into(targetImageView3);
        ImageView targetImageView4=(ImageView) findViewById(R.id.image4);
        String internetUrl4="http://i.imgur.com/zMeGubl.jpg";

        Glide
                .with(this)
                .load(internetUrl4)
                .into(targetImageView4);
        ImageView targetImageView5=(ImageView) findViewById(R.id.image5);
        String internetUrl5="http://i.imgur.com/x2ndMF0.jpg";

        Glide
                .with(this)
                .load(internetUrl5)
                .crossFade()

                .into(targetImageView5);
        ImageView targetImageView6=(ImageView) findViewById(R.id.image6);
        String internetUrl6="http://i.imgur.com/4PoGxDK.jpg";

        Glide
                .with(this)
                .load(internetUrl6)
                .crossFade()

                .into(targetImageView6);

    }
}


