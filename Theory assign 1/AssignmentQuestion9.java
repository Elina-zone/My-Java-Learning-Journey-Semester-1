import java.util.Scanner;

public class AssignmentQuestion9 {
    public static void main(String[] args) {
//declaring variables and also use the given data
        double loanAmount = 1200000;             //P=loan Amount
        double annualInterest = 12;          //annual rate/12
        int years = 5;                           //loan duration
//Calculate monthly interest rate and total months
        double monthlyRate = (annualInterest / 100) / 12;
        int totalMonths = years * 12;
//Apply the formula for monthly payment
        double payment = (loanAmount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -totalMonths));
//Display the result
        System.out.println("Hassan's Monthly Car Loan Installment: Rs. " + payment);
        }
    }