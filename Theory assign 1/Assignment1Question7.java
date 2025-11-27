import java.util.Scanner;

public class Assignment1Question7 {
    public static void main(String[] args) {

//declaring and Given data
        int i = 50000;           //Ahmed's monthly salary
        int e = 37500;         //Ahmed's monthly expenses
        int lc = 100000;      //Price of the laptop
//Calculate monthly savings
        int s = i - e;
//Calculate number of months required to buy the laptop
        int mr = lc / s;
// Display the results
        System.out.println("Ahmed's Monthly Savings: " + s);
        System.out.println("Months Required to Buy Laptop: " + mr);
        }
    }                                                                                          