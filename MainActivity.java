
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
            "CRIME INVESTIGATION BUREAU\n\n" +
            "UNDERCOVER DIVISION\n\n" +
            "BUILD 0.3.0"
        );

        screen.setTextSize(24);
        screen.setTextColor(Color.WHITE);
        screen.setGravity(Gravity.CENTER);
        screen.setBackgroundColor(Color.rgb(15, 18, 28));

        setContentView(screen);
    }
}
