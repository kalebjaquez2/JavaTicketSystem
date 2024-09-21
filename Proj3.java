/**
 * Proj3.java
 * EXTRA CREDIT INCLUDED
 * Kaleb Jaquez / Thursday 2:30-:4:20
 * 
 * This program helps the user get information on the price on what it would take to buy different types of tickets.
 * This program also error checks if the user does not enter the numbers within the scope.
 * At the conclusion of the code you are offered to order more tickets, or to be done and the program shuts off.
 * 
 */

import java.util.*;

public class Proj3 {
     public static void main(String [] args){
      Scanner scnr = new Scanner(System.in);

do{

    final double VIEW_LEVEL = 150;
    final double PREMIUM_VIEW_LEVEL = 340;
    final double RED_ZONE_LEVEL = 340;
    final double CHAIRBACK_LEVEL = 360;
    final double PREMIUM_LEVEL_DONO = 150;
    final double RED_ZONE_LEVEL_DONO = 250;
    final double CHAIRBACK_LEVEL_DONO = 1300;
    final double PARKING_PASS = 250;
    final double DISCOUNT_ALUMNI = 0.05;
    final double DISCOUNT_FACULTY = 0.10;
    final double DISCOUNT_MILITARY = 0.20;
    final double SALES_TAX = .0775;
    final double PROCESSING_FEE = 3.50;

    //Start of menu
System.out.println("** Welcome to the KSU Ticket App for the 2024 season **");
System.out.println("\t !!! Show your Purple Pride !!! ");
System.out.println("(Application developed by Kaleb Jaquez)");
System.out.println();

System.out.println("Please select from the following categories:");
System.out.println("1)Student");
System.out.println("2)Alumni");
System.out.println("3)Faculty or Staff");
System.out.println("4)Military");
System.out.println("5)General Public");

int firstSelection;

do {
    System.out.print("Selection:");
    firstSelection = scnr.nextInt();
    if (firstSelection < 1 || firstSelection > 5) {
        System.out.println("Invalid Selection. Please enter a number 1-5 only.");
    }
} while (firstSelection < 1 || firstSelection > 5);
System.out.println();
double discount = 0;
double processingFee = 0;
String firstSelectioString = "";
switch (firstSelection) {
    case 1:
        firstSelectioString =("Student");
        discount = 0.5;
        processingFee = 0;
        break;
    case 2:
        firstSelectioString =("Alumni");
        discount = DISCOUNT_ALUMNI;
        processingFee = PROCESSING_FEE;
        break;
    case 3:
        firstSelectioString = ("Faculty or Staff");
        discount = DISCOUNT_FACULTY;
        processingFee = PROCESSING_FEE;
        break;
    case 4:
        firstSelectioString = ("Military");
        discount = DISCOUNT_MILITARY;
        processingFee = 0;
        break;
    case 5:
        firstSelectioString =("General Public");
        discount = 0;
        processingFee = PROCESSING_FEE;
        break;
}


//Selecting seat Location
System.out.println("Please select from the following seat locations:");
System.out.println("1)View Level");
System.out.println("2)Premium View Level");
System.out.println("3)Red Zone Level");
System.out.println("4)Chairbacks Level(non-students only)");

int secondSelection;
do {
    System.out.print("Selection:");
    secondSelection = scnr.nextInt();
    if (secondSelection < 1 || secondSelection > 5) {
        System.out.println("Invalid Selection. Please enter a number 1-5 only.");
    }
} while (secondSelection < 1 || secondSelection > 5);
System.out.println();

if(secondSelection == 4 && firstSelection == 1){
    int tempSelection;
    do {
            System.out.println("Invalid Selection. Students cannot purchase Chairbacks Level.");
            System.out.print("Selection:");
            tempSelection = scnr.nextInt();
            if(tempSelection != 4){
                secondSelection = tempSelection;
            }
        
    } while (tempSelection == 4) ;
    System.out.println();
}

double dono = 0;
double secondSelectionPrice = 0;
String secondSelectioString = "";
switch (secondSelection) {
    case 1:
        secondSelectioString =("View Level");
        secondSelectionPrice = VIEW_LEVEL;
        dono = 0;
        break;
    case 2:
        secondSelectioString =("Premium View Level");
        secondSelectionPrice = PREMIUM_VIEW_LEVEL;
        dono = PREMIUM_LEVEL_DONO;
        break;
    case 3:
        secondSelectioString = ("Red Zone Level");
        secondSelectionPrice = RED_ZONE_LEVEL;
        dono = RED_ZONE_LEVEL_DONO;
        break;
    case 4:
        secondSelectioString = ("Chairback Level");
        secondSelectionPrice = CHAIRBACK_LEVEL;
        dono = CHAIRBACK_LEVEL_DONO;

        break;
}




int amountOfTickets;
double parkingPass;

System.out.print("How many tickets would you like to purchase?");
amountOfTickets = scnr.nextInt();

System.out.print("Would you like to purchase a parkig pass for an additional $" + PARKING_PASS +"?('Y' or 'N'):");
String input = scnr.next();
    if(input.equalsIgnoreCase("y")){;
        parkingPass = PARKING_PASS;
    }else{
        parkingPass = 0;
    }

    String isThereParking;
if(parkingPass == 250){
    isThereParking = "WITH";
}else{
    isThereParking = "WITHOUT";
}
double totalProcessingFee = (double)processingFee * amountOfTickets;
double totalTicketPrice = amountOfTickets * secondSelectionPrice;
double totalDiscount = totalTicketPrice * discount;
double subTotal = totalTicketPrice - totalDiscount + totalProcessingFee;
double taxableAmount = subTotal;
double totalSalesTax = SALES_TAX * taxableAmount;

double grandTotal = subTotal + totalSalesTax + dono + parkingPass  ;

System.out.println("You ordered " + amountOfTickets +" " + secondSelectioString + " seat(s) " + isThereParking + " parking");
System.out.println("Tickets: $" + String.format("%,.2f", totalTicketPrice));
System.out.println("Discount: $" + String.format("%,.2f",totalDiscount));
System.out.println("Processing Fee: $" + String.format("%,.2f", totalProcessingFee));
System.out.println("Subtotal: $" + String.format("%,.2f",subTotal));
System.out.println("Sales Tax: $" + String.format("%,.2f",totalSalesTax));
System.out.println("Required Donation: $" + String.format("%,.2f",dono));
System.out.println("Parking: $" + String.format("%.2f", (double)parkingPass));
System.out.println("Total: $" + String.format("%,.2f",grandTotal));

System.out.println("Would you like to order more tickets? ('Y' or 'N'):");
    }while (scnr.next().equalsIgnoreCase("y"));

    
}
}