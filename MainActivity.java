package com.whosthekiller.game;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Color;
import android.view.Gravity;

public class MainActivity extends Activity {

    static {
        System.loadLibrary("whosthekiller");
    }

    public native String getGameTitle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView screen = new TextView(this);

        screen.setText(getGameTitle());
        screen.setTextSize(32);
        screen.setTextColor(Color.WHITE);
        screen.setBackgroundColor(Color.rgb(20, 20, 25));
        screen.setGravity(Gravity.CENTER);

        setContentView(screen);
    }
                                  }
