# Intent Transfer Demo - Project Documentation

## 1. Project Overview
A professional Android application demonstrating the use of **Explicit** and **Implicit Intents**. The app allows users to transfer text along with media (Video, Image, or Files) between different Activities.

## 2. Folder Structure
```
com.intent.transfer.demo
├── SplashActivity.java         # Entry point with logo
├── ui
│   ├── home
│   │   └── HomeActivity.java   # Navigation hub with Material Cards
│   ├── transfer
│   │   ├── TransferInputActivity.java # Form to collect text and media
│   │   ├── VideoTransferActivity.java # Displays received video
│   │   ├── ImageTransferActivity.java # Displays received image
│   │   └── FileTransferActivity.java  # Displays received file info
│   └── settings
│       └── SettingsActivity.java # Professional settings screen
└── util                        # Helper classes (if any)
```

## 3. Key Features
- **Explicit Intents**: Used for navigating between all app screens and passing complex data (URIs and Strings).
- **Activity Result API**: Modern way to handle media selection (Video, Image, Documents).
- **Implicit Intents**: 
  - **Open File**: Uses `ACTION_VIEW` to let other apps open the received file.
  - **Feedback**: Uses `ACTION_SENDTO` (mailto:) to open the default email client.
- **Material Design 3**: Modern UI with Cards, Outlined Inputs, and MaterialSwitch.
- **Error Handling**: Comprehensive checks for null URIs and empty text.

## 4. Architecture
- **Multi-Activity Design**: Each functional unit is encapsulated in its own Activity for clear demonstration of Intent boundaries.
- **Separation of Concerns**: UI logic is grouped into `home`, `transfer`, and `settings` packages.

## 5. Working Principle (Workflow)
1. **Splash**: Shows for 2s, then launches `HomeActivity`.
2. **Home**: User clicks a card (Video, Image, or File).
3. **Input Screen**: User enters text and selects a media file using the `ActivityResultLauncher`.
4. **Transfer**: On clicking "Transfer", an Explicit Intent carries the text and file URI to the specific destination Activity.
5. **Display**: The destination activity extracts data and renders it (e.g., plays video in `VideoView`).

## 6. Interview / Viva Questions

### Q1: What is an Explicit Intent?
**A**: An Intent that specifies exactly which component (by class name) to start. It is usually used for navigation within the same app.

### Q2: What is an Implicit Intent?
**A**: An Intent that specifies an action (like `ACTION_VIEW` or `ACTION_DIAL`) without naming a specific component. The Android system finds an app capable of handling that action.

### Q3: Why use Activity Result API over `startActivityForResult`?
**A**: It is decoupled from the Activity/Fragment, provides better type safety, and is lifecycle-aware, reducing the risk of crashes during configuration changes.

### Q4: How do you pass a large file between Activities?
**A**: You should never pass the actual file bytes. Instead, pass the **URI** of the file using `intent.putExtra("key", uri.toString())`.

## 7. Common Errors & Fixes
- **Error**: `SecurityException` when opening a file URI.
  - **Fix**: Use `FLAG_GRANT_READ_URI_PERMISSION` in the Intent.
- **Error**: `getColumnIndex` returns -1.
  - **Fix**: Always check if the index is valid before querying the Cursor.
- **Error**: Application crashes on rotation.
  - **Fix**: Use `onSaveInstanceState` or handle configuration changes correctly.
