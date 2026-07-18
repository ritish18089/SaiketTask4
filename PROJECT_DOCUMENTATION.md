# Blip – File Transfer: Project Overview

## 1. Introduction
**Blip** is a high-speed, secure file-sharing application designed for seamless transfer between nearby devices. Inspired by Google's Quick Share, it leverages modern Android technologies to provide a fast and reliable user experience.

## 2. Technology Stack
- **Language**: Java
- **UI Framework**: XML Layouts with Material Design 3
- **Architecture**: MVVM (Model-View-ViewModel) & Clean Architecture
- **Navigation**: Bottom Navigation with Fragment Management
- **Persistence**: SharedPreferences for user settings
- **Minimum SDK**: 24+

## 3. Key Features
- **Send Directly**: Discover and connect to nearby devices instantly.
- **Recent Files**: A visual history of all transfers with support for multiple file types.
- **Unified Transfer Dashboard**: Simplified UI for sending and receiving files.
- **Video Preview**: Built-in video player with metadata display.
- **Material 3 UI**: Dynamic colors, smooth animations, and responsive layouts.
- **Runtime Permissions**: Secure handling of storage and nearby device access.

## 4. MVVM Architecture Explanation
- **Model**: Data classes like `Device` and `TransferFile` represent the domain data.
- **View**: Fragments (`HomeFragment`, `TransferFragment`) and Activities handle the UI and user interactions.
- **ViewModel**: `TransferViewModel` holds the UI state and handles business logic, ensuring state survives configuration changes.
- **Repository**: Acts as a mediator between data sources and the ViewModel (Mocked in this version).

## 5. Interview / Viva Questions

### Q1: Why did you choose MVVM over MVC?
**A**: MVVM provides better separation of concerns. The ViewModel is lifecycle-aware and doesn't hold references to the View, which prevents memory leaks and makes the code more testable.

### Q2: How does the app handle nearby device discovery?
**A**: (Current implementation uses a mock discovery logic). In a production environment, we would use the Google Nearby Connections API or WiFi Direct, which involve scanning for Bluetooth LE advertisements and establishing a P2P connection.

### Q3: What is Material Design 3?
**A**: It is the latest version of Google's design system. It introduces "Material You" (dynamic color), updated components like the SearchBar, and improved accessibility features.

### Q4: How do you handle runtime permissions?
**A**: We use the `PermissionManager` utility class which checks the current Android version (SDK) and requests appropriate permissions like `READ_MEDIA_VIDEO` for Android 13+ and `READ_EXTERNAL_STORAGE` for older versions.

## 6. Common Errors & Solutions
- **Error**: `SecurityException` when accessing storage.
  - **Solution**: Ensure permissions are declared in `AndroidManifest.xml` and requested at runtime.
- **Error**: `R` class not found after package rename.
  - **Solution**: Perform a Clean Build and ensure the `import com.blip.filetransfer.R;` is correct.

## 7. Best Practices Followed
- **Consistency**: Unified naming conventions for files and variables.
- **Responsiveness**: Used `ConstraintLayout` and `NestedScrollView` for flexible UI.
- **Efficiency**: RecyclerView with custom Adapters for smooth list scrolling.
- **Safety**: Lifecycle-aware components to manage UI state correctly.
