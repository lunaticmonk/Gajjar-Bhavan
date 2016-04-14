package app.example.android.com.hostel4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by Sumedh on 08/04/2016.
 */
public class notifications extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notifications);
        ImageView targetImageView=(ImageView) findViewById(R.id.image);
        String internetUrl="http://i.imgur.com/9POp7zG.jpg";

        Glide
                .with(this)
                .load(internetUrl)
                .animate( android.R.anim.slide_in_left ) // or R.anim.zoom_in

                .into(targetImageView);

        ImageView targetImageView1=(ImageView) findViewById(R.id.image1);
        String internetUrl1="http://i.imgur.com/sSrvaEO.jpg";

        Glide
                .with(this)
                .load(internetUrl1)
                .animate( android.R.anim.slide_in_left ) // or R.anim.zoom_in

                .into(targetImageView1);
        ImageView targetImageView2=(ImageView) findViewById(R.id.image2);
        String internetUrl2="http://i.imgur.com/EDJdPJ8.jpg";


        Glide
                .with(this)
                .load(internetUrl2)
                .animate(android.R.anim.slide_in_left) // or R.anim.zoom_in

                .into(targetImageView2);
        ImageView targetImageView3=(ImageView) findViewById(R.id.image3);
        String internetUrl3="http://i.imgur.com/pw5rMed.jpg";


        Glide
                .with(this)
                .load(internetUrl3)
                .animate(android.R.anim.slide_in_left) // or R.anim.zoom_in

                .into(targetImageView3);


    }
}
