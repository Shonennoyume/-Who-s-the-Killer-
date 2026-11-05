
package com.whosthekiller.game;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {

    LinearLayout root;
    int white = Color.WHITE;
    int background = Color.rgb(13, 18, 28);
    int panel = Color.rgb(29, 38, 52);
    int accent = Color.rgb(40, 170, 190);

    String currentCase = "The First Disappearance";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        home();
    }

    void setup(String title) {
        ScrollView scroll = new ScrollView(this);
        root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setPadding(22, 25, 22, 25);
        root.setBackgroundColor(background);

        scroll.addView(root);
        setContentView(scroll);

        TextView heading = new TextView(this);
        heading.setText(title);
        heading.setTextColor(white);
        heading.setTextSize(25);
        heading.setTypeface(null, Typeface.BOLD);
        heading.setPadding(0, 10, 0, 20);
        root.addView(heading);
    }

    void addText(String value, int size) {
        TextView text = new TextView(this);
        text.setText(value);
        text.setTextColor(white);
        text.setTextSize(size);
        text.setPadding(5, 10, 5, 10);
        root.addView(text);
    }

    void addButton(String name, Runnable action) {
        Button button = new Button(this);
        button.setText(name);
        button.setTextColor(white);
        button.setBackgroundTintList(
            android.content.res.ColorStateList.valueOf(panel)
        );

        LinearLayout.LayoutParams params =
            new LinearLayout.LayoutParams(
                -1, -2
            );
        params.setMargins(0, 7, 0, 7);

        root.addView(button, params);
        button.setOnClickListener(v -> action.run());
    }

    void home() {
        setup("WHO'S THE KILLER?");

        addText("A DETECTIVE OPEN-WORLD GAME", 13);
        addText("CIB | CONFIDENTIAL INVESTIGATION", 13);

        addText("DETECTIVE STATUS", 18);
        addText("New recruit\nDepartment: CIB\nRank: Trainee", 15);

        addText("MAIN MENU", 18);

        addButton("START INVESTIGATION", this::cases);
        addButton("DETECTIVE EQUIPMENT", this::equipment);
        addButton("PLAYER PROFILE", this::profile);
        addButton("GAME SETTINGS", this::settings);

        addText("VERSION 0.4.0 | DEVELOPMENT BUILD", 12);
    }

    void cases() {
        setup("INVESTIGATION BOARD");

        addText("Available investigation files", 16);

        addButton("CASE 001 - The First Disappearance", () -> {
            currentCase = "The First Disappearance";
            caseDetails();
        });

        addButton("CASE 002 - Unknown Caller", () -> {
            currentCase = "Unknown Caller";
            caseDetails();
        });

        addButton("CASE 003 - The Silent Warehouse", () -> {
            currentCase = "The Silent Warehouse";
            caseDetails();
        });

        addButton("Back to menu", this::home);
    }

    void caseDetails() {
        setup("CASE FILE");

        addText(currentCase, 22);
        addText("STATUS: OPEN", 15);

        addText(
            "Your assignment:\n" +
            "Investigate the location, collect evidence, " +
            "interview witnesses and identify suspicious activity.",
            16
        );

        addButton("Inspect crime scene", () -> {
            setup("CRIME SCENE");
            addText("Investigation started.", 18);
            addText("Search the area for useful evidence.", 15);
            addButton("Search for fingerprints", () ->
                addText("Fingerprint search recorded.", 15));
            addButton("Photograph evidence", () ->
                addText("Evidence photograph recorded.", 15));
            addButton("Record witness statement", () ->
                addText("Witness statement recorded.", 15));
            addButton("Return to case", this::caseDetails);
        });

        addButton("Evidence board", this::evidence);
        addButton("Back to cases", this::cases);
    }

    void evidence() {
        setup("EVIDENCE BOARD");

        addText("CASE: " + currentCase, 16);
        addText("Collected evidence", 18);

        addText("• Fingerprints: Not collected", 15);
        addText("• Photographs: Not collected", 15);
        addText("• Witness statements: Not collected", 15);
        addText("• Suspect information: Unknown", 15);

        addText(
            "Remember: Evidence must be examined before " +
            "drawing conclusions.",
            14
        );

        addButton("Back to case", this::caseDetails);
    }

    void equipment() {
        setup("CIB EQUIPMENT");

        addText("Available detective equipment", 17);

        addButton("Smartphone", () ->
            equipmentInfo("Secure calls, messages and contacts."));

        addButton("Digital Camera", () ->
            equipmentInfo("Photograph crime scenes and evidence."));

        addButton("Audio Recorder", () ->
            equipmentInfo("Record witness interviews."));

        addButton("Fingerprint Scanner", () ->
            equipmentInfo("Examine fingerprints at investigation sites."));

        addButton("Evidence Kit", () ->
            equipmentInfo("Collect and preserve physical evidence."));

        addButton("GPS Tracker", () ->
            equipmentInfo("Track authorized investigation locations."));

        addButton("Binoculars", () ->
            equipmentInfo("Observe distant locations."));

        addButton("Back to menu", this::home);
    }

    void equipmentInfo(String info) {
        setup("EQUIPMENT DETAILS");
        addText(info, 17);
        addButton("Back", this::equipment);
    }

    void profile() {
        setup("DETECTIVE PROFILE");

        addText("IDENTITY: NEW RECRUIT", 18);
        addText("Organization: CIB", 16);
        addText("Rank: Trainee", 16);
        addText("Cases completed: 0", 16);
        addText("Evidence collected: 0", 16);
        addText("Experience: Beginner", 16);

        addButton("Back to menu", this::home);
    }

    void settings() {
        setup("GAME SETTINGS");

        addText("Development settings", 17);

        addButton("Camera: Third Person", () ->
            addText("Third-person camera selected.", 14));

        addButton("Change Camera: First Person", () ->
            addText("First-person camera selected.", 14));

        addButton("Audio Settings", () ->
            addText("Audio settings will be added in a later build.", 14));

        addButton("Graphics Settings", () ->
            addText("Graphics settings will be added in a later build.", 14));

        addButton("Back to menu", this::home);
    }

    @Override
    public void onBackPressed() {
        home();
    }
    }
            
