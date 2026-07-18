package com.intent.transfer.demo;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;
import com.intent.transfer.demo.util.NavigationUtil;
import com.intent.transfer.demo.util.ThemeUtils;

public class VideoPreviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ThemeUtils.applyTheme(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_preview);

        NavigationUtil.setupBottomNavigation(this, R.id.nav_video);

        TextView tvPreviewName = findViewById(R.id.tvPreviewName);
        TextView tvPreviewEmail = findViewById(R.id.tvPreviewEmail);
        TextView tvPreviewPhone = findViewById(R.id.tvPreviewPhone);
        TextView tvPreviewMessage = findViewById(R.id.tvPreviewMessage);
        TextView tvVideoName = findViewById(R.id.tvPreviewVideoName);
        VideoView videoView = findViewById(R.id.videoView);
        MaterialButton btnBack = findViewById(R.id.btnBack);

        String name = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");
        String phone = getIntent().getStringExtra("phone");
        String message = getIntent().getStringExtra("message");
        String videoUriStr = getIntent().getStringExtra("videoUri");

        tvPreviewName.setText(name);
        tvPreviewEmail.setText(email);
        tvPreviewPhone.setText(phone);
        tvPreviewMessage.setText(message);

        if (videoUriStr != null) {
            Uri videoUri = Uri.parse(videoUriStr);
            tvVideoName.setText("Video: " + videoUri.getLastPathSegment());
            videoView.setVideoURI(videoUri);
            MediaController mediaController = new MediaController(this);
            videoView.setMediaController(mediaController);
            mediaController.setAnchorView(videoView);
            videoView.start();
        }

        btnBack.setOnClickListener(v -> finish());
    }
}
