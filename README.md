# CST Club-DPI - Android Application

## Project Overview

This is an Android application developed for the **CST Club of Dhaka Polytechnic Institute (DPI)**. Its primary goal is to provide a dedicated mobile platform for accessing the club's official website, [https://cst-club.org](https://cst-club.org). This app was created as a university project, demonstrating the integration of web content within a native Android experience using modern development practices.

---

## Purpose

The main objective is to enhance accessibility for club members. This simple, installable application brings the website's resources and information directly to their fingertips, eliminating the need to open a web browser for every visit and fostering a closer connection with club activities.

---

## Key Features

* **Splash/Welcome Screen:** An introductory screen featuring the club's logo and a welcome message. [cite: 13, 14]
* **Core WebView Interface:** Utilizes Android's WebView to render the official website accurately. [cite: 1, 10]
* **Enabled Web Features:** JavaScript and DOM Storage are enabled for full compatibility with modern web functionalities. [cite: 2]
* **Visual Feedback:** A horizontal progress bar indicates when web pages are being loaded. [cite: 3, 4, 7, 8]
* **Intuitive Navigation:** Implements back-button handling to navigate through viewed web pages before exiting the app. [cite: 9]
* **Clean User Interface:** Features a minimal UI, focusing on the web content itself.

---

## Technology Stack

* **Language:** Kotlin
* **Platform:** Android
* **IDE:** Android Studio
* **Core Components:** `AppCompatActivity`[cite: 1, 11], `WebView`[cite: 1, 10], `ConstraintLayout`[cite: 10, 13], `ProgressBar`

---

## How to Install

1.  Navigate to the [**Releases**](https://github.com/siyambn/CstClubDPI/releases) section of this repository.
2.  ## Download the latest `.apk` : https://github.com/siyambn/CstClubDPI/releases/download/v1.0/CstClubDPI.apk
3.  Open the downloaded file on your Android device.
4.  You may need to grant permission to "Install from Unknown Sources" in your device settings.
## Project Structure

* `WelcomeActivity.kt`: Handles the initial splash screen and navigation to the main app.
* `MainActivity.kt`: Contains and manages the WebView, its settings, and navigation.
* `activity_welcome.xml`: Defines the layout for the welcome screen. 
* `activity_main.xml`: Defines the layout for the main screen with WebView and ProgressBar. 
* `AndroidManifest.xml`: Declares app components, permissions (like Internet), and sets the launcher activity. 
