package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();
        CellPhone cellPhone3 = new CellPhone(23232, "Huawei", "Verizon", "999-999-9999", "Will");

        Scanner myScanner = new Scanner(System.in);

        inputInfo(myScanner, cellPhone1);
        inputInfo(myScanner, cellPhone2);
        display(cellPhone1);
        display(cellPhone2);
        cellPhone1.dial(cellPhone2.getPhoneNumber());
        display(cellPhone3);

        myScanner.close();
    }
    public static void display(CellPhone phone){
        System.out.println("Serial Number: " + phone.getSerialNumber() + "\nPhone number: " + phone.getPhoneNumber() + "\nModel: " + phone.getModel() + "\nCarrier: " + phone.getCarrier() + "\nOwner: " + phone.getOwner());

    }
    public static void inputInfo(Scanner scanner, CellPhone phone){
        System.out.println("What is the serial number? ");
        phone.setSerialNumber(scanner.nextInt());
        scanner.nextLine();
        System.out.println("What model is the phone? ");
        phone.setModel(scanner.nextLine());
        System.out.println("Who is the carrier?");
        phone.setCarrier(scanner.nextLine());
        System.out.println("What is the phone number?");
        phone.setPhoneNumber(scanner.nextLine());
        System.out.println("Who is the owner of the phone?");
        phone.setOwner(scanner.nextLine());
    }
}
