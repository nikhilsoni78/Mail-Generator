package com.security;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;
import java.util.Random;

public class EmailService {
    private static final String from = "Your Mail";
    private static final String pass = "App PassWord";

    public static String generateOTP(String toEmail,String otp) throws MessagingException {

        Properties props = new Properties();
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.port","587");
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.starttls.enable","true");

        Authenticator authenticator = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from,pass);
            }
        };

        Session session = Session.getInstance(props,authenticator);
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from));
        message.setRecipient(Message.RecipientType.TO,new InternetAddress(toEmail));
        message.setSubject("Your One Time Password For Login");
        message.setText("Hello \n" +
                "Your OTP is :" + otp + "\nRegards" +"\nNikhil Soni");
        Transport.send(message);
        return "Email Send Successfully " + toEmail;
    }

    public static String getOtp() {
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000);
        return String.valueOf(otp);
    }
}
