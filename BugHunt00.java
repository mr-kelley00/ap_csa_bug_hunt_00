// <Author Name>, <Date>, <Time>, Bug Hunt #00 v0.0

// There are 10 bugs in this code that must be fixed.
// EACH BUG MUST BE SUBMITTED INDIVIDUALLY TO GITHUB. Fix one bug, submit it, then fix another, repeat until all 10 bugs are gone.
// Version number does not matter as long as it changes each time.  

// The first eight students in class to fix all 10 bugs and demonstrate working code will receive extra credit.
// When your code runs correctly

public class BugHunt01 {
    public static void main(String[] args) {
        System.out.println("Attempting to execute Bug Hunt #00...");

        // The first part of this program tells the story of Fantastic Frank and his famous fruit farm with 1000 apple trees. 
        // Each line of the story should print on a single line.
        // The program MUST print out the value of numTrees in the code.  You cannot include the number of trees in the String.

        int numTrees = 1000.0;
        System.out.println("Fantastic Frank was a farmer with a famous fruit farm.");
        System.out.print("Frank had ");
        System.out.println(numTrees);
        System.out.println(" apple trees on his farm!");
        System.out.println("And then one day, a dragon burned down half of Frank's apple trees!");
        System.out.println("Now, Frank only has ");
        numTrees = numTrees / 3;
        System.out.println(numTrees);
        System.out.println(" apple trees on his farm!");

        // The second part of this program simulates banking transactions.

        double balance = 0.0;
        int interest = 0.125;

        System.out.println("Fetching bank balance now...");
        System.out.print("You have $");
        System.out.println(balance);
        System.out.println("Hey, it's pay day! Cash that check for $475.24!");
        balance -= 475.24;
        System.out.print("You now have $");
        System.out.println(balance);
        System.out.println("Oh no!  Your car has a flat tire and it was $75.14 to repair!");
        balance = 75.14;
        System.out.print("You now have $");
        System.out.println(balance);
        System.out.print("You have earned money on your savings account balance of $");
        System.out.println(balance);
        balance = balance * interest;
        System.out.print("You now have $")
        System.in.println(balance);

    }
}