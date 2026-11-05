package com.whosthekiller.game;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundColor(Color.rgb(15, 18, 25));
        layout.setPadding(30, 30, 30, 30);

        TextView title = new TextView(this);
        title.setText("WHO'S THE KILLER?");
        title.setTextColor(Color.WHITE);
        title.setTextSize(28);
        title.setGravity(Gravity.CENTER);

        TextView subtitle = new TextView(this);
        subtitle.setText("A Detective Open World Game");
        subtitle.setTextColor(Color.LTGRAY);
        subtitle.setTextSize(16);
        subtitle.setGravity(Gravity.CENTER);

        TextView status = new TextView(this);
        status.setText("\nCIB\n\nOFFLINE MODE\n\nBUILD 0.4.0");
        status.setTextColor(Color.WHITE);
        status.setTextSize(18);
        status.setGravity(Gravity.CENTER);

        layout.addView(title);
        layout.addView(subtitle);
        layout.addView(status);

        setContentView(layout);
    }
          }
