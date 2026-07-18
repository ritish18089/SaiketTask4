package com.intent.transfer.demo;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.OpenableColumns;
import android.view.View;
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

public class FileTransferActivity extends AppCompatActivity {

    private TextInputEditText etName, etEmail, etPhone, etMessage;
    private MaterialButton btnSelectFile, btnTransfer;
    private MaterialCardView cardFileInfo;
    private TextView tvFileName, tvFileSize;
    private Uri selectedFileUri;

    private final ActivityResultLauncher<String> filePickerLauncher = registerForActivityResult(
            new ActivityResultContracts.GetContent(),
            uri -> {
                if (uri != null) {
                    selectedFileUri = uri;
                    cardFileInfo.setVisibility(View.VISIBLE);
                    displayFileInfo(uri);
                }
            }
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ThemeUtils.applyTheme(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_transfer);

        NavigationUtil.setupBottomNavigation(this, R.id.nav_file);

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPhone = findViewById(R.id.etPhone);
        etMessage = findViewById(R.id.etMessage);
        btnSelectFile = findViewById(R.id.btnSelectFile);
        btnTransfer = findViewById(R.id.btnTransfer);
        cardFileInfo = findViewById(R.id.cardFileInfo);
        tvFileName = findViewById(R.id.tvFileName);
        tvFileSize = findViewById(R.id.tvFileSize);

        btnSelectFile.setOnClickListener(v -> filePickerLauncher.launch("*/*"));

        btnTransfer.setOnClickListener(v -> {
            if (validate()) {
                Intent intent = new Intent(this, FilePreviewActivity.class);
                intent.putExtra("name", etName.getText().toString());
                intent.putExtra("email", etEmail.getText().toString());
                intent.putExtra("phone", etPhone.getText().toString());
                intent.putExtra("message", etMessage.getText().toString());
                intent.putExtra("fileUri", selectedFileUri.toString());
                startActivity(intent);
            }
        });
    }

    private void displayFileInfo(Uri uri) {
        Cursor cursor = getContentResolver().query(uri, null, null, null, null);
        if (cursor != null && cursor.moveToFirst()) {
            int nameIndex = cursor.getColumnIndex(OpenableColumns.DISPLAY_NAME);
            int sizeIndex = cursor.getColumnIndex(OpenableColumns.SIZE);
            tvFileName.setText(cursor.getString(nameIndex));
            long size = cursor.getLong(sizeIndex);
            tvFileSize.setText(size / 1024 + " KB");
            cursor.close();
        }
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
        if (selectedFileUri == null) {
            Toast.makeText(this, getString(R.string.err_no_file), Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}
