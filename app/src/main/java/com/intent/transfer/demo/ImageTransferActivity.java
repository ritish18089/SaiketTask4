package com.intent.transfer.demo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.intent.transfer.demo.util.NavigationUtil;
import com.intent.transfer.demo.util.ThemeUtils;

public class ImageTransferActivity extends AppCompatActivity {

    private TextInputEditText etName, etEmail, etPhone, etMessage;
    private MaterialButton btnSelectImage, btnTransfer;
    private MaterialCardView cardImageInfo;
    private ImageView ivPreview;
    private TextView tvImageName;
    private Uri selectedImageUri;

    private final ActivityResultLauncher<String> imagePickerLauncher = registerForActivityResult(
            new ActivityResultContracts.GetContent(),
            uri -> {
                if (uri != null) {
                    selectedImageUri = uri;
                    cardImageInfo.setVisibility(View.VISIBLE);
                    tvImageName.setText(uri.getLastPathSegment());
                    ivPreview.setImageURI(uri);
                }
            }
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ThemeUtils.applyTheme(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_transfer);

        NavigationUtil.setupBottomNavigation(this, R.id.nav_image);

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPhone = findViewById(R.id.etPhone);
        etMessage = findViewById(R.id.etMessage);
        btnSelectImage = findViewById(R.id.btnSelectImage);
        btnTransfer = findViewById(R.id.btnTransfer);
        cardImageInfo = findViewById(R.id.cardImageInfo);
        ivPreview = findViewById(R.id.ivImagePreview);
        tvImageName = findViewById(R.id.tvImageName);

        btnSelectImage.setOnClickListener(v -> imagePickerLauncher.launch("image/*"));

        btnTransfer.setOnClickListener(v -> {
            if (validate()) {
                Intent intent = new Intent(this, ImagePreviewActivity.class);
                intent.putExtra("name", etName.getText().toString());
                intent.putExtra("email", etEmail.getText().toString());
                intent.putExtra("phone", etPhone.getText().toString());
                intent.putExtra("message", etMessage.getText().toString());
                intent.putExtra("imageUri", selectedImageUri.toString());
                startActivity(intent);
            }
        });
    }

    private boolean validate() {
        if (etName.getText() == null || etName.getText().toString().isEmpty()) {
            Toast.makeText(this, getString(R.string.err_empty_name), Toast.LENGTH_SHORT).show();
            return false;
        }
        if (etEmail.getText() == null || etEmail.getText().toString().isEmpty()) {
            Toast.makeText(this, getString(R.string.err_empty_email), Toast.LENGTH_SHORT).show();
            return false;
        }
        if (etPhone.getText() == null || etPhone.getText().toString().isEmpty()) {
            Toast.makeText(this, getString(R.string.err_empty_phone), Toast.LENGTH_SHORT).show();
            return false;
        }
        if (etMessage.getText() == null || etMessage.getText().toString().isEmpty()) {
            Toast.makeText(this, getString(R.string.err_empty_message), Toast.LENGTH_SHORT).show();
            return false;
        }
        if (selectedImageUri == null) {
            Toast.makeText(this, getString(R.string.err_no_image), Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}
