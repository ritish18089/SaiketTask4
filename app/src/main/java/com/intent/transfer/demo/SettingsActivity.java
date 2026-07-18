package com.intent.transfer.demo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import com.intent.transfer.demo.util.NavigationUtil;
import com.intent.transfer.demo.util.ThemeUtils;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ThemeUtils.applyTheme(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        NavigationUtil.setupBottomNavigation(this, R.id.nav_settings);

        RadioGroup rgTheme = findViewById(R.id.rgTheme);

        // Load saved states
        int currentTheme = ThemeUtils.getSelectedTheme(this);
        if (currentTheme == AppCompatDelegate.MODE_NIGHT_YES) {
            rgTheme.check(R.id.rbDark);
        } else {
            rgTheme.check(R.id.rbLight);
        }

        // Listeners
        rgTheme.setOnCheckedChangeListener((group, checkedId) -> {
            int mode = (checkedId == R.id.rbDark) ? 
                    AppCompatDelegate.MODE_NIGHT_YES : AppCompatDelegate.MODE_NIGHT_NO;
            ThemeUtils.saveTheme(SettingsActivity.this, mode);
        });

        findViewById(R.id.btnAbout).setOnClickListener(v -> 
                startActivity(new Intent(this, AboutActivity.class)));

        findViewById(R.id.btnHelp).setOnClickListener(v -> 
                startActivity(new Intent(this, HelpCenterActivity.class)));

        findViewById(R.id.btnFeedback).setOnClickListener(v -> sendFeedback());

        findViewById(R.id.btnPrivacy).setOnClickListener(v -> 
                startActivity(new Intent(this, PrivacyPolicyActivity.class)));

        findViewById(R.id.btnTerms).setOnClickListener(v -> 
                startActivity(new Intent(this, TermsActivity.class)));
    }

    private void sendFeedback() {
        try {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:ritish1808@gmail.com"));
            intent.putExtra(Intent.EXTRA_SUBJECT, "Intent Transfer Demo Feedback");
            intent.putExtra(Intent.EXTRA_TEXT, "Hello,\n\nPlease write your feedback here.\n\nThank you.");
            startActivity(intent);
        } catch (android.content.ActivityNotFoundException e) {
            android.widget.Toast.makeText(this, "No email application found.", android.widget.Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            android.widget.Toast.makeText(this, "An error occurred.", android.widget.Toast.LENGTH_SHORT).show();
        }
    }
}
