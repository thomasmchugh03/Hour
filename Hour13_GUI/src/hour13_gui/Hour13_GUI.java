
package hour13_gui;

import java.util.Random;

/**
 * Write a description of class Partial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hour13_GUI
{

    static int top;
    static int [] array = new int [1000];

    /**
     * Constructor for objects of class Partial
     */
    public static void main(String [] args) 
    {

        Random r = new Random();
        int n = r.nextInt(25) + 5; // The size of the input set

        /**
         * Add to the array n random numbers from 0 to 10
         */
        //int top = -1;
        for(int i = 0; i < n; ++i)
        {
        	int j = r.nextInt(11);
        	array[i] = j;
        	top++;
        }
        printArray();

        /**
         * Add a new value to the array
         */
        int j = r.nextInt(11);
        ++top;
        array[top] = j;
        printArray();
        
        
        
        /**
         * Insert a random value at in the middle of the list
         */
        int mid = top / 2;
        for (int i = top; i >= mid; --i)
        {	
        	array[i+1] = array[i];
        }
        array[mid] = j;
        top++;
        

        printArray();
        
        /**
         * Remove the 3rd element
         */
        for(int i = 2; i <= top; ++i)
        {
        	array[i] = array[i+1];
        }
        top--;
        

        printArray();

        /**
         * Move the second to last element to the second element
         */
        //printArray();
        
       
    }

    static void printArray() 
    {
    	for(int i = 0; i <= top; ++i)
    	{
    		if((i +1) % 8 == 0)
    		{
    			System.out.println();
    		}
    		System.out.print(array[i] + " ");
    	}
    	System.out.println("\n");
    }

}