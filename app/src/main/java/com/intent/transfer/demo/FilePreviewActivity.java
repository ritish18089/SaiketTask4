package com.intent.transfer.demo;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.OpenableColumns;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;
import com.intent.transfer.demo.util.NavigationUtil;
import com.intent.transfer.demo.util.ThemeUtils;

public class FilePreviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ThemeUtils.applyTheme(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_preview);

        NavigationUtil.setupBottomNavigation(this, R.id.nav_file);

        TextView tvPreviewName = findViewById(R.id.tvPreviewName);
        TextView tvPreviewEmail = findViewById(R.id.tvPreviewEmail);
        TextView tvPreviewPhone = findViewById(R.id.tvPreviewPhone);
        TextView tvPreviewMessage = findViewById(R.id.tvPreviewMessage);
        TextView tvFileName = findViewById(R.id.tvPreviewFileName);
        TextView tvFileSize = findViewById(R.id.tvPreviewFileSize);
        TextView tvFileType = findViewById(R.id.tvPreviewFileType);
        MaterialButton btnOpenFile = findViewById(R.id.btnOpenFile);
        MaterialButton btnBack = findViewById(R.id.btnBack);

        String name = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");
        String phone = getIntent().getStringExtra("phone");
        String message = getIntent().getStringExtra("message");
        String fileUriStr = getIntent().getStringExtra("fileUri");

        tvPreviewName.setText(name);
        tvPreviewEmail.setText(email);
        tvPreviewPhone.setText(phone);
        tvPreviewMessage.setText(message);

        if (fileUriStr != null) {
            Uri fileUri = Uri.parse(fileUriStr);
            displayFileInfo(fileUri, tvFileName, tvFileSize, tvFileType);
            
            btnOpenFile.setOnClickListener(v -> {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(fileUri, getContentResolver().getType(fileUri));
                intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                try {
                    startActivity(intent);
                } catch (Exception e) {
                    Toast.makeText(this, "No app found to open this file", Toast.LENGTH_SHORT).show();
                }
            });
        }

        btnBack.setOnClickListener(v -> finish());
    }

    private void displayFileInfo(Uri uri, TextView tvName, TextView tvSize, TextView tvType) {
        Cursor cursor = getContentResolver().query(uri, null, null, null, null);
        if (cursor != null && cursor.moveToFirst()) {
            int nameIndex = cursor.getColumnIndex(OpenableColumns.DISPLAY_NAME);
            int sizeIndex = cursor.getColumnIndex(OpenableColumns.SIZE);
            tvName.setText(cursor.getString(nameIndex));
            long size = cursor.getLong(sizeIndex);
            tvSize.setText(size / 1024 + " KB");
            tvType.setText(getContentResolver().getType(uri));
            cursor.close();
        }
    }
}
