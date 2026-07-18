package com.intent.transfer.demo;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.appbar.MaterialToolbar;
import com.intent.transfer.demo.util.ThemeUtils;

public class TermsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ThemeUtils.applyTheme(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);

        MaterialToolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationOnClickListener(v -> finish());

        TextView tvTerms = findViewById(R.id.tvTermsConditions);
        tvTerms.setText(Html.fromHtml(getString(R.string.terms_conditions_text), Html.FROM_HTML_MODE_COMPACT));
    }
}
