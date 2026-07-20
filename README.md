# Intent Transfer Demo - 💫  Smart Intent Transfer
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
- Splash Screen Navigation
- Text Transfer Functionality
- Video Selection & Transfer
- Video Preview Playback
- Image Selection & Transfer
- Image Preview Display
- File Selection & Transfer
- File Preview & File Information
- Explicit Intent Data Passing
- User Input Validation
- Theme Switching (Light/Dark)
- Settings Module
- About App
- Help Center
- Send Feedback via Email
- Privacy Policy
- Terms & Conditions

### UI Testing
- Material Design 3 Consistency
- Responsive Layout
- Button Alignment
- Text Field Validation
- Icon Visibility
- Screen Navigation
- Toolbar Consistency
- Theme UI Verification
- Preview Screen Layout
- Bottom Navigation Functionality

### Compatibility Testing
- Android API Level 24+
- Different Screen Sizes
- Portrait Orientation
- Landscape Orientation
- Various Android Versions
- Different Device Manufacturers

### Performance Testing
- Application Launch Time
- Media Loading Performance
- Image Rendering Speed
- Video Playback Performance
- File Loading Performance
- Activity Transition Speed
- Memory Usage
- Smooth UI Responsiveness
  
### Security Testing
- Secure File URI Handling
- Intent Data Validation
- Invalid Input Handling
- Unsupported File Type Handling
- Permission Request Validation
- Application Stability

### Integration Testing
- Activity Result API Integration
- Explicit Intent Communication
- SharedPreferences Integration
- Device Storage Access
- Gallery Integration
- File Manager Integration
- Email Intent Integration

### User Acceptance Testing (UAT)
- Easy Navigation
- User-Friendly Interface
- Correct Data Transfer
- Accurate Media Preview
- Theme Preference Persistence
- Overall User Experience
- Stable Application Behavior

## 📸 Screenshots
### 📱 Splash Screen
<p align="center"><img src="https://github.com/ritish18089/SaiketTask4/blob/main/1.jpg"  height="500px"></p>

### 🎥 Video Transfer Screen
<p align="center"><img src="https://github.com/ritish18089/SaiketTask4/blob/main/2.jpg"  height="500px"></p>

### ▶️ Video Preview Screen
<p align="center"><img src="https://github.com/ritish18089/SaiketTask4/blob/main/3.jpg"  height="500px"></p>

### 🖼️ Image Transfer Screen
<p align="center"><img src="https://github.com/ritish18089/SaiketTask4/blob/main/4.jpg"  height="500px"></p>

### 🖼️ Image Preview Screen
<p align="center"><img src="https://github.com/ritish18089/SaiketTask4/blob/main/5.jpg"  height="500px"></p>

### 📄 File Transfer Screen
<p align="center"><img src="https://github.com/ritish18089/SaiketTask4/blob/main/6.jpg"  height="500px"></p>

### 📄 File Preview Screen
<p align="center"><img src="https://github.com/ritish18089/SaiketTask4/blob/main/7.jpg"  height="500px"></p>

### ⚙️ Settings Screen
<p align="center"><img src="https://github.com/ritish18089/SaiketTask4/blob/main/8.jpg"  height="500px"></p>

### ℹ️ About App Screen
<p align="center"><img src="https://github.com/ritish18089/SaiketTask4/blob/main/9.jpg"  height="500px"></p>

### ❓ Help Center Screen
<p align="center"><img src="https://github.com/ritish18089/SaiketTask4/blob/main/10.jpg"  height="500px"></p>

### 🔒 Privacy Policy Screen
<p align="center"><img src="https://github.com/ritish18089/SaiketTask4/blob/main/11.jpg"  height="500px"></p>

### 📄 Terms & Conditions Screen
<p align="center"><img src="https://github.com/ritish18089/SaiketTask4/blob/main/12.jpg"  height="500px"></p>

## ⚙ Installationw
### Prerequisites
- Android Studio Hedgehog or later
- JDK 17 or above
- Android SDK 35
- Gradle 8+
- Android Device or Emulator (Android 7.0+)

### Steps
- Clone the repository: git clone https://github.com/ritish18089/IntentTransferDemo.git
- Open the project in Android Studio.
- Sync Gradle dependencies.
- Build the project: Build > Make Project
- Connect an Android device or start an Android Emulator.
- Click **Run ▶** to install and launch the application.

### Minimum Requirements
- Android Version: Android 7.0 (API 24) or above
- RAM: 2 GB minimum
- Storage: 50 MB free space
- Internet: Not required (except for Send Feedback via Email)
- Permissions:
  - Read Media Images
  - Read Media Video
  - Read External Storage (for older Android versions)

## 🎯 Future Enhancements
- Implement Bluetooth and Wi-Fi Direct for direct device-to-device data transfer.
- Add cloud integration (Firebase or Google Drive) for secure media and file sharing.
- Introduce user authentication to provide secure and personalized access.
- Support QR code-based device pairing for faster and easier file transfers.
- Enable transfer history with search, filtering, and recently shared items.
- Add multi-language support to improve accessibility for users across different regions.

## 📱Download APK
Click below to download the latest version of Intent Transfer Demo
[APK File](https://github.com/ritish18089/SaiketTask4/releases/download/v1.0.0/Intent.apk)

