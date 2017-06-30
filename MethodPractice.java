/**
 * CS152 Lab 4 -- Welcome to Methods.
 *
 * Implement all the methods described below.
 *
 * Student name: Diego Garcia
 */
public class MethodPractice {

    /**
     * Returns the product of its arguments.
     * @param x First argument
     * @param y Second argument
     * @param z Third argument
     * @return Product of x, y and z
     */
    //G O O D
	public static int multThree( int x, int y, int z) {
        // REPLACE THE METHOD BODY

        // This is an obviously wrong return value
        // that exists only to allow the file to compile
        return x * y * z;
    }

    /**
     * Is argument negative?
     * @param x Value to check.
     * @return True if x is a negative number, false otherwise.
     */
    //G O O D
	public static boolean isNegative( int x ) {
        // REPLACE THE METHOD BODY

        // Hardcoded value will be "correct" sometimes,
        // but you must make it work for all input
    	if (x < 0)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
        //return true;
    }

    /**
     * Does the given string contain the letter G (either upper or
     * lower case)?
     * @param x String to check
     * @return True if x contains G, false otherwise.
     */
    //G O O D
	public static boolean containsG ( String x ) {
		
		boolean containsletter = true;
		x = x.toLowerCase();
		for (int i = 0; i < x.length(); i ++)
		{
			char letter = x.charAt(i);
			if (letter == 'g')
			{
				containsletter = true;
				break;
			}
			else
			{
				containsletter = false;
			}
		}
		
		if (containsletter == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

    /**
     * Where is the location of the letter G (upper or lower case) in
     * the given string?
     * @param x String to check
     * @return 0 based location of first occurrence of G in x,
     *         -1 if G is not present.
     */
    // G O O D
	public static int indexOfG( String x ) {
        int index = -1;
    	x = x.toLowerCase();
        for (int i = 0; i < x.length(); i++)
        {
        	char letter = x.charAt(i);
        	if (letter == 'g')
        	{
        		index = i;
        		break;
        	}
        }
    	// REPLACE THE METHOD BODY

        // This is an obviously wrong return value
        // that exists only to allow the file to compile
        return index;        
    }

    /**
     * This method returns a response based on the string input:
     *     Apple => Orange
     *     Hello => Goodbye!
     *     Turing => Machine
     *     Yay! => \o/
     * Any other input should be responded to with:
     *     What should I say? 
     * @param input The input string
     * @return Corresponding output string.
     */
    
	//G O O D
	public static String respond( String input ) {
        if (input == "Apple")
        {
        	//System.out.println("Orange");
        	return "Orange";
        }
        else
        {
        	if (input == "Hello")
        	{
        		//System.out.println("Goodbye!");
        		return "Goodbye!";
        	}
        	else
        	{
        		if (input == "Turing")
        		{
        			//System.out.println("Machine");
        			return "Machine";
        		}
        		else
        		{
        			if (input == "Yay!")
        			{
        				//System.out.println("\\o/");
        				return "\\o/";
        			}
        			else
        			{
        				//System.out.println("What should I say?");
        				return "What should I say?";
        			}
        		}
        	}
        }
    	// REPLACE THE METHOD BODY

        // Have to return something here to make the file compile
        //return "this string is junk";
    }

    /**
     * Average up to five positive numbers. Any non-positive values are
     * not included in the average. (Note: zero is not positive.)
     * @param a First value
     * @param b Second value
     * @param c Third value
     * @param d Fourth value
     * @param e Fifth value
     * @return Average of the positive input values. If none are positive, returns -1.
     */
	// G O O D
	public static double averagePositives( int a, int b, int c, int d, int e ) {
	     
        double sum = 0;
        int totalnum = 0;
        double average = 0;
        if (a > 0)
        {
        	sum += a;
        	totalnum += 1;
        }
        
        if (b > 0)
        {
        	sum += b;
        	totalnum += 1;
        }
        
        if (c > 0)
        {
        	sum += c;
        	totalnum += 1;
        }
        
        if (d > 0)
        {
        	sum += d;
        	totalnum += 1;
        }
        
        if (e > 0)
        {
        	sum += e;
        	totalnum += 1;
        }
        
        if (sum > 0)
        {
        	average = sum/ totalnum;
        	//System.out.println(sum);
        	//System.out.println(totalnum);
        	//System.out.println(average);
        }
        
        if (totalnum > 0)
        {
        	return average;
        	//System.out.println(average);
        }
        else
        {
        	return -1;
        }
        
            //YOU WERE WORKING ON THIS ONE!
    	// REPLACE THE METHOD BODY
    	

        // This is an obviously wrong return value
        // that exists only to allow the file to compile
        //return -4.2;        
    }


    // WRITE A METHOD FROM SCRATCH
    //
    // Write a method called doubleOddIgnoreEven that returns twice
    // odd numbers and returns even values unchanged.
    //
    // The method should take a single int argument and return an int
    //
    // Don't forget to use the public static modifiers
	public static int doubleOddIgnoreEven (int f)
    {
    	if (f % 2 == 0)
    	{
    		return f;
    	}
    	else
    	{
    		return f * 2;
    	}
    }



    // WRITE A METHOD FROM SCRATCH
    //
    // Write a method called calculateTotalPayment that takes two
    // arguments, an int meal which is the cost of a meal, and a
    // double tip which represents the tip percentage one would add to
    // the bill.   
    // The method must return a double which equals how much should be
    // paid.
    //
    // int meal must be greater than 0
    // double tip must be 0 or greater and .6 or less (no tips over 60%)
    // If either number is invalid, return -1;
    //
    // Don't forget to use the public static modifiers
	public static double calculateTotalPayment (int meal, double tip)
    {
    	double tiptimesmeal = 0;
    	double mealtotal = 0;
    	if (tip >= 0 && tip <= 0.6)
    	{
    		if (meal > 0)
    		{
    			tiptimesmeal = meal * tip;
    			mealtotal = tiptimesmeal + meal;
    			return mealtotal;
    		}
    		else
    		{
    			return -1;
    		}
    	}
    	else
    	{
    		return -1;
    	}
    }





    // This code tests your program's completeness.
    public static void main(String[] args) {
        int numCorrect = 0;

        if( multThree(1,2,3) == 6 ) { numCorrect++; }
        if( multThree(4,-5, 2) == -40 ) { numCorrect++; }
        
        if( isNegative(-3) ) { numCorrect++; }
        if( !isNegative(2) ) { numCorrect++; }
        if( !isNegative(0) ) { numCorrect++; }
        
        if( !containsG( "man" ) ) { numCorrect++; }    
        if( containsG( "dog" ) ) { numCorrect++; }    
        if( containsG( "EGGSHELL" ) ) { numCorrect++; } 

        if( indexOfG( "man" ) == -1 ) { numCorrect++; } 
        if( indexOfG( "EGGSHELL" ) == 1 ) { numCorrect++; } 
        if( indexOfG( "dog" ) == 2 ) { numCorrect++; } 
        if( indexOfG( "xyzggGGggG" ) == 3 ) { numCorrect++; } 
        if( indexOfG( "xyzGGggGGg" ) == 3 ) { numCorrect++; }

        if( respond( "Apple" ).equals( "Orange" ) ) { numCorrect++; } 
        if( respond( "Hello" ).equals( "Goodbye!" ) ) { numCorrect++; } 
        if( respond( "Turing" ).equals( "Machine" ) ) { numCorrect++; } 
        if( respond( "Yay!" ).equals( "\\o/" ) ) { numCorrect++; } 
        if( respond( "xyz" ).equals( "What should I say?" ) ) { numCorrect++; } 

        if( averagePositives( 12,13,12,13,12 ) == 12.4 ) { numCorrect++; } 
        if( averagePositives( 0,0,0,0,0 ) == -1 ) { numCorrect++; } 
        if( averagePositives( 0,0,15,0,-2 ) == 15 ) { numCorrect++; } 
        if( averagePositives( 100,-3,4021,-2,13 ) == 1378 ) { numCorrect++; } 

        // Uncomment these tests AFTER IMPLEMENTING doubleOddIgnoreEven
         if( doubleOddIgnoreEven( 4 ) == 4 ) { numCorrect++; } 
         if( doubleOddIgnoreEven( 0 ) == 0 ) { numCorrect++; } 
         if( doubleOddIgnoreEven( 3 ) == 6 ) { numCorrect++; } 

        // Uncomment these tests AFTER IMPLEMENTING calculateTotalPayment
         if( calculateTotalPayment( 0, .3 ) == -1 ) { numCorrect++; } 
         if( calculateTotalPayment( 10, .2 ) == 12.0 ) { numCorrect++; } 
         if( calculateTotalPayment( 100, .5 ) == 150 ) { numCorrect++; } 
         if( calculateTotalPayment( 100, .65 ) == -1 ) { numCorrect++; } 
         if( calculateTotalPayment( 120, .32 ) == 158.4 ) { numCorrect++; } 
    
        System.out.println( "Your program's completeness is currently: " + numCorrect + "/30" );
    }

}