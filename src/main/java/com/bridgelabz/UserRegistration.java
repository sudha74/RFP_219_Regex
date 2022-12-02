package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validFirstName();
        userRegistration.validSecondName();
    }

    public void validFirstName() {
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user firstname");
        String firstName = scanner.next();

        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()) {
            System.out.println("First name is valid");
        } else {
            System.out.println("First name is Invalid");
        }
    }

    public void validSecondName() {
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user second name");
        String secondName = scanner.next();

        Matcher matcher = pattern.matcher(secondName);
        if (matcher.matches()) {
            System.out.println("Second name is valid");
        } else {
            System.out.println("Second name is Invalid");
        }
    }
}
