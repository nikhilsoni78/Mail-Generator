# Mail-Generator
Java Email OTP Login System

This is a simple Java command-line application that sends a One-Time Password (OTP) to a user's email before they can log in. The user must enter the correct OTP to complete the login successfully.

The main purpose of this project is to learn how to send emails from a Java application, specifically using the Jakarta Mail API and Gmail's SMTP server.

Features

Generates a random 6-digit OTP.

Sends the OTP to the user's provided email address.

Verifies the OTP entered by the user to complete the login process.

Technology Used

Java

Jakarta Mail API: The main library for sending emails from Java.

Gmail SMTP Server: Used as the email service provider (Note: Not recommended for real-world projects).

!! IMPORTANT SETUP !!

You must complete this setup before running the project, otherwise, it will not work.

You cannot use your direct Gmail password in the code. You must generate an "App Password" from Google.

Turn ON 2-Step Verification:

Go to your Google Account settings (myaccount.google.com) and open the "Security" tab.

Turn "2-Step Verification" ON.

Generate an App Password:

In the same "Security" tab, click on "App Passwords".

Under "Select app," choose "Other (Custom name)" and give it a name (e.g., "Java Mail App").

Google will generate a 16-character password. Copy this password.

Update the Code:

Open the EmailService.java file.

In the FROM_EMAIL variable, enter your Gmail address.

In the APP_PASSWORD variable, paste the 16-character App Password you just generated.

Now you can compile and run the project!
