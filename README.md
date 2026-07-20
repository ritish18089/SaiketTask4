# Intent Transfer Demo - ⏳ Smart Productivity Timer
A brief description of what this project does and who it's for.

## 🌟 Overview
Intent Transfer Demo is a modern Android application developed using Java and Android Studio to demonstrate the implementation of Explicit Intents for transferring data between Activities. The application allows users to enter personal information and transfer it along with images, videos, and files through dedicated modules. Users can preview the transferred content on separate screens, making it easy to understand how Intent-based communication works in Android. Built with Material Design 3, the application provides a clean, responsive, and user-friendly interface, making it an ideal learning project for students, beginners, and Android developers who want to understand Activity navigation, data passing, and media handling.

## 🚀 Features
### Text Transfer Module
- Transfer Name, Email, Contact Number, and Message
- Form validation before transfer
- Explicit Intent-based communication
- Preview transferred user details

### Video Transfer Module
- Select videos from device storage
- Preview selected video before transfer
- Pass video URI using Explicit Intents
- Play transferred videos on the preview screen

### Image Transfer Module
- Select images from the gallery
- Preview selected image
- Transfer image URI between Activities
- Display transferred image in high quality

### File Transfer Module
- Select files from device storage
- Support PDF, DOC, DOCX, PPT, PPTX, XLS, XLSX, TXT, and ZIP formats
- Transfer file URI using Explicit Intents
- View file information on the preview screen

### Preview Module
- Display transferred user details
- Preview transferred videos
- Preview transferred images
- Display transferred file information
- Smooth navigation between Activities

### Settings Module
- Light Theme
- Dark Theme
- Theme preference using SharedPreferences
- Modern Material Design interface

### Information Module
- About App
- Help Center
- Privacy Policy
- Terms & Conditions
- Send Feedback via Email

### User Interface
- Material Design 3 Components
- Responsive Layout for different screen sizes
- Simple and intuitive navigation
- Modern and clean user interface
- Consistent design across all screens

## 🛠 Technology Stack
- **Programming Language:** Java
- **Development Environment (IDE):** Android Studio
- **User Interface:** XML with Material Design 3 Components
- **Application Architecture:** MVVM-inspired Architecture
- **Local Data Storage:** SharedPreferences
- **Timer Implementation:** CountDownTimer API
- **Stopwatch Implementation:** Handler and SystemClock
- **Navigation:** Bottom Navigation View
- **List Management:** RecyclerView
- **Background Processing:** Foreground Service
- **Notifications:** NotificationManager & Notification Channels
- **Layouts:** ConstraintLayout and LinearLayout
- **Icons:** Material Icons
- **Build System:** Gradle
- **Version Control:** Git
- **Repository Hosting:** GitHub
- **Supported Android Version:** Android 10 (API 29) and above

## 📂 Architecture
The architecture of FocusFlow follows a modular design, where each module is responsible for a specific functionality. This approach improves maintainability, scalability, and code organization.
- **Splash Screen:** The Splash Screen is the entry point of the application. It displays the app logo and name for a few seconds while initializing the application before navigating to the Home Screen.
- **Home Screen:** The Home Screen serves as the central dashboard of the application. From here, users can access the Countdown Timer, Stopwatch, Daily Planner, and Statistics modules. It acts as the main navigation hub and displays the currently selected focus activity.
- **Timer Module:** The Timer Module provides a countdown timer for focus sessions. Users can set custom durations, start, stop, and reset the timer. A circular progress indicator visually represents the remaining time, and the timer updates every second until completion.
- **Stopwatch Module:** The Stopwatch Module is designed to measure elapsed time. It supports start, stop, reset, and lap recording, making it useful for tracking activities that do not require a predefined duration.
- **Planner Module:** The Planner Module allows users to create, edit, delete, and manage daily activities. Users can assign custom durations to each activity and start a focus session, which loads the selected activity into the Home Screen timer.
- **Statistics Module:** The Statistics Module provides productivity insights by displaying total activities, completed activities, pending activities, daily focus time, and overall productivity summaries. This helps users monitor and improve their daily performance.
- **Local Data Storage (SharedPreferences):** The application uses SharedPreferences as local storage to save user preferences and application data, such as planner activities, timer state, history, statistics, and settings. This ensures that important information is retained even after the app is closed and reopened.
- **History Screen:** The History Screen stores records of completed and stopped activities. Users can search previous sessions, view activity details, and clear history whenever needed.
- **Settings Screen:** The Settings Screen enables users to customize the application by managing dark mode, notifications, alert sounds, vibration, and accessing the About App, Help Center, Privacy Policy, and Terms & Conditions pages.
- **Notification System:** The Notification System manages foreground notifications during active focus sessions and alerts users when a timer is completed. It also supports notification sounds and vibration based on user preferences, ensuring users remain informed even when the app is running in the background.
<img src="https://github.com/ritish18089/SaiketTask5/blob/main/focusa.png"  height="1000px" width="1000px" >

## 🎯  Application Work Flow
<img src="https://github.com/ritish18089/SaiketTask5/blob/main/erftg.png" height="1000px" width="1000px" >

## 🧪 Testing Strategy
### Functional Testing
- Timer Start, Stop, Reset
- Stopwatch Operations
- Activity Creation
- Activity Editing
- Activity Deletion
- History Storage
- Statistics Calculation
- Notifications
- Settings

### UI Testing
- Material Design Consistency
- Responsive Layout
- Button Alignment
- Navigation Flow
- Status Bar Handling
- Bottom Navigation
- Performance Testing
- Timer Accuracy
- Memory Usage
- Notification Performance
- Screen Rotation Handling

### Compatibility Testing
- Android 10+
- Android 11
- Android 12
- Android 13
- Android 14
- Android 15

### User Acceptance Testing
- Activity Planning
- Focus Sessions
- Timer Notifications
- Stopwatch Accuracy
- History Tracking

## 📸 Screenshots
### 🚀 Splash Screen
<p align="center"><img src="https://github.com/ritish18089/SaiketTask5/blob/main/1.jpeg"  height="500px"></p>

### 🏠 Home Screen
<p align="center"><img src="https://github.com/ritish18089/SaiketTask5/blob/main/2.jpeg"  height="500px"></p>

### ⏳ Countdown Timer Running
<p align="center"><img src="https://github.com/ritish18089/SaiketTask5/blob/main/3.jpeg"  height="500px"></p>

### ⏱️ Stopwatch Screen
<p align="center"><img src="https://github.com/ritish18089/SaiketTask5/blob/main/4.jpeg"  height="500px"></p>

### 📅 Daily Planner
<p align="center"><img src="https://github.com/ritish18089/SaiketTask5/blob/main/5.jpeg"  height="500px"></p>

### ➕ Add Activity Dialog
<p align="center"><img src="https://github.com/ritish18089/SaiketTask5/blob/main/6.jpeg"  height="500px"></p>

### 📜 History Screen
<p align="center"><img src="https://github.com/ritish18089/SaiketTask5/blob/main/7.jpeg"  height="500px"></p>

### 📊 Statistics Screen
<p align="center"><img src="https://github.com/ritish18089/SaiketTask5/blob/main/8.jpeg"  height="500px"></p>

### ⚙️ Settings Screen
<p align="center"><img src="https://github.com/ritish18089/SaiketTask5/blob/main/9.jpeg"  height="500px"></p>

### ℹ️ About App
<p align="center"><img src="https://github.com/ritish18089/SaiketTask5/blob/main/10.jpeg"  height="500px"></p>

### ❓ Help Center
<p align="center"><img src="https://github.com/ritish18089/SaiketTask5/blob/main/11.jpeg"  height="500px"></p>

### 🔒 Privacy Policy
<p align="center"><img src="https://github.com/ritish18089/SaiketTask5/blob/main/12.jpeg"  height="500px"></p>

### 📄 Terms & Conditions
<p align="center"><img src="https://github.com/ritish18089/SaiketTask5/blob/main/13.jpeg"  height="500px"></p>

### 🔔 Notification (Running Timer)
<p align="center"><img src="https://github.com/ritish18089/SaiketTask5/blob/main/14.jpeg"  height="500px"></p>

### 🎉 Timer Completion Notification
<p align="center"><img src="https://github.com/ritish18089/SaiketTask5/blob/main/15.jpeg"  height="500px"></p>

## ⚙ Installationw
### Prerequisites
- Android Studio Hedgehog or later
- JDK 17 or above
- Android SDK 35
- Gradle 8+
- Android Device or Emulator (Android 10+)

### Steps
- Clone the repository: git clone https://github.com/ritish18089/SaiketTask5.git
- Open the project in Android Studio.
- Sync Gradle dependencies.
- Build the project: Build > Make Project
- Run the application on an emulator or physical Android device.

### Minimum Requirements
- Android Version: Android 10 (API 29) or above
- RAM: 2 GB minimum
- Storage: 50 MB free space
-Internet: Not required (except for feedback email functionality)

## 🎯 Future Enhancements
- AI-based Productivity Insights and Smart Activity Recommendations
- Cloud Backup and Cross-Device Synchronization
- Google Calendar and Microsoft Outlook Integration
- Shared Timers and Team Collaboration Features
- Advanced Analytics with Weekly and Monthly Productivity Reports
- Voice Commands and Voice-Controlled Timer Management

## 📱Download APK
Click below to download the latest version of FocusFlow
[APK File](https://github.com/ritish18089/SaiketTask5/releases/download/v1.0.0/FocusFlow.apk)

