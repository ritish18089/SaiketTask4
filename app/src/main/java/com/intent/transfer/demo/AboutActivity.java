package com.intent.transfer.demo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.appbar.MaterialToolbar;
import com.intent.transfer.demo.util.ThemeUtils;

public class AboutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ThemeUtils.applyTheme(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        MaterialToolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationOnClickListener(v -> finish());

        TextView tvTechStack = findViewById(R.id.tvTechStack);
        tvTechStack.setText(Html.fromHtml(getString(R.string.about_tech_stack), Html.FROM_HTML_MODE_COMPACT));

        TextView tvEmail = findViewById(R.id.tvEmail);
        tvEmail.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:ritish1808@gmail.com"));
            intent.putExtra(Intent.EXTRA_SUBJECT, "Query regarding Intent Transfer Demo");
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        });
    }
}
