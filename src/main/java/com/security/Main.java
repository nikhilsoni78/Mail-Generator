package com.security;

import jakarta.mail.MessagingException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please Enter Your email Address");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        try{
            System.out.println("Sending Email");
            String generatedOTP = EmailService.getOtp();
            String generated = EmailService.generateOTP(email,generatedOTP);
            System.out.println(generated);
            System.out.println("Enter OTP");
            String otp = scanner.nextLine();
            if(otp.equals(generatedOTP)){
                System.out.println("Login Successfully");
            }else {
                System.out.println("Login Failed Wrong OTP");
            }
        }catch (MessagingException e){
            System.out.println("Email sent fail " + e.getMessage());
        }

        scanner.close();


    }
}