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
- **IDE:** Android Studio
- **UI Design:** XML Layouts
- **Design System:** Material Design 3
- **Framework:** Android SDK
- **Navigation:** Explicit Intents
- **Media Selection:** Activity Result API
- **Data Storage:** SharedPreferences
- **Minimum SDK:** API 24 (Android 7.0)
- **Target SDK:** Latest Android SDK

## 📂 Architecture
This architecture represents:
- **User Interface Layer** – All Activities and screens displayed to the user.
- **Application Layer** – Business logic including Explicit Intents, navigation, validation, and theme management.
- **Android Services Layer** – Built-in Android components such as the Activity Result API, Content Resolver, VideoView, ImageView, and File Provider.
- **Local Storage Layer** – SharedPreferences used to save the selected theme and other app preferences.
- **Device Storage Layer** – External storage where images, videos, and documents are selected from.
<img src="https://github.com/ritish18089/SaiketTask4/blob/main/itd.png"  height="1000px" width="1000px" >

## 🎯  Application Work Flow
<img src="https://github.com/ritish18089/SaiketTask4/blob/main/idts.png" height="1000px" width="1000px" >

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

