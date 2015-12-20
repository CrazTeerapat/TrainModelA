package vernity.puttinun.teerapat.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    // Explicit
    private TextView headTextView, detailTextView;
    private ImageView trafficImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Bind Widget
        bindWidget();

        // Show View
        showView();

    }   // Main Method

    private void showView() {

        // Show Head
        String strHead = getIntent().getStringExtra("Head");
        headTextView.setText(strHead);

        // Show Image
        int intImage = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        trafficImageView.setImageResource(intImage);

        // Show Detail
        int intIndex = getIntent().getIntExtra("Index", 0);
        String[] strDetail = getResources().getStringArray(R.array.detail);
        detailTextView.setText(strDetail[intIndex]);

    }   // Show View

    private void bindWidget() {

        headTextView = (TextView) findViewById(R.id.textView2);
        detailTextView = (TextView) findViewById(R.id.textView3);
        trafficImageView = (ImageView) findViewById(R.id.imageView);

    }
}   // Main Class
