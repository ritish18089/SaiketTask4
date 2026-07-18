package com.intent.transfer.demo.util;

import android.app.Activity;
import android.content.Intent;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.intent.transfer.demo.FileTransferActivity;
import com.intent.transfer.demo.ImageTransferActivity;
import com.intent.transfer.demo.R;
import com.intent.transfer.demo.SettingsActivity;
import com.intent.transfer.demo.VideoTransferActivity;

public class NavigationUtil {

    public static void setupBottomNavigation(Activity activity, int selectedItemId) {
        BottomNavigationView bottomNavigationView = activity.findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(selectedItemId);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == selectedItemId) return true;

            Intent intent = null;
            if (itemId == R.id.nav_video) {
                intent = new Intent(activity, VideoTransferActivity.class);
            } else if (itemId == R.id.nav_image) {
                intent = new Intent(activity, ImageTransferActivity.class);
            } else if (itemId == R.id.nav_file) {
                intent = new Intent(activity, FileTransferActivity.class);
            } else if (itemId == R.id.nav_settings) {
                intent = new Intent(activity, SettingsActivity.class);
            }

            if (intent != null) {
                activity.startActivity(intent);
                activity.overridePendingTransition(0, 0);
                activity.finish();
                return true;
            }
            return false;
        });
    }
}
