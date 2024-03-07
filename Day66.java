/* The java.util.Random class instance is used to generate a stream of pseudorandom numbers. Following are the important points about Random −

The class uses a 48-bit seed, which is modified using a linear congruential formula.
The algorithms implemented by class Random use a protected utility method that on each invocation can supply up to 32 pseudorandomly generated bits.
java.util.Random

For using this class to generate random numbers, we have to first create an instance of this class and then invoke methods such as nextInt(), nextDouble(), nextLong() etc using that instance.
We can generate random numbers of types integers, float, double, long, booleans using this class.
We can pass arguments to the methods for placing an upper bound on the range of the numbers to be generated. For example, nextInt(6) will generate numbers in the range 0 to 5 both inclusive.
Syntax:

To generate a random integer in the range 0 to 100 both inclusive.

create instance of Random class
Random rand = new Random();
int rand_int1 = rand.nextInt(101);

Task:

What will be the output for the following code?
*/

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class myClass
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
                Random rand = new Random();
                System.out.println(rand.nextInt(1));
	}
}

// Answer : 0
