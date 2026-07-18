package com.intent.transfer.demo;

import android.app.Application;
import com.intent.transfer.demo.util.ThemeUtils;

public class IntentTransferApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Initialize theme before any activity is created
        ThemeUtils.applyTheme(this);
    }
}
