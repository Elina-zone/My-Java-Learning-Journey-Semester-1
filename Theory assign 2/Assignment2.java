import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         //Main menu loop
        while (true) {
            System.out.println("------>Main Menu Assignemnt-2<------");
            System.out.println("1 - Question-1");
            System.out.println("2 - Question-2");
            System.out.println("3 - Question-3");
            System.out.println("4 - Question-4");
            System.out.println("5 - Question-5");
            System.out.println("Press option (1-5) to execute the program and Press 0 to Exit");
            System.out.print("Enter your option: ");
            int userChoice = input.nextInt();

            if (userChoice == 0) { // Exit condition
                System.out.println("Exiting Program");
                break;
            }
            // Execute selected Question Method
            switch (userChoice) {
                case 1:
		    System.out.println("-------Executing Question - 1-------");
                    validateSSN(input);
                    break;
                case 2:
  		    System.out.println("-------Executing Question - 2-------");
                    identifyMajorStatus(input);
                    break;
                case 3:
		    System.out.println("------Executing Question - 3-------");
                    generatePlateNumber();
                    break;
                case 4:
		    System.out.println("-------Executing Question - 4-------");
                    decimalToBinary(input);
                    break;
                case 5:
		    System.out.println("-------Executing Question - 5-------");
                    globalWarmingQuiz(input);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
                input.close(); // Close scanner to prevent memory leaks
    }
   
     
/* Question – 1:									
Write a program that prompts the user to enter a Social Security number in the format DDD-DD-DDDD, where D is a digit. Your program should check whether the input is valid. Here are sample runs:
Enter a SSN: 232-23-5435
232-23-5435 is a valid social security number
Enter a SSN: 23-23-5435
23-23-5435 is an invalid social security number */

    // Question 1: Validate Social Security Number (SSN)
    public static void validateSSN(Scanner input) {
        System.out.print("Enter a SSN (DDD-DD-DDDD): ");
        String string = input.next();
        // Regex to check valid SSD format
        if (string.matches("\\d{3}-\\d{2}-\\d{4}")) {
            System.out.println(string + " is a valid SSN Security Number");
        } else {
            System.out.println(string + " is not a valid SSN Security Number");
        }
    }

/* Question – 2:										______
Write a program that prompts the user to enter two characters and displays the major and status represented in the characters. The first character indicates the major and the second is number character 1, 2, 3, 4, which indicates whether a student is a freshman, sophomore, junior, or senior. Suppose the following characters are used to denote the majors:
M: Mathematics                             C: Computer Science                 I: Information Technology
Sample Run
Enter two characters: M1
Mathematics Freshman
Enter two characters: T3
Invalid input */


    // Question 2: Identify Major & Status
    public static void identifyMajorStatus(Scanner input) {
        System.out.print("Enter two characters (Major & Year): ");
        input.nextLine();
        String userInput = input.nextLine();

        if (userInput.length() != 2) {// Validate input length
            System.out.println("Invalid input length. Please enter exactly two characters.");
            return;
        }
        char major = Character.toUpperCase(userInput.charAt(0));
        char status = userInput.charAt(1);
        // Determine Major
        String majorName = "Invalid";
        if (major == 'M') {
            majorName = "Mathematics";
        } else if (major == 'C') {
            majorName = "Computer Science";
        } else if (major == 'I') {
            majorName = "Information technology";
        }
        // determine Status year
        String statusName = "Invalid";
        if (status == '1') {
            statusName = "Freshman";
        } else if (status == '2') {
            statusName = "Sophomore";
        } else if (status == '3') {
            statusName = "junior";
        } else if (status == '4') {
            statusName = "senior";
        }
        // print result
        if (majorName.equals("Invalid") || statusName.equals("Invalid")) {
            System.out.println("Invalid input");
        } else {
            System.out.println(majorName + " " + statusName);
        }
    }

    // Question 3) generate number plate
    public static void generatePlateNumber() {

        StringBuilder numberPlate = new StringBuilder();
        // generate three random letters
        for (int i = 0; i < 3; i++) {
            char letter = (char) ('A' + (int) (Math.random() * 26));
            numberPlate.append(letter);
        }
        // generate 4 random digits (1-9)
        for (int i = 0; i < 4; i++) {
            int digit = (int) (Math.random() * 10);
            numberPlate.append(digit);
        }
        System.out.println("Generate number plate: " + numberPlate);
    }

/* Question – 4:										______
Write a program that prompts the user to enter a decimal integer and displays its corresponding binary value. Don’t use Java’s Integer.toBinaryString(int) in this program. */


    // Question 4) decimal to binary
    public static void decimalToBinary(Scanner input) {
        System.out.println("Enter a decimal Number: ");
        int num = input.nextInt();
        input.nextLine();
        if (num == 0) {// handle zero case
            System.out.println("0");
            return;
        }
        if (num == 1) {// handle one case
            System.out.println("1");
            return;
        }
        StringBuilder binary = new StringBuilder();
        while (num > 1) {
            binary.insert(0, num % 2);// insert gets binary digit in reversed order
                                      // we can also do this using append(), reverse() method
            num /= 2;
        }
        System.out.println(binary.toString());
    }
/* Question – 5:										______
The controversial issue of global warming has been widely publicized by the film “An Inconvenient Truth,” featuring former Vice President Al Gore. Mr. Gore and a U.N. network of scientists, the Intergovernmental Panel on Climate Change, shared the 2007 Nobel Peace Prize in recognition of “their efforts to build up and disseminate greater knowledge about man-made climate change.” Research both sides of the global warming issue online (you might want to search for phrases like “global warming skeptics”). Create a five-question multiple choice quiz on global warming, each question having four possible answers (numbered 1–4). Be objective and try to fairly represent both sides of the issue. Next, write an application that administers the quiz, calculates the number of correct answers (zero through five) and returns a message to the user. If the user correctly answers five questions, print “Excellent”; if four, print “Very good”; if three or fewer, print “Time to brush up on your knowledge of global warming,” and include a list of some of the websites where you found your facts */

    // Question 5) Global warming quiz
    public static void globalWarmingQuiz(Scanner input) {
        int score = 0;
        // Q 1
        System.out.println("1. What is the primary greenhouse gas responsible for global warming?");
        System.out.println("1. Nitrogen \n2. oxygen\n3. Argon\n4. carbon dioxide");
        System.out.print("Enter your Choice (1-4): ");
        if (input.nextInt() == 4) {
            System.out.println("Your answer is correct");
            score++;
        } else {
            System.out.println("Your answer is wrong");
        }
        // Q 2
        System.out.println("2. Which of the following is a common argument made by global warming skeptics?");
        System.out.print(
                "1. The Earth's climate is not changing\n2. Climate change is a natural cycle\n3. CO2 has no impact on temperature\n4. Renewable energy is unnecessary\nEnter Your choice: ");
        if (input.nextInt() == 2) {
            System.out.println("your answer is correct");
            score++;
        } else {
            System.out.println("your answer is wrong");
        }
        // Q 3
        System.out.println("3. What is the main purpose of paris Agreement? ");
        System.out.print(
                "1. To reduce global carbon emission\n2. To increse fossil fuel production\n3. To stop Economic growth\n4. To regulate population\n Enter Your choice: ");
        if (input.nextInt() == 1) {
            System.out.println("Your answer is correct");
            score++;
        } else {
            System.out.println("Your answer is wrong");
        }

        // Q 4
        System.out.println("4. How do climate models predict future climate conditions?");
        System.out.print(
                "1. By using past climate trends\n2. By making random guesses\n3. By relying solely on government policies\n4. By ignoring greenhouse gas effects\n Enter Your choice: ");
        if (input.nextInt() == 1) {
            System.out.println("Your answer is correct");
            score++;
        } else {
            System.out.println("Your answer is wrong");
        }
        // Q 5
        System.out.println("5. What is one possible consequence of global warming?");
        System.out.print(
                "1. Decreased hurricane intensity\n2. More stable sea levels\n3. Rising global temperatures\n4. More Arctic ice\n Enter your choice: ");
        if (input.nextInt() == 3) {
            System.out.println("Your answer is correct");
            score++;
        } else {
            System.out.println("Your answer is wrong");
        }
        System.out.println("Your score:" + score + "/5");
        if (score == 5) {
            System.out.println("Excellent");
        } else if (score == 4) {
            System.out.println("Very Good");
        } else {
            System.out.println("Time to brush up on your knowledge of global warming.");
            System.out.println("Recommended sources:");
            System.out.println("- https://www.ipcc.ch/");
            System.out.println("- https://climate.nasa.gov/");
            System.out.println("- https://www.skepticalscience.com/");
            System.out.println("- https://www.ncdc.noaa.gov/");
        }
    }
}
