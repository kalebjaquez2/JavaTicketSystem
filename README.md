# JavaTicketSystem
A command-line application for calculating ticket prices and includes details like discounts for various groups (students, alumni, military, etc.), error checking, and extra features like parking.
Prices-based on 2023-2024 season

Features
Calculates ticket prices based on seating level.
Offers discounts for:
Students (50% discount)
Alumni (5% discount)
Faculty/Staff (10% discount)
Military (20% discount)
Allows the purchase of optional parking passes.
Validates user input for seating selection and ticket quantity.
Provides a summary of the total price, including taxes, processing fees, and any required donations.

How to run code:
Clone the repository-
git clone https://github.com/kalebjaquez2/JavaTicketSystem.git

Navigate to the project directory:
Copy code
cd JavaTicketSystem in command line

Compile and run the program:
javac Proj3.java in command Line
java Proj3 in command line

Sample Output-

** Welcome to the KSU Ticket App for the 2024 season **
     !!! Show your Purple Pride !!! 
(Application developed by Kaleb Jaquez)

Please select from the following categories:
1) Student
2) Alumni
3) Faculty or Staff
4) Military
5) General Public
Selection: 2

Please select from the following seat locations:
1) View Level
2) Premium View Level
3) Red Zone Level
4) Chairbacks Level (non-students only)
Selection: 3

How many tickets would you like to purchase? 2
Would you like to purchase a parking pass for an additional $250? (Y or N): N

You ordered 2 Red Zone Level seat(s) WITHOUT parking
Tickets: $680.00
Discount: $34.00
Processing Fee: $7.00
Subtotal: $653.00
Sales Tax: $50.63
Required Donation: $250.00
Total: $953.63


Future Implementations: 

Add functionality to save the order details to a file.

Implement user authentication for different user groups.

Create a graphical interface for a better user experience

