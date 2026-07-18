# Interview & Viva Questions

## 1. What is an Intent in Android?
An Intent is a messaging object you can use to request an action from another app component. It is mainly used to start activities, start services, and deliver broadcasts.

## 2. Differentiate between Explicit and Implicit Intents.
- **Explicit Intent:** Specifies the exact component to be started by its class name. Used for navigation within your own app.
- **Implicit Intent:** Does not name a specific component but declares a general action to perform, allowing components from other apps to handle the request (e.g., opening a web page or picking a file).

## 3. How do you pass data between Activities?
Data is passed using the `putExtra()` method of the `Intent` object. On the receiving side, data is retrieved using methods like `getStringExtra()`, `getIntExtra()`, etc., from the `getIntent()` object.

## 4. What is a Splash Screen?
A splash screen is the initial screen shown when an app starts, usually displaying the app's logo or name. It often performs initialization tasks in the background.

## 5. What is the role of the AndroidManifest.xml file?
It provides essential information about the app to the Android system, including the package name, components (activities, services, etc.), permissions required, and hardware/software features used.

## 6. How do you handle file picking in modern Android?
Using `ActivityResultLauncher` with `ActivityResultContracts.GetContent()` is the recommended way to pick files (images, videos, etc.) from the system.

## 7. What is Material Design 3?
Material Design 3 (also known as Material You) is the latest version of Google's design system, featuring updated components, color systems (like dynamic color), and improved typography.

## 8. Why is input validation important?
Validation ensures that the app receives data in the expected format, preventing crashes, security vulnerabilities, and ensuring a better user experience by guiding the user to correct errors.

## 9. What is a ViewBinding?
ViewBinding is a feature that allows you to more easily write code that interacts with views. It generates a binding class for each XML layout file, providing direct references to all views with an ID.

## 10. How do you use Implicit Intents to open a file?
You create an Intent with `ACTION_VIEW`, set the data URI and the MIME type using `setDataAndType()`, and grant read URI permissions using `FLAG_GRANT_READ_URI_PERMISSION`.
