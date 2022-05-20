/*______________________________________________________________________________________________________
 * 
 * Write a Java program that reads arguments from the command line 
 * and checks whether all numeric positive non-zero values appear in ascending order.
 * _____________________________________________________________________________________________________
 * 
 * 
 * Example:
 * 
 *______________________________________________________________________________________________________
 *
 *  Input:
 *      java Test1 1 0 -2 3 5 -7 -9 7 8 
 *  Output:
 *      YES
 *______________________________________________________________________________________________________
 *      
 *______________________________________________________________________________________________________
 *  
 *  Input:
 *      java Test1 1 0 -2 3 5 -7 -9 4 7 8 
 *  Output:
 *      NO
 *______________________________________________________________________________________________________
 *
 *______________________________________________________________________________________________________ 
 */

package fme.internship;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author <full name>
 * @email <email address>
 * 
 */
public class Test1 {

    public static void main(String[] args) {
        System.out.println("FME Internship - Test1");
        List<Integer> numbers = new ArrayList<>();
        for (String argument : args) {
            int numericValue = Integer.parseInt(argument);
            if (numericValue > 0) {
                numbers.add(numericValue);
            }
        }
        boolean sorted = numbers.stream().sorted().toList().equals(numbers);
        if (sorted) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}