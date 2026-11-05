
package com.whosthekiller.game;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView screen = new TextView(this);

        screen.setText(
            "WHO'S THE KILLER?\n\n" +
            "CIB - UNDERCOVER INVESTIGATION\n\n" +
            "DEVELOPMENT BUILD 0.2.0"
        );

        screen.setTextSize(23);
        screen.setTextColor(Color.WHITE);
        screen.setGravity(Gravity.CENTER);
        screen.setBackgroundColor(Color.rgb(15, 18, 25));

        setContentView(screen);
    }
}
