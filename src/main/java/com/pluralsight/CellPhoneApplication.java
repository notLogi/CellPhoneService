package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Cellphone phone = new Cellphone();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is the serial number? ");
        phone.setSerialNumber(myScanner.nextInt());
        myScanner.nextLine();
        System.out.println("What mode is the phone? ");
        phone.setModel(myScanner.nextLine());
        System.out.println("Who is the carrier?");
        phone.setCarrier(myScanner.nextLine());
        System.out.println("What is the phone number?");
        phone.setPhoneNumber(myScanner.nextLine());
        System.out.println("Who is the owner of the phone?");
        phone.setOwner(myScanner.nextLine());
        System.out.println(phone.getSerialNumber() + " " + phone.getPhoneNumber() + " " + phone.getModel() + " " + phone.getCarrier() + " " + phone.getOwner());
    }
}
