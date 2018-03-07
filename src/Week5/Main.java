/*
 * @project Week5
 * @author  Osbardo Rodriguez
 * Date:    3/6/18
 */
package Week5;

/*
 * Import the Scanner java package.
 */
import java.util.Scanner;

/**
 * Define class Main.
 */
public class Main {

    public static void main( String[] args ) {

        /*
         * Write a program that takes a test score from 1-10
         * and prints the letter grade based on the score.
         *
         * A: 9 or 10
         * B: 8
         * C: 7
         * D: 6
         * F: 1-5
         *
         * Repeat the process 3 times.
         */

        // Instantiate the Scanner
        Scanner input = new Scanner( System.in );

        /*
         * Declare our variables
         */
        int score;

        for ( int counter = 0; counter < 3; counter++ ) {

            /*
             * Get the user input
             */
            System.out.print( "Please enter a number between 1-10: " );
            score = input.nextInt();

            /*
            if ( score == 9 || score == 10 ) {
                System.out.println( "You got an A!" );
            } else if ( score == 8 ) {
                System.out.println( "You got an B!" );
            } else if ( score == 7 ) {
                System.out.println( "You got an C!" );
            } else if ( score == 6 ) {
	            System.out.println( "You got an D!" );
            } else {
	            System.out.println( "You got an F!" );
            }
            */

            /*
             * The above code has a pattern that contains 2 elements:
             *
             * 1) In each if/else if statements, they all test
             *    the same variable and it is an int.
             * 2) Each test is looking for an equality on a
             *    specific integer value(s)
             *
             * When this pattern occurs, you can use a switch statement
             * instead of an if/else if chain.
             */

            switch ( score ) {
	            // Case is checking if/else if.
	            case 10:
	            case 9:
	            	System.out.println( "You got an A!" );
		            break;
	            case 8:
		            System.out.println( "You got an B!" );
		            break;
	            case 7:
		            System.out.println( "You got an C!" );
		            break;
	            case 6:
		            System.out.println( "You got an D!" );
		            break;
				// default is the else.
	            default:
		            System.out.println( "You got an F!" );
		            // the break isn't necessary for the default, but it doesn't hurt to have
		            break;
            }

            /*
             * The switch statement acts as another form of a specialized
             * if/else if statement. Within each case, the code supporting it
             * ends with a "break" statement.
             *
             * "break" formally means "exit the body of code you are in".
             * In this case, the break means exit the switch statement at that point.
             *
             * This can also apply to loops.
             */
        }

	    /*
	     * Write a program that prints numbers from 1 to 10 but stops
	     * at a number given by the user
	     */

	    System.out.print( "What number to stop at: " );
	    int stopNumber = input.nextInt();

	    for ( int counter = 1; counter <= 10; counter++ ) {

	    	if ( counter > stopNumber ) {
	    		break;
		    }

	    	System.out.println( counter );
	    }

	    /*
	     * Write a program that prints numbers from 1 to 10 but skips
	     * a number given by the user
	     */

	    System.out.print( "What number to skip: " );
	    int skipNumber = input.nextInt();

	    for ( int counter = 1; counter <= 10; counter++ ) {

		    if ( counter == skipNumber ) {
			    continue;
		    }

		    System.out.println( counter );
	    }

	    /*
	     * Exercise 4: Calculating Sales exercise in the book (5.17 in 9th edition)
	     *
	     * An online retailer sells five products whose retail
	     * prices are as follows:
	     *
	     * Product 1: $2.98
	     * Product 2: $4.50
	     * Product 3: $9.98
	     * Product 4: $4.49
	     * Product 5: $6.87
	     *
	     * Write a program that reads a series of pairs of numbers as follows:
	     *
	     * Product number
	     * Quantity sold
	     *
	     * Your program should use a switch statement to determine the retail
	     * price for each product. It should calculate and display the total
	     * retail value of all products sold.
	     *
	     * Use a loop to determine when the program should stop looping and
	     * display the final results.
	     */
    }
}
