# Simple Intent Demo - Advanced Video & Data Transfer

## 1. Project Overview
A professional Android application demonstrating **Explicit Intents** to transfer multiple data types (Text, Phone, Email, URI) between Activities. It features a modern Material Design 3 UI and follows Android development best practices.

## 2. Features
- **Multi-Data Transfer**: Pass Name, Email, Phone, and Message across Activities.
- **Video Selection**: Integrated System Video Picker using the **Activity Result API**.
- **Advanced Video Player**: `VideoView` with `MediaController` (Play, Pause, Seek).
- **Persistence**: Remembers user inputs using `SharedPreferences`.
- **State Restoration**: Handles screen rotation without losing the selected video.
- **Material 3**: Outlined text fields, Tonal buttons, and custom CardViews.
- **Transitions**: Smooth slide and fade animations between Activities.

## 3. Working Principle
1. **MainActivity** collects user input and allows video selection.
2. The **Activity Result Launcher** returns a URI for the selected video.
3. Upon validation, an **Explicit Intent** is created.
4. Data is bundled into the Intent using `putExtra()`.
5. **SecondActivity** extracts the data using `getStringExtra()` and `Uri.parse()`.
6. Data is displayed in Cards, and the video is loaded into a `VideoView`.

## 4. Folder Structure
```
com.intent.demo
├── MainActivity.java      (Input, Video Selection, Intent Trigger)
├── SecondActivity.java    (Data Display, Video Playback)
└── SplashActivity.java    (App Entry, Splash Logic)
res
├── layout                 (Activity XMLs)
├── values
│   ├── colors.xml         (M3 Palette)
│   ├── strings.xml        (Localization)
│   └── themes.xml         (M3 Theme Configuration)
└── AndroidManifest.xml    (Activity Registration)
```

## 5. Interview / Viva Questions

### Q1: What is an Explicit Intent?
**A**: An Explicit Intent specifies the exact component to be started by name (e.g., `SecondActivity.class`). It is primarily used within an application to navigate between its own activities.

### Q2: How do you handle configuration changes (like rotation) for URIs?
**A**: By overriding `onSaveInstanceState(Bundle)` and storing the URI string, then restoring it in `onCreate(Bundle)`.

### Q3: Why use Activity Result API instead of `startActivityForResult`?
**A**: The Activity Result API is decoupled from the Activity/Fragment, easier to test, and provides better type safety and lifecycle management.

### Q4: How do you play a video from a URI?
**A**: Use `videoView.setVideoURI(uri)` and call `videoView.start()` inside `onPreparedListener`.

## 6. Common Errors & Best Practices
- **Errors**: `SecurityException` (Missing permissions), `NullPointerException` (invalid Intent Extras).
- **Best Practices**: Use `TextInputLayout` for validation, always add null checks for Intent Extras, use `getViewLifecycleOwner` in fragments (if applicable), and provide user feedback via `Snackbar` or `Toast`.
