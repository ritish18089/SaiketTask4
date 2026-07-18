package com.intent.transfer.demo;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;
import com.intent.transfer.demo.util.NavigationUtil;
import com.intent.transfer.demo.util.ThemeUtils;

public class ImagePreviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ThemeUtils.applyTheme(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_preview);

        NavigationUtil.setupBottomNavigation(this, R.id.nav_image);

        TextView tvPreviewName = findViewById(R.id.tvPreviewName);
        TextView tvPreviewEmail = findViewById(R.id.tvPreviewEmail);
        TextView tvPreviewPhone = findViewById(R.id.tvPreviewPhone);
        TextView tvPreviewMessage = findViewById(R.id.tvPreviewMessage);
        TextView tvImageName = findViewById(R.id.tvPreviewImageName);
        ImageView ivPreview = findViewById(R.id.ivPreviewImage);
        MaterialButton btnBack = findViewById(R.id.btnBack);

        String name = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");
        String phone = getIntent().getStringExtra("phone");
        String message = getIntent().getStringExtra("message");
        String imageUriStr = getIntent().getStringExtra("imageUri");

        tvPreviewName.setText(name);
        tvPreviewEmail.setText(email);
        tvPreviewPhone.setText(phone);
        tvPreviewMessage.setText(message);

        if (imageUriStr != null) {
            Uri imageUri = Uri.parse(imageUriStr);
            tvImageName.setText("Image: " + imageUri.getLastPathSegment());
            ivPreview.setImageURI(imageUri);
        }

        btnBack.setOnClickListener(v -> finish());
    }
}
