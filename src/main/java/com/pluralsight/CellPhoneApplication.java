package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone newPhoneWhoDis = new CellPhone();

        Scanner input = new Scanner(System.in);

        /*
       What is the serial number? 2597153
       What model is the phone? iPhone 15 Pro Max
       Who is the carrier? Verizon
       What is the phone number? 888-555-1234
       Who is the owner of the phone? Sandra
         */

        newPhoneWhoDis.setSerialNumber(Integer.parseInt(askQuestion(input, "What is the serial number?")));
        newPhoneWhoDis.setModel(askQuestion(input, "What model is the phone?"));
        newPhoneWhoDis.setCarrier(askQuestion(input, "Who is the carrier?"));
        newPhoneWhoDis.setPhoneNumber(askQuestion(input, "What is the phone number?"));
        newPhoneWhoDis.setOwner(askQuestion(input, "Who is the owner of the phone?"));

        System.out.println("Serial Number: " + newPhoneWhoDis.getSerialNumber());
        System.out.println("Model: " + newPhoneWhoDis.getModel());
        System.out.println("Carrier: " + newPhoneWhoDis.getCarrier());
        System.out.println("Phone Number: " + newPhoneWhoDis.getPhoneNumber());
        System.out.println("Owner: " + newPhoneWhoDis.getOwner());

    }

    public static String askQuestion(Scanner scanner, String question) {
        System.out.println(question);
        return scanner.nextLine().trim();
    }
}
