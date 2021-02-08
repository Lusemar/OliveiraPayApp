/*
Name: Lusemar Oliveira
Class: COP2800 - Programming in Java 
Programming Assignment #3: Payroll Application
Due date: Friday, January 29, 2021
Program Description: Write a program that reads the following information and prints a payroll statement with
Employee’s name (e.g. John Doe),Number of hours worked in a week (e.g. 40) Hourly pay rate (e.g. 15.50)
Federal tax withholding rate (e.g. 15%), State tax withholding rate (e.g. 5%) and then print all user entered information
and in addition the gross pay, fed withholding dollar amount, state withholding dollar amount, total deductions, and net pay.
 */
package oliveirapayapp; // Here is the package where the program is located.

import java.util.Scanner; // This is a class in the Java API used to create a Scanner object.

public class OliveiraPayApp { // Here is the our class.

    public static void main(String[] args) { // Here is the main method, it's where the program executes.
        // Variables declared and intialized. 
        String emploeesName; // String variable declared.
        double workedHourPerWeek, hourPayRate, federalTaxRate, stateTaxRate, federalWithholdingValeu, grossPayValeu,stateTaxRateValue, netPayValue = 0.0; // Double variable declared and incialized.
        int splitPeople, splitAnswer = 0; // Integer variable declared and incialized.
                                
        // User input
        Scanner input = new Scanner(System.in); // This is the escanner function that we imported.
        System.out.println("Please, Enter the Employee\'s Name: "); // This will print the message that the user will see.
        emploeesName = input.next(); // Storing the user input into a String variable.
            if(!emploeesName.matches("[a-zA-Z_]+"))System.out.println("There is an Error, You Have Entered an Invalid Input!\n");// This is the if condition that will check if the user input is a valid Name, if It's in the a to z range, lower case or upper case. And if it is, will print a message to the user.            
            
        System.out.println("Please, Enter the Number of Hours Worked in a Week: "); // This will print the message that the user will see.
        workedHourPerWeek = input.nextDouble(); // Storing the user input into a double variable.
             if(workedHourPerWeek < 0)System.out.println("There is an Error, You Have Entered a Negative Number!\n"); // This is the if condition that will check if the user input is a negative value. And if it is, will print a message to the user.
        
        System.out.println("Please, Enter the Hourly Pay Rate: "); // This will print the message that the user will see.
        hourPayRate = input.nextDouble(); // Storing the user input into a double variable.
            if(hourPayRate < 0)System.out.println("There is an Error, You Have Entered a Negative Number!\n");// This is the if condition that will check if the user input is a negative value. And if it is, will print a message to the user.            
            
        System.out.println("Please, Enter the Federal Tax Withholding Rate Percentage: ");// This will print the message that the user will see.
        federalTaxRate = input.nextDouble();// Storing the user input into a double variable.
            if(federalTaxRate < 0)System.out.println("There is an Error, You Have Entered a Negative Number!\n");// This is the if condition that will check if the user input is a negative value. And if it is, will print a message to the user.
            
        System.out.println("Please, Enter the State Tax Withholding Rate Percentage: ");// This will print the message that the user will see.
        stateTaxRate = input.nextDouble();// Storing the user input into a double variable.
            if(stateTaxRate < 0)System.out.println("There is an Error, You Have Entered a Negative Number!\n");// This is the if condition that will check if the user input is a negative value. And if it is, will print a message to the user.
        
        grossPayValeu = workedHourPerWeek * hourPayRate; // Here is where we find out the Gross Pay Value multipling the week worked hours by Hour pay rate. 
        federalWithholdingValeu = (grossPayValeu * (federalTaxRate/100)); // Here is where we find out the Federal Tax Withholding Rate Percentage Value multiplying the Gross Pay Value by Federal Tax Rate divided by one hundred.
        stateTaxRateValue = (grossPayValeu * (stateTaxRate/100));// Here is where we find out the State Tax Rate Percentage Value multiplying the Gross Pay Value by State Tax Rate divided by one hundred.
        netPayValue = (grossPayValeu - (federalWithholdingValeu + stateTaxRateValue)); // Here is where we find out the Net Pay Value subtracting the sum of Federal Tax Rate Value and State Tax value from the Gross Pay Value.
        
        //// Here is where we out put the Information.
        System.out.println("_____________________________________________________________"); // This is just to print a line to help to separate the content;
        System.out.println("Employee Name: " + emploeesName);  // This is a simple print output information concatenated with a variable.
        System.out.printf("Hours Worked per Week: %.1f\n" , workedHourPerWeek); // This is a formatted output concatenated with a double variable with it's specific parameters. (No a specific precition to the left of the dot and one decimal digit to the right of the dot).
        System.out.printf("Pay Rate per Hour: $%.2f\n", hourPayRate); // This is a formatted output concatenated with a double variable with it's specific parameters. (No a specific precition to the left of the dot and two decimal digits to the right of the dot).
        System.out.printf("Gross Pay per Week: $%.2f\n", grossPayValeu); // This is a formatted output concatenated with a double variable with it's specific parameters. (No a specific precition to the left of the dot and two decimal digits to the right of the dot).
        System.out.println("Deductions:"); // This is a simple print output information.
        System.out.printf("\tFederal Withholding (%.1f%%): $%.2f\n", federalTaxRate, federalWithholdingValeu); // This is a formatted output concatenated with a double variables with it's specific parameters. (No a specific precition to the left of the dot and one decimal digit to the right of the dot for the first variable and not a specific precition to the left of the dot and two decimal digits to the right of the dot for the second variable).
        System.out.printf("\tState Withholding (%.1f%%): $%.2f\n", stateTaxRate, stateTaxRateValue); // This is a formatted output concatenated with a double variables with it's specific parameters. (No a specific precition to the left of the dot and one decimal digit to the right of the dot for the first variable and not a specific precition to the left of the dot and two decimal digits to the right of the dot for the second variable).
        System.out.printf("\tTotal Deduction: $%.2f\n", (federalWithholdingValeu + stateTaxRateValue)); // This is a formatted output concatenated with a double variable with it's specific parameters. (No a specific precition to the left of the dot and two decimal digits to the right of the dot).
        System.out.printf("Net Pay: $%.2f\n", (netPayValue)); // This is a formatted output concatenated with a double variable with it's specific parameters. (No a specific precition to the left of the dot and two decimal digits to the right of the dot).
    }    
}
